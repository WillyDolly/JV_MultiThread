/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class ExtendThreadMain {
    public static void main(String[] args) {
            System.out.println("start main thread");
        ExtendThread et2 = new ExtendThread("sub thread");
        
        for(int count=0;count<50;count++){
            System.out.println("main thread run at "+count);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
               
            }
        }
        System.out.println("finish main thread");
    }
}
