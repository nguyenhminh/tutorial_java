public class bai9_toanTuLogic {

  public static void main(String[] args) {
    //Kiem tra gia tri i>0 và i<10 không?
    int i = 7;
    System.out.println(i > 0 && i < 10);

    int a = 1;
    int b = 2;
    int c = a++ - ++b + 1;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}
