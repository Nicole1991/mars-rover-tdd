package main;

import entity.Location;
import enums.Direction;
import enums.Instruction;

import java.util.List;

public class MarsRover {
    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void executionMultiplyInstruction(List<Instruction> instructions) {
        instructions.forEach(this::executionInstruction);
    }

    public Location executionInstruction(Instruction instruction) {
        if (instruction.equals(Instruction.M)) {
            return executionMove(this.location);
        } else if (instruction.equals(Instruction.R)) {
            return executionTurnRight(this.location);
        }
        return executionTurnLeft(this.location);
    }

    private Location executionTurnRight(Location location) {
        int currentIndexOfDirection = Direction.valueOf(location.getDirection().toString()).ordinal();
        int newIndexOfDirection = currentIndexOfDirection + 1 > 3 ? 0 : currentIndexOfDirection + 1;
        location.setDirection(Direction.values()[newIndexOfDirection]);
        return location;
    }

    private Location executionTurnLeft(Location location) {
        int currentIndexOfDirection = Direction.valueOf(location.getDirection().toString()).ordinal();
        int newIndexOfDirection = currentIndexOfDirection - 1 < 0 ? 3 : currentIndexOfDirection - 1;
        location.setDirection(Direction.values()[newIndexOfDirection]);
        return location;
    }

    private Location executionMove(Location location) {
        int currentY = location.getY();
        int currentX = location.getX();
        switch(location.getDirection()) {
            case N: location.setY(currentY + 1); break;
            case S: location.setY(currentY -1); break;
            case E: location.setX(currentX + 1); break;
            case W: location.setX(currentX -1); break;
        }
        return location;
    }
}
