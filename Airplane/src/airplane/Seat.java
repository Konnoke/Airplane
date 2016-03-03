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
public class Seat {
    
    boolean seatFree;
    final char isTaken = 'X';
    final char isFree = '-';
    char seatSymbol;
    char seatPosition;
    
    public Seat(boolean free){
        seatFree = free;
    }
    
    public char getSeat(){
        
        if(seatFree == true){
            seatSymbol = isFree;
        }else if(seatFree == false) {
            seatSymbol = isTaken;
        }
        
        return seatSymbol;
    }
    
    public void setSeat(){
        
        seatFree = false;
        seatSymbol = isTaken;
    }
    
    public void setSeatPosition(char seatPosition){
        this.seatPosition = seatPosition;
    }
    
    public char getSeatPosition(){
        return seatPosition;
    }
    
    
    /*
    public String freeFirstSeat(String seatPreference, String name){
		String seatLocation = null;
		
		if(seatPreference.toUpperCase().equals("W")){
			for(int rowF = 0; rowF < ROW_FIRST; rowF++){
				//Window A
				if(pArrayFirst[rowF][0].getName() == null){	
					seatLocation = setExistingPassenger(rowF+1, 0+1, name);
					break;
				//Window D
				}else if(pArrayFirst[rowF][3].getName() == null){	
					seatLocation = setExistingPassenger(rowF+1, 3+1, name);
					break;
				}	
			}//loop
		}else if(seatPreference.toUpperCase().equals("A")){
			for(int rowF = 0; rowF < ROW_FIRST; rowF++){
				//Aisle B
				if(pArrayFirst[rowF][1].getName() == null){	
					seatLocation = setExistingPassenger(rowF+1, 1+1, name);
					break;
				//Aisle C
				}else if(pArrayFirst[rowF][2].getName() == null){	
					seatLocation = setExistingPassenger(rowF+1, 2+1, name);
					break;
				}	
			}
		}	
		return seatLocation;	
	}
	
	public String searchAvailabilityEcon(String seatPreference, String name){
            String seatLocation = null;
            if(seatPreference.toUpperCase().equals("W")){
		for(int rowE = 0; rowE < ROW_ECON; rowE++){
			if(pArrayEcon[rowE][0].getName() == null){	
				seatLocation = setExistingPassenger(rowE+10, 0+1, name);
				break;				
			}else if(pArrayEcon[rowE][5].getName() == null){	
				seatLocation = setExistingPassenger(rowE+10, 5+1, name);
				break;
			}	
		}
		}else if(seatPreference.toUpperCase().equals("C")){
			for(int rowE = 0; rowE < ROW_ECON; rowE++){
				if(pArrayEcon[rowE][1].getName() == null){	
					seatLocation = setExistingPassenger(rowE+10, 1+1, name);
					break;				
				}else if(pArrayEcon[rowE][4].getName() == null){	
					seatLocation = setExistingPassenger(rowE+10, 4+1, name);
					break;
				}	
			}
		}else if(seatPreference.toUpperCase().equals("A")){
			for(int rowE = 0; rowE < ROW_ECON; rowE++){
				if(pArrayEcon[rowE][2].getName() == null){	
					seatLocation = setExistingPassenger(rowE+10, 2+1, name);
					break;				
				}else if(pArrayEcon[rowE][3].getName() == null){	
					seatLocation = setExistingPassenger(rowE+1, 3+1, name);
					break;
				}	
			}
		}		
		return seatLocation;	
	}
    */
    
    
}
