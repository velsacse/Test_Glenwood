package com.glenwood.template.client;

import org.fusesource.restygwt.client.Defaults;

import com.glenwood.template.client.application.main.ActionServletURL;
import com.glenwood.template.client.application.main.CustomLocalStorage;
import com.glenwood.template.client.ioc.ClientGinjector;
import com.glenwood.template.client.ioc.GinjectorProvider;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootLayoutPanel;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */

public class template implements EntryPoint {
	String baseUrl=null;
	public static final ClientGinjector ginjector = ((GinjectorProvider) GWT.create(GinjectorProvider.class)).get();
	ActionServletURL actionServletURL;
	/**
	 * This is the entry point method.
	 * @return 
	 */

	/**
	 * This method is to hide the refresh message visible on page load 
	 * 
	 */
	public static native String afterLoad() /*-{
	$doc.getElementById("refreshMessage").style.zIndex="-50000";
	}-*/;
		
	
	
	public void onModuleLoad() {
		afterLoad();
		ginjector.getCSSInjector().injectCSS();
		CustomLocalStorage.patientprotalStorageMap.clear();
		actionServletURL=ginjector.getActionServletURL();

		//Setting the redirect servlet url for AJAX request
		
		baseUrl="http://127.0.0.1:8888/";
		
		
		
		
			/*if(Window.Location.getParameter("contextPath") == "" || Window.Location.getParameter("contextPath") == null){
//				baseUrl="http://localhost";
				Window.Location.replace("/login.html");
			}else{
				
				baseUrl = Window.Location.getProtocol()+"//"+Window.Location.getHost()+"/"+Window.Location.getParameter("contextPath");
				Defaults.setServiceRoot(Window.Location.getProtocol()+"//"+Window.Location.getHost()+"/"+"template_backend");
			}*/
			
 			actionServletURL.setBaseURLGlace(baseUrl);
//			actionServletURL.setBaseURL(baseUrl+"/GWT");			
			ginjector.getMainPresenter().go(RootLayoutPanel.get());

			// Goes to place represented on URL or default place
			ginjector.getPlaceHistoryHandler().handleCurrentHistory();
		
	}
}