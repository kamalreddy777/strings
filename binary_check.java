import java.util.Scanner;

public class binary_check {
    public static void main(String[] args) {
        String binary,hexadecimal,date;
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number:");
        binary=s.nextLine();
        System.out.println("enter a number:");
        hexadecimal=s.nextLine();
        System.out.println("enter the date:");
        date=s.nextLine();
        if(binary.matches("[0-1]+")){
            System.out.println("it is a binary number");
        }
        if (hexadecimal.matches("[0-9A-F]+")){
            System.out.println("it is a hexadecimal number");
        }
        if(date.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}")){
            System.out.println("you entered date in correct format");
        }
    }
}
