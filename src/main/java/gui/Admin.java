package gui;

import dao.EmployeeDao;
import dao.EmployeeSalaryAddDao;
import dao.EmployeeSalaryDao;
import dao.EmployeeSalarySubDao;
import dao.imp.EmployeeDaoImp;
import dao.imp.EmployeeSalaryAddDaoImp;
import dao.imp.EmployeeSalaryDaoImp;
import dao.imp.EmployeeSalarySubDaoImp;
import pojo.Employee;
import pojo.EmployeeSalary;
import pojo.EmployeeSalaryAdd;
import pojo.EmployeeSalarySub;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author shipengfei
 * @data 20-1-6
 */
public class Admin extends JFrame {
    public static void main(String[] args) {
        Admin admin=new Admin();
        admin.admin();
    }

    public void admin(){
        setTitle("BASIC 测试文件 ADMIN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
        setBounds(600, 300, 500, 400);

        //标题
        JLabel jLabel=new JLabel(" 欢 迎 您 的 使 用 ！   管 理 员 " +
                "");
        Font font = new Font("楷体", Font.BOLD, 16);
        jLabel.setFont(font);
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        jLabel.setPreferredSize(new Dimension(400, 100));

        JPanel panMain=new JPanel();
        panMain.setLayout(null);

        JButton jButton1=new JButton("工资发放");
        JButton jButton2=new JButton("人员调动");
        JButton jButton3=new JButton("入职离岗");
        JButton jButton4=new JButton("返回登录");


        jButton1.setBounds(40,10,90,30);
        jButton2.setBounds(40,60,90,30);
        jButton3.setBounds(40,110,90,30);
        jButton4.setBounds(40,180,90,30);


        panMain.add(jButton1);
        panMain.add(jButton2);
        panMain.add(jButton3);
        panMain.add(jButton4);

        final JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createLoweredBevelBorder());
        panel.setBounds(150,10,320,200);
        panMain.add(panel);


        //发放工资
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                panel.repaint();

                JLabel idLabel=new JLabel("用户ID:");
                idLabel.setBounds(20,10,60,30);

                final JTextField jTextID=new JTextField("",10);
                jTextID.setBounds(70,10,50,25);

                JLabel timeLabel=new JLabel("发放年月:");
                timeLabel.setBounds(150,10,60,30);

                final JTextField jTextTime=new JTextField("",10);
                jTextTime.setBounds(210,10,50,25);


                //add 应发工资
                final JPanel panelSalary=new JPanel();
                panelSalary.setLayout(null);
                panelSalary.setBorder(BorderFactory.createLineBorder(Color.lightGray));
                panelSalary.setBounds(10,50,300,140);

                JButton jButton=new JButton("发放");
                jButton.setBounds(160,100,60,30);

                JLabel basic=new JLabel("基本工资:");
                basic.setBounds(10,10,60,30);
                final JTextField jTextBasic=new JTextField("",10);
                jTextBasic.setBounds(70,10,50,25);

                JLabel postSalary=new JLabel("岗位工资:");
                postSalary.setBounds(10,50,60,30);
                final JTextField jTextPostSalary=new JTextField("",10);
                jTextPostSalary.setBounds(70,50,50,25);

                JLabel housingSubsidy=new JLabel("住房补贴:");
                housingSubsidy.setBounds(140,10,60,30);
                final JTextField jTextHousingSubsidy=new JTextField("",10);
                jTextHousingSubsidy.setBounds(200,10,50,25);

                JLabel allowance=new JLabel("津贴:");
                allowance.setBounds(140,50,60,30);
                final JTextField jTextAllowance=new JTextField("",10);
                jTextAllowance.setBounds(200,50,50,25);

                jButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        EmployeeSalaryAdd employeeSalaryAdd=new EmployeeSalaryAdd();
                        employeeSalaryAdd.setStaffId(jTextID.getText());
                        employeeSalaryAdd.setTime(jTextTime.getText());
                        employeeSalaryAdd.setBasicWage(jTextBasic.getText());
                        employeeSalaryAdd.setPostSalary(jTextPostSalary.getText());
                        employeeSalaryAdd.setHousingSubsidy(jTextHousingSubsidy.getText());
                        employeeSalaryAdd.setAllowance(jTextAllowance.getText());

                        System.out.println(employeeSalaryAdd.toString());

                        EmployeeSalaryAddDao employeeSalaryAddDao=new EmployeeSalaryAddDaoImp();
                        employeeSalaryAddDao.insertEmployeeSalaryAdd(employeeSalaryAdd);

                    }
                });


                panelSalary.add(jButton);
                panelSalary.add(basic);
                panelSalary.add(jTextBasic);
                panelSalary.add(postSalary);
                panelSalary.add(jTextPostSalary);
                panelSalary.add(housingSubsidy);
                panelSalary.add(jTextHousingSubsidy);
                panelSalary.add(allowance);
                panelSalary.add(jTextAllowance);


                //sub 应扣工资
                jButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panelSalary.removeAll();
                        panelSalary.repaint();

                        JButton jButton=new JButton("发放");
                        jButton.setBounds(160,100,60,30);

                        JLabel unionDues=new JLabel("工会会费:");
                        unionDues.setBounds(10,10,60,30);
                        final JTextField jTextUnionDues=new JTextField("",10);
                        jTextUnionDues.setBounds(70,10,50,25);

                        JLabel waterElec=new JLabel("水电费:");
                        waterElec.setBounds(10,50,60,30);
                        final JTextField jTextWaterElec=new JTextField("",10);
                        jTextWaterElec.setBounds(70,50,50,25);

                        JLabel housingFund=new JLabel("住房公积金:");
                        housingFund.setBounds(140,10,60,30);
                        final JTextField jTextHousingFund=new JTextField("",10);
                        jTextHousingFund.setBounds(200,10,50,25);

                        JLabel pension=new JLabel("养老保险:");
                        pension.setBounds(140,50,60,30);
                        final JTextField jTextPension=new JTextField("",10);
                        jTextPension.setBounds(200,50,50,25);

                        jButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                EmployeeSalarySub employeeSalarySub=new EmployeeSalarySub();
                                employeeSalarySub.setStaffId(jTextID.getText());
                                employeeSalarySub.setTime(jTextTime.getText());
                                employeeSalarySub.setUnionDues(jTextUnionDues.getText());
                                employeeSalarySub.setWaterElecFee(jTextWaterElec.getText());
                                employeeSalarySub.setHousingFund(jTextHousingFund.getText());
                                employeeSalarySub.setPension(jTextPension.getText());

                                EmployeeSalarySubDao employeeSalarySubDao=new EmployeeSalarySubDaoImp();
                                employeeSalarySubDao.insertEmployeeSalarySub(employeeSalarySub);

                            }
                        });

                        jButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                panelSalary.removeAll();
                                panelSalary.repaint();

                                JButton jButton=new JButton("发放");
                                jButton.setBounds(160,100,60,30);

                                JLabel label=new JLabel("奖惩:");
                                label.setBounds(10,10,60,30);
                                final JTextField jText=new JTextField("",10);
                                jText.setBounds(70,10,50,25);


                                jButton.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        EmployeeSalary employeeSalary=new EmployeeSalary();

                                        employeeSalary.setStaffId(jTextID.getText());
                                        employeeSalary.setTime(jTextTime.getText());
                                        employeeSalary.setRewardPuni(jText.getText());

                                        EmployeeSalaryDao salaryDao=new EmployeeSalaryDaoImp();
                                        salaryDao.upadtaEmployeeSalary(employeeSalary);

                                        new Admin().admin();
                                        dispose();
                                    }
                                });




                                panelSalary.add(label);
                                panelSalary.add(jText);

                                panelSalary.add(jButton);

                                panelSalary.revalidate();
                            }
                        });



                        panelSalary.add(jButton);
                        panelSalary.add(unionDues);
                        panelSalary.add(jTextUnionDues);
                        panelSalary.add(waterElec);
                        panelSalary.add(jTextWaterElec);
                        panelSalary.add(housingFund);
                        panelSalary.add(jTextHousingFund);
                        panelSalary.add(pension);
                        panelSalary.add(jTextPension);


                        panelSalary.revalidate();
                    }
                });

                panel.add(idLabel);
                panel.add(jTextID);
                panel.add(timeLabel);
                panel.add(jTextTime);
                panel.add(panelSalary);

                panel.revalidate();

            }
        });


        //人员调动
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                panel.repaint();

                final JLabel idLabel=new JLabel("职员ID:");
                idLabel.setBounds(20,10,60,30);

                final JTextField jTextID=new JTextField("",10);
                jTextID.setBounds(70,10,100,30);

                JButton jButton=new JButton("查询");
                jButton.setBounds(180,10,60,27);

                JLabel upLabel=new JLabel("调往部门:");
                upLabel.setBounds(20,150,60,30);

                final JTextField jTextUP=new JTextField("",10);
                jTextUP.setBounds(70,150,100,30);

                JButton update=new JButton("更改");
                update.setBounds(180,150,60,27);


                String[] headers = { "姓名", "性别","入职时间", "部门","职位","政治面貌","婚姻情况" };
                Object[][] cellData = {
                };

                final DefaultTableModel tableModel = new DefaultTableModel(cellData, headers);
                final JTable table = new JTable(tableModel);

                table.getTableHeader().setBounds(3,50,315,20);
                table.setBounds(3,70,315,70);

                //查询
                jButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String staffID=jTextID.getText();

                        EmployeeDao employeeDao=new EmployeeDaoImp();
                        Employee employee=employeeDao.findByStaffID(staffID);
                        String[] cellData = {
                                employee.getStaffName(),employee.getSex(),employee.getPartiTime(), employee.getDepName(),employee.getPosition(),employee.getPoliticalStatus(),employee.getMaritalStatus()
                        };
                        tableModel.addRow(cellData);
                    }
                });

                //人员调动
                update.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String staffID=jTextID.getText();
                        String depName=jTextUP.getText();

                        EmployeeDao employeeDao=new EmployeeDaoImp();
                        Employee employee=employeeDao.findByStaffID(staffID);
                        employee.setDepName(depName);
                        employeeDao.updateEmployeeBasic(employee);

                        JOptionPane.showMessageDialog(
                                Admin.this,
                                "人员调动成功！",
                                "调动",
                                JOptionPane.PLAIN_MESSAGE
                        );


                    }
                });


                panel.add(idLabel);
                panel.add(jTextID);
                panel.add(jButton);

                panel.add(upLabel);
                panel.add(jTextUP);
                panel.add(update);
                panel.add(table.getTableHeader());
                panel.add(table);

                panel.revalidate();

            }
        });

        //入职离岗
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                panel.repaint();

                JButton jButtonR=new JButton("入职");
                jButtonR.setBounds(60,10,60,30);


                JButton jButtonL=new JButton("离岗");
                jButtonL.setBounds(200,10,60,30);


                //入职
                jButtonR.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel.removeAll();
                        panel.repaint();

                        JLabel Label1=new JLabel("员工编号:");
                        Label1.setBounds(10,10,60,30);
                        final JTextField jText1=new JTextField("",10);
                        jText1.setBounds(70,10,50,30);

                        JLabel Label2=new JLabel("姓名:");
                        Label2.setBounds(10,50,60,30);
                        final JTextField jText2=new JTextField("",10);
                        jText2.setBounds(70,50,50,30);

                        JLabel Label3=new JLabel("性别:");
                        Label3.setBounds(10,90,60,30);
                        final JTextField jText3=new JTextField("",10);
                        jText3.setBounds(70,90,50,30);

                        JLabel Label4=new JLabel("生日:");
                        Label4.setBounds(10,130,60,30);
                        final JTextField jText4=new JTextField("",10);
                        jText4.setBounds(70,130,50,30);

                        JLabel Label5=new JLabel("入职日期:");
                        Label5.setBounds(10,170,60,30);
                        final JTextField jText5=new JTextField("",10);
                        jText5.setBounds(70,170,50,30);

                        JLabel Label6=new JLabel("部门:");
                        Label6.setBounds(130,10,60,30);
                        final JTextField jText6=new JTextField("",10);
                        jText6.setBounds(180,10,50,30);

                        JLabel Label7=new JLabel("职位:");
                        Label7.setBounds(130,50,60,30);
                        final JTextField jText7=new JTextField("",10);
                        jText7.setBounds(180,50,50,30);

                        JLabel Label8=new JLabel("职称:");
                        Label8.setBounds(130,90,60,30);
                        final JTextField jText8=new JTextField("",10);
                        jText8.setBounds(180,90,50,30);

                        JLabel Label9=new JLabel("政治面貌:");
                        Label9.setBounds(130,130,60,30);
                        final JTextField jText9=new JTextField("",10);
                        jText9.setBounds(180,130,50,30);

                        JLabel Label10=new JLabel("婚姻情况:");
                        Label10.setBounds(130,170,60,30);
                        final JTextField jText10=new JTextField("",10);
                        jText10.setBounds(180,170,50,30);

                        JButton jButton=new JButton("入职");
                        jButton.setBounds(240,90,60,27);

                        jButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                Employee employee=new Employee();
                                employee.setStaffId(jText1.getText());
                                employee.setStaffName(jText2.getText());
                                employee.setSex(jText3.getText());
                                employee.setBirthday(jText4.getText());
                                employee.setPartiTime(jText5.getText());
                                employee.setDepName(jText6.getText());
                                employee.setPosition(jText7.getText());
                                employee.setTitle(jText8.getText());
                                employee.setPoliticalStatus(jText9.getText());
                                employee.setMaritalStatus(jText10.getText());

                                System.out.println(employee.toString());

                                EmployeeDao employeeDao=new EmployeeDaoImp();
                                employeeDao.insertEmployeeBasic(employee);

                                JOptionPane.showMessageDialog(
                                        Admin.this,
                                        jText2.getText()+"入职成功！",
                                        "入职",
                                        JOptionPane.PLAIN_MESSAGE
                                );

                            }
                        });

                        panel.add(Label1);
                        panel.add(jText1);
                        panel.add(Label2);
                        panel.add(jText2);
                        panel.add(Label3);
                        panel.add(jText3);
                        panel.add(Label4);
                        panel.add(jText4);
                        panel.add(Label5);
                        panel.add(jText5);
                        panel.add(Label6);
                        panel.add(jText6);
                        panel.add(Label7);
                        panel.add(jText7);
                        panel.add(Label8);
                        panel.add(jText8);
                        panel.add(Label9);
                        panel.add(jText9);
                        panel.add(Label10);
                        panel.add(jText10);

                        panel.add(jButton);

                        panel.revalidate();
                    }
                });


                //离岗
                jButtonL.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel.removeAll();
                        panel.repaint();

                        JLabel label=new JLabel("离职员工编号:");
                        label.setBounds(50,10,80,30);
                        final JTextField jText=new JTextField("",10);
                        jText.setBounds(150,10,100,30);

                        JButton jButton=new JButton("一键离职");
                        jButton.setBounds(100,90,100,30);


                        jButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                String staffID=jText.getText();

                                EmployeeSalaryAddDao addDao=new EmployeeSalaryAddDaoImp();
                                addDao.deleteEmployeeSalaryAdd(staffID);

                                EmployeeSalarySubDao subDao=new EmployeeSalarySubDaoImp();
                                subDao.deleteEmployeeSalarySub(staffID);

                                EmployeeSalaryDao salaryDao=new EmployeeSalaryDaoImp();
                                salaryDao.deleteEmployeeSalary(staffID);

                                EmployeeDao employeeDao=new EmployeeDaoImp();
                                employeeDao.deleteEmployeeBasic(staffID);

                                JOptionPane.showMessageDialog(
                                        Admin.this,
                                        jText.getText()+"\t离职成功！所有信息已删除！",
                                        "离职",
                                        JOptionPane.PLAIN_MESSAGE
                                );

                            }
                        });



                        panel.add(label);
                        panel.add(jText);

                        panel.add(jButton);

                        panel.revalidate();
                    }
                });

                panel.add(jButtonR);
                panel.add(jButtonL);

                panel.revalidate();
            }
        });


        //返回登录
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Basic().Login();
                dispose();
            }
        });



        add(jLabel, BorderLayout.NORTH);
        add(panMain,BorderLayout.CENTER);


        setVisible(true);
    }
}
