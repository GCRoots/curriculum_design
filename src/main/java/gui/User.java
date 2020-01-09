package gui;

import dao.DepartmentDao;
import dao.EmployeeSalaryAddDao;
import dao.EmployeeSalaryDao;
import dao.EmployeeSalarySubDao;
import dao.imp.DepartmentDaoImp;
import dao.imp.EmployeeSalaryAddDaoImp;
import dao.imp.EmployeeSalaryDaoImp;
import dao.imp.EmployeeSalarySubDaoImp;
import pojo.Department;
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
public class User extends JFrame {
    public static void main(String[] args) {
        User user=new User();
        user.user();
    }

    public void user(){
        setTitle("BASIC 测试文件 USER");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
        setBounds(600, 300, 500, 400);

        //标题
        JLabel jLabel=new JLabel(" 欢 迎 您 的 使 用 ！   用 户 ");
        Font font = new Font("楷体", Font.BOLD, 16);
        jLabel.setFont(font);
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        jLabel.setPreferredSize(new Dimension(400, 100));

        JPanel panMain=new JPanel();
        panMain.setLayout(null);



        JButton jButton1=new JButton("工资查询");
        JButton jButton2=new JButton("部门查询");
        JButton jButton3=new JButton("返回登录");


        jButton1.setBounds(40,10,90,30);
        jButton2.setBounds(40,60,90,30);
        jButton3.setBounds(40,180,90,30);

        panMain.add(jButton1);
        panMain.add(jButton2);
        panMain.add(jButton3);

        final JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createLoweredBevelBorder());

        panel.setBounds(150,10,320,200);




        panMain.add(panel);


        //工资查询
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                panel.repaint();

                JLabel idLabel=new JLabel("用户ID:");
                idLabel.setBounds(10,10,60,30);

                final JTextField jTextID=new JTextField("",10);
                jTextID.setBounds(60,10,100,30);

                JLabel timeLabel=new JLabel("时间:");
                timeLabel.setBounds(170,10,60,30);

                final JTextField jTextTime=new JTextField("",10);
                jTextTime.setBounds(210,10,100,30);

                JButton jButton=new JButton("查询");
                jButton.setBounds(220,160,60,27);


                String[] headers = { "基本工资", "岗位工资","住房补贴", "津贴","应发工资"};
                Object[][] cellData = {
                };
                final DefaultTableModel tableModel = new DefaultTableModel(cellData, headers);
                final JTable table = new JTable(tableModel);
                table.getTableHeader().setBounds(3,50,315,20);
                table.setBounds(3,70,315,30);

                panel.add(table.getTableHeader());
                panel.add(table);

                String[] headers1 = { "工会会费", "水电费","住房公积金", "养老保险","应扣工资"};
                Object[][] cellData1 = {
                };
                final DefaultTableModel tableModel1 = new DefaultTableModel(cellData1, headers1);
                JTable table1 = new JTable(tableModel1);
                table1.getTableHeader().setBounds(3,100,315,20);
                table1.setBounds(3,120,315,30);

                panel.add(table1.getTableHeader());
                panel.add(table1);

                String[] headers2 = { "奖惩", "实际工资"};
                Object[][] cellData2 = {
                };
                final DefaultTableModel tableModel2 = new DefaultTableModel(cellData2, headers2);
                JTable table2 = new JTable(tableModel2);
                table2.getTableHeader().setBounds(50,150,315,20);
                table2.setBounds(50,170,100,30);

                panel.add(table2.getTableHeader());
                panel.add(table2);

                jButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String staffID=jTextID.getText();
                        String time=jTextTime.getText();

                        EmployeeSalaryAddDao addDao=new EmployeeSalaryAddDaoImp();
                        EmployeeSalaryAdd add=addDao.addFind(staffID,time);

                        EmployeeSalarySubDao subDao=new EmployeeSalarySubDaoImp();
                        EmployeeSalarySub sub=subDao.subFind(staffID,time);

                        EmployeeSalaryDao salaryDao=new EmployeeSalaryDaoImp();
                        EmployeeSalary salary=salaryDao.salaryFind(staffID,time);

                        String[] adds={add.getBasicWage(),add.getPostSalary(),add.getHousingSubsidy(),add.getAllowance(),salary.getSalaryAdd()};
                        String[] subs={sub.getUnionDues(),sub.getWaterElecFee(),sub.getHousingFund(),sub.getPension(),salary.getSalarySub()};
                        String[] salarys={salary.getRewardPuni(),salary.getRealWages()};

                        tableModel.addRow(adds);
                        tableModel1.addRow(subs);
                        tableModel2.addRow(salarys);

                    }
                });



                panel.add(idLabel);
                panel.add(jTextID);
                panel.add(jButton);
                panel.add(timeLabel);
                panel.add(jTextTime);

                panel.revalidate();

            }
        });

        //部门查询
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                panel.repaint();

                JLabel idLabel=new JLabel("部门ID:");
                idLabel.setBounds(20,10,60,30);

                final JTextField jTextID=new JTextField("",10);
                jTextID.setBounds(70,10,100,30);

                JButton jButton=new JButton("查询");
                jButton.setBounds(180,10,60,27);

                String[] headers = { "部门", "负责人", "人数" };
                Object[][] cellData = {
                };
                final DefaultTableModel tableModel = new DefaultTableModel(cellData, headers);
                JTable jTable=new JTable(tableModel);

                jTable.getTableHeader().setBounds(3,60,315,20);
                jTable.setBounds(3,80,315,116);

                jButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String depID=jTextID.getText();

                        DepartmentDao departmentDao=new DepartmentDaoImp();
                        Department department=departmentDao.findByDepID(depID);

                        String[] s={department.getDepName(),department.getHeader(),department.getNumber()};

                        tableModel.addRow(s);
                    }
                });


                panel.add(idLabel);
                panel.add(jTextID);
                panel.add(jButton);
                panel.add(jTable.getTableHeader());
                panel.add(jTable);


                panel.revalidate();

            }
        });

        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Basic().Login();
                dispose();
            }
        });



        add(jLabel,BorderLayout.NORTH);
        add(panMain,BorderLayout.CENTER);

        setVisible(true);
    }

}
