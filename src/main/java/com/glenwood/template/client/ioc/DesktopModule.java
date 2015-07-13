package com.glenwood.template.client.ioc;

import javax.inject.Singleton;

import com.glenwood.template.client.application.avptemplate.AVPDesktopModule;
import com.glenwood.template.client.application.main.ActionServletURL;
import com.glenwood.template.client.application.main.ActionServletURLImpl;
import com.glenwood.template.client.application.main.MainDesktopModule;
import com.glenwood.template.client.mvp.DesktopMvpModule;
import com.glenwood.template.client.resource.CSSInjector;
import com.glenwood.template.client.resource.DesktopCSSInjector;
import com.glenwood.template.client.resource.DesktopResources;
import com.google.gwt.inject.client.AbstractGinModule;


public class DesktopModule extends AbstractGinModule{

	@Override
	protected void configure() {
		install(new DesktopMvpModule());
		install(new MainDesktopModule());
		install(new AVPDesktopModule());
		bind(DesktopResources.class).in(Singleton.class);
		bind(CSSInjector.class).to(DesktopCSSInjector.class).in(Singleton.class);
		bind(ActionServletURL.class).to(ActionServletURLImpl.class).in(Singleton.class);
	}
}

