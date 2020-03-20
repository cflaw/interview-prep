package pcs;
import pcs.qns1.*;
import pcs.qns2.*;
import pcs.qns3.*;

public class main {

	public static void main(String[] args) {
		
		// question 1 - change from double to int not done
		// unit tests not done
	
		qns1 q1 = new qns1();
//		int[] denom = { 1, 10, 5, 8 };
//		int amount = 0;
//		System.out.println("Q1: "+ q1.coinChangeInt(denom, amount));
		
		double[] dDenom =  { 1, 10, 5, 8 };
		double dAmount = 13;
		System.out.println("Q1 - problem 1: "+ q1.coinChange(dDenom, dAmount));
		
		int[] denom =  { 1, 10, 5, 8 };
		int amount = 13;
		System.out.println("Q1 - problem 1 (old): "+ q1.coinChangeOld(denom, amount));

		// question 2 problem 1
		problem1 q2p1 = new problem1();
		int q2p1Results = q2p1.findLargest(18892);
		System.out.println("Q2 - problem 1: "+q2p1Results);
		
		// question 2 problem 2 - not complete
		problem2 q2p2 = new problem2();
		int q2p2Results = q2p2.findSecondLargest(q2p1Results);
		System.out.println("Q2 - problem 2: "+q2p2Results);
		
		// question 3
		qns3 q3 = new qns3();
		String brackets = "({ { [] () } } ) ()";
		Boolean q3Results = q3.checkBrackets(brackets);
		System.out.println("Q3 - problem 1: "+q3Results);

	}

}
