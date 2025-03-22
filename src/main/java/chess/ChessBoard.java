package chess;

public class ChessBoard {
    private final Player whitePlayer;
    private final Player blackPlayer;
    Boolean isWhiteTurn = true;

    public ChessBoard(Player whitePlayer, Player blackPlayer) {
        this.whitePlayer = whitePlayer;
        this.blackPlayer = blackPlayer;
    }

    public void movePiece(Location startPosition, Location destination) {
        if (isWhiteTurn) {
            whitePlayer.validateOurPiece(startPosition);
            whitePlayer.movePiece(startPosition, destination);
            blackPlayer.removePiece(destination);
            isWhiteTurn = false;
            return;
        }

        blackPlayer.validateOurPiece(startPosition);
        blackPlayer.movePiece(startPosition, destination);
        whitePlayer.removePiece(destination);
        isWhiteTurn = true;
    }

    public boolean isKingDie() {
        return whitePlayer.isKingDie() || blackPlayer.isKingDie();
    }


    public Player getWhitePlayer() {
        return whitePlayer;
    }

    public Player getBlackPlayer() {
        return blackPlayer;
    }

    public Boolean getWhiteTurn() {
        return isWhiteTurn;
    }
}
