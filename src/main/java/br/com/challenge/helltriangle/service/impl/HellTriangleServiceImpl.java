package br.com.challenge.helltriangle.service.impl;

import br.com.challenge.helltriangle.exception.TriangleException;
import br.com.challenge.helltriangle.helper.HellTriangleHelper;
import br.com.challenge.helltriangle.service.TriangleService;

public class HellTriangleServiceImpl implements TriangleService{

	private HellTriangleHelper hellTriangleHelper = new HellTriangleHelper();
	
	public int findMaximumTotalTriangule(int[][] triangle) throws TriangleException {
		this.hellTriangleHelper.validateTriangle(triangle);
		return this.processToFindMaximumTotalTriangle(triangle, 0, 0);
	}
	
	private int processToFindMaximumTotalTriangle(int[][] triangle, int previousPosition, int lineNumber) throws TriangleException {
		Integer positionLargestElement = null;
		
		if (triangle.length == lineNumber) {
			return 0;
		} else {
			positionLargestElement = 
					this.hellTriangleHelper.findPositionTheLargestElementInTheRow(previousPosition, lineNumber, triangle[lineNumber]);
			return triangle[lineNumber][positionLargestElement] + processToFindMaximumTotalTriangle(triangle, positionLargestElement, lineNumber + 1);
		}
	}

}
