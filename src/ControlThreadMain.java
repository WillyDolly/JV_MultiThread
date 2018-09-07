/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class ControlThreadMain {
    public static void main(String[] args) {
        System.out.println("start main thread");
        ControlThread ct = new ControlThread("sub");
        try{
            Thread.sleep(1000);
            
            ct.callSuspend();
            System.out.println("tam dung");
            Thread.sleep(1000);
            
            ct.callResume();
            System.out.println("khoi phuc");
            Thread.sleep(1000);
            
            ct.callSuspend();
            System.out.println("tam dung");
            Thread.sleep(1000);
            
             ct.callResume();
            System.out.println("khoi phuc");
            Thread.sleep(1000);
            
            ct.callStop();
            System.out.println("dung");
            Thread.sleep(1000);
        }catch(InterruptedException exc){
            System.out.println("luong chinh bi ngat");
        }
        System.out.println("finish main thread");
    }
}
