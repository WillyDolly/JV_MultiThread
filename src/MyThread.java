
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
public class MyThread implements Runnable{
    String threadName;
    
    MyThread(String name){
        threadName = name;
    }
    
    @Override
    public void run() {
        System.out.println("start "+threadName);
        for(int count=0;count<10;count++){
            try {
                System.out.println("loop 1 to "+count);
                Thread.sleep(400);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
        System.out.println(threadName+" finish");
    }
    
}
