/**
 * 
 */
/**
 * Copyright 2018 China Renaissance Inc.
 */	
package com.zht.split.split;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author VULCAN
 *
 */
@Service
public class StarterService {
	private String config;
	private String say;

    public StarterService(String config,String say) {
        this.config = config;
        this.say = say;
    }
    
    public String[] split(String separatorChar) {
        return StringUtils.split(this.config, separatorChar);
    }
    
    
    public String sayHello(){
    	if (StringUtils.isEmpty(say)) {
    		return "say  null";
		}else{
			return say;
		}
    	 
    }
}
