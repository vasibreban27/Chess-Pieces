import static java.lang.Integer.signum;

public class Chessboard {
    private Piece[][] board;
    public Chessboard() {
        this.board = new Piece[8][8];
    }
    private boolean betweenBorders(int x,int y)
    {
        return (x >= 0 && x < 8 && y >= 0 && y < 8);
    }
    public void placePiece(Piece piece,int x,int y) {
        if(betweenBorders(x,y))
            board[x][y] = piece;
        else
        {
            System.out.println("Position x=" + x + " and y=" + y + " is out of bounds");
        }
    }
    public Piece getPiece(int x,int y) {
        if(betweenBorders(x,y))
            return board[x][y];
        else {
            System.out.println("Position x=" + x + " and y=" + y + " is out of bounds");
            return null;
        }
    }
    public void removePiece(int x,int y)
    {
        if(betweenBorders(x,y))
             board[x][y] = null;
        else
        {
            System.out.println("Position x=" + x + " and y=" + y + " is out of bounds");
        }
    }
    public boolean movePiece(int startX,int startY,int endX,int endY){
        if (!betweenBorders(startX, startY) || !betweenBorders(endX, endY)) {
            System.out.println("Move is out of bounds.");
            return false;
        }
        Piece piece = getPiece(startX,startY);
        if(piece == null)
        {
            System.out.println("No piece at the starting position.");
            return false;
        }
        if(piece.isValidMove(endX,endY,this))
        {
            removePiece(startX,startY);
            placePiece(piece,endX,endY);
            piece.setPosition(endX,endY);
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isPathClear(int x,int y,int newX,int newY) //to check if the path between (x,y) and new(x,y) is clear
    {
        if (!betweenBorders(x, y) || !betweenBorders(newX, newY)) {
            return false;
        }
        int dx = Integer.signum(newX-x);
        int dy = Integer.signum(newY-y);

        int curX = x+dx;
        int curY = y+dy;
        while(curX!=newX && curY!=newY)
        {
            if(getPiece(curX,curY) != null)
                return false;
            curX = curX+dx;
            curY = curY+dy;
        }
        return true;
    }
}
