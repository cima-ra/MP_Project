package greetings;

import java.time.LocalTime;

public class NormalGreetings implements GreeetingsStrategy{

	private LocalTime time = LocalTime.now();
	
	@Override
	public String getGreetings() {
		String string = new String("");
		
		if(time.isBefore(LocalTime.NOON)) {
			string = " Buonga Giornata.";
		}else {
			string = " Buona Serata.";
		}
		
		return string;
	}

}
