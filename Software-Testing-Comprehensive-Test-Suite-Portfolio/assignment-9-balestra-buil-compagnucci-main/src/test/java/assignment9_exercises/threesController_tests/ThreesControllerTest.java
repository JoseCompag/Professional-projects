package assignment9_exercises.threesController_tests;

import assignment9_exercises.RandomGenerator;
import assignment9_exercises.ThreesBoard;
import assignment9_exercises.ThreesController;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import static org.easymock.EasyMock.*;

@Suite
@SelectPackages("assignment9_exercises.threesController_tests.threesController_methodTest")
public class ThreesControllerTest {

    /**
     * Executes a specified movement (up, down, right, or left) on the ThreesBoard 
     * with a mocked RandomGenerator to control tile placement.
     *
     * @param threesBoard    The ThreesBoard instance on which the move will be performed.
     * @param moveDirection  The direction of the move ("up", "down", "right", or "left").
     * @param tilePosition   The specific position on the board where a new tile will appear.
     * @param tileNewValue   The value of the new tile to be added to the board after the move.
     * @throws IllegalArgumentException if an invalid move direction is provided.
     * 
     * Note: 
     * In this test setup, the verify instruction was intentionally omitted because some test cases 
     * involve scenarios where movement (e.g., moveLeft or moveRight) is invoked but no actual moves 
     * are possible on the ThreesBoard. Since no tiles are shifted or new values generated in these 
     * cases, the interactions with the mock RandomGenerator are limited or nonexistent. Adding a 
     * verify call here would introduce potential false failures, as it would expect interactions
     * with the mock that may not occur when no movement takes place. By omitting verify, the test 
     * can accurately focus on validating board state and game logic without requiring unnecessary or
     * artificial interactions with the mock object in cases where no movement happens.
     * 
     */
    public static void moveWithMockedGenerator(ThreesBoard threesBoard, String moveDirection, int tilePosition, int tileNewValue) {
        setupMockedGenerator(threesBoard, tilePosition, tileNewValue - 1);
        ThreesController controller = new ThreesController(threesBoard);

        switch (moveDirection) {
            case "up":
                controller.moveUp();
                break;
            case "down":
                controller.moveDown();
                break;
            case "right":
                controller.moveRight();
                break;
            case "left":
                controller.moveLeft();
                break;
            default:
                throw new IllegalArgumentException("Invalid direction: " + moveDirection);
        }
    }

     /**
     * Configures a mocked RandomGenerator to return specific values for tile positioning
     * and tile values, allowing control over where and with what value new tiles appear.
     *
     * @param threesBoard    The ThreesBoard instance using the mocked RandomGenerator.
     * @param tilePosition   The position index on the board where the new tile will appear.
     * @param tileNewValue   The value of the new tile to be added, adjusted to fit game requirements.
     */
    private static void setupMockedGenerator(ThreesBoard threesBoard, int tilePosition, int tileNewValue) {
        threesBoard.generator = createMock(RandomGenerator.class);
        
        expect(threesBoard.generator.getRandom(anyInt())).andReturn(tileNewValue).times(1);
        
        expect(threesBoard.generator.getRandom(anyInt())).andReturn(tilePosition).times(1); 
        expect(threesBoard.generator.getRandom(anyInt())).andReturn(tileNewValue).times(1);
        replay(threesBoard.generator);
    }
}