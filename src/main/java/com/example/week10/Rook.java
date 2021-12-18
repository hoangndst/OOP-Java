package com.example.week10;

public class Rook extends Piece {

    /**
     * Constructor 1.
     * @param coordinatesX x-coordinate of the piece.
     * @param coordinatesY y-coordinate of the piece.
     */

    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    /**
     * Constructor 2.
     * @param coordinatesX x-coordinate of the piece.
     * @param coordinatesY y-coordinate of the piece.
     * @param color the color of the piece.
     */

    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    /**
     * Get th symbol of the piece.
     * @return the symbol of the piece.
     */

    public String getSymbol() {
        return "R";
    }

    /**
     * Check if the piece can move to the destination.
     * @param board the board of the game.
     * @param x the x coordinate of the destination.
     * @param y the y coordinate of the destination.
     * @return true if the piece can move to the destination, false otherwise.
     */

    public boolean canMove(Board board, int x, int y) {
        if (x == this.getCoordinatesX()) {
            if (y > this.getCoordinatesY()) {
                for (int i = this.getCoordinatesY() + 1; i < y; i++) {
                    if (board.getAt(x, i) != null) {
                        return false;
                    }
                }
                if (board.getAt(x, y) != null) {
                    if (board.getAt(x, y).getColor().equals(this.getColor())) {
                        return false;
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                for (int i = this.getCoordinatesY() - 1; i > y; i--) {
                    if (board.getAt(x, i) != null) {
                        return false;
                    }
                }
                if (board.getAt(x, y) != null) {
                    if (board.getAt(x, y).getColor().equals(this.getColor())) {
                        return false;
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        } else if (y == this.getCoordinatesY()) {
            if (x > this.getCoordinatesX()) {
                for (int i = this.getCoordinatesX() + 1; i < x; i++) {
                    if (board.getAt(i, y) != null) {
                        return false;
                    }
                }
                if (board.getAt(x, y) != null) {
                    if (board.getAt(x, y).getColor().equals(this.getColor())) {
                        return false;
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                for (int i = this.getCoordinatesX() - 1; i > x; i--) {
                    if (board.getAt(i, y) != null) {
                        return false;
                    }
                }
                if (board.getAt(x, y) != null) {
                    if (board.getAt(x, y).getColor().equals(this.getColor())) {
                        return false;
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        } else {
            return false;
        }
    }
}
