package JavaClass;
 
import java.util.Scanner;
 
public class VD3 {
    public String hoTen, lop, diachi;
    private double diemki1, diemki2; 
    public void nhap() {
        Scanner scanner = new Scanner(System.in);   
        System.out.println("Nhập họ tên sinh viên: ");
        hoTen = scanner.nextLine();
        System.out.println("Nhập lớp: ");
        lop = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        diachi = scanner.nextLine();
        System.out.println("Nhập điểm Kì 1: ");
        diemki1 = scanner.nextDouble();
        System.out.println("Nhập điểm Kì 2: ");
        diemki2 = scanner.nextDouble();
        scanner.close();
    }
    public double tinhDiemTrungBinh(double a, double b) {
        return (a + b) / 2;
    }
     
    public String xepLoaiHocLuc(double diemTB) {
        if (diemTB >= 8 && diemTB <= 10) {
            return "Giỏi";
        }
        if (diemTB >= 6.5 && diemTB < 8) {
            return "Khá";
        }
        if (diemTB >= 5.0 && diemTB < 6) {
            return "Trung bình";
        }
        if (diemTB >= 0.0 && diemTB < 5) {
            return "Yếu";
        }
        return "Nhập sai!";
    }
     
    public static void main(String[] args) {
        VD3 student = new VD3();
        student.nhap();
        
        System.out.println("Điểm trung bình 2 kì = " + student.tinhDiemTrungBinh(student.diemki1, student.diemki2));
        
        System.out.println("Xếp loại:"+student.xepLoaiHocLuc( student.tinhDiemTrungBinh(student.diemki1, student.diemki2)));
        
    }
}