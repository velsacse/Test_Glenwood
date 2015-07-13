package com.glenwood.template.client.application.main;

import java.util.HashMap;

/**
 * Class for mapping the key and url
 * 
 * @author Software
 *
 */
public class URLCollection {
	
	public HashMap<String,String> urlMap=new HashMap<String,String>();
	
	public URLCollection(){
		urlMap.put("template.users", "/SaveAndForwardAction.Action");
		urlMap.put("template.faxForwardUserList", "/FaxForwardListGWT.Action");
		urlMap.put("template.practicename", "/SessionVariableJson.Action?ajax=1&GlaceAjaxRequest=true");		
	}
	
	/**
	 * Getter method getting the value for the key
	 * 
	 * @param key is the String value
	 * @return the url value assigned to the key
	 */
	public String getValue(Object key){
		return urlMap.get(key);
	}
}
