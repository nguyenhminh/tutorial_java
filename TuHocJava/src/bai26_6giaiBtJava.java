import java.util.Scanner;

public class bai26_6giaiBtJava {

  public static void main(String[] args) {
//    boolean kq = checkMk("1234sdfgs");
//    if (kq) {
//      System.out.println("MK hop le!");
//    } else {
//      System.out.println("MK k hop le");
//    }
    Scanner sc = new Scanner(System.in);
    String password = "";
    while (true) {
      System.out.println("Moi thiet lap Mk");
      System.out.println("MK it nhat 6 ky tu, it nhat mot chu cai va it nhat 1 chu so: ")
      ;
      String newPassword = sc.nextLine();
      if (checkMk((newPassword))) {
        password = newPassword;
        System.out.println("MK moi da duoc thiet lap");
        break;
      } else {
        System.out.println("MK k hop le, nhap lai");
      }
    }

    int count = 0;
    String login = "";
    while (true) {
      System.out.println("Moi nhap mk login: ");
      login = sc.nextLine();
      if (login.equals(password)) {
        System.out.println("Dang nhap thanh cong!");
        break;
      } else {
        System.out.println("MK k hop le");
        count++;
      }
      if (count == 5) {
        System.out.println("Ban da nhap sai qua 5 lan, bi khoa");
        break;
      }
    }
  }

  public static boolean checkMk(String password) {
    //Kiem tra do dai
    if (password.length() < 6) {
      return false;
    }

    boolean hasLetter = false;
    for (char c : password.toCharArray()) {
      if (Character.isLetter(c)) {
        hasLetter = true;
        break;
      }
    }

    if (!hasLetter) {
      return false;
    }

    boolean hasNumber = false;
    for (char c : password.toCharArray()) {
      if (Character.isDigit(c)) {
        hasNumber = true;
        break;
      }
    }

    if (!hasNumber) {
      return false;
    }

    return true;
  }
}
