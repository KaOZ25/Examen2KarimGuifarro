/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import javax.swing.JProgressBar;

/**
 *
 * @author karim
 */
public class Hilo extends Thread{
    JProgressBar a;
    private boolean avanzar;
    private boolean vive;

    public Hilo(JProgressBar a) {
        this.a = a;
        avanzar=true;
        vive=true;
    }

    public JProgressBar getA() {
        return a;
    }

    public void setA(JProgressBar a) {
        this.a = a;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
     @Override
    public void run(){
        while(vive){
            if(avanzar){
                int n=0;
                a.setValue(a.getValue()+1);
                for (int i = 0; i < 3; i++) {
                    n++;
                }
                if (n==3) {
                    a.setValue(a.getValue()-1);
                }
                 if (a.getValue()<28){
                    
                }                
            } //FIN IF
            try {
                Thread.sleep(3);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
