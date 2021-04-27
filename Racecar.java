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
public class Racecar extends Automobile{
    private int wheelBaseInches;
    
    
    public int getWheelBaseInches(){ 
        return wheelBaseInches;
    }
    public void setWheelBaseInches(int WBI){
        wheelBaseInches = WBI; 
        
    }
}
