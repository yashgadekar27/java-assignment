import java.util.Scanner;

class P36 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
          double surfacearea;
        int diameter=sc.nextInt();
        int height=sc.nextInt();
        double radius=diameter/2;
        surfacearea=2*3.14*radius*(radius+height);
        System.out.println(surfacearea);
    }
}
