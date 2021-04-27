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
public class Van extends Automobile{
    private int slidingDoors;
    private int moreSpace;
    private int foldableSeats;
    private double spaceForPass;
    
    public int getSlidingDoors(){
        return slidingDoors;
    }
    public void setSlidingDoors(int SD){
        slidingDoors = SD;
    }
    
    public int getMoreSpace(){
        return moreSpace;
    }
    public void setMoreSpace(int MS){
        moreSpace = MS;
    }
    
    public int getFoldableSeats(){
        return foldableSeats;
    }
    public void setFoldableSeats(int FS){
        foldableSeats = FS;
    }
    
    public double getSpaceForPass(){
        return spaceForPass;
    }
    public void setSpaceForPass(double SFP){
        spaceForPass = SFP;
    }
    
    
    
    
}
