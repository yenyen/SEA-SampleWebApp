package ch.heigvd.sea.demo.demoapp.services;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.ejb.Stateless;

/**
 *
 * @author Olivier Liechti
 */
@Stateless
public class ClockService implements ClockServiceLocal {


	@Override
	public String getCurrentTime() {
		Calendar now = Calendar.getInstance();
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy/MMM/dd HH:mm:ss"); //format it as per your requirement
		String result = formatter.format(now.getTime());
		return result;
	}

	
}
