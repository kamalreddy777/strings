import java.util.Locale;

public class methods {
    public static void main(String[] args) {
        /*strings are immutable
          it creates new object for string methods
         */
        //length():returns length of a string
        String str=" kamal Reddy ";
        int len;
        len = str.length();
        System.out.println(len);
        //toLowerCase():convert to lower case
        str=str.toLowerCase();
        System.out.println(str);
        //toUpperCase():convert to upper case
        str=str.toUpperCase();
        System.out.println(str);
        //trim():remove spaces
        str=str.trim();
        System.out.println(str);
        System.out.println(str.length());
        //sub string():returns sub string
        str=str.substring(1);
        System.out.println(str);
        str=str.substring(1,4);
        System.out.println(str);


    }
}
