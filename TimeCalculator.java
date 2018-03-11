import java.util.Scanner;

class TimeCalculator {
	public static void main(String[] args) {
		System.out.print("Please enter the first time: ");
		Scanner in1 = new Scanner(System.in);						 	//Scanner
		int time1 = in1.nextInt();
		
		System.out.print("Please enter the second time: ");
		Scanner in2 = new Scanner(System.in);
		int time2 = in2.nextInt();

		int hour1 = time1/100; int min1 = time1 - (hour1*100);			//Parsing hour and minute
		int hour2 = time2/100; int min2 = time2 - (hour2*100);
		int hour_out = 0; int min_out = 0;								//Output initialize

		if (hour1 <= hour2){											//If first time <= second time
			if (min2 >= min1){
				hour_out = hour2 - hour1;
				min_out = min2 - min1;
			}
			else {
				hour2 -= 1;
				min2 += 60;
				hour_out = hour2 - hour1;
				min_out = min2 - min1;
			}
		}
		else { 															//If first time > second time
			if (min2 >= min1) {
				hour2 = 24 + hour2;
				hour_out = hour2 - hour1;
				min_out = min2 - min1;
			}
			else {
				hour2= 24 + hour2 - 1;
				min2 += 60;
				hour_out = hour2 - hour1;
				min_out = min2 - min1;
			}
		}
	System.out.print("The duration between these two times is " + hour_out + " hours " + min_out + " minutes.ok");
	}
}