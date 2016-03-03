/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airplane;

/**
 *
 * @author Konnoke aka Kevin Baik
 */
public class Airplane {
    Seat[][] firstClass = new Seat[5][4];
    Seat[][] economyClass = new Seat[15][6];
    boolean seatFound;
    boolean free;
    /**
     * @param args the command line arguments
     */
    
    public Airplane(){
        for(int i = 0; i < 5; i ++){
            //System.out.println("");
            for(int j = 0; j <4; j ++){
                
                firstClass[i][j] = new Seat(true);
                if(j == 0 || j == 3){
                    firstClass[i][j].setSeatPosition('W');
                }else if(j == 1 || j == 2){
                    firstClass[i][j].setSeatPosition('A');
                }
            }
            //System.out.println("");
        }
        
        for(int k = 0; k < 15; k ++){
            for(int l = 0; l < 6; l ++){
                economyClass[k][l] = new Seat(true);
                if(l == 0 || l == 6){
                    economyClass[k][l].setSeatPosition('W');
                }else if(l == 2 || l == 3){
                    economyClass[k][l].setSeatPosition('A');
                }else{
                    economyClass[k][l].setSeatPosition('C');
                }
                
            }
            
        }
    }
    
     public void showSeating(){
        System.out.println("_Front of plane_");
        System.out.println("________________");
        for(int i = 0; i < 5; i ++){
            System.out.print("  ");
            for(int j = 0; j <4; j ++){
                
                System.out.print((firstClass[i][j].getSeat()) +" ");
                if(j == 1){
                    System.out.print("|  |");
                }
            }
            System.out.println("");
            
        }
        System.out.println("-------  -------");
        for(int k = 0; k < 15; k ++){
            
            for(int l = 0; l <6; l ++){
                
                System.out.print(economyClass[k][l].getSeat() +" ");
                if(l == 2){
                    System.out.print("|  |");
                }
            }
            System.out.println("");
            
        }
        
        System.out.println("__End of plane__");
        System.out.println("________________");
        System.out.println("\n \n \n \n ");
    }
    
    public boolean checkOpenSeatPosition(char seatClass, char position){
        seatFound = false;
        if(seatClass == 'F'){
            for(int i = 0; i < 5; i ++){
                for(int j = 0; j <4; j ++){
                
                    if(firstClass[i][j].getSeatPosition() == position){
                        seatFound = true;
                    }
                }
            }
        }else if(seatClass == 'E'){
            for(int i = 0; i < 15; i ++){
                for(int j = 0; j <6; j ++){
                
                    if(firstClass[i][j].getSeatPosition() == position){
                        seatFound = true;
                    }
                }
            }
        }
        
        return seatFound;
    }
    
    public void getOpenSeatPosition(char seatClass, char position){
        boolean seatAssigned = false;
        if(seatClass == 'F'){
            for(int i = 0; i < 5; i ++){
                for(int j = 0; j <4; j ++){
                
                    if(!seatAssigned && firstClass[i][j].getSeat() == '-' && firstClass[i][j].getSeatPosition() == position){
                        firstClass[i][j].setSeat();
                        seatAssigned = true;
                    }
                }
            }
        }else if(seatClass == 'E'){
            for(int i = 0; i < 15; i ++){
                for(int j = 0; j <6; j ++){
                
                    if(!seatAssigned && economyClass[i][j].getSeat() == '-' && economyClass[i][j].getSeatPosition() == position){
                        economyClass[i][j].setSeat();
                        seatAssigned = true;
                    }
                }
            }
        }
    }
     
    public void run(){
        showSeating();
        //windowSearch();
        getOpenSeatPosition('F', 'W');
        getOpenSeatPosition('F', 'A');
        getOpenSeatPosition('F', 'W');
        getOpenSeatPosition('F', 'W');
        getOpenSeatPosition('F', 'A');
        
        getOpenSeatPosition('E', 'W');
        getOpenSeatPosition('E', 'C');
        getOpenSeatPosition('E', 'C');
        getOpenSeatPosition('E', 'A');
        showSeating();
        
    }
    
    
    
}
