package model;

public class Chess {
    private static int size;
    private int x;
    private int y;
    private boolean color;   //true for white, false for black

    public Chess(int x, int y, boolean color) {
        this.x = x;
        this.y = y;
        this.color = color;
        //size??
    }

    public int getSize() {
        return size;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean getColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }
}
