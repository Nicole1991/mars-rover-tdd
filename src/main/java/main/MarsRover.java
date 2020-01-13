package main;

import entity.Location;
import enums.Direction;

public class MarsRover {
    private Location location;

    public Location executionMove(Location location) {
        return new Location(0, location.getY() + 1, Direction.N);
    }
}
