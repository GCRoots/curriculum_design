package gui;

import javax.swing.*;
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
        JLabel jLabel=new JLabel(" 欢 迎 您 的 使 用 ！   用 户 ： XXX");
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

        panel.setBounds(170,10,280,200);



        panMain.add(panel);


        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                panel.repaint();

                JLabel idLabel=new JLabel("用户ID:");
                idLabel.setBounds(20,10,60,30);

                JTextField jTextID=new JTextField("",10);
                jTextID.setBounds(70,10,100,30);

                JButton jButton=new JButton("查询");
                jButton.setBounds(180,10,60,27);


                panel.add(idLabel);
                panel.add(jTextID);
                panel.add(jButton);

                panel.revalidate();

            }
        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                panel.repaint();

                JLabel idLabel=new JLabel("部门ID:");
                idLabel.setBounds(20,10,60,30);

                JTextField jTextID=new JTextField("",10);
                jTextID.setBounds(70,10,100,30);

                JButton jButton=new JButton("查询");
                jButton.setBounds(180,10,60,27);


                panel.add(idLabel);
                panel.add(jTextID);
                panel.add(jButton);

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
