
public class IfCondition {
	public static void main(String[] args){
		boolean isEnabled = true;
		if(isEnabled){
			System.out.println("Your pass is Enabled");
		}	else {
				System.out.println("please wait");
		}
		int maleage=22;
		int femaleage=18;
	    if((maleage>=22) &&(femaleage>=18))
		{
	     System.out.println(" you can marry");
		}
		else {
			System.out.println(" you still child");
		}
	    int score =95;
	    String grade="";
	    if(score >=95){
	    	grade="A";
	    }
	    else if (score>=80)
	    {
	    	grade="B";
	    }
	    else if (score>=70)
	    {
	    	grade="c";
	    }
	    else if (score>=55)
	    {
	    	grade="D";
	    
	    } 
	    else if (score<=54)
	    {
	    	grade="F";
	    }
	    System.out.println(" score is "+grade);
	    int Day=2;
	    String weekday="";
	    if(Day==1){
	    	weekday="mon";
	    }else if(Day==2)
	    {
	    	weekday="tue";
	    }else if(Day==3)
	    {
	    	weekday="wed";
	    }else if(Day==4)
	    {
	    	weekday="thar";
	    }else if(Day==5)
	    {
	    	weekday="fri";
	    }else if(Day==6){
	    	weekday="sat";
	    }else if(Day==7){
	    	weekday="sun";
	    }
	    System.out.println(" day "+Day+" "+" weekday "+weekday);
	    
	    	    }

}
