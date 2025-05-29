public class bai26_1_string1 {

  public static void main(String[] args) {
//    String s = "Trong đầm gì đẹp bằng sen" +
//        "\nLá xanh bông trắng lại chen nhị vàng!";
//    System.out.println(s);

//    StringBuilder chuoi = new StringBuilder();
//    //append: thêm giá trị
//    chuoi.append("Xin chao, ");
//    chuoi.append("mình tên là Minh!");
//    System.out.println(chuoi);
//
//    //insert
//    chuoi.insert(8, " bạn");
//    System.out.println(chuoi);
//
//    //delete
//    chuoi.delete(8, 9);
//    System.out.println(chuoi);
//    System.out.println(chuoi.length());

//    String s7 = " Minh dep trai";
//    System.out.println(s7.indexOf("Minh"));
//    System.out.println(s7.lastIndexOf("trai"));
//    System.out.println(s7.contains("trai"));
//    String s9 = "mp3";
//    String s10 = "Co mp3 trong chuoi";
//    boolean check = s10.contains(s9);
//    System.out.println(check);
//
//    String s11 = "abcsdfdsfjd";
//    String s12 = s11.substring(2);
//    System.out.println("s12: " + s12);
//
//    String s13 = s11.substring(4, 6);
//    System.out.println("s13: " + s13);

//    String s14 = "Toi di tim Toi";
//    String s15 = s14.replace("Toi", "Ban");
//    System.out.println(s15);
//
//    String s16 = s14.replaceFirst("Toi", "Ban");
//    System.out.println(s16);
//
//    String s18 = "     Xoa space    ";
//    System.out.println("s19: " + s18.trim());

   /* String s19 = "Abc123";
    String s20 = "Abc123";
    int x = s19.compareTo(s20);
    System.out.println("x = " + x);

    String s21 = "Abc123";
    String s22 = "abc123";
    int x1 = s21.compareTo(s22);
    System.out.println("x1 = " + x1);


    String s23 = "Abc123";
    String s24 = "abc123";
    int x2 = s21.compareToIgnoreCase(s22);
    System.out.println("x2 = " + x2);*/

    String s25 = "Hello, world!";
    String[] mang = s25.split(", ");

    for (int i = 0; i < mang.length; i++) {
      System.out.println(mang[i]);
    }
  }
}
