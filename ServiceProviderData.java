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
public class ServiceProviderData {
    
    
  private  String  Fname , Lname , fee , Gender , E_mail ,Service_CAtagory ,Contact_no,Address,City,State,County,Pincode, Acc_Pswd;
    
  public ServiceProviderData(String Fname ,String Lname , String fee ,String Gender ,String E_mail ,String Service_CAtagory ,String Contact_no,String Address, String City,String State,String County,String Pincode, String Acc_Pswd){
      
     this.Fname =Fname;
             this.Lname =Lname;
            this.fee =fee;
            this.Gender =Gender;
            this.E_mail =E_mail;
           this.Service_CAtagory =Service_CAtagory;
            this.Contact_no=Contact_no;
           this.Address=Address;
            this.City=City;
            this.State=State;
            this.County=County;
            this.Pincode=Pincode;
           this. Acc_Pswd =Acc_Pswd;
  }
   
  
    public String Fname(){
        return Fname;
    }
     public String Lname(){
        return Lname;
    }
      public String fee(){
        return fee;
    }
       public String Gender(){
        return Gender;
    } public String E_mail(){
        return E_mail;
    } public String Service_CAtagory(){
        return Service_CAtagory;
    } public String Contact_no(){
        return Contact_no;
    } public String City(){
        return City;
    } public String State(){
        return State;
    } public String County(){
        return County;
    } public String Pincode(){
        return Pincode;
    } public String Acc_Pswd(){
        return Acc_Pswd;
    } 
     public String Address(){
        return Address;
    } 
   
    
    
    
    
    
    
    
    
    
       
    
}
