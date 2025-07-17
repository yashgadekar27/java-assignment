 import java.util.Scanner;
 
 class P3{
    public static void main (String args[]) {
    Scanner sc =new Scanner(System.in);

    System.out.println("year of service ");
    double year=sc.nextInt();

     System.out.println("salery ");
     double salery=sc.nextInt();
     if(year>5){
      double bonus=(salery*5/100);
      System.out.println( "you are getting bonus"+bonus);
     }
      else{
      System.out.println("you are not getting bonus");
    }
}
 }






