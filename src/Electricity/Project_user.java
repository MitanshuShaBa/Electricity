package Electricity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Project_user extends JFrame implements ActionListener{
    String my_user;
    Project_user(String username){
        super("Electricity Billing System");
        my_user = username;

        setSize(1920,1080);

        /* Adding background image */
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("icon/elect1.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1900, 950,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        add(l1);

//        /* First Column */
        JMenuBar mb  = new JMenuBar();
//        JMenu master = new JMenu("Master");
//        JMenuItem m1 = new JMenuItem("New Customer");
//        JMenuItem m2 = new JMenuItem("Customer Details");
//        master.setForeground(Color.BLUE);


//        /* ---- Customer Details ---- */
//        m1.setFont(new Font("monospaced",Font.PLAIN,12));
//        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
//        Image image1 = icon1.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
//        m1.setIcon(new ImageIcon(image1));
//        m1.setMnemonic('D');
//        m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
//        m1.setBackground(Color.WHITE);
//
//        /* ---- Meter Details ---- */
//        m2.setFont(new Font("monospaced",Font.PLAIN,12));
//        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("icon/icon2.png"));
//        Image image2 = icon2.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
//        m2.setIcon(new ImageIcon(image2));
//        m2.setMnemonic('M');
//        m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
//        m2.setBackground(Color.WHITE);
//
//        m1.addActionListener(this);
//        m2.addActionListener(this);

        // --------------------------------------------------------------------------------------------


        /* Second Column */
        JMenu user = new JMenu("User");
//        JMenuItem u1 = new JMenuItem("Calculate Bill");
        JMenuItem u2 = new JMenuItem("Last Bill");
        user.setForeground(Color.RED);


//        /* ---- Bill Details ---- */
//        u1.setFont(new Font("monospaced",Font.PLAIN,12));
//        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("icon/icon5.png"));
//        Image image5 = icon5.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
//        u1.setIcon(new ImageIcon(image5));
//        u1.setMnemonic('B');
//        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
//        u1.setBackground(Color.WHITE);

        /* ---- Last Bill ----*/
        u2.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image image6 = icon6.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        u2.setIcon(new ImageIcon(image6));
        u2.setMnemonic('L');
        u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
        u2.setBackground(Color.WHITE);

//        u1.addActionListener(this);
        u2.addActionListener(this);


        // ---------------------------------------------------------------------------------------------

        /* Third Column*/
        JMenu report = new JMenu("Report");
        JMenuItem r1 = new JMenuItem("Generate Bill");
        report.setForeground(Color.BLUE);

        /* ---- Report ---- */
        r1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("icon/icon7.png"));
        Image image7 = icon7.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        r1.setIcon(new ImageIcon(image7));
        r1.setMnemonic('R');
        r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        r1.setBackground(Color.WHITE);

        r1.addActionListener(this);

        // -----------------------------------------------------------------------------------------------

        /* Fourth Column*/
        JMenu utility = new JMenu("Utility");
        JMenuItem ut1 = new JMenuItem("Notepad");
        JMenuItem ut2 = new JMenuItem("Calculator");
        JMenuItem ut3 = new JMenuItem("Web Browser");
        utility.setForeground(Color.RED);

        /* ---- Calender ---- */
        ut1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon8 = new ImageIcon(ClassLoader.getSystemResource("icon/icon12.png"));
        Image image8 = icon8.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ut1.setIcon(new ImageIcon(image8));
        ut1.setMnemonic('C');
        ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        ut1.setBackground(Color.WHITE);

        /* ---- Calculator ---- */
        ut2.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon9 = new ImageIcon(ClassLoader.getSystemResource("icon/icon9.png"));
        Image image9 = icon9.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ut2.setIcon(new ImageIcon(image9));
        ut2.setMnemonic('X');
        ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        ut2.setBackground(Color.WHITE);

        /* ---- Web Browser ---- */
        ut3.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("icon/icon10.png"));
        Image image10 = icon10.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ut3.setIcon(new ImageIcon(image10));
        ut3.setMnemonic('W');
        ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
        ut3.setBackground(Color.WHITE);


        ut1.addActionListener(this);
        ut2.addActionListener(this);
        ut3.addActionListener(this);

        // ---------------------------------------------------------------------------------------

        /*Fifth Column */
        JMenu exit = new JMenu("Exit");
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.BLUE);

        /* ---- Exit ---- */
        ex.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("icon/icon11.png"));
        Image image11 = icon11.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ex.setIcon(new ImageIcon(image11));
        ex.setMnemonic('Z');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
        ex.setBackground(Color.WHITE);

        ex.addActionListener(this);


        // ---------------------------------------------------------------------------------------------


//        master.add(m1);
//        master.add(m2);

//        user.add(u1);
        user.add(u2);

        report.add(r1);

        utility.add(ut1);
        utility.add(ut2);
        utility.add(ut3);

        exit.add(ex);

//        mb.add(master);
        mb.add(user);
        mb.add(report);
        mb.add(utility);
        mb.add(exit);

        setJMenuBar(mb);

        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);
    }
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        switch (msg) {
            case "Generate Bill":
                new generate_bill_user(my_user).setVisible(true);

                break;
            case "Last Bill":
                new LastBillUser(my_user).setVisible(true);

                break;
            case "Notepad":
                try {
                    Runtime.getRuntime().exec("notepad.exe");
                } catch (Exception ignored) {
                }
                break;
            case "Calculator":
                try {
                    Runtime.getRuntime().exec("calc.exe");
                } catch (Exception ignored) {
                }
                break;
            case "Web Browser":
                try {
                    Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
                } catch (Exception ignored) {
                }
                break;
            case "Exit":
                System.exit(0);
        }


    }


    public static void main(String[] args){
        new Project_user("Virat").setVisible(true);
    }

}
