
public class ConditionalOperator {
	public static void main(String[] args){
		boolean isEnabled = true;
		boolean isValid = true;
		boolean canEnter = isEnabled && isValid;
		System.out.println("can Enter " + canEnter);
		int like =100;
		int dislike =20;
		boolean result1 = (like >= 70)&&(dislike <10);
		System.out.println(" the result is " +result1);
		boolean isok=true;
		boolean doReverse=!isok;//t=f,f=t;
	    System.out.println("doreverse "+doReverse);
	}

}
