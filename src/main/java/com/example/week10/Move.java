package com.example.week10;

import java.util.HashMap;

public class Move {

    private int startX;
    private int startY;
    private int endX;
    private int endY;

    private Piece movedPiece;
    private Piece killedPiece;

    private HashMap<Integer, String> maps = new HashMap<Integer, String>() {
        {
            put(1, "a");
            put(2, "b");
            put(3, "c");
            put(4, "d");
            put(5, "e");
            put(6, "f");
            put(7, "g");
            put(8, "h");
        }
    };

    /**
     * Constructor 1.
     * @param startX the x coordinate of the start position.
     * @param startY the y coordinate of the start position.
     * @param endX the x coordinate of the end position.
     * @param endY the y coordinate of the end position.
     * @param movedPiece the piece that is moved.
     */

    public Move(int startX, int startY, int endX, int endY, Piece movedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.movedPiece = movedPiece;
    }

    /**
     * Constructor 2.
     * @param startX the x coordinate of the start position.
     * @param startY the y coordinate of the start position.
     * @param endX the x coordinate of the end position.
     * @param endY the y coordinate of the end position.
     * @param movedPiece the piece that is moved.
     * @param killedPiece the piece that is killed.
     */

    public Move(int startX, int startY, int endX, int endY, Piece movedPiece, Piece killedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.movedPiece = movedPiece;
        this.killedPiece = killedPiece;
    }

    /**
     * Get the start x coordinate of the move.
     * @return the start x coordinate of the move.
     */

    public int getStartX() {
        return startX;
    }

    /**
     * Get the start y coordinate of the move.
     * @return the start y coordinate of the move.
     */

    public int getStartY() {
        return startY;
    }

    /**
     * Get the end x coordinate of the move.
     * @return the end x coordinate of the move.
     */

    public int getEndX() {
        return endX;
    }

    /**
     * Get the end y coordinate of the move.
     * @return the end y coordinate of the move.
     */

    public int getEndY() {
        return endY;
    }

    /**
     * Get the piece that is moved.
     * @return the piece that is moved.
     */

    public Piece getMovedPiece() {
        return movedPiece;
    }

    /**
     * Get the piece that is killed.
     * @return the piece that is killed.
     */

    public Piece getKilledPiece() {
        return killedPiece;
    }

    /**
     * Set the start x coordinate of the move.
     * @param startX the start x coordinate of the move.
     */

    public void setStartX(int startX) {
        this.startX = startX;
    }

    /**
     * Set the start y coordinate of the move.
     * @param startY the start y coordinate of the move.
     */

    public void setStartY(int startY) {
        this.startY = startY;
    }

    /**
     * Set the end x coordinate of the move.
     * @param endX the end x coordinate of the move.
     */

    public void setEndX(int endX) {
        this.endX = endX;
    }

    /**
     * Set the end y coordinate of the move.
     * @param endY the end y coordinate of the move.
     */

    public void setEndY(int endY) {
        this.endY = endY;
    }

    /**
     * Set the piece that is moved.
     * @param movedPiece the piece that is moved.
     */

    public void setMovedPiece(Piece movedPiece) {
        this.movedPiece = movedPiece;
    }

    /**
     * Set the piece that is killed.
     * @param killedPiece the piece that is killed.
     */

    public void setKilledPiece(Piece killedPiece) {
        this.killedPiece = killedPiece;
    }

    /**
     * Get the string representation of the move.
     * @return the string representation of the move.
     */

    public String toString() {
        String x = maps.get(this.endX);
        String y = Integer.toString(this.endY);
        String color = this.movedPiece.getColor();
        String symbol = this.movedPiece.getSymbol();
        return color + "-" + symbol + x + y;
    }

}
