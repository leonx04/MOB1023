/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3_4_P2;

/**
 *
 * @author dungn
 */
public class Dongho {
    private String maDongHo;
    private String tenDongHo;
    private String xuatXu;
    private double namSanXuat;
    private double giaTien;

    public Dongho(String maDongHo, String tenDongHo, String xuatXu, double namSanXuat, double giaTien) {
        this.maDongHo = maDongHo;
        this.tenDongHo = tenDongHo;
        this.xuatXu = xuatXu;
        this.namSanXuat = namSanXuat;
        this.giaTien = giaTien;
    }

    public String getMaDongHo() {
        return maDongHo;
    }

    public String getTenDongHo() {
        return tenDongHo;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public double getNamSanXuat() {
        return namSanXuat;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setMaDongHo(String maDongHo) {
        this.maDongHo = maDongHo;
    }

    public void setTenDongHo(String tenDongHo) {
        this.tenDongHo = tenDongHo;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public void setNamSanXuat(double namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

   
}
