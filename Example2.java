import java.util.Scanner;


public class Example2 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		boolean valid;
		do{
		System.out.println("enter score");
		int score = scan.nextInt();
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
	    else if (score>=50)
	    {
	    	grade="D";
	    
	    } 
	    else if (score<50)
	    {
	    	grade="F";
	    }
	    System.out.println(" score is "+grade);
	   System.out.println("do u want to continue the process");
	   String input=scan.next();
	   if(input.equalsIgnoreCase("yes")){
		   valid= true;
	   }else {
		   valid= false;
	   }
	   }while(valid);
		
		}}


