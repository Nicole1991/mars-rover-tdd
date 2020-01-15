package entity;

import enums.Direction;
import lombok.AllArgsConstructor;
import lombok.Builder;
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

    private void subX() {
        this.x -= 1;
    }

    private void subY() {
        this.y -= 1;
    }

    private void addY() {
        this.y += 1;
    }

    public void addX() {
        this.x += 1;
    }
}
