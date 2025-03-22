package chess.piece;

import chess.Color;
import chess.Location;
import java.util.List;

public class Knight extends Piece {

    public Knight(Location location, String name, PieceType pieceType) {
        super(location, name, pieceType);
    }

    @Override
    public Boolean isCanMoveDestination(Location destination) {
        int dX = getLocation().getX() - destination.getX();
        int dY = getLocation().getY() - destination.getY();
        int presentX = getLocation().getX();
        int presentY = getLocation().getY();

        List<Location> route;

        if (dX == 2 && dY == 1) {
            route = List.of(new Location(presentX - 1, presentY), new Location(presentX - 2, presentY - 1));
            if (route.contains(destination)) {
                return true;
            }
        }

        if (dX == 2 && dY == -1) {
            route = List.of(new Location(presentX - 1, presentY), new Location(presentX - 2, presentY + 1));
            if (route.contains(destination)) {
                return true;
            }
        }

        if (dX == 1 && dY == -2) {
            route = List.of(new Location(presentX, presentY + 1), new Location(presentX - 1, presentY + 2));
            if (route.contains(destination)) {
                return true;
            }
        }

        if (dX == -1 && dY == -2) {
            route = List.of(new Location(presentX, presentY + 1), new Location(presentX + 1, presentY + 2));
            if (route.contains(destination)) {
                return true;
            }
        }

        if (dX == -2 && dY == 1) {
            route = List.of(new Location(presentX + 1, presentY), new Location(presentX + 2, presentY - 1));
            if (route.contains(destination)) {
                return true;
            }
        }

        if (dX == -2 && dY == -1) {
            route = List.of(new Location(presentX + 1, presentY), new Location(presentX + 2, presentY + 1));
            if (route.contains(destination)) {
                return true;
            }
        }

        if (dX == 1 && dY == 2) {
            route = List.of(new Location(presentX, presentY - 1), new Location(presentX - 1, presentY - 2));
            if (route.contains(destination)) {
                return true;
            }
        }

        if (dX == -1 && dY == 2) {
            route = List.of(new Location(presentX, presentY - 1), new Location(presentX + 1, presentY - 2));
            if (route.contains(destination)) {
                return true;
            }
        }

        return true;
    }
}
