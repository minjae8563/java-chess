package chess.piece;

import chess.Location;
import java.util.ArrayList;
import java.util.List;

public class ChessBoardInitialize {
    public List<Piece> initialWhitePieces() {
        List<Piece> pieces = new ArrayList<>();
        Rook rook1 = new Rook(new Location(7,  0), "r", PieceType.ROOK);
        Rook rook2 = new Rook(new Location(7,  7), "r", PieceType.ROOK);
        pieces.add(rook1);
        pieces.add(rook2);

        Knight knight1 = new Knight(new Location(7, 1), "n", PieceType.KNIGHT);
        Knight knight2 = new Knight(new Location(7, 6), "n", PieceType.KNIGHT);
        pieces.add(knight1);
        pieces.add(knight2);

        Bishop bishop1 = new Bishop(new Location(7, 2), "b", PieceType.BISHOP);
        Bishop bishop2 = new Bishop(new Location(7, 5), "b", PieceType.BISHOP);
        pieces.add(bishop1);
        pieces.add(bishop2);

        King king = new King(new Location(7, 3), "k", PieceType.KING);
        Queen queen = new Queen(new Location(7, 4), "q", PieceType.QUEEN);
        pieces.add(king);
        pieces.add(queen);

        WhitePawn pawn1 = new WhitePawn(new Location(6, 0), "p", PieceType.WHITE_PAWN);
        WhitePawn pawn2 = new WhitePawn(new Location(6, 1), "p", PieceType.WHITE_PAWN);
        WhitePawn pawn3 = new WhitePawn(new Location(6, 2), "p", PieceType.WHITE_PAWN);
        WhitePawn pawn4 = new WhitePawn(new Location(6, 3), "p", PieceType.WHITE_PAWN);
        WhitePawn pawn5 = new WhitePawn(new Location(6, 4), "p", PieceType.WHITE_PAWN);
        WhitePawn pawn6 = new WhitePawn(new Location(6, 5), "p", PieceType.WHITE_PAWN);
        WhitePawn pawn7 = new WhitePawn(new Location(6, 6), "p", PieceType.WHITE_PAWN);
        WhitePawn pawn8 = new WhitePawn(new Location(6, 7), "p", PieceType.WHITE_PAWN);

        pieces.add(pawn1);
        pieces.add(pawn2);
        pieces.add(pawn3);
        pieces.add(pawn4);
        pieces.add(pawn5);
        pieces.add(pawn6);
        pieces.add(pawn7);
        pieces.add(pawn8);

        return pieces;
    }

    public List<Piece> initialBlackPieces() {
        List<Piece> pieces = new ArrayList<>();
        Rook rook1 = new Rook(new Location(0,  0), "R", PieceType.ROOK);
        Rook rook2 = new Rook(new Location(0,  7), "R", PieceType.ROOK);
        pieces.add(rook1);
        pieces.add(rook2);

        Knight knight1 = new Knight(new Location(0, 1), "N", PieceType.KNIGHT);
        Knight knight2 = new Knight(new Location(0, 6), "N", PieceType.KNIGHT);
        pieces.add(knight1);
        pieces.add(knight2);

        Bishop bishop1 = new Bishop(new Location(0, 2), "B", PieceType.BISHOP);
        Bishop bishop2 = new Bishop(new Location(0, 5), "B", PieceType.BISHOP);
        pieces.add(bishop1);
        pieces.add(bishop2);

        King king = new King(new Location(0, 3), "K", PieceType.KING);
        Queen queen = new Queen(new Location(0, 4), "Q", PieceType.QUEEN);
        pieces.add(king);
        pieces.add(queen);

        BlackPawn pawn1 = new BlackPawn(new Location(1, 0), "P", PieceType.BLACK_PAWN);
        BlackPawn pawn2 = new BlackPawn(new Location(1, 1), "P", PieceType.BLACK_PAWN);
        BlackPawn pawn3 = new BlackPawn(new Location(1, 2), "P", PieceType.BLACK_PAWN);
        BlackPawn pawn4 = new BlackPawn(new Location(1, 3), "P", PieceType.BLACK_PAWN);
        BlackPawn pawn5 = new BlackPawn(new Location(1, 4), "P", PieceType.BLACK_PAWN);
        BlackPawn pawn6 = new BlackPawn(new Location(1, 5), "P", PieceType.BLACK_PAWN);
        BlackPawn pawn7 = new BlackPawn(new Location(1, 6), "P", PieceType.BLACK_PAWN);
        BlackPawn pawn8 = new BlackPawn(new Location(1, 7), "P", PieceType.BLACK_PAWN);

        pieces.add(pawn1);
        pieces.add(pawn2);
        pieces.add(pawn3);
        pieces.add(pawn4);
        pieces.add(pawn5);
        pieces.add(pawn6);
        pieces.add(pawn7);
        pieces.add(pawn8);

        return pieces;
    }

}
