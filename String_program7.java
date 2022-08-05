
import java.util.Scanner;

/*
7) How to reverse String without recursion
 */
public class String_program7 {
    public static String reverseString(String str){
      if(str.isEmpty()){
         return str;
      }else{
         return reverseString(str.substring(1))+str.charAt(0);
      }
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a String value: ");
      String str = sc.next();
      String result = program7.reverseString(str);
      System.out.println(result);
   }
}
