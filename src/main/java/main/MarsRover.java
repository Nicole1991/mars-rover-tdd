package main;

import entity.Location;

public class MarsRover {
    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public Location executeInstruction(String instruction) {
        this.location.setY(this.location.getY() + 1);
        return this.location;
    }
}
