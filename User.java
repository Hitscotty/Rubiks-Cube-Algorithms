package Rubiks1D;

import java.util.Random;

   class Cube {
	
	String color;
	
	public Cube(){
		
	}
	
}
   
public class User extends movement{
	

	
	public enum move {
		top, middle, bottom, left, center, right
	}
	
//						Create the Cube
//----------------------------------------------------------------------------


	public static Cube[] createCube() {
		Cube[] rubiks = new Cube[54];

		for (int i = 0; i < 54; i++) {
			rubiks[i] = new Cube();
			
			if (i <   9          ) rubiks[i].color = "G";
			if (i >=  9 && i < 18) rubiks[i].color = "R";
			if (i >= 18 && i < 27) rubiks[i].color = "W";
			if (i >= 27 && i < 36) rubiks[i].color = "O";
			if (i >= 36 && i < 45) rubiks[i].color = "Y";
			if (i >= 45 && i < 54) rubiks[i].color = "B";

		}

		return rubiks;
	}
	
	public static Cube[] createSudoku(){
		Cube[] sudoku = new Cube[54];
		
		String [] num = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
		
		int count = 1;
		for (int i = 0; i < 54; i++) {
			sudoku[i] = new Cube();
			if(count == 10) count = 1;
			
			sudoku[i].color = "" + count;
			count++;
			

		}
		return sudoku;
	}
//						Show the cube
//----------------------------------------------------------------------------
	
	public static void display(Cube[] C) {
		int[] row = { 9, 12, 15 };

		// Top
		System.out.printf("\t Top");
		for (int i = 0; i < 9; i++) {
			if (i % 3 == 0) System.out.printf("\n\t");
			System.out.printf("%s ", C[i].color);
		}
		
		System.out.printf("\n");

		// 			Middle Elongated
		
		System.out.println("Left\tFront\tRight\tBack");
		for (int i = 0; i < 3; i++) {
			int place = row[i];
			while (place < 45) {
				System.out.printf("%s ", C[place].color);
				System.out.printf("%s ", C[place + 1].color);
				System.out.printf("%s ", C[place + 2].color);
				System.out.printf("\t");
				place += 9;
			}
			System.out.println("");
		}

		//				bottom
		System.out.printf("\tBottom");
		for (int i = 45; i < 54; i++) {
			if (i % 3 == 0) System.out.printf("\n\t");
			System.out.printf("%s ", C[i].color);
		}

	}
	
	public static boolean solve(Cube [] rubiks){
		for (int i = 0; i < 54; i++) {
			
			if (i <   9 && rubiks[i].color != "G")             return false;
			if (i >=  9 && i < 18 &&  rubiks[i].color  != "R") return false;
			if (i >= 18 && i < 27 &&  rubiks[i].color  != "W") return false;
			if (i >= 27 && i < 36 &&  rubiks[i].color  != "O") return false;
			if (i >= 36 && i < 45 &&  rubiks[i].color  != "Y") return false;
			if (i >= 45 && i < 54 &&  rubiks[i].color  != "B") return false;

		}
		return true;
	}
	
	public static int isCross(Cube [] c){
		int [] cross = {1, 3, 5, 7};
		int count = 0;
		for(int i = 0; i < cross.length; i++){
			if(c[cross[i]].color != c[4].color) {
				count++;
			}
		}
		return count;
	}
	public static void scramble(Cube [] c){
		Random scram = new Random();
		int count    = scram.nextInt(100);
		
		while(count < 100){
			int move  = scram.nextInt(6);
			
		switch(move){
			case 0:
				face(c);
				break;
			case 1: 
				right(c);
				break;
			case 2:
				bottomCounter(c);
				break;
			case 3:
				up(c);
				break;
			case 4:
				left(c);
				break;
			case 5:
				rightCounter(c);
				break;
			case 6:
				left(c);
				break;
			default:
				break;
		}
		count++;
		}
	}
	
	

//----------------------------------------------------------------------------
//						 Debug Section	
//----------------------------------------------------------------------------


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube[] Cube = createCube();
		boolean unsolved = false;
		int count        = 1;
		while(unsolved == false){
			test(Cube);
			System.out.println("\n");
			System.out.println("\tTrial: " + count++);
			display(Cube);

			unsolved = solve(Cube);
		}
		
		//display(Cube);
		
		
			
	
		
		
	}

}
