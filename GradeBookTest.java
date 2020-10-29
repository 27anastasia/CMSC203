import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	GradeBook g1; // declaration
	GradeBook g2; // declaration
	
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g1.addScore(100);
		g1.addScore(50);
		
		g2 = new GradeBook(5); 
		g2.addScore(80); 
		g2.addScore(60); 
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null; 
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("100.0 50.0 "));
		assertEquals(2, g1.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(150, g1.sum(), 0.0001);
	}

	@Test
	void testMinimum() {
		assertEquals(50, g1.minimum(), 0.001);
	}

	@Test
	void testFinalScore() {
		assertEquals(100, g1.finalScore());
	}

	@Test
	void testGetScoreSize() {
		assertEquals(2, g1.getScoreSize());
	}

	@Test
	void testToString() {
		assertTrue(g1.toString().equals("100.0 50.0 "));
	}

}
