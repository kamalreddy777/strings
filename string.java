public class string {
    public static void main(String[] args) {
        //method 1
        String str="java";
        System.out.println(str);
        //method 2
        char c[]={'H','e','l','l','o'};
        String str1= new String(c);
        System.out.println(str1);
        //method 3
        byte b[]={65,66,68,46};
        String str2=new String(b);
        System.out.println(str2);
        //method 4
        String str3=new String("java");
        System.out.println(str3);
        //pool&heap
        System.out.println(str==str3);
    }
}
