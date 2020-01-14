package main;


import enums.Direction;

import static enums.Direction.*;

public class MarsRover {
    private int x;
    private int y;
    private Direction direction;

    public MarsRover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public void executeInstruction(String instruction) {
        if (instruction.equals("M")) {
            switch (this.getDirection()) {
                case N: yAdd(); break;
                case S: ySub(); break;
                case E: xAdd(); break;
                case W: xSub(); break;
            }
        } else {
            this.direction = W;
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
