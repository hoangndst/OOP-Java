package com.example.week11;

import com.example.week10.Board;
import com.example.week10.Piece;

public class Bishop extends Piece {

    /**
     * Constructor 1.
     * @param coordinatesX x-coordinate of the piece.
     * @param coordinatesY y-coordinate of the piece.
     */

    public Bishop(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    /**
     * Constructor 2.
     * @param coordinatesX x-coordinate of the piece.
     * @param coordinatesY y-coordinate of the piece.
     * @param color the color of the piece.
     */

    public Bishop(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    /**
     * Get symbol of the piece.
     * @return the symbol of the piece.
     */

    public String getSymbol() {
        return "B";
    }

    /**
     * Check if the piece can move to the destination.
     * @param board the board of the game.
     * @param x the x coordinate of the destination.
     * @param y the y coordinate of the destination.
     * @return true if the piece can move to the destination, false otherwise.
     */
    
    public boolean canMove(Board board, int x, int y) {
        if (x < 1 || x > 8 || y < 1 || y > 8) {
            return false;
        }
        if (board.getAt(x, y) != null) {
            if (board.getAt(x, y).getColor().equals(this.getColor())) {
                return false;
            }
        }
        if (Math.abs(x - this.getCoordinatesX()) == Math.abs(y - this.getCoordinatesY())) {
            if (x > this.getCoordinatesX()) {
                if (y > this.getCoordinatesY()) {
                    for (int i = this.getCoordinatesX() + 1, j = this.getCoordinatesY() + 1;
                         i < x; i++, j++) {
                        if (board.getAt(i, j) != null) {
                            return false;
                        }
                    }
                    return true;
                } else {
                    for (int i = this.getCoordinatesX() + 1, j = this.getCoordinatesY() - 1;
                         i < x; i++, j--) {
                        if (board.getAt(i, j) != null) {
                            return false;
                        }
                    }
                    return true;
                }
            } else {
                if (y > this.getCoordinatesY()) {
                    for (int i = this.getCoordinatesX() - 1, j = this.getCoordinatesY() + 1;
                         i > x; i--, j++) {
                        if (board.getAt(i, j) != null) {
                            return false;
                        }
                    }
                    return true;
                } else {
                    for (int i = this.getCoordinatesX() - 1, j = this.getCoordinatesY() - 1;
                         i > x; i--, j--) {
                        if (board.getAt(i, j) != null) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        } else {
            return false;
        }
    }
}
