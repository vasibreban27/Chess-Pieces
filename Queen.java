class Queen extends Piece{
    public Queen(int x, int y, Color color) {
        super("Queen",color,x,y);
    }

    public boolean isValidMove(int newX, int newY,Chessboard board)
    {
        boolean straightMove = (newX == x || newY == y);
        boolean diagonalMove = (Math.abs(newX - x) == Math.abs(newY - y));
        return (straightMove || diagonalMove) && board.isPathClear(x,y,newX,newY);
    }
}
