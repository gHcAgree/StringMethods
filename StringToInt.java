
public class StringToInt {
	
	static boolean valid = true;        //differentiate "input 0" & "invalid input"
	
	public static int stringToInt(String number) {
		if(number==null||number.length()==0) { 
			valid = false;
			return 0;
		}
		
		int num = 0;
		boolean negtive = false;
		char sign = number.charAt(0);
		int start = 0;
		if(sign=='-') { negtive = true; start=1; }
		else if(sign=='+') { start = 1; }
		
		for(int i=start;i<number.length();i++) {
			char d = number.charAt(i);
			if(isDigit(d))
				num = num*10 + d-'0';
			else {
				valid = false;
				return 0;
			}
		}
		
		if(num==0) return 0;
		else if(negtive) return 0-num;
		else return num;
	}
	
	public static boolean isDigit(char c) {
		if(c>='0'&&c<='9') return true;
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(stringToInt("0"));
	}
}
