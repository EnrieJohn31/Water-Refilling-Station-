/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package water_refilling_station;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Enrie John B. Edem
 */
public class XConnect {
    public static Connection Connect(){
      Connection con = null;
      Statement st = null;
      try{
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/water_station","root","");
          st = con.createStatement();
      }catch(SQLException | HeadlessException ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
      }    
        return con;
    }
}
