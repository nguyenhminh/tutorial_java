import java.util.Scanner;

public class bai26_charTrongJava {

  public static void main(String[] args) {
  /*  //Khai baos
    char ch = 'a';
    char ch2 = 66;
    System.out.println(ch2);
    Scanner sc = new Scanner(System.in);
    System.out.println("Mời nhập vào 1 ký tự: ");

    //Đọc dl từ bàn phím
    String input = sc.nextLine();
    char ch3 = input.charAt(0); //Lấy ký tự đầu tiên  trong chuỗi string
    System.out.println("Ký tự vừa nhập " + ch3);

    //So sánh
    System.out.println(Character.compare('b', 'b'));
    System.out.println(Character.compare('a', 'b'));*/

    char ch4 = '1';
    char ch5 = 'a';
    char ch6 = 'A';
    char ch7 = ' ';

    System.out.println(Character.isDigit(ch4));
    System.out.println(Character.isLetter(ch5));
    System.out.println(Character.isUpperCase(ch6));
    System.out.println(Character.isLowerCase(ch6));
    System.out.println(Character.isWhitespace(ch7));

  }
}
