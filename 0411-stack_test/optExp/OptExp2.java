package optExp;

public class OptExp2 {
	
	private String exp;
	
	public int evalPosfix(String postfix) {
		LinkedStack s = new LinkedStack();
		exp = postfix;
		int opr1, opr2, value;
		
		char testCh;
		
		for (int i = 0; i < 7; i++) {
			testCh = exp.charAt(i);
			
			if (testCh != '+' && testCh != '-' && testCh != '*' && testCh != '/') {
				value = testCh - '0';
				s.push(value);
			}
			else {
				opr2 = s.pop();
				opr1 = s.pop();
				
				switch(testCh) {
				case '+' :
					s.push(opr1 + opr2);
					break;
				case '-' :
					s.push(opr1 - opr2);
					break;
				case '*' :
					s.push(opr1 * opr2);
					break;
				case '/' :
					s.push(opr1 / opr2);
					break;
				}
			}
		}
		
		return s.pop();
	}

}
