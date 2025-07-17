import java.util.Scanner;

class P21 {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int bl=15,bh=5,bb=8,wh=1500,wl=1000,wb=800,areaBrick,areaWall;




          System.out.println("enter the length of the brick");
        bl=sc.nextInt();
           System.out.println("enter the breadth of the brick");
        bb=sc.nextInt();
           System.out.println("enter the hight of the brick");
        bh=sc.nextInt(); 
         System.out.println("enter the length of the wall ");
        wl=sc.nextInt();
           System.out.println("enter the breadth of the wall ");
        wb=sc.nextInt();
           System.out.println("enter the hight of the wall ");
        wh=sc.nextInt();




        areaBrick=bl*bh*bb;
        areaWall=wh*wl*wb;
        float totalBrickRequired=areaWall/areaBrick;
        System.out.println(totalBrickRequired);
    }
}
