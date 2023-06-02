/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASIGNMENT_1;
/**
 *
 * @author dungn
 */
public class ASIGNMENT_1 {
    private String maSP ;
    private String tenSP ;
    private Double donGia ;
    private int  soLuong ;
    private String hinhThucVC ;
    private String hinhThucBan ;

    public ASIGNMENT_1(String maSP, String tenSP, Double donGia, int soLuong, String hinhThucVC, String hinhThucBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.hinhThucVC = hinhThucVC;
        this.hinhThucBan = hinhThucBan;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public Double getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getHinhThucVC() {
        return hinhThucVC;
    }

    public String getHinhThucBan() {
        return hinhThucBan;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setHinhThucVC(String hinhThucVC) {
        this.hinhThucVC = hinhThucVC;
    }

    public void setHinhThucBan(String hinhThucBan) {
        this.hinhThucBan = hinhThucBan;
    }
    
    
}
