/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu3;

/**
 *
 * @author dungn
 */
public class QLSV {
    String ma;
    String tenSV;
    String gioiTinh ;
    private Integer namSinh;

    public QLSV(String ma, String tenSV, String gioiTinh, Integer namSinh) {
        this.ma = ma;
        this.tenSV = tenSV;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
    }

    public String getMa() {
        return ma;
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

    public void setMa(String ma) {
        this.ma = ma;
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
