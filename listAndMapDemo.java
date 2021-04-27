/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportFam;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author lanek
 */
public class listAndMapDemo {
    public static void main(String[] args){
        
        LinkedList<String> speedScenarios = new LinkedList<>();
        
        String[] scenarioArray = new String[5];
        
        speedScenarios.add("Rigged elevator with bomb");
        speedScenarios.add("City has speed trigger explosion");
        
        speedScenarios.add("Subway hijack");
        speedScenarios.add(1, "Destroys random city ad bus driver");
        
        
        System.out.println("Linked List Display");
        
        ListIterator<String> iter = speedScenarios.listIterator();
        
        
        while(iter.hasNext()){
            String item = iter.next();
            System.out.println("List Item: " + item);
        }//close while
        
        
        
    }//close main
}//close class
