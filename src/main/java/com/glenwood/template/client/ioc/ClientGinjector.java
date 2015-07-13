package com.glenwood.template.client.ioc;




import com.glenwood.template.client.application.main.ActionServletURL;
import com.glenwood.template.client.application.main.MainPresenter;
import com.glenwood.template.client.resource.CSSInjector;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.PlaceHistoryHandler;

public interface ClientGinjector extends Ginjector {
	PlaceHistoryHandler getPlaceHistoryHandler();
	CSSInjector getCSSInjector();
	MainPresenter getMainPresenter();
	EventBus getEventBus();
	ActionServletURL getActionServletURL();
}
