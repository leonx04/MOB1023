/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B31_5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author dungn
 */
public class ViDu_Ghi_Chuoi {
     public static void main(String[] args) {
        try {
            // 1. Mở kết nối đến file vi_du_1.txt
            //  trường hợp file không tồn tại -> FileNotFoundException
            FileOutputStream fos = new FileOutputStream("vi_du_1.txt");
            
            // 2. Chuyển nội dung dạng String -> byte[]
            String message = "Hello, SD18322";
            byte[] mes = message.getBytes();
            
            // 3. Ghi nội dung
            //  trường hợp ghi lỗi -> IOException
            fos.write(mes);
            
            // 4. Đóng kết nối
            fos.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File không tồn tại!");
        } catch (IOException ex) {
            System.out.println("Lỗi đọc ghi!");
        }
    }
}
