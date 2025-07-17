import java.util.Scanner;

class P19 {
     public static void main(String args[]){
     Scanner sc=new Scanner(System.in);

     System.out.println("enter first number");
     float num1=sc.nextFloat();

     System.out.println("enter second number");
     float num2=sc.nextFloat();

     num1=num2;
     num2=num1;
    System.out.println(num1);
    System.out.println(num2);
    sc.close();
}
}
