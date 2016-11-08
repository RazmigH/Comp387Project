package beans;


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mouadbouras
 */
public class ReserveLog extends Resource{
    public int reservesID ;
    public int userID ;
    public Date startDate ;
    public Date endDate;
    
    public ReserveLog( int reservesID ,
     int userID ,
     int resourceID ,
     String resourceName ,
     boolean isMaintained , 
     String description ,
     Date startDate ,
     Date endDate ){
     super(resourceID, resourceName, isMaintained ,description, "" );
     this.reservesID = reservesID ;
     this.userID = userID ;
     this.startDate = startDate ;
     this.endDate =  endDate ;       
    }
}
