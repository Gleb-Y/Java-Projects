package OOP.oop_lab_2.problem2;

public class ChessGame {
    public static void main(String[] args) {
        Board chessBoard = new Board();
        chessBoard.printBoard();

        Position from = new Position(1, 4);
        Position to = new Position(2, 4);
        chessBoard.movePiece(from, to);
        chessBoard.printBoard();
    }
}