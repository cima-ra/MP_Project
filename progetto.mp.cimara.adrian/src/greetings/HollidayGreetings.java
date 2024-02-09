package greetings;

import java.time.LocalDate;

public class HollidayGreetings implements GreeetingsStrategy{
	private LocalDate today = LocalDate.now();

	@Override
	public String getGreetings() {
		String festivity = new String("");
		
		if(isCapodanno(today)) {
			festivity = " Buon Anno nuovo! ";
		}else if (isNatale(today)){
			festivity = " Buona Natale! ";
		}
		
		return festivity;
	}
	
	private static boolean isCapodanno(LocalDate date) {
		return date.getMonthValue() == 1 && date.getDayOfMonth() == 1;
	}
	
	private static boolean isNatale(LocalDate date) {
		return date.getMonthValue() == 12 && date.getDayOfMonth() == 25;
	}
}
