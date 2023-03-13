public class MapTile {
    private int x;
    private int y;
    public MapTile(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() { return x; }
    public int getY() { return y; }
    public MapTile[] adjacent_moves() {
        MapTile[] moves = new MapTile[4];
        moves[0] = new MapTile(x+1,y); //Right
        moves[1] = new MapTile(x-1,y); // Left
        moves[2] = new MapTile(x,y+1); // up
        moves[3] = new MapTile(x,y-1); // down
       return moves;
    }

}
