/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB3_4;

import java.util.Date;

/**
 *
 * @author dungn
 */
public class NguoiYeuCu {

    public NguoiYeuCu(String hoTen, Date SinhNhat) {
        this.hoTen = hoTen;
        this.SinhNhat = SinhNhat;
    }

    public String getHoTen() {
        return hoTen;
    }

    public Date getSinhNhat() {
        return SinhNhat;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setSinhNhat(Date SinhNhat) {
        this.SinhNhat = SinhNhat;
    }
    
    private String hoTen;
    private Date SinhNhat;

    
}
