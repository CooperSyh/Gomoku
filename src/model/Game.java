package model;

public class Game {
    private ChessMap Chess;
    private boolean curColor;

    public boolean isOver() {
        return (checkVertical() || checkHorizontal() || checkDiagonal());
    }

    private boolean checkVertical() {
        return false;
        //TODO: add check top and bot
    }

    private boolean checkHorizontal() {
        return false;
    }

    private boolean checkDiagonal() {
        return (checkLeftDiagonal() || checkRightDiagonal());
    }

    private boolean checkLeftDiagonal() {
        return false;
    }

    private boolean checkRightDiagonal() {
        return false;
    }

    private boolean countChessInDir(Chess c, Direction dir, int count) {
        // may return int for count so far
        boolean over = false;
        switch (dir) {
            case L:
                //TODO
                over = false;
                break;
            case R:
                over = false;
                break;
            case T:
                over = false;
                break;
            case B:
                over = false;
                break;
            case TL:
                over = false;
                break;
            case BL:
                over = false;
                break;
            case TR:
                over = false;
                break;
            case BR:
                over = false;
                break;
        }
        return over;
    }
}
