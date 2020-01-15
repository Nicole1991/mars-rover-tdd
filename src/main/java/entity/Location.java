package entity;

import enums.Direction;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location {
    private int x;
    private int y;
    private Direction direction;
}
