import java.util.Scanner;

public class bai10_scannerJava {

  public static void main(String[] args) {
    //Khởi tạo đối tượng
    Scanner sc = new Scanner(System.in);

    //Cho phép nhập chuỗi
    System.out.println("Mời nhập vào mật khẩu cấp 1: ");
    String mk1 = sc.nextLine();
    System.out.println("Mật khẩu cấp 1 là: " + mk1);

    //Nhập số nguyên
    System.out.println("Mời nhập vào số nguyên a: ");
    int a = sc.nextInt();
    System.out.println("a = " + a);

    //Nhập số float
    System.out.println("Mời nhập vào số thực b: ");
    float b = sc.nextFloat();
    System.out.println("b = " + b);
  }
}
