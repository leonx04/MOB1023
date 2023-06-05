/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B12;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author dungn
 */
public class NhanVien implements Serializable{

    public static void addNhanVien(NhanVien nv) {}

    public static void XoaNhanVien(int selectedRow) {}
    
    
    private String TenNhanVien;
    private Date SinhNhat;
    private String GioiTinh;
    private int Vong1;
    private int Vong2;
    private int Vong3;

    public NhanVien(String TenNhanVien, Date SinhNhat, String GioiTinh, int Vong1, int Vong2, int Vong3) {
        this.TenNhanVien = TenNhanVien;
        this.SinhNhat = SinhNhat;
        this.GioiTinh = GioiTinh;
        this.Vong1 = Vong1;
        this.Vong2 = Vong2;
        this.Vong3 = Vong3;
    }

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public Date getSinhNhat() {
        return SinhNhat;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public int getVong1() {
        return Vong1;
    }

    public int getVong2() {
        return Vong2;
    }

    public int getVong3() {
        return Vong3;
    }

    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
    }

    public void setSinhNhat(Date SinhNhat) {
        this.SinhNhat = SinhNhat;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public void setVong1(int Vong1) {
        this.Vong1 = Vong1;
    }

    public void setVong2(int Vong2) {
        this.Vong2 = Vong2;
    }

    public void setVong3(int Vong3) {
        this.Vong3 = Vong3;
    }
    
    
}
