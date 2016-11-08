package beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mouadbouras
 */
public class User {
    public int userID ;
    public int isAdmin ;
    public String email ;
    public String password ; 
    public String name ;
    public String phoneNumber; 
    public String department ;
    
    public User( int userID ,
     int isAdmin ,
     String email ,
     String password , 
     String name ,
     String phoneNumber, 
     String department  ){
     this.userID = userID ;
     this.isAdmin = isAdmin ;
     this.email = email ;
     this.password =  password ; 
     this.name = name ;
     this.phoneNumber = phoneNumber; 
     this.department = department ;       
    }
}
