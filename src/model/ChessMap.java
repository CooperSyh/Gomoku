package model;

public class ChessMap {
    //mini-board for chess (2D map for all chess pieces)
    private Chess[][] pieces;

    public ChessMap(int size) {
        pieces = new Chess[size][size];
    }

    public void addChess(int x, int y, boolean color) {
        Chess c = new Chess(x, y, color);
        pieces[x][y] = c;
    }

}
