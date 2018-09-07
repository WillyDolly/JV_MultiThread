
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
public class MyThread2 implements Runnable{
String name;

    MyThread2(String name){
        this.name = name;
        Thread thread = new Thread(this,name);
        thread.start();
    }
    
    @Override
    public void run() {
        System.out.println("start thread "+name);
        for(int count=0;count<10;count++){
            System.out.println("thread "+name+" run at "+count);
            try {
               Thread.sleep(400);
               } catch (InterruptedException ex) {
                Logger.getLogger(MyThread2.class.getName()).log(Level.SEVERE, null, ex);
               }
        }
        System.out.println("finish "+name);
    }
    
}
