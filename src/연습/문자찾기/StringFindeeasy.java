package 연습.문자찾기;

public class StringFindeeasy {

    static char findChars(String str) {
    	char[] temp = new char[256];  // char is 1 byte - 8 bits so 256 possible values
    	for(int i=0; i<str.length(); i++)
    		temp[str.charAt(i)]++;  // 각 문자별 고유의 인덱스에 저장
    	
    	char result = '_';
    	for(int i=0; i<str.length(); i++) {
    		if(temp[str.charAt(i)] == 1) { // count=1 이면, 해당 문자가 하나라는 것을 의
    			result = str.charAt(i);
    			break;
    		}
    	}
    	
    	return result;
    }
 
    public static void main (String[] args) {
        String str = "abacabaabacaba";
        
        System.out.println("find: " + findChars(str));
    }
}
