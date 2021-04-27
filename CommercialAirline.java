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
public class CommercialAirline extends TransportVehicle{
    private int crewCount;
    private double altitude;
    private double hoursOfOperation;
    private int engineCycles;
    
    
    final int ENGINE_CYCLE_CUTOFF = 34000;
    final int HOURS_CUTOFF = 34000;
    
    
    //getters and setters
    //getting and setting count of passangers
    public int getCrewCount(){
        return crewCount; 
    }
    public void setCrewCount(int cc){
        crewCount = cc;
    }
    
    //getter and setter for the altitude of the plane
    public double getAltitude(){
        return altitude;
    }
    public void setAltitude(int alt){
        altitude = alt;
    }
    
    //getter and setter for the hours of operation the plane can withstand 
    public double getHoursOfOperation(){
        return hoursOfOperation;
    }
    public void setHoursOfOperation(double hoursOfOp){
        hoursOfOperation = hoursOfOp;
    }
    //getter and setter for the amount of times the engine has cycled through
    
    public int getEngineCycles(){
        return engineCycles;
    }
    public void setEngineCycles(int ec){
        engineCycles = ec;
    }
    
            
}
