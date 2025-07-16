 class P32 {
    public static void main(String args[]){
        int gardenSide = 150;
        int gardenArea = gardenSide*gardenSide;

        int poolSide = 25;
        int poolArea = poolSide * poolSide;

        int actualGardenArea = gardenArea - poolArea;
        System.out.println(actualGardenArea);
    }
    
}
