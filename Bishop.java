 class Bishop extends Piece {
    public Bishop(int x, int y, Color color) {
        super("Bishop",color,x,y);
    }
    public boolean isValidMove(int newX,int newY,Chessboard board) {
        boolean diagonalMove = (Math.abs(newX - x) == Math.abs(newY - y));
        return diagonalMove && board.isPathClear(x,y,newX,newY);
    }
}
