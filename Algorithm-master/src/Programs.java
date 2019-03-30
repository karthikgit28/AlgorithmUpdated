
public class Programs {

	public static void main(String[] args) {
		//Natural Number sum
		int sum =0;
		for(int i=0;i<1000;i++) {
			if(i%3==0 || i%5==0) {
				sum+= i;
			}
		}
		System.out.println("Sum= "+ sum);


		//Fibonacci Even number sum
		int fib1 = 0;
		int fib2 = 0;
		int curFib = 1;
		int sum1 = 0;
		while(curFib < 4000000){
			if(curFib % 2 == 0){
				sum1 += curFib;
			}
			fib1 = fib2;
			fib2 = curFib;
			curFib = fib1 + fib2;
		}
		System.out.println("Solution to problem 2 = " + sum1);


		//Palindrome
		int max = 0;
		for(int i=100;i<1000;i++) {
			for(int j=100;j<1000;j++) {
				int k = i*j;
				String z = String.valueOf(k);
				if(new StringBuffer(z).reverse().toString().equals(z) && k>max) {
					max = k;
				}
			}
		}
		System.out.println("Solution to problem 3 = " + max);


	}

}
