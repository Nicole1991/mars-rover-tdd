import entity.Location;
import enums.Direction;
import enums.Instruction;
import main.MarsRover;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_return_0_1_N_when_initial_location_is_0_0_N_and_accept_move_instruction() {
        Location location = new Location(0, 0, Direction.N);
        MarsRover marsRover = new MarsRover(location);

        Location newLocation = marsRover.executionInstruction(Instruction.M);
        assertEquals(1, newLocation.getY());
    }

    @Test
    public void should_return_0_2_N_when_initial_location_is_0_1_N_and_accept_move_instruction() {
        Location location = new Location(0, 1, Direction.N);
        MarsRover marsRover = new MarsRover(location);

        Location newLocation = marsRover.executionInstruction(Instruction.M);
        assertEquals(2, newLocation.getY());
    }

    @Test
    public void should_return_0_nagetive_1_S_when_initial_location_is_0_0_S_and_accept_move_instruction() {
        Location location = new Location(0, 0, Direction.S);
        MarsRover marsRover = new MarsRover(location);

        Location newLocation = marsRover.executionInstruction(Instruction.M);
        assertEquals(-1, newLocation.getY());
    }
}
