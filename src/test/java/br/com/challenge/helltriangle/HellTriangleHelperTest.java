package br.com.challenge.helltriangle;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.challenge.helltriangle.exception.TriangleException;
import br.com.challenge.helltriangle.helper.HellTriangleHelper;

public class HellTriangleHelperTest {

	private HellTriangleHelper hellTriangleHelper ;
	
	@Before
	public void setUp() {
		this.hellTriangleHelper = new HellTriangleHelper();
	}
	
	@Test
	public void testPositionTheLargestElementInTheRowIsFound() throws TriangleException {
		int previousPosition = 1;
		int[] row = {9,1,7};

		int position = 
				this.hellTriangleHelper.findPositionTheLargestElementInTheRow(previousPosition, 2, row);
		
		assertEquals(position, 2);
	}
	
	@Test(expected = TriangleException.class)
	public void testPositionTheLargestElementInTheRowIsNotFound() throws TriangleException {
		int previousPosition = 4;
		int[] row = {20,9,10,6,3};
 
		this.hellTriangleHelper.findPositionTheLargestElementInTheRow(previousPosition, 4, row);
	}

	@Test
	public void testTriangleValid() throws TriangleException {
		int[][] hellTriangle = {{6},{3,5},{9,7,1},{4,6,8,4}};		
		this.hellTriangleHelper.validateTriangle(hellTriangle);
	}	
	
	@Test(expected = TriangleException.class)
	public void testTriangleNotValid() throws TriangleException {
		int[][] hellTriangle = {{6},{3,5},{9,7,1,5},{4,6,8,4,20}};
		this.hellTriangleHelper.validateTriangle(hellTriangle);
	}
	
}
