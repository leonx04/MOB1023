/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5_6;

/**
 *
 * @author dungn
 */
public class DieuHoa {
    private String MaDH;
    private String TenDH;
    private String  LoaiDH;
    private String CongSuat;
    private String LuuLuongGio;

    public DieuHoa(String MaDH, String TenDH, String LoaiDH, String CongSuat, String LuuLuongGio) {
        this.MaDH = MaDH;
        this.TenDH = TenDH;
        this.LoaiDH = LoaiDH;
        this.CongSuat = CongSuat;
        this.LuuLuongGio = LuuLuongGio;
    }

     public DieuHoa() {}

    public String getMaDH() {
        return MaDH;
    }

    public String getTenDH() {
        return TenDH;
    }

    public String getLoaiDH() {
        return LoaiDH;
    }

    public String getCongSuat() {
        return CongSuat;
    }

    public String getLuuLuongGio() {
        return LuuLuongGio;
    }

    public void setMaDH(String MaDH) {
        this.MaDH = MaDH;
    }

    public void setTenDH(String TenDH) {
        this.TenDH = TenDH;
    }

    public void setLoaiDH(String LoaiDH) {
        this.LoaiDH = LoaiDH;
    }

    public void setCongSuat(String CongSuat) {
        this.CongSuat = CongSuat;
    }

    public void setLuuLuongGio(String LuuLuongGio) {
        this.LuuLuongGio = LuuLuongGio;
    }
    
    
}
