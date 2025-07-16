 class P6 {
     public static void main(String args[]){
        int a = 10;
        int b = 9;
        int perimeter = 36;  
        
        int c = perimeter - a - b; 

        
        int s = perimeter/2; 
        int area = s*(s-a)*(s-b)*(s-c);
        area = (int)Math.sqrt(area);

        System.out.println("c = "+ c);
        System.out.println("perimeter = "+ perimeter);
        System.out.println("area = "+ area);

    }
    
}
