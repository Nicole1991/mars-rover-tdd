import entity.Location;
import main.MarsRover;
import org.junit.Test;

import static enums.Direction.N;
import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_return_1_1_N_given_1_0_N_when_execute_move_instruction() {
        MarsRover marsRover = new MarsRover(new Location(1, 0, N));

        Location location = marsRover.executeInstruction("M");

        assertEquals(1, location.getX());
        assertEquals(1, location.getX());
        assertEquals(N, location.getDirection());
    }
}
