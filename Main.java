import java.util.*;

class Main {

public static void main (String[] args) {

	Map enemyMap = new Map(10,10);
	Map checkeredMap;
	ComputerShot computerShot = new ComputerShot ();
	Shot lastShot = new Shot (5,5);

	/**Test a shot: */
	checkeredMap = computerShot.shotCheckerSteps(enemyMap);

//Check the random shooting:
	checkeredMap.setCell(5,5,9);
	computerShot.checkForPreviousHits(checkeredMap, lastShot);
	//Check the random shooting:
	checkeredMap.setCell(5,5,10);
	computerShot.checkForPreviousHits(checkeredMap, lastShot);
	

	//Test the shooting if the last successful shot is present //
	//upper cell:
	checkeredMap.setCell(5,5,2);
	computerShot.checkForPreviousHits(checkeredMap, lastShot);
	//left cell:
	checkeredMap.setCell(5,5,2);
	checkeredMap.setCell(4,5,2);
	computerShot.checkForPreviousHits(checkeredMap, lastShot);
	//lower cell:
	checkeredMap.setCell(5,5,2);
	checkeredMap.setCell(5,4,2);
	computerShot.checkForPreviousHits(checkeredMap, lastShot);
	//right cell:
	checkeredMap.setCell(5,5,2);
	checkeredMap.setCell(6,5,2);
	computerShot.checkForPreviousHits(checkeredMap, lastShot);
	//Check the random shooting:
	checkeredMap.setCell(5,5,9);
	//Check the random shooting:
	checkeredMap.setCell(5,5,10);
	
	
	

}
}
