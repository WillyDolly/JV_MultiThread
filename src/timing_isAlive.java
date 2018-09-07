
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
public class timing_isAlive {
    public static void main(String[] args) {
        System.out.println("main thread starts");
        ExtendThread sub1 = new ExtendThread("sub 1");
        ExtendThread sub2 = new ExtendThread("sub 2");
        ExtendThread sub3 = new ExtendThread("sub 3");
        
        do{
           try {
                System.out.println("sleep");
              Thread.sleep(100);//slow down the process. Without this -> endless loop
            }catch (InterruptedException ex) {
              Logger.getLogger(timing_isAlive.class.getName()).log(Level.SEVERE, null, ex);
            }
        }while(sub1.isAlive()|| sub2.isAlive() || sub3.isAlive());// ensure main thread ends last
        System.out.println("main thread finishes");
    }
}
