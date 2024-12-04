
package dbconnection;

import java.sql.*; //AN * DENOTES THAT YOU ARE ACCESSING EVERY AVAILABLE CLASS WITHIN THE PACKAGE LIKE SQL OR SWING
import javax.swing.*;


public class dbcon {
   

    
    //STEP #1
    private static final String username = "root"; //THIS VARIABLE HOLDS THE VALUE OF THE DEFAULT USERNAME FOR YOUR MYSQL SERVER BY DEFAULT IT IS SET TO ROOT
    private static final String password = ""; // THE DEFAULT VALUE FOR YOUR MYSQL SERVER IS NONE, SO DONT PUT ANYTHING INSIDE THE QOUTATIONS EVEN SPACE CHARACTER
    private static final String db_con  = "jdbc:mysql://localhost:3306/oop"; //THIS HOLDS THE URL OF YOUR MYSQL, THE ONLY VALUE THAT VARIES HERE IS THE PORT NUMBER, BY DEFAULT IT IS SET TO 3306
                                                                              // SO YOU MUST CHECK FIRST YOUR PORT NUMBER BEFORE DOING SO, BY GOING TO XAMPP CONTROL PANEL -> MANAGE SERVERS- > CLICK MYSQL-> THEN CONFIGURE
    
    // CONNECTION OBJECT AND THE SINGLE INSTANCE OF THE CLASS
    private static  Connection conn; // THIS IS THE DECLARATION FOR conn INSTANCE FOR THE CLASS Connection, WE'LL BE USING THAT LATER
    private static  dbcon dbc; // THIS IS THE SINGLETON FOR THE CLASS DBConnection
    

    //STEP #2
    //OVER RIDING THE DEFAULT CONSTRUCTOR
    public dbcon(){
       // REMEMBER THE VARIABLE CONN?, THIS IS HOW IT'S BEEN USED, MAKE SURE TO SET ITS VALUE TO NULL
       conn = null;
        try {
             conn = DriverManager.getConnection(db_con, username,password); // CONN NOW RECEIVE THE VALUE FOR CONNECTION HANDLING BY ASSIGNING THE METHOD getConnection(then pass the variables here
             JOptionPane.showMessageDialog(null, "Database has been loaded successfully"); // THIS LINE WILLL ONLY SEND YOU A FEED BACK IF YOU HAD A SUCCESSFUL CONNECTION
        } catch (Exception ex) { // AN EXCEPTION MUST BE CAUGHT HERE, MAHIRAP DIN NAMAN PAG WALANG SUMASAMBOT E ANO? PURO PA - FALL MGA NASA PALIGID NATIN NGAYON
             JOptionPane.showMessageDialog(null, ex);// YAN DIALOG BOX ANG LALABAS PAG MAY EXCEPTION
        }
        
    }
    //step #3 THIS METHOD CREATES THE CONNECTION TO THE INSTANCE OF DBConnection which is dbc, wala munang hugot
    public static dbcon getDBConnection(){
    if (dbc == null){
        dbc = new dbcon();// now dbc HAS A NEW VALUE WHENEVER IT WAS IDENTIFIED WITH A NULL VALUE
    }
    return dbc;
    }
    
    // THIS METHOD WILL ESTABLISH THE CONNECTION TO THE MYSQL SERVER BY RETURNING THE VARIABLE CONN, THIS METHOD WILL BE CALLED BY THE DBConnection INSTANCE ON THE OTHER CLASS/ JFRAME FORMS.
    public  Connection getConnection(){
        return conn;
    }
    
    // TAPOS NITO PUNTA KA SA USERINFO.JAVA NA FILE OKIE??4
    
        public static void main(String[] args) {
        dbcon db = dbcon.getDBConnection();
        Connection con = db.getConnection();

        if (con != null) {
            System.out.println("Connection successful!");
        } else {
            System.out.println("Failed to connect.");
        }
    }

}
  
    
    

