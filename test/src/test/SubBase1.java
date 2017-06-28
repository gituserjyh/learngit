package test;

import java.util.Calendar;

public class SubBase1 extends Base{
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
	}
}
