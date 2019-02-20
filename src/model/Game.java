package model;

public class Game {
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

    private boolean countChessInDir(Chess c, Direction dir) {
        boolean over = false;
        switch (dir) {
            case L:
                //todo
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
            case LT:
                over = false;
                break;
            case LB:
                over = false;
                break;
            case RT:
                over = false;
                break;
            case RB:
                over = false;
                break;
        }
        return over;
    }
}
