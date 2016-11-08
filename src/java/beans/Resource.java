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
public class Resource {
    public int resourceID ;
    public String resourceName ;
    public boolean isMaintained ; 
    public String description ;
    public String child; 

    
    public Resource( int resourceID ,
     String resourceName ,
     boolean isMaintained , 
     String description , String child ){
     this.resourceID = resourceID ;
     this.resourceName = resourceName ;
     this.isMaintained = isMaintained ;
     this.description =  description ;  
     this.child =  child ;       
     
    }
}
