import java.util.Scanner;

public class regular_expression {
    public static void main(String[] args) {
        String id,username,domainname,check;
        int i;
        Scanner str=new Scanner(System.in);
        System.out.println("enter your mail:");
        id= str.nextLine();
       // System.out.println(id);
       if(id.matches("\\w*@gmail.com")) {
           i = id.indexOf("@");
           username = id.substring(0, i);
           System.out.println("username is: " + username);
           domainname = id.substring(i + 1, id.length());
           System.out.println("domainname is: " + domainname);
       }
       else{
           System.out.println("this is not a gmail");
       }



    }
}
