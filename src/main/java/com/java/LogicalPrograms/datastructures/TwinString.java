package com.java.LogicalPrograms.datastructures;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TwinString {
	
	public static void main(String[] args) {
		List<String> a = new LinkedList<>();
		List<String> b = new LinkedList<>();
		
		a.add("cdab");
		a.add("abdc");
		a.add("acbs");
		
		b.add("abcd");
		b.add("bdcg");
		b.add("acba");
		
		List<String> ls = twins(a,b);
		System.out.println(ls);
	}

    // Complete the twins function below.
    static List<String> twins(List<String> a, List<String> b) {
        
        int aLen = a.size();
        int bLen = b.size();
        int min = 0;
        if(aLen < bLen){
            min = aLen;
        }else{
            min = bLen;
        }
        List<String> ls = new LinkedList();
        int i = 0;
        int j = 0;
        while(ls.size() < min){
            String str = a.get(i);
            String str1 = b.get(j);
            if(str.equals(str1)){
                ls.add("Yes");
            } else{
                boolean isEqu = false;
                if(str.length() == str1.length()){
                    char[] cr = str.toCharArray();
                    for(int m=0;m<cr.length-2;m = m+1){
                        char temp = cr[m];
                        cr[m] = cr[m+2];
                        cr[m+2] = temp;
                        String s = ""+Arrays.toString(cr);
                        if(str1.equals(s)){
                            ls.add("Yes");
                            isEqu = true;
                            break;
                        }
                    }
                    if(!isEqu){
                        for(int m=1;m<cr.length-2;m = m+1){
                        char temp = cr[m];
                        cr[m] = cr[m+1];
                        cr[m+1] = temp;
                        String s = ""+Arrays.toString(cr);
                        if(str1.equals(s)){
                            ls.add("Yes");
                            isEqu = true;
                            break;
                        }
                    }
                    }
                    
                    
                    if(!isEqu){
                        ls.add("No");
                    }
                    
                }else{
                    ls.add("No");
                }
            }       
            i++;
            j++;
        }
        return ls;

    }
    
    
    


}


