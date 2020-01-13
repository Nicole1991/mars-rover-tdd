package main;

import entity.Location;
import enums.Instruction;

import static enums.Direction.W;

public class MarsRover {
    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public Location executionInstruction(Instruction instruction) {
        if (instruction.equals(Instruction.M)) {
            return executionMove(this.location);
        }
        return executionTurnLeft(this.location);
    }

    private Location executionTurnLeft(Location location) {
        location.setDirection(W);
        return location;
    }

    private Location executionMove(Location location) {
        int currentY = location.getY();
        int currentX = location.getX();
        switch (location.getDirection()) {
            case N: location.setY(currentY + 1); break;
            case S: location.setY(currentY -1); break;
            case E: location.setX(currentX + 1); break;
            case W: location.setX(currentX -1); break;
        }
        return location;
    }
}
