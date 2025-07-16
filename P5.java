 class P5 {
public static void main (String args[]){
        int costOfFencing = 1600;
        int rate = 25;
        int length = 20;

        int perimeter = costOfFencing/rate;
         int breadth = perimeter/2 - length;

        int area = length * breadth;

        System.out.println("perimeter = "+ perimeter);
        System.out.println("breadth = "+ breadth);
        System.out.println("area = "+ area);
    }
}
    

