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
        switch (instruction) {
            case M: this.location.moveInstruction(); break;
            case L: this.location.turnLeftInstruction(); break;
            case R: this.location.turnRightInstruction(); break;
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
