public class regular_expression {
    public static void main(String[] args) {
        String str="programmer@gmail.com",username,domainname,check;
        int i;
       if(str.matches("\\w*@gmail.com")) {
           i = str.indexOf("@");
           username = str.substring(0, i);
           System.out.println("username is: " + username);
           domainname = str.substring(i + 1, str.length());
           System.out.println("domainname is: " + domainname);
       }
       else{
           System.out.println("this is not a gmail");
       }



    }
}
