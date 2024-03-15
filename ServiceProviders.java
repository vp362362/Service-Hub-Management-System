/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package javaapplication2;

package demoswing2;

/**
 *
 * @author Lenovo
 */
public class ServiceProviders {
    static   ServiceProviderData [] data =new ServiceProviderData[5];
    
     private  String  Fname , Lname , fee , Gender , E_mail ,Service_CAtagory ,Contact_no,Address,City,State,County,Pincode, Acc_Pswd;
     
     static {
//           ServiceProviderData [] data =new ServiceProviderData[5];
     data[0] =new ServiceProviderData("Vishal", "Patel", "22", "Male", "Vishal12@gmail.com", "Doctor", "9876543210", "Ganesh nagar", "Indore", "Madhya Pradesh", "India", "452010", "Vish@123" );
     data[1] =new ServiceProviderData("Hemant", "Devde", "25", "Male", "hemant@gmail.com", "Teacher", "9893548642", "Scheme No 140", "Indore", "Madhya Pradesh", "India", "452001", "h@2611" );
      
     data[2] =new ServiceProviderData("Yatharth", "Gupta", "28", "Male", "yatharth@gmail.com", "Plumber", "7787592375", "Raj Maholla", "Indore", "Madhya Pradesh", "India", "452010", "yath@123" );
      
     data[3] =new ServiceProviderData("VArsha", "Jat", "23", "Female", "Varsha69@gmail.com", "chef", "9876543210", "Vijay Nagar", "Indore", "Madhya Pradesh", "India", "452010", "varsha@123" );
      
     data[4] =new ServiceProviderData("Sonali", "Patel", "22", "FeMale", "Sonali@gmail.com", "Broker", "9876543210", "Gandhi nagar", "Indore", "Madhya Pradesh", "India", "452010", "son@6162" );
      
     
       System.out.print("Data 1" );
             System.out.print(data[0].Fname() + " "+data[0].fee() );
             System.out.print(data[1].Fname() + " "+data[1].fee() );
             System.out.print(data[2].Fname() + " "+data[2].fee() );
             System.out.print(data[3].Fname() + " "+data[3].fee() );
               System.out.print("Data" );
             
     }
     
  public   ServiceProviders(){
      System.out.print("Yha aa gya hai ");
              
            
//    BookingTable x=   new BookingTable(data);
      System.out.print("Bas ab ho he gya  aa gya hai ");
     }
     
    public static void main(String args[]){
        
        
      
                
    }
    public ServiceProviderData[]  getObj(){
        return data;
    }
}
