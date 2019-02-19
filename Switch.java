public class Switch {
	public static void main(String[] args) {
		int day = 2;
		String weekday="";
		switch (day) {
		case 1:
			weekday = "mon";
			break;
		case 2:
			weekday = "tue";
			break;
		case 3:
			weekday = "wed";
			break;
		case 4:
			weekday = "thar";
			break;
		case 5:
			weekday = "fri";
			break;
		case 6:
			weekday = "sat";
			break;
		case 7:
			weekday = "sun";
			break;
		default:
			System.out.println("invalid");
			break;
			}
		System.out.println("weekday" + weekday);
	}

}
