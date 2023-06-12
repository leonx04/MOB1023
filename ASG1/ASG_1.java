/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASG1;

import java.math.BigDecimal;

/**
 *
 * @author dungn
 */
public class ASG_1 {
    private String MaTL;
    private String TenTL;
    private Double SoLuong ;
    private BigDecimal DonGia;
    private String LoaiTL;
    private String DTC;

    public ASG_1(String MaTL, String TenTL, Double SoLuong, BigDecimal DonGia, String LoaiTL, String DTC) {
        this.MaTL = MaTL;
        this.TenTL = TenTL;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.LoaiTL = LoaiTL;
        this.DTC = DTC;
    }

    public String getMaTL() {
        return MaTL;
    }

    public String getTenTL() {
        return TenTL;
    }

    public Double getSoLuong() {
        return SoLuong;
    }

    public BigDecimal getDonGia() {
        return DonGia;
    }

    public String getLoaiTL() {
        return LoaiTL;
    }

    public String getDTC() {
        return DTC;
    }

    public void setMaTL(String MaTL) {
        this.MaTL = MaTL;
    }

    public void setTenTL(String TenTL) {
        this.TenTL = TenTL;
    }

    public void setSoLuong(Double SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setDonGia(BigDecimal DonGia) {
        this.DonGia = DonGia;
    }

    public void setLoaiTL(String LoaiTL) {
        this.LoaiTL = LoaiTL;
    }

    public void setGoiBH(String DTC) {
        this.DTC = DTC;
    }

    

   
}
