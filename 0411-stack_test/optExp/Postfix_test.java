package optExp;

public class Postfix_test {
	public static void main(String args[]) {
		OptExp2 opt = new OptExp2();
		int result;
		String exp = "35*62/-";
		
		System.out.printf("\n 후위표기식 : %s", exp);
		
		result = opt.evalPosfix(exp);
		
		System.out.printf("\n 연산결과 = %d \n", result);
				
	}

}
