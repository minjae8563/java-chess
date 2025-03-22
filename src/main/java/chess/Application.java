package chess;

import chess.piece.ChessBoardInitialize;
import chess.piece.Piece;
import chess.view.InputView;
import chess.view.OutputView;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ChessBoardInitialize chessBoardInitialize = new ChessBoardInitialize();
        List<Piece> whitePieces = chessBoardInitialize.initialWhitePieces();
        List<Piece> blackPieces = chessBoardInitialize.initialBlackPieces();
        Player whitePlayer = new Player(whitePieces);
        Player blackPlayer = new Player(blackPieces);
        ChessBoard chessBoard = new ChessBoard(whitePlayer, blackPlayer);

        while (!chessBoard.isKingDie()) {
            try {
                InputView.printBoard(chessBoard.getWhitePlayer().getPieces(), chessBoard.getBlackPlayer().getPieces());
                Location startLocation = InputView.getWantToMovePieceLocation(chessBoard.getWhiteTurn());
                Location destination = InputView.getWantToMovePieceDestination(chessBoard.getWhiteTurn());
                chessBoard.movePiece(startLocation, destination);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        OutputView.printResult(whitePlayer);
    }
}
