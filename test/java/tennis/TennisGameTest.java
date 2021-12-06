package tennis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TennisGameTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void addOnePoint_addpointfrom0to15_return15() {
		Player playerA = new Player();
		Player playerB = new Player();
		playerA.tennisScore = 0; 
		playerB.tennisScore = 15;
		TennisScore ts = new TennisScore();
		int currentscore = 0;
		int expected = 15;
		
		//act
		int actual = ts.addOnePoint(playerA, playerB);
		
		//assert 
		assertEquals(expected, actual);	
		assertEquals(0, ts.GameStatus);	
	}
	
	@Test
	void addOnePoint_addpointfrom15to30_return30() {
		Player playerA = new Player();
		Player playerB = new Player();
		playerA.tennisScore = 15; 
		playerB.tennisScore = 15;
		TennisScore ts = new TennisScore();
		int currentscore = 15;
		int expected = 30;
		
		//act
		int actual = ts.addOnePoint(playerA, playerB);
		
		//assert 
		assertEquals(expected, actual);	
		assertEquals(0, ts.GameStatus);		
	}
	
	@Test
	void addOnePoint_addpointfrom30to40_return40() {
		Player playerA = new Player();
		Player playerB = new Player();
		playerA.tennisScore = 30; 
		playerB.tennisScore = 15;
		TennisScore ts = new TennisScore();
		int currentscore = 30;
		int expected = 40;
		
		//act
		int actual = ts.addOnePoint(playerA, playerB);
		
		//assert 
		assertEquals(expected, actual);	
		assertEquals(0, ts.GameStatus);	
	}
	
	@Test
	void addOnePoint_addpointfrom40toGame_return100() {
		//arrange
		Player playerA = new Player();
		Player playerB = new Player();
		playerA.tennisScore = 40; 
		playerB.tennisScore = 15;
		TennisScore ts = new TennisScore();
		int currentscore = 40;
		int expected = 100;
		
		//act
		int actual = ts.addOnePoint(playerA, playerB);
		
		//assert 
		assertEquals(expected, actual);	
		assertEquals(0, ts.GameStatus);		
	}
	
	@Test
	void addOnePoint_addpointfrom30toDeuce_return40() {
		//arrange
		Player playerA = new Player();
		Player playerB = new Player();
		playerA.tennisScore = 30; 
		playerB.tennisScore = 40;
		TennisScore ts = new TennisScore();
		int currentscore = 30;
		int expected = 40;
		
		//act
		int actual = ts.addOnePoint(playerA, playerB);
		
		//assert 
		assertEquals(expected, actual);	
		assertEquals(1, ts.GameStatus);
	}
	
	@Test
	void addOnePoint_addpointfromDeucetoAdv_return50() {
		//arrange
		Player playerA = new Player();
		Player playerB = new Player();
		playerA.tennisScore = 40; 
		playerB.tennisScore = 40;
		TennisScore ts = new TennisScore();
		ts.GameStatus = 1;
		int currentscore = 40;
		int expected = 50;
		
		//act
		int actual = ts.addOnePoint(playerA, playerB);
		
		//assert 
		assertEquals(expected, actual);	
		assertEquals(0, ts.GameStatus);
	}
	
	@Test
	void addOnePoint_addpointfrom50toGame_return100() {
		//arrange
		Player playerA = new Player();
		Player playerB = new Player();
		playerA.tennisScore = 50; 
		playerB.tennisScore = 40;
		TennisScore ts = new TennisScore();
		ts.GameStatus = 0;
		int currentscore = 50;
		int expected = 100;
		
		//act
		int actual = ts.addOnePoint(playerA, playerB);
		
		//assert 
		assertEquals(expected, actual);	
		assertEquals(0, ts.GameStatus);
	}

	@Test
	void addOnePoint_addpointfrom40toDeuce_return40() {
		//arrange
		Player playerA = new Player();
		Player playerB = new Player();
		playerA.tennisScore = 50; 
		playerB.tennisScore = 40;
		TennisScore ts = new TennisScore();
		ts.GameStatus = 1;
		int currentscore = 40;
		int expected = 40;
		
		//act
		int actual = ts.addOnePoint(playerA, playerB);
		
		//assert 
		assertEquals(expected, actual);	
		assertEquals(1, ts.GameStatus);
	}
}
