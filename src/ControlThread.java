/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class ControlThread implements Runnable{
    boolean suspended , stopped;
    Thread thread;
    
    ControlThread(String name){
        thread = new Thread(this,name);
        suspended = false;
        stopped = false;
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("start "+thread.getName());
        try{
            for(int i=1;i<1000;i++){
                System.out.print(i+" ");
                if((i%10)==0){
                    System.out.println();
                    Thread.sleep(250);
                }
                
                synchronized(this){
                    while(suspended){
                        wait();
                    }
                    if(stopped) break;
                }
            }
            
        }catch(InterruptedException exc){
            System.out.println("");
        }
        System.out.println("finish "+thread.getName());
    }
    
    synchronized void callSuspend(){
        suspended = true;// this method call wait(), not notify()
    }
    
    synchronized void callStop(){
        stopped = true;
        //make sure stopping thread completely
        suspended = false;
        notify();//wake up waiting thread
    }
    
    synchronized void callResume(){
        suspended = false;
        notify();
    }
}
