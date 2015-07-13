package com.glenwood.template.client.ioc;





import com.glenwood.template.client.application.avptemplate.AVPTabletModule;
import com.glenwood.template.client.application.main.ActionServletURL;
import com.glenwood.template.client.application.main.ActionServletURLImpl;
import com.glenwood.template.client.application.main.MainTabletModule;
import com.glenwood.template.client.mvp.TabletMvpModule;
import com.glenwood.template.client.resource.CSSInjector;
import com.glenwood.template.client.resource.TabletCSSInjector;
import com.glenwood.template.client.resource.TabletResources;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;




public class TabletModule extends AbstractGinModule{

	@Override
	protected void configure() {
		install(new TabletMvpModule());
		install(new MainTabletModule());
		install(new AVPTabletModule());
		bind(TabletResources.class).in(Singleton.class);
		bind(CSSInjector.class).to(TabletCSSInjector.class).in(Singleton.class);
		 bind(ActionServletURL.class).to(ActionServletURLImpl.class).in(Singleton.class);
	}

}

