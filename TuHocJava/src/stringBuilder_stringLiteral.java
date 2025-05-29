public class stringBuilder_stringLiteral {
  public static void main(String[] args) {
    int iterations = 10000;

    // Test 1: Sử dụng String literal (toán tử +)
    long startTime1 = System.currentTimeMillis();
    String result1 = "";
    for (int i = 0; i < iterations; i++) {
      result1 += "abc";  // tạo đối tượng mới mỗi lần nối
    }
    long endTime1 = System.currentTimeMillis();
    System.out.println("Thời gian với String literal (+): " + (endTime1 - startTime1) + " ms");

    // Test 2: Sử dụng StringBuilder
    long startTime2 = System.currentTimeMillis();
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < iterations; i++) {
      builder.append("abc");  // nối trực tiếp mà không tạo mới đối tượng
    }
    String result2 = builder.toString();
    long endTime2 = System.currentTimeMillis();
    System.out.println("Thời gian với StringBuilder: " + (endTime2 - startTime2) + " ms");
  }
}
