import java.util.Scanner;

class P30 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = sc.nextInt();

        if(year % 100 == 0){

            if(year % 400 == 0) System.out.println("GIven year is a leap year.");
            else System.out.println("GIven year is not a leap year.");

        }else if(year % 4 == 0){
            System.out.println("GIven year is a leap year.");
        } else {
            System.out.println("GIven year is not a leap year.");
        }
    }
}
