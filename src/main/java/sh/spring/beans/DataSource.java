package sh.spring.beans;

import java.util.Properties;

public class DataSource {
	@Override
	public String toString() {
		return "DataSource [properties=" + properties + "]";
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	private Properties properties;
}
