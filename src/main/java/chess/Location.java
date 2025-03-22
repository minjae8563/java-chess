package chess;

import java.util.Objects;

public class Location {
    private final int x;
    private final int y;

    public Location(int x, int y) {
        validateCoordinate(x);
        validateCoordinate(y);
        this.x = x;
        this.y = y;
    }

    private void validateCoordinate(int number) {
        if (number < 0 || number > 7) {
            throw new IllegalArgumentException("[ERROR] 체스판은 7 X 7 입니다. 입력값을 확인해 주세요");
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Location location = (Location) o;
        return x== location.x && y == location.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
