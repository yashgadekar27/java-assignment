import java.util.Scanner;

class P3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
           int area,breadth,length,perimeter;
        System.out.println("enter the value of area");
        area=sc.nextInt();
        System.out.println("enter the value of breadth");
        breadth=sc.nextInt();
        
        length=area/breadth;
        perimeter=2*(length+breadth);
        System.out.println(length);
        System.out.println(perimeter);
    }
}
