
package employoyeee.management.system;

import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;// calendar textfield
import java.util.*;
import java.awt.event.*;
//import java.sql.*;

public class AddEmployee extends JFrame implements ActionListener {
    
    Random ran = new Random();
    int number = ran.nextInt(999999);
    JTextField tfname,tffname,tfsalary,tfaddress,tfphone,tfaadhar,tfemail,tfdesignation;
    JDateChooser dcdob;
    JComboBox cbeducation;
    JLabel lblempid;
    JButton add,back;
    AddEmployee(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/option2.jpg"));
      Image i2 = i1.getImage().getScaledInstance(1100,700 ,Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel image = new JLabel(i3);
      image.setBounds(0, 0 , 900 , 700);
      add(image);
      
        JLabel heading = new JLabel("Add Employee Detail");
        heading.setBounds(320,30,500,50);
        heading.setFont(new Font("SAN_SERIF" , Font.BOLD , 25));
       image. add(heading);
        
        JLabel Labelname = new JLabel("Name");
        Labelname.setBounds(50,150,150,30);
        Labelname.setFont(new Font("serif" ,Font.BOLD,20));
       image. add(Labelname);
        
        // name ke samne ki textfield
        
        tfname = new JTextField();
        tfname.setBounds(200,150,150,30);
        image. add(tfname);
        
        JLabel LabelFname = new JLabel("Father's Name");
        LabelFname.setBounds(400,150,150,30);
        LabelFname.setFont(new Font("serif" ,Font.BOLD,20));
       image. add(LabelFname);
        
        // name ke samne ki textfield
        
        tffname = new JTextField();
        tffname.setBounds(600,150,150,30);
       image. add(tffname);
        
         // dob 
        JLabel Labeldob = new JLabel("Date of Birth");
        Labeldob.setBounds(50,200,150,30);
        Labeldob.setFont(new Font("serif" ,Font.BOLD,20));
       image. add(Labeldob);
        
        // name ke samne ki textfield
        // for dob we use calender
        
        dcdob = new JDateChooser();
        dcdob.setBounds(200,200,150,30);
       image. add(dcdob);
        
        JLabel Labelsalary = new JLabel("Salary");
        Labelsalary.setBounds(400,200,150,30);
        Labelsalary.setFont(new Font("serif" ,Font.BOLD,20));
        image.add(Labelsalary);
        
        // name ke samne ki textfield
        
        tfsalary = new JTextField();
        tfsalary.setBounds(600,200,150,30);
       image. add(tfsalary);
        
         JLabel Labeladdress= new JLabel("Address");
        Labeladdress.setBounds(50,250,150,30);
        Labeladdress.setFont(new Font("serif" ,Font.BOLD,20));
        image.add(Labeladdress);
        
        // name ke samne ki textfield
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200,250,150,30);
       image. add(tfaddress);
        
        
         JLabel LabelPhone = new JLabel("Phone");
        LabelPhone.setBounds(400,250,150,30);
        LabelPhone.setFont(new Font("serif" ,Font.BOLD,20));
        image.add(LabelPhone);
        
        // name ke samne ki textfield
        
        tfphone = new JTextField();
        tfphone.setBounds(600,250,150,30);
       image. add(tfphone);
        
        
         JLabel Labelemail = new JLabel("Email");
        Labelemail.setBounds(50,300,150,30);
        Labelemail.setFont(new Font("serif" ,Font.BOLD,20));
       image. add(Labelemail);
        
        // name ke samne ki textfield
        
        tfemail = new JTextField();
        tfemail.setBounds(200,300,150,30);
       image. add(tfemail);
        
        
         JLabel Labeleducation = new JLabel("Highest Education");
        Labeleducation.setBounds(400,300,150,30);
        Labeleducation.setFont(new Font("serif" ,Font.BOLD,20));
       image. add(Labeleducation);
        
        // name ke samne ki textfield
        // make choice dropbox here
        String courses[] = {"BBA","BCA","BA","BSC","B.COM","BTech","MBA","MCA","Ma","MSc"};
        cbeducation = new JComboBox(courses);
        cbeducation.setBackground(Color.WHITE);
        cbeducation.setBounds(600,300,150,30);
       image. add(cbeducation);
        
        
        JLabel Labeldesignation = new JLabel("Designation");
        Labeldesignation.setBounds(50,350,150,30);
        Labeldesignation.setFont(new Font("serif" ,Font.BOLD,20));
        image.add(Labeldesignation);
        
        // name ke samne ki textfield
        
        tfdesignation = new JTextField();
        tfdesignation.setBounds(200,350,150,30);
       image. add(tfdesignation);
        
        
        
        JLabel Labelaadhar = new JLabel("Aadhar Number");
        Labelaadhar.setBounds(400,350,150,30);
        Labelaadhar.setFont(new Font("serif" ,Font.BOLD,20));
        image.add(Labelaadhar);
        
        // name ke samne ki textfield
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(600,350,150,30);
       image. add(tfaadhar);
        
        // random empid
        JLabel Labelempid = new JLabel("Employee id");
        Labelempid.setBounds(50,400,150,30);
        Labelempid.setFont(new Font("serif" ,Font.BOLD,20));
       image. add(Labelempid);
        
        // name ke samne ki textfield
        
        lblempid = new JLabel("" + number);// concat
        lblempid.setBounds(200,400,150,30);
        lblempid.setFont(new Font("serif" ,Font.BOLD,20));
       image. add(lblempid);
        
        
        
      add  = new JButton("Add Details");
      add.setBounds(250 , 550 , 150 , 40);
      add.addActionListener(this);
      add.setBackground(Color.BLACK);
      add.setForeground(Color.WHITE);
      image.add(add);
      
      back = new JButton("Back");
      back.setBounds(450 , 550 , 150 , 40);
      back.addActionListener(this);
      back.setBackground(Color.BLACK);
      back.setForeground(Color.WHITE);
      image.add(back);
        
        
        
       
        setSize(900,700);
        setLocation(300,50);
        setVisible(true);
        
        
    }
    
    //override
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == add){
            String name = tfname.getText(); // user ka data nikalna
            String fname = tffname.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();// typecast here
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = (String) cbeducation.getSelectedItem();// typecast
            String designation = tfdesignation.getText();
            String aadhar = tfaadhar.getText();
            String empId = lblempid.getText();
            
            try{
                Conn conn = new Conn();
                String query ="insert into employeee values('"+name+"','"+fname+"','"+dob+"', '"+salary+"','"+address+"','"+phone+"','"+email+"','"+education+"','"+designation+"','"+aadhar+"','"+empId+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Details added successfully");
                setVisible(false);
                new Home();
            } catch (Exception e){
                e.printStackTrace();
            }
                    
        } else{
            setVisible(false);
            new Home();
        }
            
    
}
    
    public static void main(String args[]){
        new AddEmployee();
                
                
    }
    
}
