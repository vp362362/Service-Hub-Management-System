/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoswing2;
import java.sql.*;
import java.lang.Exception;
/**
 *
 * @author vp362
 */
public class Database {
    
    
    private static final String url = "jdbc:mysql://localhost:3306/servicehub";
       private static final String Username = "root";
          private static final String Pswd = "root";
          
          private static Connection conn;
          
          static {
              try{
                  Class.forName("com.mysql.cj.jdbc.Driver");
                  conn =(Connection)DriverManager.getConnection(url, Username, Pswd);
                  
              }catch(ClassNotFoundException e){
                  System.out.println("error : "+e.getMessage());
              }catch(SQLException  s){
                  System.out.println("error : "+s.getMessage());
              }
          }
    
          
          public static Connection getconnection(){
              return conn;
          }
          public  static void main(String Args[]){
              System.out.println("hello guy ");
          }
}
