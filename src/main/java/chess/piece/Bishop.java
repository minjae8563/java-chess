package chess.piece;

import chess.Location;

public class Bishop extends Piece {

    public Bishop(Location location, String name, PieceType pieceType) {
        super(location, name, pieceType);
    }

    @Override
    public Boolean isCanMoveDestination(Location destination) {
        int dx = getLocation().getX() - destination.getX();
        int dy = getLocation().getY() - destination.getY();

        return Math.abs(dx) == Math.abs(dy);
    }
}
