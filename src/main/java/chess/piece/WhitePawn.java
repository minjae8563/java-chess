package chess.piece;

import chess.Location;

public class WhitePawn extends Piece {

    public WhitePawn(Location location, String name, PieceType pieceType) {
        super(location, name, pieceType);
    }

    @Override
    public Boolean isCanMoveDestination(Location destination) {
        int dx = getLocation().getX() - destination.getX();
        int dy = getLocation().getY() - destination.getY();

        if (dx == 0 && dy == 1) {
            return true;
        }

        if (dx == 0 && dy == -1) {
            return true;
        }

        return dx == 1 && dy == 0;
    }

}
