/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5_6;

import java.io.Serializable;
import java.util.Date;

public class NguoiYeu implements Serializable{
    private String TenNY;
    private Date SinhNhat;
    private String QueQuan;
    private String GioiTinh;

    public String getTenNY() {
        return TenNY;
    }

    public void setTenNY(String TenNY) {
        this.TenNY = TenNY;
    }

    public Date getSinhNhat() {
        return SinhNhat;
    }

    public void setSinhNhat(Date SinhNhat) {
        this.SinhNhat = SinhNhat;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }
}
