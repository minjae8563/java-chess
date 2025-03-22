package chess.piece;

import static chess.piece.PieceType.BISHOP;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import chess.Color;
import chess.Location;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BishopTest {
    @Test
    @DisplayName("비숍 테스트")
    void test1() {
        Bishop bishop = new Bishop(new Location(5, 5), "비숍", BISHOP);

        Location location1 = new Location(4, 6);
        Location location2 = new Location(4, 4);
        Location location3 = new Location(6, 4);
        Location location4 = new Location(6, 6);

        assertThat(bishop.isCanMoveDestination(location3)).isTrue();
        assertThat(bishop.isCanMoveDestination(location1)).isTrue();
        assertThat(bishop.isCanMoveDestination(location2)).isTrue();
        assertThat(bishop.isCanMoveDestination(location4)).isTrue();
    }

}
