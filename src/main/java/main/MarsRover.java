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
            this.location.moveInstruction();
        } else if (instruction.equals(Instruction.L)) {
            this.location.turnLeftInstruction();
        } else {
            this.location.turnRightInstruction();
        }
        return this.location;
    }

    public void executionMultiplyInstruction(List<Instruction> instructions) {
        instructions.forEach(this::executionInstruction);
    }

    public Location getLocation() {
        return location;
    }
}
