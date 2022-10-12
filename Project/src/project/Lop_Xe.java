/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author xuank
 */
public abstract class Lop_Xe implements ITinhTien{
    protected String BienSoXe, MauXe, TenXe, TrangThai;
    protected int SoNgayThueDuKien;
    protected Date NgayThue, NgayTra;

    public Lop_Xe() {
    }

    public Lop_Xe(String BienSoXe, String MauXe, String TenXe, String TrangThai, int SoNgayThueDuKien, Date NgayThue, Date NgayTra) {
        this.BienSoXe = BienSoXe;
        this.MauXe = MauXe;
        this.TenXe = TenXe;
        this.TrangThai = TrangThai;
        this.SoNgayThueDuKien = SoNgayThueDuKien;
        this.NgayThue = NgayThue;
        this.NgayTra = NgayTra;
    }

    public String getBienSoXe() {
        return BienSoXe;
    }

    public String getMauXe() {
        return MauXe;
    }

    public String getTenXe() {
        return TenXe;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public int getSoNgayThueDuKien() {
        return SoNgayThueDuKien;
    }

    public Date getNgayThue() {
        return NgayThue;
    }

    public Date getNgayTra() {
        return NgayTra;
    }

    public void setBienSoXe(String BienSoXe) {
        this.BienSoXe = BienSoXe;
    }

    public void setMauXe(String MauXe) {
        this.MauXe = MauXe;
    }

    public void setTenXe(String TenXe) {
        this.TenXe = TenXe;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public void setSoNgayThueDuKien(int SoNgayThueDuKien) {
        this.SoNgayThueDuKien = SoNgayThueDuKien;
    }

    public void setNgayThue(Date NgayThue) {
        this.NgayThue = NgayThue;
    }

    public void setNgayTra(Date NgayTra) {
        this.NgayTra = NgayTra;
    }
    
}
