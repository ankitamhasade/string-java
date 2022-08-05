/*
6) How to reverse a given String?
 */
public class String_program6 {
     public static String reverse(String str)
    {
        // return if the string is null or empty
        if (str == null || str.equals("")) {
            return str;
        }
 
        // get string length
        int n = str.length();
 
        // create a character array of the same size as that of string
        char[] temp = new char[n];
 
        // fill character array backward with characters in the string
        for (int i = 0; i < n; i++) {
            temp[n - i - 1] = str.charAt(i);
        }
 
        // convert character array to string and return it
        return String.copyValueOf(temp);
    }
 
    public static void main(String[] args)
    {
        String str = "Techie Delight";
 
        // String is immutable
        str = reverse(str);
 
        System.out.println("The reverse of the given string is: " + str);
    }
}
