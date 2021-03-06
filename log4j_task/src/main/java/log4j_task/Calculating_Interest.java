package log4j_task;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculating_Interest {
	private static final Logger LOGGER = LogManager . getLogger(Calculating_Interest. class);
	public double Simple_Interest(double principal_balance,double annual_interest_rate, double time_in_years )
	{
		double amount=principal_balance*(1+(annual_interest_rate/100)*time_in_years);
		LOGGER . debug("Simple_Interest"+ amount);
		return amount;
	}
	public double Compound_Interest(double principal_balance,double annual_interest_rate, double no_of_times_interest_applied, double no_of_time_periods_elapsed )
	{
		 double power=Math.pow((1+((annual_interest_rate/100)/no_of_times_interest_applied)), (no_of_times_interest_applied*no_of_time_periods_elapsed));
		 double amount =principal_balance* power;
		 LOGGER . debug("Simple_Interest"+ amount);
		return amount;
	}

}