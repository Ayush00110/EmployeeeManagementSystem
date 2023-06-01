
 package employoyeee.management.system;


 import javax.swing.*;
 import java.awt.*;
 import java.sql.*;
 import net.proteanit.sql.DbUtils;
 import java.awt.event.*;


public class ViewEmployee extends JFrame implements ActionListener{
    
    JTable table;
    Choice cemployeeId;
    JButton search , print , update , back;
   
    ViewEmployee(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/option7.jpg"));
      Image i2 = i1.getImage().getScaledInstance(1100,700 ,Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel image = new JLabel(i3);
      image.setBounds(0, 0 , 900 , 700);
      add(image);
        
        JLabel searchlbl = new JLabel("Search by Employee Id");
        searchlbl.setBounds(20,20,150,20);
        image.add(searchlbl);
        
        cemployeeId = new Choice();
        cemployeeId.setBounds(180,20,150,20);
       image. add(cemployeeId);
        
   // try     
         try{
           Conn c = new Conn();// whenever need database
           ResultSet rs = c.s.executeQuery("select * from employeee");//ddl command
           
           
           while(rs.next()){
            cemployeeId.add(rs.getString("empId"));
           }
        }catch (Exception e){
            e.printStackTrace();
        }
       
         
         
        table = new JTable();
        
    //2 try
    
        try{
           Conn c = new Conn();// whenever need database
           ResultSet rs = c.s.executeQuery("select * from employeee");//ddl command
           table.setModel(DbUtils.resultSetToTableModel(rs));
           
           }catch (Exception e){
            e.printStackTrace();
        }
            
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0,100,900,600);
        image.add(jsp);
        
        search = new JButton("Search");
        search.setBounds(20,70,80,20);
        search.addActionListener(this);
       image. add(search);
        
        
        print = new JButton("Print");
        print.setBounds(120,70,80,20);
        print.addActionListener(this);
        image.add(print);
        
         
        update = new JButton("Update");
        update.setBounds(220,70,80,20);
        update.addActionListener(this);
       image. add(update);
        
         
        back = new JButton("Back");
        back.setBounds(320,70,80,20);
        back.addActionListener(this);
       image. add(back);



        
                
       setSize(900,700);
       setLocation(300,100);
       setVisible(true);
        
       
       
    }
    
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource() == search){
             
             String query = "select * from employeee where empId =  '" + cemployeeId.getSelectedItem() +"'";
             try {
                 
                 Conn c = new Conn();
                 ResultSet rs = c.s.executeQuery(query);
                 table.setModel(DbUtils.resultSetToTableModel(rs));
             }catch (Exception e){
                 e.printStackTrace();
             }
             
         }else if (ae.getSource() == print){
             try{
                 table.print();
             }catch(Exception e){
                 e.printStackTrace();
             }
             
         }else if (ae.getSource() == update) {
             setVisible(false);
             new UpdateEmployee(cemployeeId.getSelectedItem());
         }else {
             setVisible(false);
             new Home();
         }
     }
    
 public static void main(String args[]){  
      new ViewEmployee();
     
    
   
 
}
 
}

