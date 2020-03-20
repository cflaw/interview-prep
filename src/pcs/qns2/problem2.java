package pcs.qns2;

import java.util.ArrayList;
import java.util.Arrays;

public class problem2 {
	public int findSecondLargest(int number) {
		String str = (new Integer(number)).toString();
	    char[] numArray = str.toCharArray();
	    int[] num = new int[numArray.length];
	    for (int i = 0; i < numArray.length; i++) {
	    	num[i] = Character.getNumericValue(numArray[i]);
	    }
	    
	    
	    int position = num.length -1;
	    int prevDigit = num[num.length -1];
	   
        for (int i = num.length-1; i >= 1; i--) {
            if (num[i] > prevDigit) {
            	 position = i;    
            	//System.out.println("debug: " + num[i] + " and position: " + position);
            	 break;
            }
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
        	if (i == position) {
        		list.add(Integer.toString(num[position+1]));
        	}
        	else if (i == position+1) {
        		list.add(Integer.toString(num[position]));
        	}
        	else
        		list.add(Integer.toString(num[i]));
        }
 
        StringBuilder sb = new StringBuilder();
        for(String x:list) {
            sb.append(x);
        }

        return Integer.valueOf(sb.toString());

	}

}
