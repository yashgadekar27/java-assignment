import java.util.Scanner;

public class P28 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int surfaceArea,cost;
         int length,breadth;
        length=sc.nextInt();
        breadth=sc.nextInt();
        surfaceArea=length*breadth;
        cost=surfaceArea*205;
        System.out.println(cost);
    }
}
