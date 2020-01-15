package main;

import entity.Location;
import enums.Instruction;

public class MarsRover {
    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public Location executionInstruction(Instruction instruction) {
        if (instruction.equals(Instruction.M)) {
            return this.executionMoveInstruction();
        } else if (instruction.equals(Instruction.L)) {
            return this.executionTurnLeftInstruction();
        }
        return this.executionTurnRightInstruction();
    }

    private Location executionTurnRightInstruction() {
        return this.location;
    }

    private Location executionTurnLeftInstruction() {
        return this.location;
    }

    private Location executionMoveInstruction() {
        this.location.moveInstruction();
        return this.location;
    }
}
