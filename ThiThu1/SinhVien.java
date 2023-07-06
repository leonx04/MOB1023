/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu1;

/**
 *
 * @author dungn
 */
public class SinhVien {
    private String maSV;
    private String tenSV;
    private String gioiTinh;
    Integer namSinh;

    public SinhVien(String maSV, String tenSV, String gioiTinh, Integer namSinh) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public Integer getNamSinh() {
        return namSinh;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setNamSinh(Integer namSinh) {
        this.namSinh = namSinh;
    }
  
    
}
