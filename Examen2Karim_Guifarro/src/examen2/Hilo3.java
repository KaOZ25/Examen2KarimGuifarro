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
public class Hilo3 extends Thread{

    JProgressBar c;
    private boolean avanzar;
    private boolean vive;
     public Hilo3(JProgressBar c) {
        this.c = c;
        avanzar=true;
        vive=true;
    }

    public JProgressBar getC() {
        return c;
    }

    public void setC(JProgressBar c) {
        this.c = c;
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
