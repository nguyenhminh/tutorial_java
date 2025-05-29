import java.util.Scanner;

public class bai26_vanDungString {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập vào một chuỗi: ");

    //đọc dl và gán biến
    String s = sc.nextLine();

//    gán biến
    int demSo = 0;
    int demInThuong = 0;
    int demInHoa = 0;
    int demSpace = 0;

    for (int i = 0; i < s.length(); i++) {
//      System.out.println(i);
      char c = s.charAt(i);
      if (Character.isLowerCase(c)) {
        demInThuong++;
      } else if (Character.isUpperCase(c)) {
        demInHoa++;
      } else if (Character.isDigit(c)) {
        demSo++;
      } else if (Character.isWhitespace(c)) {
        demSpace++;
      }
    }
    System.out.println("Số lượng ký tự thường: " + demInThuong);
    System.out.println("Số lượng ký tự hoa: " + demInHoa);
    System.out.println("Số lượng ký tự số: " + demSo);
    System.out.println("Số lượng ký tự space: " + demSpace);
  }
}
