package com.glenwood.template.client.ioc;

import javax.inject.Singleton;

import com.glenwood.template.client.application.avptemplate.AVPMobileModule;
import com.glenwood.template.client.application.main.ActionServletURL;
import com.glenwood.template.client.application.main.ActionServletURLImpl;
import com.glenwood.template.client.application.main.MainMobileModule;
import com.glenwood.template.client.mvp.MobileMvpModule;
import com.glenwood.template.client.resource.CSSInjector;
import com.glenwood.template.client.resource.MobileCSSInjector;
import com.glenwood.template.client.resource.MobileResources;
import com.google.gwt.inject.client.AbstractGinModule;


public class MobileModule extends AbstractGinModule{

	@Override
	protected void configure() {
		install(new MobileMvpModule());
		install(new MainMobileModule());
		install(new AVPMobileModule());
		bind(MobileResources.class).in(Singleton.class);
		bind(CSSInjector.class).to(MobileCSSInjector.class).in(Singleton.class);
		bind(ActionServletURL.class).to(ActionServletURLImpl.class).in(Singleton.class);
	}
}

