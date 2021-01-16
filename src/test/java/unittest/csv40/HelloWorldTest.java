package unittest.csv40;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import edu.vcccd.vc.csv40.HelloWorld;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HelloWorldTest {
	private static final int maximumScore = 20;
	private static final int maximumAssignmentScore = 25;
	private static int totalScore;

	@BeforeClass
	public static void beforeTesting() {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {

		if (totalScore == maximumScore) {
			System.out.printf("Your unit test score is %d out of %d.\n\n", totalScore, maximumScore);
		} else {
			System.out.printf("Your unit test score is %d out of %d (%d).\n\n", totalScore, maximumScore,
					totalScore - maximumScore);
		}

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		System.out.printf("The assignment is worth a total of %d where the remainder of %d %s\n",
				maximumAssignmentScore, difference, correctedPoint);
		System.out.println("comes from grading related to documentation, algorithms, and other");
		System.out.println("criteria.");
	}

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@After
	public void resetStreams() {
		System.setOut(originalOut);
		System.setErr(originalErr);
	}

	@Test
	public void testHelloWorld() throws Exception {
		HelloWorld.main(null);
		assertEquals("Hello, World!\n", outContent.toString());
		totalScore += 20;
	}
}