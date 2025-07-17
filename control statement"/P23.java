import java.util.Scanner;

class P23 {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check even or odd:");
        int num1 = sc.nextInt();

        if(num1 % 2 == 0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

    }
}
