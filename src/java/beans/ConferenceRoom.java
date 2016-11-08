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
public class ConferenceRoom extends Resource {
    public String location ;
    public int capacity ; 
    

    
    public ConferenceRoom( int resourceID ,
     String resourceName ,
     boolean isMaintained , 
     String description ,
     String location ,
     int capacity ){
       
     super(resourceID, resourceName, isMaintained ,description, "ConferenceRoom" );
     this.location = location ;
     this.capacity = capacity ;
    }
}
