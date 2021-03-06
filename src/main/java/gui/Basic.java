package gui;

import dao.AdminDao;
import dao.UsersDao;
import dao.imp.AdminDaoImp;
import dao.imp.UsersDaoImp;
import pojo.Admins;
import pojo.Users;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author shipengfei
 * @data 19-12-27
 */
public class Basic extends JFrame{

    public static void main(String[] args) {
        Basic basic=new Basic();
        basic.Login();
    }

    public void Login() {
        setTitle("BASIC 测试文件 LOGIN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
        setBounds(600, 300, 500, 400);

        //标题
        JLabel jLabel=new JLabel("工 资 管 理 系 统");
        Font font = new Font("隶书", Font.BOLD, 34);
        jLabel.setFont(font);
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        jLabel.setPreferredSize(new Dimension(400, 100));

        final JPanel panMain=new JPanel();
        panMain.setLayout(null);

        JLabel jl1 = new JLabel("用户名:");
        JLabel jl2 = new JLabel("密    码:");
        jl1.setSize(100, 40);
        jl1.setLocation(50,10);
        jl1.setHorizontalAlignment(JLabel.RIGHT);
        jl2.setSize(100, 40);
        jl2.setLocation(50,10+10+40);
        jl2.setHorizontalAlignment(JLabel.RIGHT);

        panMain.add(jl1);
        panMain.add(jl2);

        final JTextField jTextName=new JTextField("",10);
        final JPasswordField jTextPass=new JPasswordField(16);
        jTextName.setSize(250,40);
        jTextName.setLocation(50 + 100 + 20, 10);
        jTextPass.setSize(250,40);
        jTextPass.setLocation(50+100+20,10+10+40);
        jTextPass.setEchoChar('*');

        panMain.add(jTextName);
        panMain.add(jTextPass);

        // 单选框
        final JRadioButton JB1 = new JRadioButton("管理员");
        JRadioButton JB2 = new JRadioButton("用户");
        // 加入组，避免出现可以两个都选择的情况
        ButtonGroup bg = new ButtonGroup();
        JB2.setSelected(true);
        // 把单选按钮加入组
        bg.add(JB1);
        bg.add(JB2);

        JB1.setSize(90,20);
        JB1.setLocation(125,125);
        JB2.setSize(90,20);
        JB2.setLocation(300,125);

        panMain.add(JB1);
        panMain.add(JB2);


        final JButton jb1=new JButton("登录");
        JButton jb2=new JButton("注册");
        jb1.setBounds(125,175,90,30);
        jb2.setBounds(300,175,90,30);

        //登录
        jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String userID=jTextName.getText();
                String password= String.valueOf(jTextPass.getPassword());

                if (!(userID.equals("")||password.equals(""))){

                    if (JB1.isSelected()) {  //管理员

                        AdminDao adminDao = new AdminDaoImp();
                        String pass = adminDao.findAdmin(userID).getPassword();

                        if (pass.equals(password)) {
                            JOptionPane.showMessageDialog(
                                    Basic.this,
                                    "管理员身份登录成功！",
                                    "登录",
                                    JOptionPane.PLAIN_MESSAGE
                            );

                            new Admin().admin();
                            dispose();

                        } else {
                            JOptionPane.showMessageDialog(
                                    Basic.this,
                                    "用户名或密码不正确！！",
                                    "登录失败",
                                    JOptionPane.WARNING_MESSAGE
                            );
                        }
                    } else {  //用户
                        UsersDao usersDao = new UsersDaoImp();
                        String pass = usersDao.findUsers(userID).getPassword();

                        if (pass.equals(password)) {
                            JOptionPane.showMessageDialog(
                                    Basic.this,
                                    "用户身份登录成功！",
                                    "登录",
                                    JOptionPane.PLAIN_MESSAGE
                            );

                            new User().user();
                            dispose();

                        } else {
                            JOptionPane.showMessageDialog(
                                    Basic.this,
                                    "用户名或密码不正确！！",
                                    "登录失败",
                                    JOptionPane.WARNING_MESSAGE
                            );
                        }
                    }
                }else {

                    JOptionPane.showMessageDialog(
                            Basic.this,
                            "用户名或密码不能为空！！",
                            "登录失败",
                            JOptionPane.WARNING_MESSAGE
                    );
                }




            }
        });

        //注册
        jb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userID=jTextName.getText();
                String password= String.valueOf(jTextPass.getPassword());

                if (JB1.isSelected()){ //管理员
                    Admins admins=new Admins();
                    admins.setUser(userID);
                    admins.setPassword(password);

                    AdminDao adminDao=new AdminDaoImp();
                    adminDao.insertAdmin(admins);

                    JOptionPane.showMessageDialog(
                            Basic.this,
                            "管理员身份注册成功！",
                            "注册",
                            JOptionPane.PLAIN_MESSAGE
                    );
                }else {                //用户
                    Users users=new Users();
                    users.setUser(userID);
                    users.setPassword(password);

                    UsersDao usersDao=new UsersDaoImp();
                    usersDao.insertUsers(users);

                    JOptionPane.showMessageDialog(
                            Basic.this,
                            "用户身份注册成功！",
                            "注册",
                            JOptionPane.PLAIN_MESSAGE
                    );
                }
            }
        });


        panMain.add(jb1);
        panMain.add(jb2);

        add(jLabel,BorderLayout.NORTH);
        add(panMain,BorderLayout.CENTER);
        setVisible(true);

    }
}
