package pack1;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationStock {
	
	private Map<NomFruit, ConfigFruit> lstFruits;

	public ConfigurationStock() {
		super();
		lstFruits = new HashMap<NomFruit, ConfigFruit>();
	}

	public ConfigurationStock(Map<NomFruit, ConfigFruit> lstFruits) {
		super();
		this.lstFruits = lstFruits;
	}
	
	public void ajoutConfigFruit(ConfigFruit confFruit)
	{
		if(lstFruits.get(confFruit.getNomFruit())==null)
		{
			lstFruits.put(confFruit.getNomFruit(), confFruit);
		}
	}
}
