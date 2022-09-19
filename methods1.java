public class methods1 {
    public static void main(String[] args) {
        String str="kamal.reddy.kasu";
        System.out.println(str.startsWith("kamal"));//returns true or false
        System.out.println(str.endsWith("reddy"));//returns true or false
        System.out.println(str.charAt(4));//returns char at given index
        System.out.println(str.indexOf("."));//search from left to right
        System.out.println(str.lastIndexOf("."));//search from right to left
        System.out.println(str.lastIndexOf("p"));//returns -1 because no char p
        String str1="kamal",str2="KAMAL",str3="reddy",str4="reddy";
        System.out.println(str1.equals(str2));//returns true if both are true
        System.out.println(str3.equals(str4));//same
        System.out.println(str1.contentEquals("kamal"));//returns true if given string is equal
        System.out.println(str1.equalsIgnoreCase(str2));//ignore cases and checks
        System.out.println(str2.compareTo(str1));//returns difference b/w first letter of two strings
        System.out.println(str3.compareTo(str4));//if equal returns 0
        /*
        difference b/w equals() and ==
         */
        String s="java",s1="java";
        String s2=new String("java");
        System.out.println(s.equals(s1));//true
        System.out.println((s==s1));//true
        System.out.println(s2.equals(s));//true
        System.out.println((s2==s));/*false because it checks reference of a literal even though they
        are same but their reference is different*/

    }
}
