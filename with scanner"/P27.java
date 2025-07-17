import java.util.Scanner;

class P27 {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int surfaceArea,cost;
         int length,breadth;
        length=sc.nextInt();
        breadth=sc.nextInt();
        surfaceArea=length*breadth;
        cost=surfaceArea*5;
        System.out.println(cost);
    }
}
