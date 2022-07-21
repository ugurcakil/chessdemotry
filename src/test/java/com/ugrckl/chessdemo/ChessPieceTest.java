package com.ugrckl.chessdemo;

import org.junit.jupiter.api.Test;

import static com.ugrckl.chessdemo.ChessPiece.Color.WHITE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChessPieceTest {
    protected boolean isMoveFoundInArray(Coordinates[] moves, Coordinates expectedMove){
        /*for(int x=0;x < moves.length; x++){
            if(moves[x].equals(expectedMove)) return true;
        }*/
        for (Coordinates curCoords : moves){
            if(curCoords.equals(expectedMove)) return true;
        }
        return false;
    }
}

