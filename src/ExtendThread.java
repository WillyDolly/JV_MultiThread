/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class ExtendThread extends Thread{
   
    ExtendThread(String name){
        super(name);
        start();
    }
    
    public void run(){//must even not override
        System.out.println("start "+getName());
         for(int count=0;count<10;count++){
            System.out.println("thread "+getName()+" run at "+count);
            try {
               Thread.sleep(400);
               } catch (InterruptedException ex) {
               
               }
        }
        System.out.println("finish "+getName());
    }
    
}
