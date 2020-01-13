package main;

import entity.Location;
import enums.Direction;
import enums.Instruction;

public class MarsRover {
    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public Location executionInstruction(Instruction instruction) {
        return executionMove(this.location);
    }

    private Location executionMove(Location location) {
        int currentY = location.getY();
        int currentX = location.getX();
        if (location.getDirection() == Direction.N) {
            location.setY(currentY + 1);
        } else if (location.getDirection() == Direction.S) {
            location.setY(currentY -1);
        } else if (location.getDirection() == Direction.E) {
            location.setX(currentX + 1);
        } else if (location.getDirection() == Direction.W) {
            location.setX(currentX - 1);
        }
        return location;
    }
}
