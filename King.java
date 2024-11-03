 class King extends Piece {

    public King(int x, int y, Color color) {
       super("King",color,x,y);
    }

    public boolean isValidMove(int newX,int newY,Chessboard board)
    {
        int dx = Math.abs(newX-x);
        int dy = Math.abs(newY-y);
        return (dx<=1 && dy<=1); //he can move only one square in any direction
    }
}
