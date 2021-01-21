package utilitie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class MathUtilsTest {
	
	
	@DisplayName("Calcul du carré")
	//@DisplayNameGeneration(ReplaceUndescores.class)
	@ParameterizedTest(name= "Le carré de {0} est {1} !!!") // {0} sera remplacé par le 1e argument
	@CsvSource({"2,4", "3,9", "5,25", "-2,4", "-10,100"})

    void squareTest(int numberToTest, int numberResult) {
        assertEquals(numberResult, MathUtils.square(numberToTest));
    }

	@DisplayName("Calcul de la factorielle")
	@ParameterizedTest(name= "La factorielle de {0} est {1} !!!") // {0} sera remplacé par le 1e argument
	@CsvFileSource(resources = {"fichierCsv.csv"}, delimiter = ';')
	void factorialTest(int nbrToTest, double nbrResult) {
		assertEquals(nbrResult, MathUtils.factorial(nbrToTest));
	}
	
	@DisplayName("Nombres premiers")
	@ParameterizedTest(name= "Le nombre {0} est premier !!!") // {0} sera remplacé par le 1e argument
	@ValueSource(ints = {2,3,5})
    void isPrimeTest(int nbr) {
        assertTrue(MathUtils.isPrime(nbr));
    }
	
	@DisplayName("Nombres non premiers")
	@ParameterizedTest(name= "Le nombre {0} n'est pas premier !!!") // {0} sera remplacé par le 1e argument
	@ValueSource(ints = {6,8,10})
    void isNotPrimeTest(int nbr) {
        assertFalse(MathUtils.isPrime(nbr));
    }
	

//	@Test
//	void factorialTestNegative() {
//		Exception exception = assertThrows(ArithmeticException.class, () -> MathUtils.factorial(-2));
//		assertEquals("negative number", exception.getMessage());
//	}
//	
//    @Test
//    void factorialTest2() {
//        assertEquals(2, MathUtils.factorial(2));
//    }
//    
//    @Test
//    void factorialTest3() {
//        assertEquals(6, MathUtils.factorial(3));
//    }
//    
//    @Test
//    void factorialTest5() {
//        assertEquals(120, MathUtils.factorial(5));
//    }
//
//    @Test
//    void isPrimeTest2() {
//        assertTrue(MathUtils.isPrime(2));
//    }
//    
//    @Test
//    void isPrimeTestGeneral() {
//        assertTrue(MathUtils.isPrime(3));
//        assertTrue(MathUtils.isPrime(5));
//        assertFalse(MathUtils.isPrime(6));
//        assertFalse(MathUtils.isPrime(8));
//    }
	
}
