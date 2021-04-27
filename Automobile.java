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
public class Automobile extends TransportVehicle {
    
    private int carSeats;
    private double milesPerHour;
    private double milesOnEngine;
    
    final double ENGINE_MILE_CUTOFF = 100000.00;
    
    public int getCarSeats(){
        return carSeats;
    }
    public void setCarSeats(int cs){
        carSeats = cs;
    }
    
    public double getMilesPerHour(){
        return milesPerHour;
    }
    public void setMilesPerHour(double mph){
        milesPerHour = mph;
    }
    
    public double getMilesOnEngine(){
        return milesOnEngine;
    }
    public void setMilesOnEngine(double moe){
        milesOnEngine = moe;
    }
    
    
}
