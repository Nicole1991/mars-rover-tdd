import enums.Instruction;
import main.MarsRover;
import org.junit.Test;

import java.util.Arrays;

import static enums.Direction.*;
import static enums.Instruction.L;
import static enums.Instruction.M;
import static enums.Instruction.R;
import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_return_1_1_N_when_given_1_0_N_and_execute_instruction_move() {
        MarsRover marsRover = new MarsRover(1, 0, N);

        marsRover.executeInstruction(M);

        assertEquals(1, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals(N, marsRover.getDirection());
    }

    @Test
    public void should_return_1_1_S_when_given_1_2_S_and_execute_instruction_move() {
        MarsRover marsRover = new MarsRover(1, 2, S);

        marsRover.executeInstruction(M);

        assertEquals(1, marsRover.getX());
        assertEquals(S, marsRover.getDirection());
        assertEquals(1, marsRover.getY());
    }

    @Test
    public void should_return_2_1_E_when_given_1_1_E_and_execute_instruction_move() {
        MarsRover marsRover = new MarsRover(1, 1, E);

        marsRover.executeInstruction(M);

        assertEquals(2, marsRover.getX());
        assertEquals(E, marsRover.getDirection());
        assertEquals(1, marsRover.getY());
    }

    @Test
    public void should_return_1_1_W_when_given_2_1_W_and_execute_instruction_move() {
        MarsRover marsRover = new MarsRover(2, 1, W);

        marsRover.executeInstruction(M);

        assertEquals(1, marsRover.getX());
        assertEquals(W, marsRover.getDirection());
        assertEquals(1, marsRover.getY());
    }

    @Test
    public void should_return_1_1_W_when_given_1_1_N_and_execute_instruction_turn_left() {
        MarsRover marsRover = new MarsRover(1, 1, N);

        marsRover.executeInstruction(L);

        assertEquals(1, marsRover.getY());
        assertEquals(1, marsRover.getX());
        assertEquals(W, marsRover.getDirection());
    }

    @Test
    public void should_return_1_1_E_when_given_1_1_S_and_execute_instruction_turn_left() {
        MarsRover marsRover = new MarsRover(1, 1, S);

        marsRover.executeInstruction(L);

        assertEquals(E, marsRover.getDirection());
        assertEquals(1, marsRover.getY());
        assertEquals(1, marsRover.getX());
    }

    @Test
    public void should_return_1_1_N_when_given_1_1_E_and_execute_instruction_turn_left() {
        MarsRover marsRover = new MarsRover(1, 1, E);

        marsRover.executeInstruction(L);

        assertEquals(N, marsRover.getDirection());
        assertEquals(1, marsRover.getY());
        assertEquals(1, marsRover.getX());
    }

    @Test
    public void should_return_1_1_S_when_given_1_1_W_and_execute_instruction_turn_left() {
        MarsRover marsRover = new MarsRover(1, 1, W);

        marsRover.executeInstruction(L);

        assertEquals(S, marsRover.getDirection());
        assertEquals(1, marsRover.getY());
        assertEquals(1, marsRover.getX());
    }

    @Test
    public void should_return_2_2_E_when_given_2_2_N_and_execute_instruction_turn_right() {
        MarsRover marsRover = new MarsRover(2, 2, N);

        marsRover.executeInstruction(R);

        assertEquals(2, marsRover.getY());
        assertEquals(2, marsRover.getX());
        assertEquals(E, marsRover.getDirection());
    }

    @Test
    public void should_return_2_2_W_when_given_2_2_S_and_execute_instruction_turn_right() {
        MarsRover marsRover = new MarsRover(2, 2, S);

        marsRover.executeInstruction(R);

        assertEquals(W, marsRover.getDirection());
        assertEquals(2, marsRover.getY());
        assertEquals(2, marsRover.getX());
    }

    @Test
    public void should_return_2_2_S_when_given_2_2_E_and_execute_instruction_turn_right() {
        MarsRover marsRover = new MarsRover(2, 2, E);

        marsRover.executeInstruction(R);

        assertEquals(S, marsRover.getDirection());
        assertEquals(2, marsRover.getY());
        assertEquals(2, marsRover.getX());
    }

    @Test
    public void should_return_2_2_N_when_given_2_2_W_and_execute_instruction_turn_right() {
        MarsRover marsRover = new MarsRover(2, 2, W);

        marsRover.executeInstruction(R);

        assertEquals(N, marsRover.getDirection());
        assertEquals(2, marsRover.getY());
        assertEquals(2, marsRover.getX());
    }

    @Test
    public void should_return_1_negative_1_S_when_initial_location_is_0_0_E_and_accept_move_turn_right_move_instruction() {
        MarsRover marsRover = new MarsRover(0, 0, E);
        marsRover.executeMultipleInstructions(Arrays.asList(Instruction.M,
            Instruction.R, Instruction.M));
        assertEquals(S, marsRover.getDirection());
        assertEquals(1, marsRover.getX());
        assertEquals(-1, marsRover.getY());
    }
}