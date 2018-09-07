
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
public class MainThread2 {
    public static void main(String[] args) {
        System.out.println("start main thread");
        MyThread2 mt2 = new MyThread2("sub thread");
        
        for(int count=0;count<50;count++){
            System.out.println("main thread run at "+count);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MainThread2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("finish main thread");
    }
}
