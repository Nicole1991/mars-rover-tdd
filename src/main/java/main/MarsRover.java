package main;


import enums.Direction;

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
        switch (instruction) {
            case "M":
                executeMoveInstruction();
                break;
            case "L":
                executeTurnLeftInstruction();
                break;
            case "R":
                executeTurnRightInstruction();
                break;
        }
    }

    private void executeTurnRightInstruction() {
        int currentDirectionIndex = getCurrentDirection();
        this.direction = currentDirectionIndex + 1 > 3 ? Direction.values()[0]
            : Direction.values()[currentDirectionIndex + 1];
    }

    private int getCurrentDirection() {
        return Direction.valueOf(this.direction.toString()).ordinal();
    }

    private void executeTurnLeftInstruction() {
        int currentDirectionIndex = getCurrentDirection();
        this.direction = currentDirectionIndex - 1 < 0 ? Direction.values()[3]
            : Direction.values()[currentDirectionIndex - 1];
    }

    private void executeMoveInstruction() {
        switch (this.getDirection()) {
            case N: yAdd(); break;
            case S: ySub(); break;
            case E: xAdd(); break;
            case W: xSub(); break;
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
