import java.util.Scanner;

public class bai11_ifElse {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Mời nhập vào điểm TB: ");
    double dtb = sc.nextDouble();

    if (dtb > 5.0) {
      System.out.println("Ban do");
    }
    else {
      System.out.println("Ban tach");
    }

  }

}
