package main;

import entity.Location;
import enums.Direction;

public class MarsRover {

    public Location executionMove(Location location) {
        int currentY = location.getY();
        if (location.getDirection() == Direction.N) {
            location.setY(currentY + 1);
        } else if (location.getDirection() == Direction.S) {
            location.setY(currentY -1);
        }
        return location;
    }
}
