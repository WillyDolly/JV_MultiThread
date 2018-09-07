
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
public class timing_Join {
    public static void main(String[] args) {
        ExtendThread thread1 = new ExtendThread("thread 1");
        ExtendThread thread2 = new ExtendThread("thread 2");
        ExtendThread thread3 = new ExtendThread("thread 3");
        
        try {
            thread1.join();
            System.out.println("thread 1 joined");//only show it when thread which calls join() stops
            thread2.join();
            System.out.println("thread 2 joined");
            thread3.join();
            System.out.println("thread 3 joined");
        } catch (InterruptedException ex) {
            Logger.getLogger(timing_Join.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
