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
public class PassengerTrain extends TransportVehicle implements Derailble{
    private int passengerCarCount;
    private int freightCarCount;
    private double milesOfOp;
    
    
    
    
    public int getPassengerCarCount(){
        return passengerCarCount;
    }
    public void setPassengerCarCount(int carc){
        passengerCarCount = carc;
    }

    @Override
    public boolean canBeDerailed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
