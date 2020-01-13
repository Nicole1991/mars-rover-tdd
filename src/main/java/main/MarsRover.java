package main;

import entity.Location;
import enums.Direction;

public class MarsRover {
    private Location location;

    public Location executionMove(Location location) {
        return new Location(0, 1, Direction.N);
    }
}
