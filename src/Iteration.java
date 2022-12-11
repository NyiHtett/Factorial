
public class Iteration {
	public static void main(String[] args) {
		System.out.println(factorial(10));
	}
	public static int factorial(int num) {
		int result = 1;
		for(int i=1;i<=10;i++) {
			result = result * i;
		}
		return result;
	}


}
