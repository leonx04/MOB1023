/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5_6;

import java.io.Serializable;

/**
 *
 * @author dungn
 */
public class SinhVien implements Serializable{
    private String  mssv;
    private String  hoTen;
    private String  chuyenNganh;
    private String soTC;

    public SinhVien(String mssv, String hoTen, String chuyenNganh, String soTC) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.chuyenNganh = chuyenNganh;
        this.soTC = soTC;
    }

    public String getMssv() {
        return mssv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public String getSoTC() {
        return soTC;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public void setSoTC(String soTC) {
        this.soTC = soTC;
    }
    
}
