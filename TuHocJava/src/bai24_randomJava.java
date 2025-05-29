import java.util.Random;

public class bai24_randomJava {

  public static void main(String[] args) {
    //Khởi tạo một đối tượng ngẫu nhiên
    Random rd = new Random();

    int soNguyen = rd.nextInt(-50,51); // -50 <= soNguyen <= 50
    int soNguyen1 = rd.nextInt(51); // 0 <= soNguyen <= 50
    System.out.println(soNguyen1);
  }
}
