 class P29 {
    public static void main(String args[]){
        //floor 
        int floorLength = 800;
        int floorbreadth = 900;
        int floorArea = floorLength * floorbreadth;
//tile
        int tileSide = 10;
        int tileArea = tileSide * tileSide;
        int tilesRequired = floorArea/tileArea;
        System.out.println(tilesRequired);
    }
}
