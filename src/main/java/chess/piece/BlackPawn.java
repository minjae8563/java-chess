package chess.piece;

import chess.Color;
import chess.Location;
import java.util.List;

public class BlackPawn extends Piece {

    public BlackPawn(Location location, String name, PieceType pieceType) {
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

        return dx == -1 && dy == 0;
    }
}
