/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B13;

import javax.swing.JLabel;

/**
 *
 * @author dungn
 */
public class CoutingThread extends Thread {
    private final JLabel lb;

    public CoutingThread(JLabel lb) {
        this.lb = lb;
    }
    @Override
    public void run() {
        int count = 0;
        while(true){
            count++;
            lb.setText(count + "");
            System.out.println(count);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                // TODO Auto-generated catch block
                ex.printStackTrace();
            }
        }
    }
    
}
