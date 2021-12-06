package tennis;

public class TennisScore {
	int GameStatus = 0; // 1: deuce
	
//	public int addOnePoint(int currentscore) {
//		int retScore = 0;
//		
//		if (currentscore == 0) {
//			retScore = 15;
//		} else if (currentscore == 15) {
//			retScore = 30;
//		} else if (currentscore == 30) {
//			retScore = 40;
//		} else if (currentscore == 40) {
//			retScore = 100;
//		}
//		return retScore;
//	}
	
	public int addOnePoint(Player playerA, Player playerB) {
		int retScore = 0;
		
		if (playerA.tennisScore == 0) {
			playerA.tennisScore = 15;
		} else if (playerA.tennisScore == 15) {
			playerA.tennisScore = 30;
		} else if (playerA.tennisScore == 30 && playerB.tennisScore!=40) {
			playerA.tennisScore = 40;
		} else if (playerA.tennisScore == 30 && playerB.tennisScore == 40) {
			playerA.tennisScore = 40;
			GameStatus = 1;
		} else if (playerA.tennisScore == 40 && playerB.tennisScore!= 40 && playerB.tennisScore!= 50&& GameStatus != 1) {
			playerA.tennisScore = 100;
		} else if (playerA.tennisScore == 40 && GameStatus == 1) {
			playerA.tennisScore = 50;
			GameStatus = 0;
		} else if (playerA.tennisScore == 50 ) {
			playerA.tennisScore = 100;
			GameStatus = 0;
		} else if (playerA.tennisScore == 40 && playerA.tennisScore == 50) {
			playerA.tennisScore = 40;
			GameStatus = 1;
		}
		return playerA.tennisScore;
	}

}
