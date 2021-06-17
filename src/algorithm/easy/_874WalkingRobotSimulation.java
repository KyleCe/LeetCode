package algorithm.easy;

import algorithm.base.Base;

import static org.junit.Assert.assertEquals;

/**
 * Created by KyleCe on 2021/3/22
 * <p>
 * A robot on an infinite XY-plane starts at point (0, 0) and faces north. The robot can receive one of three possible types of commands:
 * <p>
 * -2: turn left 90 degrees,
 * -1: turn right 90 degrees, or
 * 1 <= k <= 9: move forward k units.
 * Some of the grid squares are obstacles. The ith obstacle is at grid point obstacles[i] = (xi, yi).
 * <p>
 * If the robot would try to move onto them, the robot stays on the previous grid square instead (but still continues following the rest of the route.)
 * <p>
 * Return the maximum Euclidean distance that the robot will be from the origin squared (i.e. if the distance is 5, return 25).
 * <p>
 * Note:
 * <p>
 * North means +Y direction.
 * East means +X direction.
 * South means -Y direction.
 * West means -X direction.
 * <p>
 * Example 1:
 * <p>
 * Input: commands = [4,-1,3], obstacles = []
 * Output: 25
 * Explanation: The robot starts at (0, 0):
 * 1. Move north 4 units to (0, 4).
 * 2. Turn right.
 * 3. Move east 3 units to (3, 4).
 * The furthest point away from the origin is (3, 4), which is 32 + 42 = 25 units away.
 * Example 2:
 * <p>
 * Input: commands = [4,-1,4,-2,4], obstacles = [[2,4]]
 * Output: 65
 * Explanation: The robot starts at (0, 0):
 * 1. Move north 4 units to (0, 4).
 * 2. Turn right.
 * 3. Move east 1 unit and get blocked by the obstacle at (2, 4), robot is at (1, 4).
 * 4. Turn left.
 * 5. Move north 4 units to (1, 8).
 * The furthest point away from the origin is (1, 8), which is 12 + 82 = 65 units away.
 */
public class _874WalkingRobotSimulation extends Base {

    @Override
    public void main() {
        {
            //* Input: commands = [4,-1,3], obstacles = []
            //* Output: 25
            int[] commands = {4, -1, 3};
            int[][] obstacles = {{}};
            assertEquals(robotSim(commands, obstacles), 25);
        }
        {
            //* Input: commands = [4,-1,4,-2,4], obstacles = [[2,4]]
            //* Output: 65
            int[] commands = {4, -1, 4, -2, 4};
            int[][] obstacles = {{2, 4}};
            assertEquals(robotSim(commands, obstacles), 65);
        }
    }

    public int robotSim(int[] commands, int[][] obstacles) {
        return 1;
    }

}
