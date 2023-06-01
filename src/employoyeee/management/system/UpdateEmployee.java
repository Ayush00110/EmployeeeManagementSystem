
package employoyeee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateEmployee extends JFrame implements ActionListener {
    
      JTextField tfeducation,tffname,tfsalary,tfaddress,tfphone,tfaadhar,tfemail,tfdesignation;
    //JDateChooser dcdob;
   // JComboBox cbeducation;
      JLabel lblempid;
      JButton add,back;
      String empId;
    
     UpdateEmployee(String empId){
         this.empId = empId;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/option75.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100,700 ,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
        image.setBounds(0, 0 , 900 , 700);
        add(image);
      
        
        JLabel heading = new JLabel("Update Add Employee Detail");
        heading.setBounds(320,30,500,50);
        heading.setFont(new Font("SAN_SERIF" , Font.BOLD , 25));
       image. add(heading);
        
        JLabel Labelname = new JLabel("Name");
        Labelname.setBounds(50,150,150,30);
        Labelname.setFont(new Font("serif" ,Font.BOLD,20));
        image.add(Labelname);
        
        // name ke samne ki textfield
        
        
        
        JLabel lblname = new JLabel();
        lblname.setBounds(200,150,150,30);  // uneditable
       image. add(lblname);
        
       
        JLabel LabelFname = new JLabel("Father's Name");
        LabelFname.setBounds(400,150,150,30);
        LabelFname.setFont(new Font("serif" ,Font.BOLD,20));
        image.add(LabelFname);
        
        // name ke samne ki textfield
        
        tffname = new JTextField();
        tffname.setBounds(600,150,150,30);
        image.add(tffname);
        
         // dob 
        JLabel Labeldob = new JLabel("Date of Birth");
        Labeldob.setBounds(50,200,150,30);
        Labeldob.setFont(new Font("serif" ,Font.BOLD,20));
        image.add(Labeldob);
        
        // name ke samne ki textfield
        // for dob we use calender
        
        JLabel lbldob = new JLabel();
        lbldob.setBounds(200,200,150,30);   //uneditable
        image.add(lbldob);
        
        JLabel Labelsalary = new JLabel("Salary");
        Labelsalary.setBounds(400,200,150,30);
        Labelsalary.setFont(new Font("serif" ,Font.BOLD,20));
        image.add(Labelsalary);
        
        // name ke samne ki textfield
        
        tfsalary = new JTextField();
        tfsalary.setBounds(600,200,150,30);
        image.add(tfsalary);
        
         JLabel Labeladdress= new JLabel("Address");
        Labeladdress.setBounds(50,250,150,30);
        Labeladdress.setFont(new Font("serif" ,Font.BOLD,20));
        image.add(Labeladdress);
        
        // name ke samne ki textfield
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200,250,150,30);
        image.add(tfaddress);
        
        
         JLabel LabelPhone = new JLabel("Phone");
        LabelPhone.setBounds(400,250,150,30);
        LabelPhone.setFont(new Font("serif" ,Font.BOLD,20));
       image.add(LabelPhone);
        
        // name ke samne ki textfield
        
        tfphone = new JTextField();
        tfphone.setBounds(600,250,150,30);
        image.add(tfphone);
        
        
         JLabel Labelemail = new JLabel("Email");
        Labelemail.setBounds(50,300,150,30);
        Labelemail.setFont(new Font("serif" ,Font.BOLD,20));
       image.add(Labelemail);
        
        // name ke samne ki textfield
        
        tfemail = new JTextField();
        tfemail.setBounds(200,300,150,30);
        image.add(tfemail);
        
        
         JLabel Labeleducation = new JLabel("Highest Education");
        Labeleducation.setBounds(400,300,150,30);
        Labeleducation.setFont(new Font("serif" ,Font.BOLD,20));
       image. add(Labeleducation);
        
        // name ke samne ki textfield
        // make choice dropbox here
        tfeducation = new JTextField();
        tfeducation.setBackground(Color.WHITE);
        
        tfeducation.setBounds(600,300,150,30);
        image.add(tfeducation);
        
        
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
        
        JLabel lblaadhar = new JLabel();
        lblaadhar.setBounds(600,350,150,30);   // uneditable
        image.add(lblaadhar);
        
        // random empid
        JLabel Labelempid = new JLabel("Employee id");
        Labelempid.setBounds(50,400,150,30);
        Labelempid.setFont(new Font("serif" ,Font.BOLD,20));
       image. add(Labelempid);
        
        // name ke samne ki textfield
        
        lblempid = new JLabel();// concat
        lblempid.setBounds(200,400,150,30);
        lblempid.setFont(new Font("serif" ,Font.BOLD,20));
        image.add(lblempid);
        
        try{
           Conn c = new Conn(); 
           String query = "select * from employeee where empId ='" +empId+"'";
           ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
              lblname.setText(rs.getString("name"));
              tffname.setText(rs.getString("fname"));
              lbldob.setText(rs.getString("dob"));
              tfaddress.setText(rs.getString("address"));
              tfsalary.setText(rs.getString("salary"));
              tfphone.setText(rs.getString("phone"));
              tfemail.setText(rs.getString("email"));
              tfeducation.setText(rs.getString("education"));
              lblaadhar.setText(rs.getString("aadhar"));
             lblempid.setText(rs.getString("empId"));
             tfdesignation.setText(rs.getString("designation"));
              
            }       
            
            
        } catch (Exception e){
            e.printStackTrace();
            
        }
        
        
        
      add  = new JButton("Update Details");
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
            String fname = tffname.getText();
          //String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();// typecast here
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = tfeducation.getText();// typecast
            String designation = tfdesignation.getText();
           
            
            
            
            try{
                Conn conn = new Conn();
                String query = "update  employeee set fname = '"+fname+"', salary = '"+salary+"', address ='"+address+"', phone = '"+phone+"',email = '"+email+"',education = '"+education+"' , designation =  '"+designation+"'  where empId = '"+empId+"'";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Details updated successfully");
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
        new UpdateEmployee("");
                
                
    }
    
}
