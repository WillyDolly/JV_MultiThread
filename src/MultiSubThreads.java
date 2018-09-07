
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
public class MultiSubThreads {
    public static void main(String[] args) {
        System.out.println("main thread starts");
        MyThread2 subMT1 = new MyThread2("sub 1");
        MyThread2 subMT2 = new MyThread2("sub 2");
        MyThread2 subMT3 = new MyThread2("sub 3");
        
        for(int count=0;count<50;count++){
            try {
                System.out.println("loop main to "+count);
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MainThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        System.out.println("Main Thread finishes");
    }
}
