package entity;

import enums.Direction;

public class Location {
    private int x;
    private int y;
    private Direction direction;

    public Location(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
