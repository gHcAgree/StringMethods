
public class StringDelete {
	
	public static char[] stringDelete(char[] sentence, char[] targets) {
		if(sentence==null||targets==null) return null;
		
		int[] targetTable = new int[256];
		for(int i=0;i<256;i++) targetTable[i] = 0;
		for(int i=0;i<targets.length;i++) {
			targetTable[targets[i]]++;
		}
		
		int current=0; int toSave=0;
		
		while(current<sentence.length) {
			if(1==targetTable[sentence[current]])
				current++;
			else
				sentence[toSave++] = sentence[current++];
		}
		
		while(toSave<sentence.length) {
			sentence[toSave++] = '\0';
		}
		
		return sentence;
	}
	
	public static void main(String[] args) {
		char[] sentence = "They are mine.".toCharArray();
		sentence = stringDelete(sentence,"aeiou".toCharArray());
		System.out.println(sentence);
	}
}
