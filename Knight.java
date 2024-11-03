 class Knight extends Piece{
    public Knight(int x, int y,Color color){
        super("Knight",color,x,y);
    }
    public boolean isValidMove(int newX,int newY,Chessboard board){
        int dx = Math.abs(newX - x);
        int dy = Math.abs(newY - y);
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }
}
