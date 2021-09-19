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
public class hilo_prime extends Thread{
     JProgressBar prime;
    private boolean avanzar;
    private boolean vive;

    public hilo_prime(JProgressBar prime) {
        this.prime = prime;
        avanzar=true;
        vive=true;
    }

    public JProgressBar getPrime() {
        return prime;
    }

    public void setPrime(JProgressBar prime) {
        this.prime = prime;
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
                prime.setValue(prime.getValue()+2);
                n=n+1;
                               if (n==4) {
                    prime.setValue(prime.getValue()-6);
                }              
            } //FIN IF
            try {
                Thread.sleep(1);
                
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
