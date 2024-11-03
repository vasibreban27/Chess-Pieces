public class ChessTest {
    public static void main(String[] args) {
        Chessboard board = new Chessboard();
        Piece king = new King(2,2,Color.BLACK);
        board.placePiece(king,2,2);
        System.out.println("King moves to (3,3): "+board.movePiece(2,2,3,3)); //move one square
        System.out.println("King moves to (6,6): "+board.movePiece(3,3,6,6)); //can't move diagonally

        Piece pawn = new Pawn(1,1,Color.WHITE);
        board.placePiece(pawn,1,1);
        System.out.println("Pawn moves to (2,1): "+board.movePiece(1,1,2,1)); //forward
        System.out.println("Pawn moves to (1,1): "+board.movePiece(2,1,1,1)); //backward - false

        Piece queen  = new Queen(3,3,Color.WHITE);
        board.placePiece(queen,3,3);
        System.out.println("Queen moves to (5,5): "+board.movePiece(3,3,5,5)); //diagonal move
        System.out.println("Queen moves to (5,7): "+board.movePiece(5,5,5,7)); //vertical
        System.out.println("Queen moves to (2,7): "+board.movePiece(5,7,2,7)); //horizontal


        Piece rook = new Rook(0,0,Color.WHITE);
        board.placePiece(rook,0,0);
        System.out.println("Rook moves to (0,5): "+board.movePiece(0,0,0,5));//vertical
        System.out.println("Rook moves to (7,5): "+board.movePiece(0,5,7,5));//horizontal
        System.out.println("Rook moves to (6,6): "+board.movePiece(7,5,6,6)); //can't move diagonally

        Piece bishop = new Bishop(2,0,Color.WHITE);
        board.placePiece(bishop,2,0);
        System.out.println("Bishop moves to (4,2): "+board.movePiece(2,0,4,2)); //diagonally
        System.out.println("Bishop moves to (4,3): "+board.movePiece(4,2,4,3)); //can't move vertically

        Piece knight = new Knight(1,0,Color.WHITE);
        board.placePiece(knight,1,0);
        System.out.println("Knight moves to (2,2): "+board.movePiece(1,0,2,2)); //move in L shape
        System.out.println("Knight moves to (2,3): "+board.movePiece(2,2,2,3)); // can't move vertically
    }
}
