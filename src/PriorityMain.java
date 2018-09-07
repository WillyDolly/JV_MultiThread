
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
public class PriorityMain {
    public static void main(String[] args) {
        Priority p1 = new Priority("high priority");
        Priority p2 = new Priority("low priority");
        
        p1.thr.setPriority(Thread.MAX_PRIORITY);//CPU cores, CPU's schedule,... -> priority
        p2.thr.setPriority(Thread.NORM_PRIORITY - 2);
        
        p2.thr.start();
        p1.thr.start();//start first, finish first
        try {
            p1.thr.join();
            p2.thr.join();
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        System.out.println("p1 count up to "+p1.count);
        System.out.println("p2 count up to "+p2.count);
    }
}
