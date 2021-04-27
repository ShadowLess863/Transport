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
public class DuckyBoat extends Automobile {
    private int Numbenches;
    private int WheelNum;
    private double FloatableWater;
    private int numPedals;
    private double speedInWater;
    
    public int getNumbenches(){
        return Numbenches;
    }
    public void setNumbenches(int benches){
        benches = Numbenches;
    }
    
    public int getWheelNum(){
        return WheelNum;
    }
    public void setWheelNum(int WN){
        WN = WheelNum;
    }
    
    public int getnumPedals(){
        return numPedals;
    }
    public void setnumPedals(int NP){
        NP = numPedals;
    }
    
    public double getFloatabeWater(){
        return FloatableWater;
    }
    public void setFloatableWater(double FW){
        FW = FloatableWater;
    }
    
    public double getspeedInWater(){
        return speedInWater;
    }
    public void setspeedInWater(double SIW){
        SIW = speedInWater;
    }
    
    
}
