package Rubiks1D;

public class Color{
	
	/**
	 * Notes
	 * @param C
	 */
	
	public static void left(Cube[] C) {
		
		int[] colored = {51, 48, 45,    24, 21, 18,    6, 3, 0};
		Cube temper;

		for (int i = 0; i < colored.length/4; i++) {
			int count = i;
			temper = C[count];


			while(count < 7){
			int spot = colored[count];
			System.out.println(spot);
			int next = spot + Math.abs(spot - (colored[count+3]));


			System.out.println(next);
			C[spot] = C[next];
			
			count +=3;
			}
			C[colored.length] = temper;

		}
	}
	
	
	public void face (Cube [] C){
	int[] colored = {6, 7, 8, 27, 30, 33, 47, 46, 45, 17, 14, 11};
	Cube temper;
	
	for(int spot: colored){//rotate){
		temper = C[spot];
		int position = 0;
	for(int i = 0; i < colored.length/4; i ++){
			C[spot] = C[spot + (spot - (colored[i] + 4))];
			position = spot - (colored[i] + 4);

		}
	
	C[spot + position] = temper;


	}
}

}
