package chess;

import chess.piece.Piece;
import chess.piece.PieceType;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private final List<Piece> pieces;

    public Player(List<Piece> pieces) {
        this.pieces = new ArrayList<>(pieces);
    }

    public void movePiece(Location startPosition, Location destination) {
        for (Piece piece : pieces) {
            if (piece.getLocation().equals(destination)) {
                throw new IllegalArgumentException("[ERROR] 해당 위치에 같은 팀의 기물이 있습니다. 다시 입력해 주세요.");
            }
        }

        for (Piece piece : pieces) {
            if (piece.getLocation().equals(startPosition)) {
                if (!piece.isCanMoveDestination(destination)) {
                    throw new IllegalArgumentException("[ERROR] 해당 기물이 움직일 수 없는 위치입니다. 다시 입력해 주세요.");
                }
                piece.updateLocation(destination);
            }
        }
    }

    public void validateOurPiece(Location startPosition) {
        for (Piece piece : pieces) {
            if (piece.getLocation().equals(startPosition)) {
                return;
            }
        }
        throw new IllegalArgumentException("[ERROR] 입력하신 위치에 기물이 없거나, 같은 팀이 아닙니다.");
    }

    public void removePiece(Location destination) {
        pieces.removeIf(piece -> piece.getLocation().equals(destination));
    }

    public boolean isKingDie() {
        for (Piece piece : pieces) {
            if (piece.getPieceType().equals(PieceType.KING)) {
                return false;
            }
        }
        return true;
    }

    public List<Piece> getPieces() {
        return pieces;
    }
}
