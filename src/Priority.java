/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class Priority implements Runnable{
    int count;
    Thread thr;
    static boolean stop = false;
    static String currentThread;
    
    Priority(String name){
        count = 0;
        thr = new Thread(this,name);
        currentThread = name;
    }

    @Override
    public void run() {
        System.out.println("start "+thr.getName());
       do{
           count++;
           //switch task
           if(currentThread.compareTo(thr.getName()) !=0){
               currentThread = thr.getName();
               System.out.println("running : "+currentThread);
           }
       }while(stop==false && count<10000000);
        stop = true;//high thread stops low thread in next CPU time
        System.out.println("finish "+thr.getName());
    }
}
