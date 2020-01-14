import main.MarsRover;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_return_1_1_N_when_given_1_0_N_and_execute_instruction_move() {
        MarsRover marsRover = new MarsRover(1, 0 , "N");

        marsRover.executeInstruction("M");

        assertEquals(1, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_1_1_S_when_given_1_2_S_and_execute_instruction_move() {
        MarsRover marsRover = new MarsRover(1, 2, "S");

        marsRover.executeInstruction("M");

        assertEquals(1, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals("S", marsRover.getDirection());
    }
}
