package br.com.challenge.helltriangle.service;

import br.com.challenge.helltriangle.exception.TriangleException;

public interface TriangleService {

	public int findMaximumTotalTriangule(int[][] triangle) throws TriangleException;
	
}
