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
        if (instruction.equals("M")) {
            executeMoveInstruction();
        } else if (instruction.equals("L")){
            executeTurnLeftInstruction();
        } else if (instruction.equals("R")) {
            executeTurnRightInstruction();
        }
    }

    private void executeTurnRightInstruction() {
        int currentDirectionIndex = Direction.valueOf(this.direction.toString()).ordinal();
        this.direction = currentDirectionIndex + 1 > 3 ? Direction.values()[0]
            : Direction.values()[currentDirectionIndex + 1];
    }

    private void executeTurnLeftInstruction() {
        int currentDirectionIndex = Direction.valueOf(this.direction.toString()).ordinal();
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
