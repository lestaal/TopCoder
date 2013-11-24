// Top Coder: SRM 253 Div 2 - 250

public class ObjectPacking{
	
	/* Returns the area of the smallest box of the boxes specified by boxWidth
	 * and boxLength that can hold an object of size objWidth x objLength.
	 * (2D only, does not consider height)
	 */
	public int smallBox(int objWidth, int objLength, int[] boxWidth, int[] boxLength){
		int minArea = -1;
		for (int i=0; i < boxWidth.length; i++){
			if (Math.min(objWidth, objLength) <= Math.min(boxWidth[i], boxLength[i]) && Math.max(objWidth, objLength) <= Math.max(boxWidth[i], boxLength[i])){
				if (minArea == -1 || boxWidth[i] * boxLength[i] < minArea){
					minArea = boxWidth[i] * boxLength[i];
				}
			}
		}
		return minArea;
	}
	
}