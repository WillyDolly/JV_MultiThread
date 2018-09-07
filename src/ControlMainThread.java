
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
public class ControlMainThread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();//run this in Main method to gain reference accessing to Main Thread
        System.out.println("current thread: "+t.getName());
        System.out.println("priority: "+t.getPriority());
        System.out.println("change Main Thread:");
        t.setName("#1");
        t.setPriority(t.getPriority()+3);
         System.out.println("current thread: "+t.getName());
        System.out.println("priority: "+t.getPriority());
        
//        try {
//            t.join();
//        } catch (InterruptedException ex) {
//            Logger.getLogger(ControlMainThread.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
