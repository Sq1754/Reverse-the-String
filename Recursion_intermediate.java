
public class Recursion_intermediate {
	// Q-> Print a string in reverse 
	
	public static void printRev(String str, int idx) {
		
		if(idx==0) {// Base case
			System.out.println(str.charAt(idx));
			return;
		}
		
		System.out.print(str.charAt(idx));
		printRev(str,idx-1);
	}
	
	public static void main(String args[]) {
		String str = "abcde";
		printRev(str,str.length()-1);// -1 is because index stars from 0 but string length from 1
	}

}
