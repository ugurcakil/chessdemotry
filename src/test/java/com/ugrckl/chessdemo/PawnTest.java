package com.ugrckl.chessdemo;

import org.junit.jupiter.api.Test;

import static com.ugrckl.chessdemo.ChessPiece.Color.WHITE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PawnTest extends ChessPieceTest{
    @Test
    public void pawnCanMoveOneForward() {
        Pawn pawn = new Pawn(WHITE);
        pawn.setCoordinates(new Coordinates("a2"));
        Coordinates[] validMoves = pawn.getValidMoves();
        Coordinates expectedDestination = new Coordinates("a3");
        assertEquals(expectedDestination,validMoves[0]);
        //assertTrue(isMoveFoundInArray(validMoves, expectedDestination),String.format("Move '%s' not found",expectedDestination));

    }

    @Test
    public  void pawnCanMoveTwoForwardOnFirstMove(){
        Pawn pawn = new Pawn(WHITE);
        pawn.setCoordinates(new Coordinates("a2"));
        Coordinates[] validMoves = pawn.getValidMoves();
        Coordinates expectedDestination = new Coordinates("a4");
        assertTrue(isMoveFoundInArray(validMoves, expectedDestination));
        //assertTrue(isMoveFoundInArray(validMoves, expectedDestination),String.format("Move '%s' not found",expectedDestination));
    }
}
