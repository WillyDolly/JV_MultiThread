
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
public class Tong {
    private int sum;
    
    int Sum(int[] so){
        sum = 0;
        for(int i=0;i<so.length;i++){
            sum += so[i];
            System.out.println("current sum cua "+Thread.currentThread().getName()+" "+sum);
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(SumArray.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sum;
    }
}
