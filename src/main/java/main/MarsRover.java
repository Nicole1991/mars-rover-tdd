package main;


public class MarsRover {
    private int x;
    private int y;
    private String Direction;

    public MarsRover(int x, int y, String direction) {
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

    public String getDirection() {
        return Direction;
    }

    public void executeInstruction(String instruction) {
        this.y += 1;
    }
}
