package log4j_task;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GetMaterial
{
	private static final Logger LOGGER = LogManager . getLogger(GetMaterial.class);
	public TotalCost Type(String MaterialType)
	{
		if(MaterialType==null)
		{
			LOGGER.warn("please enter a valid plan");
			return null;
		}
		if(MaterialType.equalsIgnoreCase("StandardMaterial"))
		{
			return new StandardMaterial();
		}
		else if(MaterialType.equalsIgnoreCase("AboveStandardMaterial"))
		{
			return new AboveStandardMaterial();
		}
		else if(MaterialType.equalsIgnoreCase("HighStandardMaterial"))
		{
			return new HighStandardMaterial();
		}
		else if(MaterialType.equalsIgnoreCase("HighStandardMaterial and FullyAutomated"))
		{
			return new HightStandard_FullyAutomated();
		}
		return null;
	}

}
