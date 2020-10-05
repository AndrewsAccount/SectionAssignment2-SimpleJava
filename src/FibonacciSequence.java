import acm.program.ConsoleProgram;

public  class FibonacciSequence extends ConsoleProgram {
	
	/**
	 * these are Javadoc comments 
	 */
	private static final long serialVersionUID = 1L;
	
	//Instructions call for Fibonacci number UP TO 10,000
	final static int MAX_VALUE = 10_000;
	//Finding the Fibonacci sequence up to 10,000, I should not need more than 100 elements.
	final static int SENTINAL = 100;
	
	//entrance point
	public void run() {
		
		//Notification to the user
		System.out.println("This program lists values in a Fibonacci Sequence, up to the values up to 10,000.");
		
		/* You need to know the value of the previous 2 elements to determine the value of the current
		 * element, so create an array to store each value. This will make it easy to access the previous two
		 * elements.
		 */
		int[] fibSeq = new int[SENTINAL];
		
		//These are the given values of the first 2 elements of the Fibonacci Sequence.
		fibSeq[0] = 0;
		fibSeq[1] = 1;
		
		//Print the first 2 values of the sequence, since these are the base element
		System.out.println(fibSeq[0]);
		System.out.println(fibSeq[1]);
		
		/*	Using the given base elements, use a loop to iterate through and unknown length loop...
		 *  Until you reach the MAX_VALUE and no longer need to continue counting.
		 */
		
		for (int i = 2; i < fibSeq.length; i++) {
			
			fibSeq[i] = fibSeq[i-1] + fibSeq[i-2];
			if (fibSeq[i] >= MAX_VALUE)
				break;
			System.out.println(fibSeq[i]);
		}	
	}
}