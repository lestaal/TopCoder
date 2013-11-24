// Top Coder: SRM 409 Div 2 - 250

public class Stick {

	public int pieces(int x){
		int sumSoFar = 0;
		int numPieces = 0;
		for (int i = 6; i >= 0; i--) {
			if (sumSoFar + Math.pow(2, i) <= x) {
				sumSoFar += Math.pow(2, i);
				numPieces++;
			}
			if (sumSoFar == x) {
				return numPieces;
			}
		}
		return -1;
	}
	
}