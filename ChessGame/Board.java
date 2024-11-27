package OOP.oop_lab_2.problem2;

public class Board {
    Piece[][] board;

    public Board() {
        board = new Piece[8][8];

        board[0][0] = new Rook(new Position(0, 0), "R");
        board[0][1] = new Hourse(new Position(0, 1), "H");
        board[0][2] = new Bishop(new Position(0, 2), "B");
        board[0][4] = new Queen(new Position(0, 4), "Q");
        board[0][3] = new King(new Position(0, 3), "K");
        board[0][5] = new Bishop(new Position(0, 5),"B");
        board[0][6] = new Hourse(new Position(0, 6),"H");
        board[0][7] = new Rook(new Position(0, 7),"R");

        board[1][0] = new Pawn(new Position(1, 0), "P");
        board[1][1] = new Pawn(new Position(1, 1),"P");
        board[1][2] = new Pawn(new Position(1, 2),"P");
        board[1][3] = new Pawn(new Position(1, 3),"P");
        board[1][4] = new Pawn(new Position(1, 4),"P");
        board[1][5] = new Pawn(new Position(1, 5),"P");
        board[1][6] = new Pawn(new Position(1, 6),"P");
        board[1][7] = new Pawn(new Position(1, 7),"P");


        board[7][0] = new Rook(new Position(7, 0), "R");
        board[7][1] = new Hourse(new Position(7, 1),"H");
        board[7][2] = new Bishop(new Position(7, 2),"B");
        board[7][4] = new Queen(new Position(7, 4),"Q");
        board[7][3] = new King(new Position(7, 3),"K");
        board[7][5] = new Bishop(new Position(7, 5),"B");
        board[7][6] = new Hourse(new Position(7, 6),"H");
        board[7][7] = new Rook(new Position(7, 7),"R");

        board[6][0] = new Pawn(new Position(6, 0),"P");
        board[6][1] = new Pawn(new Position(6, 1),"P");
        board[6][2] = new Pawn(new Position(6, 2),"P");
        board[6][3] = new Pawn(new Position(6, 3),"P");
        board[6][4] = new Pawn(new Position(6, 4),"P");
        board[6][5] = new Pawn(new Position(6, 5),"P");
        board[6][6] = new Pawn(new Position(6, 6),"P");
        board[6][7] = new Pawn(new Position(6, 7),"P");

    }

    public void movePiece(Position from, Position to) {
        Piece piece = board[from.x][from.y];
        if (piece != null && piece.isLegalMove(to)) {
            board[to.x][to.y] = piece;
            board[from.x][from.y] = null;
            System.out.println("Move successful");
        } else {
            System.out.println("Illegal move");
        }
    }

    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    System.out.print(".");
                } else {
                    System.out.print(board[i][j].name);
                }
            }
            System.out.println();
        }
    }
}
