package com.example.week11;

public abstract class Piece {

    private int coordinatesX;
    private int coordinatesY;
    private String color;

    /**
     * Constructor 1.
     * @param coordinatesX the x coordinate of the piece.
     * @param coordinatesY the y coordinate of the piece.
     */

    public Piece(int coordinatesX, int coordinatesY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
    }

    /**
     * Constructor 2.
     * @param coordinatesX the x coordinate of the piece.
     * @param coordinatesY the y coordinate of the piece.
     * @param color the color of the piece.
     */

    public Piece(int coordinatesX, int coordinatesY, String color) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = color;
    }

    public abstract String getSymbol();

    public abstract boolean canMove(Board board, int x, int y);

    /**
     * Getter for the x coordinate of the piece.
     * @return the x coordinate of the piece.
     */

    public int getCoordinatesX() {
        return coordinatesX;
    }

    /**
     * Setter for the x coordinate of the piece.
     * @param coordinatesX the x coordinate of the piece.
     */

    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    /**
     * Getter for the y coordinate of the piece.
     * @return the y coordinate of the piece.
     */

    public int getCoordinatesY() {
        return coordinatesY;
    }

    /**
     * Setter for the y coordinate of the piece.
     * @param coordinatesY the y coordinate of the piece.
     */

    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    /**
     * Getter for the color of the piece.
     * @return the color of the piece.
     */

    public String getColor() {
        return color;
    }

    /**
     * Setter for the color of the piece.
     * @param color the color of the piece.
     */

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Check possition of the piece.
     * @param otherPiece the piece to check.
     * @return true if the piece is in the same position.
     */

    public boolean checkPosition(Piece otherPiece) {
        return this.coordinatesX == otherPiece.getCoordinatesX() 
        && this.coordinatesY == otherPiece.getCoordinatesY();
    }                       

}
