
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
public class SumArray implements Runnable{
Thread thread;
 Tong tong = new Tong();
int[] a;

    SumArray(String name,int[] num){
        a = num;
        thread = new Thread(this, name);
        thread.start();
    }
    
    @Override
    public void run() {
        System.out.println("start " +thread.getName());
        System.out.println(thread.getName()+"sum of "+tong.Sum(a));
        System.out.println("finish "+thread.getName());
    }   
}

