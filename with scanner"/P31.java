import java.util.Scanner;

class P31 {
     public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
         int perimeter,side,area;
         int length;
        perimeter=sc.nextInt();
        
        side=perimeter/4;
        area=side*side;
        System.out.println(area);
    }
}
