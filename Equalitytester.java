
public class Equalitytester {
public static void main(String[] args){
	int x=10;
	double y=10;
	boolean result= x ==y;
	System.out.println(" the == result "+result);
	String name= "sowntharya";
	String regName="sowntharya";
	boolean result1= name == regName;
	System.out.println("name ==" +result1);
	boolean isEnabled=false;
	boolean isValid=false;
	boolean result2= isEnabled == isValid;
	System.out.println("the result==boolean "+result2);
	double todayprice=12.34;
	double yesterdayPrice=10.33;
	boolean result3= todayprice != yesterdayPrice;
	System.out.println("not equal "+result3);
}
}
