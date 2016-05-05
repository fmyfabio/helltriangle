package br.com.challenge.helltriangle.main;

import br.com.challenge.helltriangle.exception.TriangleException;
import br.com.challenge.helltriangle.service.TriangleService;
import br.com.challenge.helltriangle.service.impl.HellTriangleServiceImpl;

public class Main {

	public static void main(String[] args) throws TriangleException {		
		TriangleService triangleService = new HellTriangleServiceImpl();
		int[][] triangle = {{6},{3,5},{9,7,1},{4,6,8,4}};
		
		int maximumTotal = triangleService.findMaximumTotalTriangule(triangle);
		System.out.println("Maximum Total Hell-Triangle: "+maximumTotal);

	}

}
