
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class TickTock {
String state;    
    synchronized public void tick(boolean running){
        if(!running){
            state = "ticked";
            notify();
            return;
        }
        
        
    try {
        System.out.println("tick");
        Thread.sleep(500);
        state = "ticked";
        notify();
    } catch (InterruptedException ex) {
        Logger.getLogger(TickTock.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        while(!state.equals("tocked"))
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(TickTock.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    synchronized public void tock(boolean running){
        if(!running){
            state = "tocked";
            notify();
            return;
        }
   
    try {
        System.out.println("tock");     
        Thread.sleep(500);
        state = "tocked";
        notify();
    } catch (InterruptedException ex) {
        Logger.getLogger(TickTock.class.getName()).log(Level.SEVERE, null, ex);
    }
         
        while(!state.equals("ticked"))
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(TickTock.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
