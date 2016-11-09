package fr.iut.tpjunit;

import org.junit.Assert;
import org.junit.Test;


public class AppTest {
	
	private App test = new App();
	
	@Test
	public void TestSomme(){
		// Prepare | Given
		int a = 1;
		int b = 2;
		// Perform | When
		int resultat = test.somme(a, b);
		// Post Check | Then
		Assert.assertEquals(3, resultat);
	}
	
	@Test
	public void TestMultiplication(){
		
	}

}
