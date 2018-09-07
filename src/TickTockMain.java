
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
public class TickTockMain {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        ThreadTickTock tickThread = new ThreadTickTock("tick",tt);
        ThreadTickTock tockThread = new ThreadTickTock("tock",tt);
         
        try {
            tickThread.thread.join();
            tockThread.thread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(TickTockMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
