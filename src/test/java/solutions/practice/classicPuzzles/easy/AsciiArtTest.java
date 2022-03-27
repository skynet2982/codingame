/*
 * Author: Robin Péricé (2022)
 */
package solutions.practice.classicPuzzles.easy;

import common.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import solutions.practice.classicPuzzles.easy.ascii.art.Solution;

import java.io.IOException;
import java.util.Scanner;

public class AsciiArtTest extends AbstractTest {

    public static final String TEST_FILES_BASE_DIR = "solutions/practice/classicPuzzles/easy/asciiArt/";
    private static final String TEST_FILE_4_5_G = TEST_FILES_BASE_DIR + "4_5_G";
    private static final String TEST_FILE_MANHATTAN = TEST_FILES_BASE_DIR + "MANHATTAN";

    @Test (enabled = true)
    public void testOneLetter() throws IOException {
        // Build the solution
        //  ##
        // #
        // # #
        // # #
        //  ##
        StringBuilder builder = new StringBuilder();
        builder.append(" ## ").append("\n");
        builder.append("#   ").append("\n");
        builder.append("# # ").append("\n");
        builder.append("# # ").append("\n");
        builder.append(" ## ");
        String solution = builder.toString();

        // GIVEN
        try (Scanner sc = loadTestFile(TEST_FILE_4_5_G);) {
            // WHEN
            final String solve = Solution.solve(sc);
            // THEN
            Assert.assertEquals(solve, solution);
        }
    }

    @Test (enabled = true)
    public void testOneWord() throws IOException {
        // Build the solution
        //  #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###
        // # # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #
        // ### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##
        // # # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #
        // # # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #
        StringBuilder builder = new StringBuilder();
        builder.append("# #  #  ### # #  #  ### ###  #  ### ").append("\n");
        builder.append("### # # # # # # # #  #   #  # # # # ").append("\n");
        builder.append("### ### # # ### ###  #   #  ### # # ").append("\n");
        builder.append("# # # # # # # # # #  #   #  # # # # ").append("\n");
        builder.append("# # # # # # # # # #  #   #  # # # # ");
        String solution = builder.toString();

        // GIVEN
        try (Scanner sc = loadTestFile(TEST_FILE_MANHATTAN);) {
            // WHEN
            final String solve = Solution.solve(sc);
            // THEN
            Assert.assertEquals(solve, solution);
        }
    }
}
