/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airplane;

/**
 *
 * @author Konnoke
 */
public class Passenger {
    
    public String passengerName;
    public String groupName;
    public String seat;
    public boolean exists;
    
    public Passenger(){
        exists = true;
    }
    
    public void deletePassenger(){
        exists = false;
    }
    
    public String getName() {
	return passengerName;
    }

    public String getGroupName() {
	return groupName;
    }

    public String getSeat(){
	return seat;
    }
	
	
    public void setName(String name) {
	this.passengerName = name;
    }
    public void setGroupName(String groupName) {
    	this.groupName = groupName;
    }
    public void setSeat(String seating){
    	this.seat = seating;
    }
    
    
    
    
    
    
    
    
}
