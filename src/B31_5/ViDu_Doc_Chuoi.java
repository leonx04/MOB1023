/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B31_5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Phong
 */
public class ViDu_Doc_Chuoi {
    
    public static void main(String[] args) {
        try {
            // 1. Mở kết nối đến file
            //  trường hợp không tìm thấy -> FileNotFoundException
            FileInputStream fis = new FileInputStream("E:\\fpoly\\Semester\\SU23\\B1\\MOB1023\\MOB1023_SD18322\\vi_du_1.txt");
            
            // 2. Lấy toàn bộ dữ liệu dạng byte trong file
            byte[] mes = fis.readAllBytes();
            
            // 3. Đổi từ byte sang String
            String message = new String(mes, "UTF-8");
            
            // 4. In kết quả và đóng kết nối
            System.out.println(message);
            fis.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Không tìm thấy file");
        } catch (IOException ex) {
            System.out.println("Đọc file không được!!");
        }
    }
}