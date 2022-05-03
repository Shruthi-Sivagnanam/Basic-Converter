//awt package
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Swing package
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//Userdefined package-Converter
import Converter.Anglec;
import Converter.Distancec;
import Converter.Temperaturec;
import Converter.Timec;

class Frame implements ActionListener
{
    JFrame f,tf,df,af,tempf;
    JButton b1,b2,b3,b4,back1,back2,back3,back4,convert1,convert2,convert3,convert4;
    JLabel lhead,ltime,langle,ldistance,ltemp,lto1,lto2,lto3,lto4;
    JComboBox cbtime1,cbtime2,cbdistance1,cbdistance2,cbangle1,cbangle2,cbtemp1,cbtemp2; 
    JTextField tatime1,tatime2,tadistance1,tadistance2,taangle1,taangle2,tatemp1,tatemp2;  
    Timec obt;
    Distancec obd;
    Anglec oba;
    Temperaturec obtem;
    //method for main window
    void Main_frame()
    {
        f=new JFrame("Conversion");
        f.setVisible(true);
        f.setSize(500,400);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //heading
        lhead=new JLabel("Conversion Table");
        lhead.setBounds(165,50,200,30);
        lhead.setFont(new Font("Verdana", Font.PLAIN, 17));
        //button for time conversion
        b1=new JButton("Time Converter");
        b1.setBounds(140,100,200,40);
        b1.addActionListener(this);
        //button for Distance conversion
        b2=new JButton("Distance Converter");
        b2.setBounds(140,160,200,40);
        b2.addActionListener(this);
        //button for angle conversion
        b3=new JButton("Angle Converter");
        b3.setBounds(140, 220, 200, 40);
        b3.addActionListener(this);
        //button for temperature converter
        b4=new JButton("Temperature Converter");
        b4.setBounds(140,280,200,40);
        b4.addActionListener(this);
        //adding all elements in the main frame
        f.add(lhead);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        
    }
    //method for Time conversion window
    void Time_frame()
    {
        String[] time={"min","hr","sec"};
        //Time conversion Frame.
        tf=new JFrame("Time Conversion");
        tf.setVisible(false);
        tf.setSize(500,400);
        tf.setLocationRelativeTo(null);
        tf.setLayout(null);
        tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //heading
        ltime=new JLabel("Time Converter");
        ltime.setBounds(165,50,200,30);
        ltime.setFont(new Font("Verdana", Font.PLAIN, 17));
        //textfield for first input
        tatime1=new JTextField();
        tatime1.setBounds(105,120,80,17);
        //textfield for seconf input
        tatime2=new JTextField();
        tatime2.setBounds(275,120,80,17);
        tatime2.setEditable(false);
        //label for to 
        lto1=new JLabel("to");
        lto1.setBounds(220,120,20,20);
        //drop down for 1st input
        cbtime1=new JComboBox<>(time);
        cbtime1.setBounds(120,150,50,20);
        cbtime1.addActionListener(this);
        //drop down for 2nd input
        cbtime2=new JComboBox<>(time);
        cbtime2.setBounds(290,150,50,20);
        cbtime2.addActionListener(this);
        //back button
        back1=new JButton("Back");
        back1.setBounds(10,300,100,40);
        back1.addActionListener(this);
        //convert button
        convert1=new JButton("Convert");
        convert1.setBounds(175,200,100,40);
        convert1.addActionListener(this);
        //Adding all components in the time conversion frame
        tf.add(cbtime1);
        tf.add(cbtime2);
        tf.add(back1);
        tf.add(ltime);
        tf.add(tatime1);
        tf.add(lto1);
        tf.add(tatime2);
        tf.add(convert1);
    }
    //method for distance conversion window
    void Distance_frame()
    {
        String[] dis={"km","m","cm"};
        df=new JFrame("Distance Conversion");
        df.setVisible(false);
        df.setSize(500,400);
        df.setLocationRelativeTo(null);
        df.setLayout(null);
        df.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //heading
        ldistance=new JLabel("Distance Converter");
        ldistance.setBounds(165,50,200,30);
        ldistance.setFont(new Font("Verdana", Font.PLAIN, 17));
        //textfield for 1st input
        tadistance1=new JTextField();
        tadistance1.setBounds(90,120,120,17);
        //textfield for 2nd input
        tadistance2=new JTextField();
        tadistance2.setBounds(255,120,120,17);
        tadistance2.setEditable(false);
        //drop down list for 1st input
        cbdistance1=new JComboBox<>(dis);
        cbdistance1.setBounds(120,150,50,20);
        cbdistance1.addActionListener(this);
        //drop down list for 2nd input 
        cbdistance2=new JComboBox<>(dis);
        cbdistance2.setBounds(290,150,50,20);
        cbdistance2.addActionListener(this);
        // to label
        lto2=new JLabel("to");
        lto2.setBounds(220,120,20,20);
        //button for convert
        convert2=new JButton("Convert");
        convert2.setBounds(175,200,100,40);
        convert2.addActionListener(this);
        //button for back to main menu
        back2=new JButton("Back");
        back2.setBounds(10,300,100,40);
        back2.addActionListener(this);
        // adding all elements in the frame
        df.add(back2);
        df.add(lto2);
        df.add(ldistance);
        df.add(tadistance1);
        df.add(tadistance2);
        df.add(convert2);
        df.add(cbdistance1);
        df.add(cbdistance2);
    }
    //method for angle conversion window
    void Angle_frame()
    {
        String[] angle={"rad","deg"};
        af=new JFrame("Angle Conversion");
        af.setVisible(false);
        af.setSize(500,400);
        af.setLocationRelativeTo(null);
        af.setLayout(null);
        af.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //heading
        langle=new JLabel("Angle Converter");
        langle.setBounds(165,50,200,30);
        langle.setFont(new Font("Verdana", Font.PLAIN, 17));
        //textarea for 1st input
        taangle1=new JTextField();
        taangle1.setBounds(105,120,80,17);
        //textfield for 2nd input
        taangle2=new JTextField();
        taangle2.setBounds(275,120,80,17);
        taangle2.setEditable(false);
        //to label
        lto3=new JLabel("to");
        lto3.setBounds(220,120,20,20);
        //drop down list for 1st input
        cbangle1=new JComboBox<>(angle);
        cbangle1.setBounds(120,150,50,20);
        cbangle1.addActionListener(this);
        //drop down list for 2nd input
        cbangle2=new JComboBox<>(angle);
        cbangle2.setBounds(290,150,50,20);
        cbangle2.addActionListener(this);
        //button for convert
        convert3=new JButton("Convert");
        convert3.setBounds(175,200,100,40);
        convert3.addActionListener(this);
        //button for back to main menu
        back3=new JButton("Back");
        back3.setBounds(10,300,100,40);
        back3.addActionListener(this);
        //adding all elements in angle frame
        af.add(back3);
        af.add(lto3);
        af.add(taangle1);
        af.add(taangle2);
        af.add(langle);
        af.add(convert3);
        af.add(cbangle1);
        af.add(cbangle2);
    }
    //method for Temperature conversion window
    void Temperature_frame()
    {
        String[] temp={"cel","fahr"};
        tempf=new JFrame("Temperature Conversion");
        tempf.setVisible(false);
        tempf.setSize(500,400);
        tempf.setLocationRelativeTo(null);
        tempf.setLayout(null);
        tempf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //heaing
        ltemp=new JLabel("Temperature Converter");
        ltemp.setBounds(165,50,200,30);
        ltemp.setFont(new Font("Verdana", Font.PLAIN, 17));
        //textfield for 1st input
        tatemp1=new JTextField();
        tatemp1.setBounds(105,120,80,17);
        //textfield for 2nd input
        tatemp2=new JTextField();
        tatemp2.setBounds(275,120,80,17);
        tatemp2.setEditable(false);
        //to label
        lto4=new JLabel("to");
        lto4.setBounds(220,120,20,20);
        //drop down list for 1st input
        cbtemp1=new JComboBox<>(temp);
        cbtemp1.setBounds(120,150,50,20);
        cbtemp1.addActionListener(this);
        //drop down for 2nd list
        cbtemp2=new JComboBox<>(temp);
        cbtemp2.setBounds(290,150,50,20);
        cbtemp2.addActionListener(this);
        //button for convert
        convert4=new JButton("Convert");
        convert4.setBounds(175,200,100,40);
        convert4.addActionListener(this);
        //button for back to main menu
        back4=new JButton("Back");
        back4.setBounds(10,300,100,40);
        back4.addActionListener(this);
        //adding all elements in the temperature frame
        tempf.add(lto4);
        tempf.add(back4);
        tempf.add(tatemp1);
        tempf.add(tatemp2);
        tempf.add(ltemp);
        tempf.add(convert4);
        tempf.add(cbtemp1);
        tempf.add(cbtemp2);
    }
    //implementing the method actionPerformed (Interface-ActionListerner)
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String s=e.getActionCommand();
        //setting the frame's visibilty
        if(s.equals("Time Converter"))
        {
            f.setVisible(false);
            tf.setVisible(true);
        }
        if(s.equals("Distance Converter"))
        {
            f.setVisible(false);
            df.setVisible(true);
        }
        if(s.equals("Angle Converter"))
        {
            f.setVisible(false);
            af.setVisible(true);
        }
        if(s.equals("Temperature Converter"))
        {
            f.setVisible(false);
            tempf.setVisible(true);
        }
        //function of back button
        if(s.equals("Back"))
        {
            if(tf.isShowing()==true)
                tf.setVisible(false);
            else if(af.isShowing()==true)
                af.setVisible(false);
            else if(df.isShowing()==true)
                df.setVisible(false);
            else if(tempf.isShowing()==true)
                tempf.setVisible(false);
            f.setVisible(true);
        }
        //function of convert button
        if(s.equals("Convert"))
        {
            String num1,s1,s2,ans;
            float a;
            if(tf.isShowing()==true)
            {
                num1=tatime1.getText();
                if(num1.equals(""))
                    tatime2.setText("No number");
                else{
                    a=Float.parseFloat(num1);
                    s1=(String) cbtime1.getSelectedItem();
                    s2=(String) cbtime2.getSelectedItem();
                    if(a<0)
                        a=-1;
                    else if(s1.equals("hr")&&s2.equals("min"))
                        a=obt.hr_to_min(a);
                    else if(s1.equals("hr")&&s2.equals("sec"))
                        a=obt.hr_to_sec(a);
                    else if(s1.equals("min")&&s2.equals("hr"))
                        a=obt.min_to_hr(a);
                    else if(s1.equals("min")&&s2.equals("sec"))
                        a=obt.min_to_sec(a);
                    else if(s1.equals("sec")&&s2.equals("hr"))
                        a=obt.sec_to_hr(a);
                    else if(s1.equals("sec")&&s2.equals("min"))
                        a=obt.sec_to_min(a);
                    else
                        a=-1;
                    ans=String.format("%.4f", a);
                    if(a==-1)
                        tatime2.setText("Not Possible");
                    else
                        tatime2.setText(ans);
                }
            }
            if(df.isShowing()==true)
            {
                num1=tadistance1.getText();
                if(num1.equals(""))
                    tadistance2.setText("No number");
                else
                {
                    a=Float.parseFloat(num1);
                    s1=(String)cbdistance1.getSelectedItem();
                    s2=(String)cbdistance2.getSelectedItem();
                    if(a<0)
                        a=-1;
                    else if(s1.equals("km")&&s2.equals("m"))
                        a=obd.km_to_m(a);
                    else if(s1.equals("km")&&s2.equals("cm"))
                        a=obd.km_to_cm(a);
                    else if(s1.equals("m")&&s2.equals("km"))
                        a=obd.m_to_km(a);
                    else if(s1.equals("m")&&s2.equals("cm"))
                        a=obd.m_to_cm(a);
                    else if(s1.equals("cm")&&s2.equals("km"))
                        a=obd.cm_to_km(a);
                    else if(s1.equals("cm")&&s2.equals("m"))
                        a=obd.cm_to_m(a);
                    else
                        a=-1;
                    ans=String.format("%.2f",a);  
                    if(a==-1)
                        tadistance2.setText("Not possible");
                    else
                        tadistance2.setText(ans);

                }
            }
            if(af.isShowing()==true)
            {
                num1=taangle1.getText();
                if(num1.equals(""))
                    taangle2.setText("No number");
                else
                {
                    a=Float.parseFloat(num1);
                    s1=(String) cbangle1.getSelectedItem();
                    s2=(String)cbangle2.getSelectedItem();
                    if(s1.equals("rad")&&s2.equals("deg"))
                    {    
                        a=oba.radian_to_degree(a);
                        ans=String.format("%.4f",a);
                        taangle2.setText(ans);
                    }
                    else if(s1.equals("deg")&&s2.equals("rad"))
                    {    
                        a=oba.degree_to_radian(a);
                        ans=String.format("%.4f",a);
                        taangle2.setText(ans);
                    }
                    else
                        taangle2.setText("Not possible");
                }
            }
            if(tempf.isShowing()==true)
            {
                num1=tatemp1.getText();
                if(num1.equals(""))
                    tatemp2.setText("No number");
                else
                {
                    a=Float.parseFloat(num1);
                    s1=(String)cbtemp1.getSelectedItem();
                    s2=(String)cbtemp2.getSelectedItem();
                    if(s1.equals("cel")&&s2.equals("fahr"))
                    {
                        a=obtem.cel_to_fahr(a);
                        ans=String.format("%.2f", a);
                        tatemp2.setText(ans);
                    }
                    else if(s1.equals("fahr")&&s2.equals("cel"))
                    {
                        a=obtem.fahr_to_cel(a);
                        ans=String.format("%.2f",a);
                        tatemp2.setText(ans);
                    }
                    else
                        tatemp2.setText("Not possible");
                }
            }
        }
    }
    //constructor
    public Frame()
    {
        obt=new Timec();
        obd=new Distancec();
        oba=new Anglec();
        obtem=new Temperaturec();
        Main_frame();
        Time_frame();
        Distance_frame();
        Angle_frame();
        Temperature_frame();
    }
}

public class Conversion 
{
    //main function to call Frame constructor
    public static void main(String[] args) {
        new Frame();
    }
}