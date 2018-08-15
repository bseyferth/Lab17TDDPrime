package Lab17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TDDPrimeTest {

	
	//only need to test the method
	@Test
	void test1() {
	    int expected = 2;
        int actual = TDDPrimeApp.getNthPrime(1);
        assertEquals(expected, actual);
	}
	
	@Test
	void test2() {
	    int expected = 3;
        int actual = TDDPrimeApp.getNthPrime(2);
        assertEquals(expected, actual);
	}
	
	@Test
	void test3() {
	    int expected = 7;
        int actual = TDDPrimeApp.getNthPrime(4);
        assertEquals(expected, actual);
	}
	
	@Test
	void test4() {
	    int expected = 13;
        int actual = TDDPrimeApp.getNthPrime(6);
        assertEquals(expected, actual);
	}
	
	@Test
	void test5() {
	    int expected = 17;
        int actual = TDDPrimeApp.getNthPrime(7);
        assertEquals(expected, actual);
	}
	
	@Test
	void test6() {
	    int expected = 43;
        int actual = TDDPrimeApp.getNthPrime(14);
        assertEquals(expected, actual);
	}

}
