package chess.piece;

import static chess.piece.PieceType.ROOK;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import chess.Color;
import chess.Location;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RookTest {
    @Test
    @DisplayName("룩 테스트")
    void test1() {
        Rook rook = new Rook(new Location(7, 0), "룩", ROOK);
        Location destination = new Location(7, 7);

        assertThat(rook.isCanMoveDestination(destination)).isTrue();
    }

}
