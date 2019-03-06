package model;

public class Game {
    final static int size = 20;
    private ChessMap pieces;
    private boolean curColor;

    public Game() {
        pieces = new ChessMap(size);
        curColor = false;
    }

    public void placePiece(int x, int y) {
        pieces.putChess(x, y, curColor);
        curColor = !curColor;
    }

    public boolean isOver(Chess c) {
        return (checkVertical(c) || checkHorizontal(c)
                || checkLeftDiagonal(c)||checkRightDiagonal(c));
    }

    private boolean checkVertical(Chess c) {
        return countChessInDir(c,c,Direction.T,1);
    }

    private boolean checkHorizontal(Chess c) {
        return countChessInDir(c,c,Direction.L,1);
    }

    private boolean checkLeftDiagonal(Chess c) {
        return countChessInDir(c,c,Direction.TL,1);
    }

    private boolean checkRightDiagonal(Chess c) {
        return countChessInDir(c,c,Direction.TR,1);
    }

    private boolean countChessInDir(Chess c, Chess cur, Direction dir, int count) {
        if (count == 5)
            return true;
        else {
            Chess next;
            int x = cur.getX();
            int y = cur.getY();
            boolean color = cur.getColor();
            if (dir == Direction.L) {
                next = pieces.getChess(x - 1, y);
                if (next != null && next.getColor() == color) {
                    count++;
                    return countChessInDir(c, next, dir, count);
                } else
                    return countChessInDir(c, c, Direction.R, count);
            } else if (dir == Direction.R) {
                next = pieces.getChess(x + 1, y);
                if (next != null && next.getColor() == color) {
                    count++;
                    return countChessInDir(c, next, dir, count);
                } else
                    return false;
            } else if (dir == Direction.T) {

            } else if (dir == Direction.B) {

            } else if (dir == Direction.TL) {

            } else if (dir == Direction.BL) {

            } else if (dir == Direction.TR) {

            } else if (dir == Direction.BR) {

            }
        }
        return false;
    }
}
