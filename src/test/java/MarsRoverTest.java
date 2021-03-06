import entity.Location;
import enums.Instruction;
import main.MarsRover;
import org.junit.Test;

import java.util.Arrays;

import static enums.Direction.*;
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
    public void should_return_0_negative_1_S_when_initial_location_is_0_0_S_and_accept_move_instruction() {
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

    @Test
    public void should_return_negative_1_0_W_when_initial_location_is_0_0_W_and_accept_move_instruction() {
        Location location = new Location(0, 0, W);
        MarsRover marsRover = new MarsRover(location);

        Location newLocation = marsRover.executionInstruction(Instruction.M);
        assertEquals(-1, newLocation.getX());
        assertEquals(0, newLocation.getY());
        assertEquals(W, newLocation.getDirection());
    }

    @Test
    public void should_return_0_0_W_when_initial_location_is_0_0_N_and_accept_turn_left_instruction() {
        Location location = new Location(0, 0, N);
        MarsRover marsRover = new MarsRover(location);

        Location newLocation = marsRover.executionInstruction(Instruction.L);
        assertEquals(0, newLocation.getX());
        assertEquals(0, newLocation.getY());
        assertEquals(W, newLocation.getDirection());
    }

    @Test
    public void should_return_0_0_E_when_initial_location_is_0_0_S_and_accept_turn_left_instruction() {
        Location location = new Location(0, 0, S);
        MarsRover marsRover = new MarsRover(location);

        Location newLocation = marsRover.executionInstruction(Instruction.L);
        assertEquals(E, newLocation.getDirection());
    }

    @Test
    public void should_return_0_0_N_when_initial_location_is_0_0_E_and_accept_turn_left_instruction() {
        Location location = new Location(0, 0, E);
        MarsRover marsRover = new MarsRover(location);

        Location newLocation = marsRover.executionInstruction(Instruction.L);
        assertEquals(N, newLocation.getDirection());
    }

    @Test
    public void should_return_0_0_S_when_initial_location_is_0_0_W_and_accept_turn_left_instruction() {
        Location location = new Location(0, 0, W);
        MarsRover marsRover = new MarsRover(location);

        Location newLocation = marsRover.executionInstruction(Instruction.L);
        assertEquals(S, newLocation.getDirection());
    }

    @Test
    public void should_return_0_0_W_when_initial_location_is_0_0_S_and_accept_turn_right_instruction() {
        Location location = new Location(0, 0, S);
        MarsRover marsRover = new MarsRover(location);
        Location newLocation = marsRover.executionInstruction(Instruction.R);
        assertEquals(W, newLocation.getDirection());
    }

    @Test
    public void should_return_0_0_E_when_initial_location_is_0_0_N_and_accept_turn_left_instruction() {
        Location location = new Location(0, 0, N);
        MarsRover marsRover = new MarsRover(location);

        Location newLocation = marsRover.executionInstruction(Instruction.R);
        assertEquals(E, newLocation.getDirection());
    }

    @Test
    public void should_return_0_0_N_when_initial_location_is_0_0_W_and_accept_turn_left_instruction() {
        Location location = new Location(0, 0, W);
        MarsRover marsRover = new MarsRover(location);

        Location newLocation = marsRover.executionInstruction(Instruction.R);
        assertEquals(N, newLocation.getDirection());
    }

    @Test
    public void should_return_0_0_S_when_initial_location_is_0_0_E_and_accept_turn_left_instruction() {
        Location location = new Location(0, 0, E);
        MarsRover marsRover = new MarsRover(location);

        Location newLocation = marsRover.executionInstruction(Instruction.R);
        assertEquals(S, newLocation.getDirection());
    }

    @Test
    public void should_return_1_negative_1_S_when_initial_location_is_0_0_E_and_accept_move_turn_right_move_instruction() {
        Location location = new Location(0, 0, E);
        MarsRover marsRover = new MarsRover(location);
        marsRover.executionMultiplyInstruction(Arrays.asList(Instruction.M,
            Instruction.R, Instruction.M));
        assertEquals(S, marsRover.getLocation().getDirection());
        assertEquals(1, marsRover.getLocation().getX());
        assertEquals(-1, marsRover.getLocation().getY());
    }

}
