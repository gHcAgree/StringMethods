
public class StringReverse {
	
	public static char[] stringReverse(char[] src) {
		if(src==null) return null;
		
		int i=0; int j=src.length-1;
		while(i<j) {
			char c = src[i];
			src[i++] = src[j];
			src[j--] = c;
		}
		
		return src;
	}
	
	public static void main(String[] args) {
		char[] src = {'t','y','e','s','h'};
		System.out.println(stringReverse(src));
	}
}
