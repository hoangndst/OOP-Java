package com.example.week11;

import java.util.ArrayList;

public class Board {

    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;

    private ArrayList<Piece> pieces;

    /**
     * Constructor.
     */

    public Board() {
        pieces = new ArrayList<Piece>();
    }

    /**
     * Add a piece to the board.
     * @param piece the piece to add.
     */

    public void addPiece(Piece piece) {
        if (validate(piece.getCoordinatesX(), piece.getCoordinatesY())) {
            if (getAt(piece.getCoordinatesX(), piece.getCoordinatesY()) == null) {
                pieces.add(piece);
            }
        }
    }

    /**
     * Check Validate.
     * @param x the x coordinate of the piece.
     * @param y the y coordinate of the piece.
     * @return true if the piece is valid.
     */

    public boolean validate(int x, int y) {
        return x >= 1 && x <= WIDTH && y >= 1 && y <= HEIGHT;
    }

    /**
     * Remove a piece from the board.
     * @param x the x coordinate of the piece.
     * @param y the y coordinate of the piece.
     */

    public void removeAt(int x, int y) {
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).getCoordinatesX() == x && pieces.get(i).getCoordinatesY() == y) {
                pieces.remove(i);
                break;
            }
        }
    }

    /**
     * Get the piece at the specified coordinates.
     * @param x the x coordinate of the piece.
     * @param y the y coordinate of the piece.
     * @return the piece at the specified coordinates.
     */

    public Piece getAt(int x, int y) {
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).getCoordinatesX() == x && pieces.get(i).getCoordinatesY() == y) {
                return pieces.get(i);
            }
        }
        return null;
    }

    /**
     * Set list of pieces.
     * @param pieces the list of pieces.
     */

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }

    /**
     * Get list of pieces.
     * @return the list of pieces.
     */

    public ArrayList<Piece> getPieces() {
        return pieces;
    }
}
