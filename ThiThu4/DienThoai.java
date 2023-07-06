/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu4;

/**
 *
 * @author dungn
 */
public class DienThoai {
    String ma ;
    String hang;
    String mauSac;
    String boNho;
    Integer gia;

    public DienThoai(String ma, String hang, String mauSac, String boNho, Integer gia) {
        this.ma = ma;
        this.hang = hang;
        this.mauSac = mauSac;
        this.boNho = boNho;
        this.gia = gia;
    }

    public String getMa() {
        return ma;
    }

    public String getHang() {
        return hang;
    }

    public String getMauSac() {
        return mauSac;
    }

    public String getBoNho() {
        return boNho;
    }

    public Integer getGia() {
        return gia;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public void setBoNho(String boNho) {
        this.boNho = boNho;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }
    
    
}
