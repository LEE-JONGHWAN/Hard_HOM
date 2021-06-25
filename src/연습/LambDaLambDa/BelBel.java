package 연습.LambDaLambDa;

import javax.swing.Timer;

public class BelBel {
    public static void main(String[] args) {
        Timer t = new Timer(1000, event-> System.out.println("hello"));
        t.start();
 
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
 
        }
    }
}
