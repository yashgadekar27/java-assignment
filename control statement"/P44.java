import java.util.Scanner;

public class P44 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter choices(+,>,==):");
        String input = sc.nextLine();
        switch(input){
            case "+":
                System.out.println("Result of sum: "+ (a+b));
                break;
            case ">":
                System.out.println("A is greater than B: "+ (a>b));
                break;
            case "==":
                System.out.println("A equals to B: "+ (a==b));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
