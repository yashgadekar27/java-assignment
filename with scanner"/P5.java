import java.util.Scanner;

class P5 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int length,breadth,perimeter,area,cost;
        System.out.println("enter the value of length");
        length=sc.nextInt();
        System.out.println("enter the cost");
        cost=sc.nextInt();
        perimeter=cost/25;
        breadth=(perimeter/2)-length;
        area=length*breadth;
        System.out.println(breadth);
        System.out.println(perimeter);
        System.out.println(area);
    }
}
