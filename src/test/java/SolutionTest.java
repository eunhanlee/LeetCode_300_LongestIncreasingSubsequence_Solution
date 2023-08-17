import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Solution;
import org.example.followUpSolution;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testCases() {
        Solution solution = new Solution();
//        followUpSolution solution = new followUpSolution();

        int[] nums1 = { 10, 9, 2, 5, 3, 7, 101, 18 };
        int expected1 = 4;
        int actual1 = solution.lengthOfLIS(nums1);
        assertEquals(expected1, actual1);

        int[] nums2 = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
        int expected2 = 6;
        int actual2 = solution.lengthOfLIS(nums2);
        assertEquals(expected2, actual2);

        int[] nums3 = { 3, 10, 2, 1, 20 };
        int expected3 = 3;
        int actual3 = solution.lengthOfLIS(nums3);
        assertEquals(expected3, actual3);

        int[] nums4 = { 50, 3, 10, 7, 40, 80 };
        int expected4 = 4;
        int actual4 = solution.lengthOfLIS(nums4);
        assertEquals(expected4, actual4);

        int[] nums5 = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int expected5 = 5;
        int actual5 = solution.lengthOfLIS(nums5);
        assertEquals(expected5, actual5);

        int[] nums6 = { 10, 20, 10, 30, 5, 40 };
        int expected6 = 4;
        int actual6 = solution.lengthOfLIS(nums6);
        assertEquals(expected6, actual6);

        int[] nums7 = { 3, 4, 5, 10 };
        int expected7 = 4;
        int actual7 = solution.lengthOfLIS(nums7);
        assertEquals(expected7, actual7);

        int[] nums8 = { 10, 9, 8, 7 };
        int expected8 = 1;
        int actual8 = solution.lengthOfLIS(nums8);
        assertEquals(expected8, actual8);

        int[] nums9 = { 1, 3, 6, 7, 9, 4, 10, 5, 6 };
        int expected9 = 6;
        int actual9 = solution.lengthOfLIS(nums9);
        assertEquals(expected9, actual9);

        int[] nums10 = { 5, 8, 7, 1, 9 };
        int expected10 = 3;
        int actual10 = solution.lengthOfLIS(nums10);
        assertEquals(expected10, actual10);

        System.out.println("All test cases passed.");
    }
}
