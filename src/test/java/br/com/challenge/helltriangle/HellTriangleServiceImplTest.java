package br.com.challenge.helltriangle;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.challenge.helltriangle.exception.TriangleException;
import br.com.challenge.helltriangle.service.impl.HellTriangleServiceImpl;

public class HellTriangleServiceImplTest {

	private HellTriangleServiceImpl hellTriangleServiceImpl;
	
	@Before
	public void setUp() {
		this.hellTriangleServiceImpl = new HellTriangleServiceImpl();
	}
	
	@Test
	public void testFindMaximumTotalTriangle() throws TriangleException {
		int[][] hellTriangle = {{6},{3,5},{9,7,1},{4,6,8,4}};
		int maximumTotal = this.hellTriangleServiceImpl.findMaximumTotalTriangule(hellTriangle);
		
		assertEquals(maximumTotal, 26);
	}

}
