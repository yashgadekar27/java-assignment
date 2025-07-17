 import java.util.Scanner;

 
 class P2 {
        public static void main(String arg [])
         {
        Scanner Sc =new Scanner(System.in) ;
        System.out.println("enter area of reactangle");
          int area = Sc.nextInt() ;
          System.out.println("enter breadth of reactangle");
          int breadth = Sc.nextInt() ;
          int length = area/breadth ;
          System.out.println("length of reactangle"+length);
          int p=2*(length+breadth);
          System.out.println("perimeter of reactangle  ....."+p);



        }

 }
    
    
