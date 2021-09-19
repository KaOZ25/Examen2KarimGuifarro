/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

/**
 *
 * @author karim
 */
public class datos {
    private String hora;
    private int fila_ent;
    private int fila_dep;
    private int fila_ret;
    private int serv_cli;
    private int total_dep;
    private int total_ret;
    private int total_sc;
    private int total_atendido;

    public datos(String hora, int fila_ent, int fila_dep, int fila_ret, int serv_cli, int total_dep, int total_ret, int total_sc, int total_atendido) {
        this.hora = hora;
        this.fila_ent = fila_ent;
        this.fila_dep = fila_dep;
        this.fila_ret = fila_ret;
        this.serv_cli = serv_cli;
        this.total_dep = total_dep;
        this.total_ret = total_ret;
        this.total_sc = total_sc;
        this.total_atendido = total_atendido;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getFila_ent() {
        return fila_ent;
    }

    public void setFila_ent(int fila_ent) {
        this.fila_ent = fila_ent;
    }

    public int getFila_dep() {
        return fila_dep;
    }

    public void setFila_dep(int fila_dep) {
        this.fila_dep = fila_dep;
    }

    public int getFila_ret() {
        return fila_ret;
    }

    public void setFila_ret(int fila_ret) {
        this.fila_ret = fila_ret;
    }

    public int getServ_cli() {
        return serv_cli;
    }

    public void setServ_cli(int serv_cli) {
        this.serv_cli = serv_cli;
    }

    public int getTotal_dep() {
        return total_dep;
    }

    public void setTotal_dep(int total_dep) {
        this.total_dep = total_dep;
    }

    public int getTotal_ret() {
        return total_ret;
    }

    public void setTotal_ret(int total_ret) {
        this.total_ret = total_ret;
    }

    public int getTotal_sc() {
        return total_sc;
    }

    public void setTotal_sc(int total_sc) {
        this.total_sc = total_sc;
    }

    public int getTotal_atendido() {
        return total_atendido;
    }

    public void setTotal_atendido(int total_atendido) {
        this.total_atendido = total_atendido;
    }

    @Override
    public String toString() {
        return "datos{" + "hora=" + hora + ", fila_ent=" + fila_ent + ", fila_dep=" + fila_dep + ", fila_ret=" + fila_ret + ", serv_cli=" + serv_cli + ", total_dep=" + total_dep + ", total_ret=" + total_ret + ", total_sc=" + total_sc + ", total_atendido=" + total_atendido + '}';
    }
    
}
