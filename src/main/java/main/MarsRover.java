package main;

import entity.Location;
import enums.Instruction;

import java.util.List;

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
        this.location.turnRightInstruction();
        return this.location;
    }

    private Location executionTurnLeftInstruction() {
        this.location.turnLeftInstruction();
        return this.location;
    }

    private Location executionMoveInstruction() {
        this.location.moveInstruction();
        return this.location;
    }

    public void executionMultiplyInstruction(List<Instruction> instructions) {
        instructions.forEach(this::executionInstruction);
    }

    public Location getLocation() {
        return location;
    }
}
