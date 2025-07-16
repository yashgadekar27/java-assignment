 class P3 {
     public static void main(String args[]){
        
        int l1 = 13;
        int b1 = 7;
        int areaOfTile = l1 * b1;

        int l2 = 520;
        int b2 = 140;
        int areaOfRegion = l2 * b2;

        int totalTiles = areaOfRegion/areaOfTile;

        System.out.println("Total tiles required = " + totalTiles);
    }
}
    

