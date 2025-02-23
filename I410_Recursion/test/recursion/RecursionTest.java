package recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class RecursionTest {

	@Test
	void Recursion_sumOfDigits_POSITIVE15to6() {
		        assertEquals(6, Recursion.sumOfDigits(15));
		    }
	@Test
    void Recursion_sumOfDigits_NEGATIVE15to6() {
        assertEquals(6, Recursion.sumOfDigits(-15));
    }
	
	@Test
    void Recursion_sumOfDigits_NEGATIVE66to12() {
        assertEquals(12, Recursion.sumOfDigits(-66));
    }
	@Test
    void Recursion_sumOfDigits_POSITVE66to12() {
        assertEquals(12, Recursion.sumOfDigits(-66));
    }
	@Test
    void Recursion_sumOfDigits_0to0() {
        assertEquals(0, Recursion.sumOfDigits(0));
    }
	@Test
    void Recursion_sumOfDigits_15000to6() {
        assertEquals(6, Recursion.sumOfDigits(15000));
    }
	@Test
    void Recursion_sumOfDigits_NEGATIVE15000to6() {
        assertEquals(6, Recursion.sumOfDigits(-15000));
    }

	@Test
 void Recursion_sumOfDigits_1038TO13() {
     assertEquals(12, Recursion.sumOfDigits(1038));
 }


	

	


	//{'[':',')','' ,L,'i','f','e','' , 'i' ,'s' ,''  , 'g' , 'o' , 'o' , 'd' ,'' , ':' , ') ', ']' , '0'} -> 2

	@Test
	void Recursion_testCountSmiles_COLONBEFOREPARENTEHISCHECKINDEX0() {
		 char[] letters0 = {':', ')', ' ', 'L', 'i', 'f', 'e', ' ', 'i', 's', ' ', 'g', 'o', 'o', 'd', ' ', ':', ')'};
	        

		
		  assertEquals(2, Recursion.countSmiles(letters0, 0));
	 }
	@Test
	void Recursion_testCountSmiles_COLONBEFOREPARENTEHISCHECKINDEX1() {
		
		char[] letters1 = {'H', 'a', 'p', 'p', 'y', ' ', 'D', 'a', 'y', ' ', ':', ')', ':', ')', ':', ')', '!'};
		assertEquals(3, Recursion.countSmiles(letters1, 0));
		
	}
	@Test
	void Recursion_testCountSmiles_COLONBEFOREPARENTEHISCHECKINDEX2() {
		
		char[] letters2 = {'a', ':', 'b', '(', 'c', ')', ':', ' ', ')', 'e'};	
		assertEquals(0, Recursion.countSmiles(letters2, 0));
	}
	@Test
	void Recursion_testCountSmiles_COLONBEFOREPARENTEHISCHECKINDEX3() {
		
		char[] letters2 = {'a', ':', ')', '(', ':', ')', ':', ')', ')', 'e'};	
		assertEquals(3, Recursion.countSmiles(letters2, 0));
	}
	@Test
	void Recursion_testCountSmiles_COLONBEFOREPARENTEHISCHECKINDEX4() {
		
		char[] letters3 = {':', ')', 'a', ':', ')', '(', ':', ')', ':', ')', ')', 'e'};	
		assertEquals(4, Recursion.countSmiles(letters3, 0));
	}
	@Test
	void Recursion_testCountSmiles_COLONBEFOREPARENTEHISCHECKINDEX5() {
		
		char[] letters3 = {'a', ':', ')', '(', ':', ')', ':', ')', ':', ')'};	
		assertEquals(4, Recursion.countSmiles(letters3, 0));
	}
	@Test
	void Recursion_testCountSmiles_COLONBEFOREPARENTEHISCHECKINDEX6() {
		
		char[] letters3 = {'a', ' ', ')', '(', ' ', ')', ' ', ')', ' ', ')'};	
		assertEquals(0, Recursion.countSmiles(letters3, 0));
	}
	
	@Test
	void Recursion_testCountSmiles_COLONBEFOREPARENTEHISCHECKINDEX7() {
		
		char[] letters3 = {':',')', ':', ')', ':', ')', ':', ')', ':', ')', ':', ')'};	
		assertEquals(6, Recursion.countSmiles(letters3, 0));
	}

	@Test
	void Recurison_testToUpper_INPUTINGHithereRETURNSSPACEOUTSTRING() {
	  String testToUpper1 = "Hi there!";
		assertEquals("H I   T H E R E !", Recursion.convertToUpperAndSeparate(testToUpper1));
	}
	@Test
	void Recurison_testToUpper_INPUTINGfarthereRETURNSSPACEOUTSTRING() {
	  String testToUpper1 = "fart here!";
		assertEquals("F A R T   H E R E !", Recursion.convertToUpperAndSeparate(testToUpper1));
	}
	@Test
	void Recurison_testToUpper_INPUTINGhowdythereRETURNSSPACEOUTSTRING() {
	  String testToUpper1 = "howdy there!";
		assertEquals("H O W D Y   T H E R E !", Recursion.convertToUpperAndSeparate(testToUpper1));
	}
	@Test
	void Recurison_testToUpper_INPUTINbigcorpoRETURNSSPACEOUTSTRING() {
	  String testToUpper1 = "big corpo!";
		assertEquals("B I G   C O R P O !", Recursion.convertToUpperAndSeparate(testToUpper1));
	}
	@Test
	void Recurison_testToUpper_INPUTINthefireisstartingRETURNSSPACEOUTSTRING() {
	  String testToUpper1 = "the fire is starting";
		assertEquals("T H E   F I R E   I S   S T A R T I N G", Recursion.convertToUpperAndSeparate(testToUpper1));
	}
	@Test
	void Recurison_testToUpper_INPUTINschoolisfunRETURNSSPACEOUTSTRING() {
	  String testToUpper1 = "school is fun";
		assertEquals("S C H O O L   I S   F U N", Recursion.convertToUpperAndSeparate(testToUpper1));
	}
	@Test
	void Recurison_testToUpper_INPUTIINhalflifeRETURNSSPACEOUTSTRING() {
	  String testToUpper1 = "half life";
		assertEquals("H A L F   L I F E", Recursion.convertToUpperAndSeparate(testToUpper1));
	}
	@Test
	void Recurison_testToUpper_INPUTIINclibingfunRETURNSSPACEOUTSTRING() {
	  String testToUpper1 = "climbing fun";
		assertEquals("C L I M B I N G   F U N", Recursion.convertToUpperAndSeparate(testToUpper1));
	}

}
