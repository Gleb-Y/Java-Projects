package OOP.oop_lab_2.problem2;

public abstract class Piece {
    protected Position a;
    protected String name;

    public Piece(Position a, String name) {
        this.a = a;
        this.name = name;
    }

    public abstract boolean isLegalMove(Position b);

    protected boolean isOnBoard(Position b) {
        return b.x >= 0 && b.x < 8 && b.y >= 0 && b.y < 8;
    }
}

class Rook extends Piece {

    public Rook(Position a, String name) {
        super(a, name);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return isOnBoard(b) && (a.x == b.x || a.y == b.y);
    }
}

class Bishop extends Piece {

    public Bishop(Position a, String name) {
        super(a, name);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return isOnBoard(b) && Math.abs(a.x - b.x) == Math.abs(a.y - b.y);
    }
}

class Hourse extends Piece {

    public Hourse(Position a, String name) {
        super(a, name);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int dx = Math.abs(a.x - b.x);
        int dy = Math.abs(a.y - b.y);
        return isOnBoard(b) && ((dx == 2 && dy == 1) || (dx == 1 && dy == 2));
    }
}

class Queen extends Piece {

    public Queen(Position a, String name) {
        super(a, name);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return isOnBoard(b) && (a.x == b.x || a.y == b.y || Math.abs(a.x - b.x) == Math.abs(a.y - b.y));
    }
}

class King extends Piece {

    public King(Position a, String name) {
        super(a, name);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int dx = Math.abs(a.x - b.x);
        int dy = Math.abs(a.y - b.y);
        return isOnBoard(b) && (dx <= 1 && dy <= 1);
    }
}

class Pawn extends Piece {
    public Pawn(Position a, String name) {
        super(a, name);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int dx = Math.abs(b.x - a.x);
        int dy = Math.abs(b.y - a.y);
        if (!isOnBoard(b)) {
            return false;
        }

        if (dx == 1 && dy == 0 || dx == 0 && dy == 1) {
            return true;
        }

        return false;
    }
}
