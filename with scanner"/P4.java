import java.util.Scanner;

class P4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int length,breadth,area;
        System.out.println("enter the value of length");
        length=sc.nextInt();
        System.out.println("enter the value of bredth");
        breadth=sc.nextInt();
        area=length*breadth;
        int totalCost=(area/100)*6;
        System.out.println(totalCost);
    }
}
