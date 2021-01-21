package utilitie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

class StringUtilsTest {
	
//	@DisplayName("Palindromes")
//	@ParameterizedTest(name= "{0} est un palindrome !!!") // {0} sera remplacé par le 1e argument
//	@ValueSource(strings = {"RADAR","NON","kayak"})
//    void isPalindromeTest(String word) {
//        assertTrue(StringUtils.isPalindrome(word));
//    }
	
	@DisplayName("Non Palindromes")
	@ParameterizedTest(name= "{0} n'est pas un palindrome !!!") // {0} sera remplacé par le 1e argument
	@ValueSource(strings = {"loupi","ordiu","dromadaire"})
    void isNotPalindromeTest(String word) {
        assertFalse(StringUtils.isPalindrome(word));
    }
	
//	@DisplayName("On encode Cesar")
//	@ParameterizedTest(name= "Le Cesar encodé  {0} est {1} !!!") // {0} sera remplacé par le 1e argument
//	@CsvFileSource(resources = "/fichierCsvCesar.csv", delimiter = ';')
//	void encodeCesarTest(String mot, String motCrypte) {
//		System.out.println(mot);
//		System.out.println(motCrypte);
//		assertEquals(motCrypte, StringUtils.encodeCesar(mot));
//	}
	
//	@DisplayName("On décode Cesar")
//	@ParameterizedTest(name= "Le Cesar décodé de {1} est {0} !!!") // {0} sera remplacé par le 1e argument
//	@CsvFileSource(resources = {"/fichierCsvCesar.csv"}, delimiter = ';')
//	void decodeCesarTest(String mot, String motCrypte) {
//		assertEquals(StringUtils.decodeCesar(motCrypte), mot);
//	}

//	@Test
//    void isPalindromeTest() {
//        assertTrue(StringUtils.isPalindrome("RADAR"));
//        assertTrue(StringUtils.isPalindrome("NON"));
//        assertTrue(StringUtils.isPalindrome("KAYAK"));
//        assertFalse(StringUtils.isPalindrome("loup"));
//        assertFalse(StringUtils.isPalindrome("ordi"));
//    }
//
//    @Test
//    void encodeCesarTest() {
//        assertEquals(StringUtils.encodeCesar("BONJOUR ZOE"), "CPOKPVS APF");
////        assertFalse(StringUtils.encodeCesar("non"), "qsdf");
//    }
//
//    @Test
//    void decodeCesarTest() {
//        assertEquals(StringUtils.decodeCesar("CPOKPVS APF"),"BONJOUR ZOE");
////        assertFalse(StringUtils.decodeCesar("qsdf", "non"));
//    }

}
