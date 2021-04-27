 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportFam;

/**
 *
 * @author lanek
 */
public class Bus extends Automobile{
    private int busSeats;
    private int maxPass;
    private int numOfWheels;
    private int numOfExits;
    
    
    public int getBusSeats(){
        return busSeats;
    }
    public void setBusSeats(int BS){
        busSeats = BS;
    }
    public int getMaxPass(){
        return maxPass;
    }
    public void setMaxPass(int MP){
        maxPass = MP;
    }
    public int getNumOfWheels(){
        return numOfWheels;
    }
    public void setNumOfWheels(int NOW){
        numOfWheels = NOW;
    }
    public int getNumOfExits(){
        return numOfExits;
    }
    public void setNumOfExits(int NOE){
        numOfExits = NOE;
    }
       
}
