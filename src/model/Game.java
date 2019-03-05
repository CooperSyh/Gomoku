package model;

public class Game {
    private ChessMap pieces;
    private boolean curColor;

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
        Chess next;
        int x = cur.getX();
        int y = cur.getY();
        boolean color = cur.getColor();
        switch (dir) {
            case L:
                next = pieces.getChess(x-1,y);
                if (next!=null && next.getColor()==color) {
                    count++;
                    countChessInDir(c, next, dir, count);
                }
                else
                    countChessInDir(c,c,Direction.R,count);
                break;
            case R:
                next = pieces.getChess(x+1,y);
                if (next!=null && next.getColor()==color) {
                    count++;
                    countChessInDir(c, next, dir, count);
                }
                else
                    return false;
                break;
            case T:
                break;
            case B:
                break;
            case TL:
                break;
            case BL:
                break;
            case TR:
                break;
            case BR:
                break;
        }
        return false;
    }
}
