package Rubiks1D;

/**
 * Class that manipulates the movements of cube as a 1D respresentation
 * 
 * @author Scotty
 * 
 */

public class movement {

	// ----------------------------------------------------------------------------
	// 						General Moves (clockWise)
	// ----------------------------------------------------------------------------

	public static void up(Cube[] C) {

		int[] rotate = { 9, 10, 11 };
		Cube temper;
		for (int i = 0; i < 3; i++) {
			int spot = rotate[i];

			temper = C[spot];
			C[spot] = C[spot + 9];
			C[spot + 9] = C[spot + 18];
			C[spot + 18] = C[spot + 27];
			C[spot + 27] = temper;

		}
		
		int [] leftR = {0, 1};
		for(int place: leftR){
			temper = C[place];
			if(place == 0){
				C[place]      = C[place + 6];
				C[place + 6]  = C[place + 8];
				C[place + 8]  = C[place + 2];
				C[place + 2]  = 	  temper;
			}
		
		if(place == 1){
			C[place]      = C[place + 2];
			C[place + 2]  = C[place + 6];
			C[place + 6]  = C[place + 4];
			C[place + 4]  = 	temper;
		}
		
		}
	}

	public static void bottom(Cube[] C) {

		int[] rotate = { 42, 43, 44 };
		Cube temper;

		for (int i = 0; i < 3; i++) {
			int spot = rotate[i];
			temper = C[spot];
			C[spot] = C[spot - 9];
			C[spot - 9] = C[spot - 18];
			C[spot - 18] = C[spot - 27];
			C[spot - 27] = temper;

		}
		
		int [] leftR = {45, 46};
		for(int place: leftR){
			temper = C[place];
			if(place == 45){
				C[place]      = C[place + 6];
				C[place + 6]  = C[place + 8];
				C[place + 8]  = C[place + 2];
				C[place + 2]  = 	  temper;
			}
		
		if(place == 46){
			C[place]      = C[place + 2];
			C[place + 2]  = C[place + 6];
			C[place + 6]  = C[place + 4];
			C[place + 4]  = 	temper;
		}
		
		}

	}

	// ----------------------------------------------------------------------------

	public static void right(Cube[] C) {
		
		
		int[] rotate = { 2, 5, 8 };
		Cube temper;

		for (int i = 0; i < 3; i++) {
			int spot     = rotate[i];

			temper       = C[spot];
			C[spot]      = C[spot + 18];
			C[spot + 18] = C[spot + 45];
			C[spot + 45] = C[spot + 36];
			C[spot +  36] = temper;
		}
		
		int [] leftR = {27, 28};
		for(int place: leftR){
			temper = C[place];
			if(place == 27){
				C[place]       = C[place + 6];
				C[place + 6]   = C[place + 8];
				C[place + 8]   = C[place  + 2];
				C[place + 2]   = 	temper;
			}
		
		if(place == 28){
			C[place]      = C[place + 2];
			C[place + 2]  = C[place + 6];
			C[place + 6]  = C[place + 4];
			C[place + 4]  =  temper;
		}
		
		}

	}

	public static void left(Cube[] C) {
		
		int[] rotate = { 51, 48, 45 };
		Cube temper;

		for (int i = 0; i < 3; i++) {
			int spot     = rotate[i];

			temper       = C[spot];
			C[spot]      = C[spot - 27];
			C[spot - 27] = C[spot - 45];
			C[spot - 45] = C[spot - 9];
			C[spot -  9] = temper;
		}
		
		int [] leftR = {17, 16};
		for(int place: leftR){
			temper = C[place];
			if(place == 17){
				C[place]      = C[place - 6];
				C[place - 6]  = C[place - 8];
				C[place - 8]  = C[place - 2];
				C[place - 2]  = 	temper;
			}
		
		if(place == 16){
			C[place]      = C[place - 2];
			C[place - 2]  = C[place - 6];
			C[place - 6]  = C[place - 4];
			C[place - 4]  = 	temper;
		}
		
		}
	}

	// ----------------------------------------------------------------------------

	public static void face(Cube[] C) {

		int[] rotate = { 6, 7, 8, 24, 25 };
		Cube temper;


		for (int spot : rotate) {
			
			if(spot == 6){
				temper = C[spot];
				C[spot] = C[spot + 21];
				C[spot + 21] = C[spot + 41];
				C[spot + 41] = C[spot + 11];
				C[spot + 11] = temper;
			}
			
			if(spot == 7){
				temper = C[spot];
				C[spot] = C[spot + 23];
				C[spot + 23] = C[spot + 39];
				C[spot + 39] = C[spot + 7];
				C[spot + 7] = temper;
			}
			
			if(spot == 8){
				temper       = C[spot];
				C[spot]      = C[spot + 25];
				C[spot + 25] = C[spot + 37];
				C[spot + 37] = C[spot + 3];
				C[spot + 3]  = temper;
			}

			if (spot == 24) {
				temper      = C[spot];
				C[spot]     = C[spot + 2];
				C[spot + 2] = C[spot - 4];
				C[spot - 4] = C[spot - 6];
				C[spot - 6] = temper;

			} 

			if(spot == 25){
				temper      = C[spot];
				C[spot]     = C[spot - 2];
				C[spot - 2] = C[spot - 6];
				C[spot - 6] = C[spot - 4];
				C[spot - 4] = temper;
			}
		}

	}
	
	public static void back(Cube[] C) {
		int[] rotate = { 0, 1, 2, 42, 43 };
		Cube temper;


		for (int spot : rotate) {
			
			if(spot == 0){
				temper = C[spot];
				C[spot] = C[spot + 15];
				C[spot + 15] = C[spot + 53];
				C[spot + 53] = C[spot + 29];
				C[spot + 29] = temper;
			}
			
			if(spot == 1){
				temper = C[spot];
				C[spot] = C[spot + 11];
				C[spot + 11] = C[spot + 51];
				C[spot + 51] = C[spot + 31];
				C[spot + 31] = temper;
			}
			
			if(spot == 2){
				temper        = C[spot];
				C[spot]       = C[spot + 7];
				C[spot + 7]   = C[spot + 49];
				C[spot + 49]  = C[spot + 33];
				C[spot + 33]  = temper;
			}

			if (spot == 42) {
				temper      = C[spot];
				C[spot]     = C[spot + 2];
				C[spot + 2] = C[spot - 4];
				C[spot - 4] = C[spot - 6];
				C[spot - 6] = temper;

			} 

			if(spot == 43){
				temper      = C[spot];
				C[spot]     = C[spot - 2];
				C[spot - 2] = C[spot - 6];
				C[spot - 6] = C[spot - 4];
				C[spot - 4] = temper;
			}
		}


	}


	// ----------------------------------------------------------------------------
	// 						Counter ClockWise Moves
	// ----------------------------------------------------------------------------

	public static void upCounter(Cube[] C) {

		int[] rotate = { 36, 37, 38 };
		Cube temper;
		for (int i = 0; i < 3; i++) {
			int spot = rotate[i];

			temper = C[spot];
			C[spot] = C[spot - 9];
			C[spot - 9] = C[spot - 18];
			C[spot - 18] = C[spot - 27];
			C[spot - 27] = temper;

		}

	}

	public static void bottomCounter(Cube[] C) {

		int[] rotate = { 15, 16, 17 };
		Cube temper;

		for (int i = 0; i < 3; i++) {
			int spot = rotate[i];
			temper = C[spot];
			C[spot] = C[spot + 9];
			C[spot + 9] = C[spot + 18];
			C[spot + 18] = C[spot + 27];
			C[spot + 27] = temper;

		}
		
		int [] leftR = {45, 46};
		for(int place: leftR){
			temper = C[place];
			if(place == 45){
				C[place]      = C[place + 2];
				C[place + 2]  = C[place + 8];
				C[place + 8]  = C[place + 6];
				C[place + 6]  = 	  temper;
			}
		
		if(place == 46){
			C[place]      = C[place + 4];
			C[place + 4]  = C[place + 6];
			C[place + 6]  = C[place + 2];
			C[place + 2]  = 	temper;
		}
		
		}

	}

	// ----------------------------------------------------------------------------

	public static void rightCounter(Cube[] C) {
		
		int[] rotate = { 53, 50, 47 };
		Cube temper;

		for (int i = 0; i < 3; i++) {
			int spot     = rotate[i];

			temper       = C[spot];
			C[spot]      = C[spot - 27];
			C[spot - 27] = C[spot - 45];
			C[spot - 45] = C[spot - 9];
			C[spot -  9] = temper;
		}
		
		int [] leftR = {35, 34};
		for(int place: leftR){
			temper = C[place];
			if(place == 35){
				C[place]       = C[place - 6];
				C[place - 6]   = C[place - 8];
				C[place - 8]  = C[place - 2];
				C[place - 2]   = 	temper;
			}
		
		if(place == 34){
			C[place]      = C[place - 2];
			C[place - 2]  = C[place - 6];
			C[place - 6]  = C[place - 4];
			C[place - 4]  = 	temper;
		}
		
		}
	}

	public static void leftCounter(Cube[] C){
		int[] rotate = { 51, 48, 45 };
		Cube temper;

		for (int i = 0; i < 3; i++) {
			int spot     = rotate[i];

			temper       = C[spot];
			C[spot]      = C[spot - 9];
			C[spot - 9] = C[spot - 45];
			C[spot - 45] = C[spot - 27];
			C[spot -  27] = temper;
		}
		
		int [] leftR = {17, 16};
		for(int place: leftR){
			temper = C[place];
			if(place == 17){
				C[place]      = C[place - 2];
				C[place - 2]  = C[place - 8];
				C[place - 8]  = C[place - 6];
				C[place - 6]  = 	temper;
			}
		
		if(place == 16){
			C[place]      = C[place - 4];
			C[place - 4]  = C[place - 6];
			C[place - 6]  = C[place - 2];
			C[place - 2]  = 	temper;
		}
		
		}
	}
	// ----------------------------------------------------------------------------

	public static void faceCounter(Cube[] C) {

		int[] rotate = { 6, 7, 8, 24, 25 };
		Cube temper;


		for (int spot : rotate) {
			
			if(spot == 6){
				temper = C[spot];
				C[spot] = C[spot + 21];
				C[spot + 21] = C[spot + 41];
				C[spot + 41] = C[spot + 11];
				C[spot + 11] = temper;
			}
			
			if(spot == 7){
				temper = C[spot];
				C[spot] = C[spot + 23];
				C[spot + 23] = C[spot + 39];
				C[spot + 39] = C[spot + 7];
				C[spot + 7] = temper;
			}
			
			if(spot == 8){
				temper       = C[spot];
				C[spot]      = C[spot + 25];
				C[spot + 25] = C[spot + 37];
				C[spot + 37] = C[spot + 3];
				C[spot + 3]  = temper;
			}

			if (spot == 24) {
				temper      = C[spot];
				C[spot]     = C[spot - 6];
				C[spot - 6] = C[spot - 4];
				C[spot - 4] = C[spot + 2];
				C[spot + 2] = temper;

			} 

			if(spot == 25){
				temper      = C[spot];
				C[spot]     = C[spot - 4];
				C[spot - 4] = C[spot - 6];
				C[spot - 6] = C[spot - 2];
				C[spot - 2] = temper;
			}
		}


	}
	
	public static void backCounter(Cube [] C){
		int[] rotate = { 0, 1, 2, 42, 43 };
		Cube temper;


		for (int spot : rotate) {
			
			if(spot == 0){
				temper       = C[spot];
				C[spot]      = C[spot + 29];
				C[spot + 29] = C[spot + 53];
				C[spot + 53] = C[spot + 15];
				C[spot + 15] = temper;
			}
			
			if(spot == 1){
				temper       = C[spot];
				C[spot]      = C[spot + 31];
				C[spot + 31] = C[spot + 51];
				C[spot + 51] = C[spot + 11];
				C[spot + 11] = temper;
			}
			
			if(spot == 2){
				temper       = C[spot];
				C[spot]      = C[spot + 33];
				C[spot + 33] = C[spot + 49];
				C[spot + 49] = C[spot +  7];
				C[spot +  7] = temper;
			}

			if (spot == 42) {
				temper      = C[spot];
				C[spot]     = C[spot - 6];
				C[spot - 6] = C[spot - 4];
				C[spot - 4] = C[spot + 2];
				C[spot + 2] = temper;

			} 

			if(spot == 43){
				temper      = C[spot];
				C[spot]     = C[spot - 4];
				C[spot - 4] = C[spot - 6];
				C[spot - 6] = C[spot - 2];
				C[spot - 2] = temper;
			}
		}

	}

	// ----------------------------------------------------------------------------
	//						 Middle Section Moves
	// ----------------------------------------------------------------------------

	public static void middleLeft(Cube[] C) {

		int[] rotate = { 12, 13, 14 };
		Cube temper;

		for (int i = 0; i < 3; i++) {
			int spot = rotate[i];
			temper = C[spot];
			C[spot] = C[spot + 9];
			C[spot + 9] = C[spot + 18];
			C[spot + 18] = C[spot + 27];
			C[spot + 27] = temper;

		}

	}

	public static void middleRight(Cube[] C) {

		int[] rotate = { 39, 40, 41 };
		Cube temper;

		for (int i = 0; i < 3; i++) {
			int spot = rotate[i];
			temper = C[spot];
			C[spot] = C[spot - 9];
			C[spot - 9] = C[spot - 18];
			C[spot - 18] = C[spot - 27];
			C[spot - 27] = temper;

		}

	}

	// ----------------------------------------------------------------------------

	public static void middleUp(Cube[] C) {
		int[] rotate = { 1, 4, 7 };
		Cube temper;

		for (int i = 0; i < 3; i++) {
			int spot = rotate[i];

			temper = C[spot];
			C[spot] = C[spot + 18];
			C[spot + 18] = C[spot + 45];
			C[spot + 45] = temper;

		}
	}

	public static void middleDown(Cube[] C) {
		int[] rotate = { 52, 49, 46 };
		Cube temper;

		for (int i = 0; i < 3; i++) {
			int spot = rotate[i];

			temper = C[spot];
			C[spot] = C[spot - 27];
			C[spot - 27] = C[spot - 45];
			C[spot - 45] = temper;

		}
	}
	
	//				Unique moves Combined
	// ----------------------------------------------------------------------------
	
	public static void whiteCross(Cube [] c){
		face(c);
		rightCounter(c);
		bottomCounter(c);
		right(c);
		faceCounter(c);
		faceCounter(c);
		
	}
	
	public static void permuteCross(Cube [] c){
		faceCounter(c);
		rightCounter(c);
		bottomCounter(c);
		right(c);
		faceCounter(c);
		faceCounter(c);
	}
	public static void superFlip(Cube [] c){
		up(c);
		right(c);
		right(c);
		face(c);
		back(c);
		right(c);
		back(c);
		back(c);
		right(c);
		up(c);
		up(c);
		left(c);
		back(c);
		back(c);
		right(c);
		upCounter(c);
		bottom(c);
		right(c);
		right(c);
		face(c);
		rightCounter(c);
		left(c);
		back(c);
		back(c);
		up(c);
		up(c);
		face(c);
		face(c);
		
		
	}
	
	public static void test(Cube [] c){
		left(c);
		right(c);
		leftCounter(c);
		rightCounter(c);
	}
	public static void reset(Cube [] c){
		up(c);
		bottom(c);
		right(c);
		upCounter(c);
	
	}


}
