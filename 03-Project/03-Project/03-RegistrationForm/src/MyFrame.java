import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame
        extends JFrame
        implements ActionListener {

    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
    private JLabel Height;
    private JTextField tHeight;
    private JLabel Weight;
    private JTextField tWeight;
    private JLabel age;
    private JTextField tage;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel add1;
    private JTextArea tadd1;
    private JLabel add2;
    private JTextArea tadd2;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;

    private String dates[]
            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String months[]
            = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private String years[]
            = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019","2020","2021" };

    public MyFrame()
    {
        setTitle("Registration Form");
        setBounds(300, 90, 900, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);

        mno = new JLabel("Mobile");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(100, 150);
        c.add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(200, 150);
        c.add(tmno);

        age = new JLabel("Age");
        age.setFont(new Font("Serif", Font.BOLD, 20));
        age.setSize(100, 20);
        age.setLocation(100, 180);
        c.add(age);

        tage = new JTextField();
        tage.setFont(new Font("Serif", Font.BOLD, 15));
        tage.setSize(100, 20);
        tage.setLocation(200, 180);
        c.add(tage);

        Height = new JLabel("Height");
        Height.setFont(new Font("Arial", Font.BOLD, 20));
        Height.setSize(100, 20);
        Height.setLocation(100, 200);
        c.add(Height);

        tHeight = new JTextField();
        tHeight.setFont(new Font("Arial", Font.BOLD, 15));
        tHeight.setSize(100, 20);
        tHeight.setLocation(200, 200);
        c.add(tHeight);

        Weight = new JLabel("Weight");
        Weight.setFont(new Font("Arial", Font.BOLD, 20));
        Weight.setSize(100, 20);
        Weight.setLocation(100, 220);
        c.add(Weight);

        tWeight = new JTextField();
        tWeight.setFont(new Font("Arial", Font.BOLD, 15));
        tWeight.setSize(100, 20);
        tWeight.setLocation(200, 220);
        c.add(tWeight);

        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 260);
        c.add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 260);
        c.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 260);
        c.add(female);

        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        dob = new JLabel("DOB");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 290);
        c.add(dob);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(200, 290);
        c.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(250, 290);
        c.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(320, 290);
        c.add(year);

        add1 = new JLabel("Address 1");
        add1.setFont(new Font("Arial", Font.PLAIN, 20));
        add1.setSize(100, 20);
        add1.setLocation(100, 340);
        c.add(add1);

        tadd1 = new JTextArea();
        tadd1.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd1.setSize(200, 75);
        tadd1.setLocation(200, 340);
        tadd1.setLineWrap(true);
        c.add(tadd1);

        add2 = new JLabel("Address 2");
        add2.setFont(new Font("Arial", Font.PLAIN, 20));
        add2.setSize(100, 20);
        add2.setLocation(100, 420);
        c.add(add2);

        tadd2 = new JTextArea();
        tadd2.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd2.setSize(200, 75);
        tadd2.setLocation(200, 420);
        tadd2.setLineWrap(true);
        c.add(tadd2);

        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 500);
        c.add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 570);
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 570);
        reset.addActionListener(this);
        c.add(reset);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 540);
        c.add(res);

        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            if ((Integer.parseInt(tage.getText()) >= 18)&&(Integer.parseInt(tHeight.getText()) >= 100)&&(Integer.parseInt(tWeight.getText()) >= 40)&&(tadd2.getText().equals(tadd1.getText()))) {
                if (term.isSelected()) {
                    System.out.println(tadd1.getText().getClass().getSimpleName());
                    String data1;
                    String data
                            = "Name : "
                            + tname.getText() + "\n"
                            + "Mobile : "
                            + tmno.getText() + "\n"
                            + "Age : "
                            + tage.getText() + "\n"
                            + "Height : "
                            + tHeight.getText() + "\n"
                            + "Weight : "
                            + tWeight.getText() + "\n";

                    if (male.isSelected()) {
                        data1 = "Gender : Male"
                                + "\n";
                    } else {
                        data1 = "Gender : Female"
                                + "\n";
                    }
                    String data2
                            = "DOB : "
                            + (String) date.getSelectedItem()
                            + "/" + (String) month.getSelectedItem()
                            + "/" + (String) year.getSelectedItem()
                            + "\n";

                    String data3 = "Address : " + tadd1.getText();
                    tout.setText(data + data1 + data2 + data3);
                    tout.setEditable(false);
                    res.setText("Registration Successfully..");
                }
            }
            else if ((Integer.parseInt(tage.getText()) < 18)||(Integer.parseInt(tHeight.getText()) < 100)|| (Integer.parseInt(tWeight.getText()) < 40)||(tadd1.getText()!=tadd2.getText())){
                String dataWorng = "Wrong";
                tout.setText(dataWorng);
                tout.setEditable(false);
            }
            else {
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the"
                        + " terms & conditions..");
            }
        }

        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tage.setText(def);
            tHeight.setText(def);
            tWeight.setText(def);
            tadd1.setText(def);
            tadd2.setText(def);
            tmno.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
        }
    }
}
