package pcs.qns2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class problem1 {
	public int findLargest(int number) {
		
		String str = (new Integer(number)).toString();
	    char[] numArray = str.toCharArray();
	    int[] num = new int[numArray.length];
	    for (int i = 0; i < numArray.length; i++) {
	    	num[i] = Character.getNumericValue(numArray[i]);
	    }
		
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < num.length; i++)
            list.add(Integer.toString(num[i]));
        
        //Collections.sort(list,(a,b) -> (int)(Long.parseLong(b+a) - Long.parseLong(a+b)));
        Collections.sort(list, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for(String x:list) {
            sb.append(x);
        }

        return Integer.valueOf(sb.toString());
    }
}
