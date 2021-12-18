package com.example.week11;

import java.util.ArrayList;

public class Game {
    
    private Board board;
    private ArrayList<Move> moveHistory;

    /**
     * Constructor for objects of class Game.
     * @param board the board to play on
     */

    public Game(Board board) {
        this.board = board;
        this.moveHistory = new ArrayList<Move>();
    }

    /**
     * Get the board.
     * @return the board
     */

    public Board getBoard() {
        return board;
    }

    /**
     * Set the board.
     * @param board the board to set
     */

    public void setBoard(Board board) {
        this.board = board;
    }

    /**
     * Get the move history.
     * @return the move history
     */

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }

    /**
     * Move a piece.
     * @param piece the piece to move
     * @param x the x coordinate of the move
     * @param y the y coordinate of the move
     */

    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(this.board, x, y)) {
            Move newMove = new Move(piece.getCoordinatesX(), x, piece.getCoordinatesY(), y, piece);
            if (this.board.getAt(x, y) != null) {
                Piece pieceAtDestination = this.board.getAt(x, y);
                newMove.setKilledPiece(pieceAtDestination);
                this.board.removeAt(x, y);
                this.board.removeAt(piece.getCoordinatesX(), piece.getCoordinatesY());
                piece.setCoordinatesX(x);
                piece.setCoordinatesY(y);
                this.board.addPiece(piece);
            } else {
                this.board.removeAt(piece.getCoordinatesX(), piece.getCoordinatesY());
                piece.setCoordinatesX(x);
                piece.setCoordinatesY(y);
                this.board.addPiece(piece);
            }
            this.moveHistory.add(newMove);
        }
    }
}
