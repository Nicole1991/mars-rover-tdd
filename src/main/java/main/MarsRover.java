package main;


import enums.Direction;

import static enums.Direction.N;
import static enums.Direction.S;

public class MarsRover {
    private int x;
    private int y;
    private Direction Direction;

    public MarsRover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        Direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public enums.Direction getDirection() {
        return Direction;
    }

    public void executeInstruction(String instruction) {
        if (this.getDirection() == N) {
            this.y += 1;
        } else if (this.getDirection() == S) {
            this.y -= 1;
        }
    }
}
