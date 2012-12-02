
public class StringCopy {
	
	public static char[] strcopy(final char[] src, char[] dst) {
		if(src==null||dst==null) return null;
		
		int i=0;
		while(src[i]!='\0') dst[i] = src[i++];
		
		return dst;
	}
	
	public static void main(String[] args) {
		char[] src = {'h','e','l','l','o','\0'};
		char[] dst = new char[6];
		dst = strcopy(src,dst);
		System.out.println(dst);
	}
}
