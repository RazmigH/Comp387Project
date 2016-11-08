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
public class ITEquipment extends Resource{
    public String equipmentType ;

    
    public ITEquipment( int resourceID ,
     String resourceName ,
     boolean isMaintained , 
     String description ,
     String equipmentType  ){
     
        super(resourceID, resourceName, isMaintained ,description, "ITEquipment");
        this.equipmentType = equipmentType ;
    }

}
