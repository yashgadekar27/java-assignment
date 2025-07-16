 class P23 {
    public static void main(String args[]){
        // box
        int side = 3;
       int cubeVolume = side*side*side;

       //carton
       int l = 15;
       int b = 9;
       int h = 12;
       int cartonVolume = l*b*h;

       int noOfBoxes = cartonVolume/cubeVolume;
       System.out.println(noOfBoxes);
    }
}
