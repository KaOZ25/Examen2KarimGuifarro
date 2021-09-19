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
public class Hilo2 extends Thread{

    JProgressBar b;
    private boolean avanzar;
    private boolean vive;
     public Hilo2(JProgressBar b) {
        this.b = b;
        avanzar=true;
        vive=true;
    }

    public JProgressBar getB() {
        return b;
    }

    public void setB(JProgressBar b) {
        this.b = b;
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
     
}
