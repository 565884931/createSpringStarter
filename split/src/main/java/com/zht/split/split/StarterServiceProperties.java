/**
 * 
 */
/**
 * Copyright 2018 China Renaissance Inc.
 */
package com.zht.split.split;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author VULCAN
 *
 */
@ConfigurationProperties("example.service")
public class StarterServiceProperties {
	private String config;
	
	private String say;

	public void setConfig(String config) {
		this.config = config;
	}

	public String getConfig() {
		return config;
	}

	/**
	 * @return the say
	 */
	public String getSay() {
		return say;
	}

	/**
	 * @param say the say to set
	 */
	public void setSay(String say) {
		this.say = say;
	}

}
