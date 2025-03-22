package chess.piece;

import chess.Color;
import chess.Location;
import java.util.List;

public abstract class Piece {
    protected Location location;
    private final String name;
    private final PieceType pieceType;

    public Piece(Location location, String name, PieceType pieceType) {
        this.location = location;
        this.name = name;
        this.pieceType = pieceType;
    }
    public abstract Boolean isCanMoveDestination(Location destination);

    public void updateLocation(Location destination) {
        this.location = destination;
    }

    public Location getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public PieceType getPieceType() {
        return pieceType;
    }
}
