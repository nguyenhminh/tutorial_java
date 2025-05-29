public class bai23_mathTrongJava {

  public static void main(String[] args) {
    System.out.println("Pi = " + Math.PI);

    //Trị tuyệt đối
    int a = -8;
    System.out.println(Math.abs(a));

    //Max - min
    System.out.println(Math.max(6, 777));
    System.out.println(Math.min(6, 777));

    //Căn bậc hai
    System.out.println(Math.sqrt(4));

    //Lũy thừa
    System.out.println(Math.pow(2, 3));

    //cos, sin, tan
    int goc = 90;
    double sin = Math.sin(Math.PI * goc / 180);
    double cos = Math.cos(Math.PI * goc / 180);
    double tan = Math.tan(Math.PI * goc / 180);
    System.out.println("sin 90 = " + sin);
    System.out.println("cos 90 = " + cos);
    System.out.println("tan 90 = " + tan);
  }
}
