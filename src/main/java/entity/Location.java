package entity;

import enums.Direction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Location {
    private int x;
    private int y;
    private Direction direction;

    public void moveInstruction() {
        switch (direction) {
            case N: addY(); break;
            case S: subY(); break;
            case E: addX(); break;
            case W: subX(); break;
        }
    }

    public void turnLeftInstruction() {
        this.direction = Direction.valueOf(direction.getTurnLeft());
    }

    private void subX() {
        this.x -= 1;
    }

    private void subY() {
        this.y -= 1;
    }

    private void addY() {
        this.y += 1;
    }

    private void addX() {
        this.x += 1;
    }

    public void turnRightInstruction() {
        this.direction = Direction.valueOf(direction.getTurnRight());
    }
}
