public class bai20_xuLyNgoaiLe {

  public static void main(String[] args) {
    int a = 10;
    int b = 0;


    try {
      int c = a / b;

      System.out.println("c = " + c);
    }
    catch (Exception ex){
      System.out.println("Co loi rui!");
      ex.printStackTrace();
    }
    System.out.println("Doan code tiep theo");
  }

}
