
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
public class MainThread {
    public static void main(String[] args) {
        System.out.println("main Thread starts");
        MyThread mt = new MyThread("sub Thread");
        Thread thread = new Thread(mt);
        thread.start();
       
        for(int count=0;count<50;count++){
            try {
                System.out.println("loop 2 to "+count);
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MainThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        System.out.println("Main Thread finishes");
    }
}
