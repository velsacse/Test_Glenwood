package com.glenwood.template.client.application.avptemplate;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;





public class AVPMobileModule extends AbstractGinModule{

	@Override
	protected void configure() {
		// TODO Auto-generated method stub

	    bind(AVPView.class).to(AVPMobileView.class).in(Singleton.class);
	    bind(AVPActivity.class);


	}



}