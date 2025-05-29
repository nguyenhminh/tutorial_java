import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class count_string {


    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);


//      System.out.println("Nhập đoạn văn:");
//      String paragraph = scanner.nextLine();
      String paragraph = "The class String includes methods for examining individual characters of the sequence, for comparing strings, for searching strings, for extracting substrings, and for creating a copy of a string with all characters translated to uppercase or to lowercase."
          + " Case mapping is based on the Unicode Standard version specified by the Character class.\n\tThe Java language provides special support for the string concatenation operator ( + ), and for conversion of other objects to strings. "
          + "String concatenation is implemented through the StringBuilder(or StringBuffer) class and its append method. String conversions are implemented through the method toString, defined by Object and inherited by all classes in Java. For additional information on string concatenation and conversion, see Gosling, Joy, and Steele, The Java Language Specification."
          + "\n\tUnless otherwise noted, passing a null argument to a constructor or method in this class will cause a NullPointerException to be thrown.";



      String lowerCaseParagraph = paragraph.toLowerCase();
      String keyword = "string";


      List<Integer> indexList = new ArrayList<>();
      int index = lowerCaseParagraph.indexOf(keyword);

      while (index != -1) {
        indexList.add(index);
        index = lowerCaseParagraph.indexOf(keyword, index + keyword.length());
      }

      System.out.println("Từ 'string' xuất hiện " + indexList.size() + " lần.");
      System.out.println("Vị trí xuất hiện (index): " + indexList);
    }
  }



