 class Pawn extends Piece {

    public Pawn(int x, int y, Color color) {
        super("Pawn",color,x,y);
    }
    public boolean isValidMove(int newX,int newY,Chessboard board) {
        int direction = (color == Color.WHITE)? 1 : -1; //1 forward,-1 downwards
        if(newY == y && newX == x +direction && board.getPiece(newX,newY)==null) //regular move,forward 1 square
            return true;
        if(newY == y && newX == x + 2*direction &&((color == Color.WHITE && x==1) || (color == Color.BLACK && x==6)) && board.isPathClear(x,y,newX,newY))
        {
            return true;  //first move can be 2 squares forward
        }
        //for diagonal capture
        return Math.abs(newY - y)==1 && newX==x +direction &&board.getPiece(newX,newY)!=null && board.getPiece(newX,newY).getColor()!=color;
    }
}
