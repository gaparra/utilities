package utilitie;

import java.util.ArrayList;
import java.util.Arrays;

public final class StringUtils {
	private StringUtils() {
		
	}
	
	static boolean isPalindrome(String word) {
		//string contenant le mot a l'envers
		String motALenvers = "";
		
		//tableau comportant tous les charact�res du string word
		String[] ary = word.split("");
		
		//taille du tableau
		int size = ary.length;
		
		//creation du mot � l'envers
		for(int i = size-1; i >= 0; i--) {
			motALenvers += ary[i];
		}
		
		if(word.equals(motALenvers)) {
			return true;
		}
		return false;
	}
	
	static String encodeCesar(String good) {
		//tableau contenant toutes les lettres de l'alphabet
		String[] alphabet = { "A", "B", "C", "D", "E", "F", "G",
				"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
				"U", "V", "W", "X", "Y", "Z", " " };
		
		//tableau comportant tous les charact�res du string good
		String[] ary = good.split("");
		
		//tableau contenant les index de chaque characteres du string good
		ArrayList<Integer> index = new ArrayList<Integer>();
		
		//r�cup�ration des index de chaque charact�res de good
		for(String s : ary) {
			index.add(Arrays.asList(alphabet).indexOf(s));
		}
		
		String motCrypte = "";
		for(int i : index) {
			if(i == 25) {
				motCrypte += alphabet[0];
			}else {
				if(i == 26) {
					motCrypte += alphabet[i];
				}else {
					motCrypte += alphabet[i + 1];	
				}
			}
		}

		return motCrypte;
	}
	
	static String decodeCesar(String crypte) {
		//tableau contenant toutes les lettres de l'alphabet
		String[] alphabet = { "A", "B", "C", "D", "E", "F", "G",
				"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
				"U", "V", "W", "X", "Y", "Z", " " };
		
		//tableau comportant tous les charact�res du string crypte
		String[] ary = crypte.split("");
		
		//tableau contenant les index de chaque characteres du string good
		ArrayList<Integer> index = new ArrayList<Integer>();
		
		//r�cup�ration des index de chaque charact�res de good
		for(String s : ary) {
			index.add(Arrays.asList(alphabet).indexOf(s));
		}
		
		String motDecrypte = "";
		for(int i : index) {
			if(i == 0) {
				motDecrypte += alphabet[25];
			}else {
				if(i == 26) {
					motDecrypte += alphabet[i];
				}else {
					motDecrypte += alphabet[i - 1];	
				}
			}
		}
		return motDecrypte;
	}
	public static String capitalize(String str){
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
}
