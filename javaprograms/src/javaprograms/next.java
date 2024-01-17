package javaprograms;
		import java.util.Scanner;

		public class next {
		    public static void main(String[] args) {
		    	
		    	 
		    	        Scanner scanner = new Scanner(System.in);
		    	        //System.out.println("enter");
		    	        int N = scanner.nextInt();
		    	        int[] numbers = new int[N];
		    	        for (int i = 0; i < N; i++) {
		    	            numbers[i] = scanner.nextInt();
		    	        }

		    	        int awesomeCount = -1;
		    	        for (int K = 1; K <= N; K++) {
		    	            int countGreaterThanOrEqualK = 0;
		    	            for (int num : numbers) {
		    	                if (num >= K) {
		    	                    countGreaterThanOrEqualK++;
		    	                }
		    	            }
		    	            if (countGreaterThanOrEqualK == K) {
		    	                awesomeCount = K;
		    	                break;
		    	            }
		    	        }

		    	        System.out.println(awesomeCount);
		    	    }
		    	}


