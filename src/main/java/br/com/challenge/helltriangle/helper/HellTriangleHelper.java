package br.com.challenge.helltriangle.helper;

import br.com.challenge.helltriangle.exception.TriangleException;

public class HellTriangleHelper {

	public int findPositionTheLargestElementInTheRow(int previousPosition, int lineNumber, int[] row) 
			throws TriangleException {
		
		Integer position = lineNumber == 0 ? 
				0 : this.findPositionOfTheLargestElementOfTwoNearestElements(previousPosition, row);
				
		return position;
	}
	
	public void validateTriangle(int[][] triangle)
			throws TriangleException {
		
		int previousTotalPosition = 0;
		
		for (int i = 0; i < triangle.length; i++) {
			if (triangle[i].length == (previousTotalPosition + 1)) {
				previousTotalPosition = triangle[i].length;
			} else {
				throw new TriangleException("The Triangle is incompatible.");
			}
		}
		
	}
	
	private int findPositionOfTheLargestElementOfTwoNearestElements(int previousPosition, int[] row) throws TriangleException {
		Integer position = null;
		
		if (row.length > (previousPosition+1)) {
			position = row[previousPosition] > row[previousPosition + 1] ? 
					previousPosition : (previousPosition + 1);
		} else {
			throw new TriangleException("The row is incompatible.");
		}		
		
		return position;
	}
	
}
