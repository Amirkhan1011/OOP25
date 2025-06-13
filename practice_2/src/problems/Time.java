package problems;

public class Time {
	public int hour;
	public int minute;
	public int second;
	
	public Time(int h, int m, int s){
		hour = h;
		minute = m;
		second = s;
	}
	
	
	public String toUniversal() {
		String res = "";
		if (hour == 24) {
			res = "00:"+ minute + ":" + second;
		}
		else {
			res = hour + ":"+ minute + ":" + second;
		}
		return res;
	}
	
	public String toStandard() {
		String res = "";
		
		if (hour > 12) {
			int new_hour = hour - 12;
			res = String.format("%02d:%02d:%02d PM", new_hour, minute, second);
		}
		else {
			res = String.format("%02d:%02d:%02d AM", hour, minute, second);
		}
		
		return res;
	}
	
	public void add(Time t) {

		hour = (hour + t.hour < 24) ? hour + t.hour: hour + t.hour - 24;
		minute = (minute + t.minute < 60) ? minute + t.minute: minute + t.minute - 60;
		second = (second + t.second < 60) ? second + t.second: second + t.second - 60;
	}

	public static void main(String[] args) {
		Time time = new Time(24, 5, 59);
		System.out.println("Standard: " + time.toStandard());
		System.out.println("Universal: " + time.toUniversal());
		Time time2 = new Time(15, 28, 30);
		time2.add(time);
		System.out.println("Universal (time2): " + time2.toUniversal());
	}
	
}
