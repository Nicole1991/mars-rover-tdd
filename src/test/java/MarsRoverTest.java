import entity.Location;
import enums.Instruction;
import main.MarsRover;
import org.junit.Test;

import static enums.Direction.E;
import static enums.Direction.N;
import static enums.Direction.S;
import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_return_0_1_N_when_initial_location_is_0_0_N_and_accept_move_instruction() {
        Location location = new Location(0, 0, N);
        MarsRover marsRover = new MarsRover(location);

        Location newLocation = marsRover.executionInstruction(Instruction.M);
        assertEquals(1, newLocation.getY());
        assertEquals(0, newLocation.getX());
        assertEquals(N, newLocation.getDirection());
    }

    @Test
    public void should_return_0_2_N_when_initial_location_is_0_1_N_and_accept_move_instruction() {
        Location location = new Location(0, 1, N);
        MarsRover marsRover = new MarsRover(location);

        Location newLocation = marsRover.executionInstruction(Instruction.M);
        assertEquals(2, newLocation.getY());
        assertEquals(0, newLocation.getX());
        assertEquals(N, newLocation.getDirection());
    }

    @Test
    public void should_return_0_nagetive_1_S_when_initial_location_is_0_0_S_and_accept_move_instruction() {
        Location location = new Location(0, 0, S);
        MarsRover marsRover = new MarsRover(location);

        Location newLocation = marsRover.executionInstruction(Instruction.M);
        assertEquals(-1, newLocation.getY());
        assertEquals(0, newLocation.getX());
        assertEquals(S, newLocation.getDirection());
    }

    @Test
    public void should_return_1_0_E_when_initial_location_is_0_0_E_and_accept_move_instruction() {
        Location location = new Location(0, 0, E);
        MarsRover marsRover = new MarsRover(location);

        Location newLocation = marsRover.executionInstruction(Instruction.M);
        assertEquals(1, newLocation.getX());
        assertEquals(0, newLocation.getY());
        assertEquals(E, newLocation.getDirection());
    }
}
