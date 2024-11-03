enum Color {
    WHITE,BLACK;
}

abstract class Piece {
    protected String type;
    protected Color color;
    protected int x,y;
    public Piece(String type, Color color, int x, int y) {
        this.type = type;
        this.color = color;
        this.x = x;
        this.y = y;
    }
    public String getType() {
        return type;
    }
    public Color getColor() {
        return color;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public abstract boolean isValidMove(int newX, int newY,Chessboard board);

}
