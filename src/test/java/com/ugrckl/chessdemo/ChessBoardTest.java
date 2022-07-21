package com.ugrckl.chessdemo;

import org.junit.jupiter.api.Test;

import static com.ugrckl.chessdemo.ChessPiece.Color.BLACK;
import static com.ugrckl.chessdemo.ChessPiece.Color.WHITE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChessBoardTest {
    @Test
    public void canAddPawn() {
        ChessBoard board = new ChessBoard();
        Pawn pawn = new Pawn(WHITE);
        board.add(pawn, "a1");
        Pawn foundPawn = (Pawn) board.getPieceAtCoords("a1");
        assertEquals(pawn, foundPawn);
    }

    @Test
    public void canAddKnight(){
        ChessBoard board = new ChessBoard();
        Knight knight = new Knight(BLACK);
        board.add(knight, "c1");
        Knight foundKnight = (Knight) board.getPieceAtCoords("c1");
        assertEquals(knight,foundKnight);
    }
}
