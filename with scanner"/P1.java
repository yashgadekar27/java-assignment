import java.util.Scanner;

class P1{
    public static void main(String[] args) {
        Scanner Sc =new Scanner (System.in);
        System.out.println("enter length of reactangle");
        int l =Sc.nextInt();
        System.out.println("enter breath of rectangle");
        int b =Sc.nextInt();
        int p=2*(l+b);
        System.out.println("perimeter of rectangle is "+p);
        
    }
}