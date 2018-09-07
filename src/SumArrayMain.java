/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class SumArrayMain {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        SumArray thr1 = new SumArray("thread 1",a);
        SumArray thr2 = new SumArray("thread 2",a);
        SumArray thr3 = new SumArray("thread 3",a);
        
        try{
            thr1.thread.join();
            thr2.thread.join();
            thr3.thread.join();
        }catch(InterruptedException ex){
            System.out.println("main thread interrupted");
        }
    }
}
