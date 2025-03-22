package chess.piece;

import chess.Color;
import chess.Location;
import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece {

    public Rook(Location location, String name, PieceType pieceType) {
        super(location, name, pieceType);
    }

    @Override
    public Boolean isCanMoveDestination(Location destination) {
        int dx = getLocation().getX() - destination.getX();
        int dy = getLocation().getY() - destination.getY();
        int presentX = getLocation().getX();
        int presentY = getLocation().getY();

        if (dx == 0 && dy > 0) {
            for (int i = 1; i <= dy; i++) {
                if (destination.equals(new Location(presentX, presentY - i))) {
                    return true;
                }
            }
            return false;
        }

        if (dx == 0 && dy < 0) {
            for (int i = 1; i <= Math.abs(dy); i++) {
                if (destination.equals(new Location(presentX, presentY + i))) {
                    return true;
                }
            }
            return false;
        }

        if (dx > 0 && dy == 0) {
            for (int i = 1; i <= dx; i++) {
                if (destination.equals(new Location(presentX - i, presentY))) {
                    return true;
                }
            }
            return false;
        }

        if (dx < 0 && dy == 0) {
            for (int i = 1; i <= Math.abs(dx); i++) {
                if (destination.equals(new Location(presentX + i, presentY))) {
                    return true;
                }
            }
            return false;
        }

        return false;
    }
}
