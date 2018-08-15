package Lab17;

public class TDDPrimeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		//need a method to calculate the Prime at a spot given by the user
		//this is the only piece that needs to be tested.
		
		
		

			
			
		}
		
	public static int getNthPrime(int num) {

//		int index = num - 1 ;
//		int[] prime = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41};
//		return prime[index];
		
		int x, count, i;
	    x=1;
	    count=0;
		
	    while (count < num){

	        for (i = 2; i <= num; i++){
	          if (x % i == 0) {
	            count = i;
	            break;
	          }
	        }
	        if ( i == x){
	          count = count+1;
	        }
	      }
	    return count;
		
		
	}
}
		
	


