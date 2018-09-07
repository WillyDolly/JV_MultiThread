/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class ThreadTickTock implements Runnable{
    Thread thread;
    TickTock tt;
    
    ThreadTickTock(String name,TickTock tt){
        thread = new Thread(this,name);
        this.tt = tt;
        if(name.equals("tick"))//tick always run before tock
            thread.setPriority(10);
        thread.start();
    }

    @Override
    public void run() {
        if(thread.currentThread().getName().equals("tick")){
            for(int i=0;i<10;i++)//each for loop is interfered by other Thread -> tick tock tick tock
                this.tt.tick(true);
            this.tt.tick(false);//stop thread tick
        }else{
            for(int i=0;i<10;i++)
                this.tt.tock(true);
            this.tt.tock(false);
        }
    }
}
