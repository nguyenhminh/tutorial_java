import java.util.Arrays;

public class bai26_BT1 {

  public static void main(String[] args) {
//    Cho chuỗi
//    String str1= "English = 78 Science = 83 Math = 68 History = 65"
//    1. Tính tổng các số trong chuỗi trên
//    2. Tính trung bình cộng

    String str1 = "English = 78 Science = 83 Math = 68 History = 65";
    int sum = 0; //Biến tính tổng
    int count = 0; // Biến lưu số lượng số

    //Tách chuỗi thành các phần tử bằng cách sử dụng split() của lớp String
    String[] parts = str1.split(" ");
    System.out.println("Parts: " + Arrays.toString(parts));

    //Duyệt mảng string và chuyển qua kiểu số nếu có thể
    for (String pt : parts) {
      System.out.println(pt);
      try {
        //Chuyển đổi chuỗi sang số nguyên
        int num = Integer.parseInt(pt);
        sum += num;
        count++;
      } catch (NumberFormatException e) {
        //Bỏ qua
      }

      //Tính TBC
      double tbc = (double) sum/count;
      System.out.println("Tổng các số trong chuỗi là: " + sum);
      System.out.println("TBC các số trong chuỗi là: " + tbc);
    }

  }
}
