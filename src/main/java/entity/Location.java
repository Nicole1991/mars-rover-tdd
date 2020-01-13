package entity;

import enums.Direction;

public class Location {
    private int x;
    private int y;
    private Direction direction;

    public Location() {
    }

    public Location(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getY() {
        return y;
    }
}
