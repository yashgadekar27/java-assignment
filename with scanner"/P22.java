import java.util.Scanner;

class P22 {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
          int length,breadth,deapth,vol;
          System.out.println("enter the length");
        length=sc.nextInt();
           System.out.println("enter the breadth");
        breadth=sc.nextInt();
           System.out.println("enter the deapth");
        deapth=sc.nextInt();
        vol=length*breadth*deapth;
        System.out.println(vol);
    }
}
