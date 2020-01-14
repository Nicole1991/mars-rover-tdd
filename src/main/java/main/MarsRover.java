package main;


import enums.Direction;

import static enums.Direction.*;

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
            yAdd();
        } else if (this.getDirection() == S) {
            ySub();
        } else if (this.getDirection() == E) {
            xAdd();
        } else if (this.getDirection() == W) {
            xSub();
        }
    }

    private void xSub() {
        this.x -= 1;
    }

    private void xAdd() {
        this.x += 1;
    }

    private void ySub() {
        this.y -= 1;
    }

    private void yAdd() {
        this.y += 1;
    }
}
