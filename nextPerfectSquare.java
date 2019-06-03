public class nextPerfectSquare{
	public static void main(String[] args){
		int result = nextPerfectSquare(36);
		System.out.println(result);
//		result = nextPerfectSquare(36);
//		System.out.println(result);
//		result = nextPerfectSquare(0);
//		System.out.println(result);
//		result = nextPerfectSquare(-5);
//		System.out.println(result);
	}

	static int nextPerfectSquare(int n){
		int nextPerfectSquare = 0;
		if(n >= 0){
			double sqrtResult = Math.sqrt(n);
                        System.out.println("Sqrt : "+sqrtResult);
			int baseNumber = (int)sqrtResult;
                        System.out.println("Base : "+baseNumber);
			int nextNumber = baseNumber + 1;
                        System.out.println("Next Number : "+nextNumber);
			nextPerfectSquare = (int)Math.pow(nextNumber, 2);
                        
		}
		return nextPerfectSquare;
	}
}