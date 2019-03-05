package model;

public class ChessMap {
    //mini-board for chess (2D map for all chess pieces)
    private Chess[][] pieces;

    public ChessMap(int size) {
        pieces = new Chess[size][size];
    }

    public void putChess(int x, int y, boolean color) {
        Chess c = new Chess(x, y, color);
        pieces[x][y] = c;
    }
    public Chess getChess(int x, int y){
        return pieces[x][y];
    }

}
