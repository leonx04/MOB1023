/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB3_4;

/**
 *
 * @author dungn
 */
public class SinhVien {
    
    private String MSSV ;
    private String HoTen ;
    private Double DiemLab;
    private Double Quiz ;
    private Double ASG ;

    public SinhVien(String MSSV, String HoTen, Double DiemLab, Double Quiz, Double ASG) {
        this.MSSV = MSSV;
        this.HoTen = HoTen;
        this.DiemLab = DiemLab;
        this.Quiz = Quiz;
        this.ASG = ASG;
    }

    public String getMSSV() {
        return MSSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public Double getDiemLab() {
        return DiemLab;
    }

    public Double getQuiz() {
        return Quiz;
    }

    public Double getASG() {
        return ASG;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setDiemLab(Double DiemLab) {
        this.DiemLab = DiemLab;
    }

    public void setQuiz(Double Quiz) {
        this.Quiz = Quiz;
    }

    public void setASG(Double ASG) {
        this.ASG = ASG;
    }
    
}
