/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author xuank
 */
public class XeMay extends Lop_Xe{
        private String LoaiXe;

    public XeMay() {
    }

    public XeMay(String LoaiXe) {
        this.LoaiXe = LoaiXe;
    }

    public String getLoaiXe() {
        return LoaiXe;
    }

    public void setLoaiXe(String LoaiXe) {
        this.LoaiXe = LoaiXe;
    }
    
    @Override
    public double TinhTien(){
        if(getLoaiXe().equals("Xe So")){
            if(Tinh_Ngay_Thue() <=3 ){
                return 120000; 
            } else if(Tinh_Ngay_Thue() <= 5){
                return 100000;
            } else if(Tinh_Ngay_Thue() <= 15){
                return 80000;
            } else{
                return 50000;
            }
        } 
        if(getLoaiXe().equals("Xe May")){
        } else {
            if(Tinh_Ngay_Thue() <= 3){
                return 180000; 
            } else if(Tinh_Ngay_Thue() <= 5){
                return 160000;
            } else if(Tinh_Ngay_Thue() <= 15){
                return 140000;
            } else{
                return 100000;
            }
            }
        return(0); 
    }
    
    public int Tinh_Ngay_Thue(){
        Calendar c1 = new GregorianCalendar();
        Calendar c2 = new GregorianCalendar();
        c1.setTime(NgayThue);
        c2.setTime(NgayTra);
        return c2.get(Calendar.YEAR)-c1.get(Calendar.YEAR); 
    }
}
