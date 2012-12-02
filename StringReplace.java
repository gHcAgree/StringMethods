public class StringReplace {
	
	public static char[] replace(char[] sentence,char[] mark,int length) {
		
		if(sentence==null||mark==null) return null;
		
	    int count = 0;
	    for(int i=0;i<length;i++) {
	    	if(sentence[i]==' ')
	    		count++;
	    }
	    
	    int currentLen = length + (mark.length-1)*count;
	    int j=length-1,p=currentLen-1;
	    
	    while(j>=0) {
	    	if(sentence[j]!=' ')
	    		sentence[p--] = sentence[j--];
	    	else {
	    		int k=mark.length-1;
	    		while(k>=0)
	    			sentence[p--] = mark[k--];
	    		j--;
	    	}
	    }
		
		return sentence;
	}
	
	public static void main(String[] args) {
		char[] sentence1 = "They are mine.".toCharArray();
		char[] sentence2 = new char[50];
		System.arraycopy(sentence1, 0, sentence2, 0, sentence1.length);
		char[] mark = "m%y".toCharArray();
		sentence2 = replace(sentence2,mark,sentence1.length);
		System.out.println(sentence2);
	}

}
