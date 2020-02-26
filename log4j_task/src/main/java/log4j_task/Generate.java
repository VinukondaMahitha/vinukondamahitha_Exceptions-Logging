package log4j_task;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Generate{  
	private static final Logger LOGGER = LogManager . getLogger(Generate.class);
    public double cla(String s,int cost1){  
      GetMaterial planFactory = new GetMaterial();    
  
      TotalCost p = planFactory.Type(s);  
      p.getCost();
           double d=p.Calculate(cost1); 
           LOGGER . debug("Total price"+d );
   		return d;
            }  
    }