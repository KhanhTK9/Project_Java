/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author xuank
 */
public class Oto extends Lop_Xe{
    private int SoCho;
    private int So_km; 
    private int So_Gio; 
    public Oto() {
    }

    public Oto(int SoCho) {
        this.SoCho = SoCho;
    }

    public int getSoCho() {
        return SoCho;
    }

    public void setSoCho(int SoCho) {
        this.SoCho = SoCho;
    }
    
    @Override
    public double TinhTien() {
        if(getSoCho() == 4){
            return 750000;
        } 
        if(getSoCho() == 7){
            return 1000000;
        }
        return(0);   
    }
    
    public double Tien_Qua_Han(){
        return(0); 
    }
    
}
