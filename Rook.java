 class Rook extends Piece {
    public Rook(int x,int y,Color color)
    {
        super("Rook",color,x,y);
    }
    public boolean isValidMove(int newX,int newY,Chessboard board)
    {
        boolean straightMove = (newX == x || newY == y);
        return straightMove && board.isPathClear(x,y,newX,newY);
    }
}
