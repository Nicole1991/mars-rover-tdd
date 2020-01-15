package enums;

public enum Direction {
    N("N", "W", "E"),
    E("E", "N", "S"),
    S("S", "E", "W"),
    W("W", "S", "N");

    private String local;
    private String turnLeft;
    private String turnRight;

    Direction(String local, String turnLeft, String turnRight) {
        this.local = local;
        this.turnLeft = turnLeft;
        this.turnRight = turnRight;
    }

    public String getTurnLeft() {
        return this.turnLeft;
    }

    public String getTurnRight() {
        return turnRight;
    }
}
