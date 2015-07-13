package com.glenwood.template.client.application.main;

import java.util.Vector;

import com.glenwood.template.client.application.fastbutton.FastToggleButton;
import com.glenwood.template.client.resource.MobileResources;
import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.Duration;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.TouchEndEvent;
import com.google.gwt.event.dom.client.TouchEndHandler;
import com.google.gwt.event.dom.client.TouchMoveEvent;
import com.google.gwt.event.dom.client.TouchMoveHandler;
import com.google.gwt.event.dom.client.TouchStartEvent;
import com.google.gwt.event.dom.client.TouchStartHandler;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.inject.Singleton;




@Singleton
public class MainMobileView extends Composite implements MainView {

  private static MainMobileViewUiBinder uiBinder = GWT
  .create(MainMobileViewUiBinder.class);
  
  interface MainMobileViewUiBinder extends UiBinder<Widget, MainMobileView> {
  }
  

@UiField SimplePanel mainDisplayPanel;
  
private Presenter presenter;


  
  @Inject
  public MainMobileView(ActivityMapper mainActivityMapper, 
                  ActivityManager mainActivityManager) {     
	  initWidget(uiBinder.createAndBindUi(this));
	  
	  mainDisplayPanel.getElement().getStyle().setHeight(Window.getClientHeight()-43, Unit.PX);
		Window.addResizeHandler(new ResizeHandler() {

			@Override
			public void onResize(ResizeEvent event) {
				mainDisplayPanel.getElement().getStyle().setHeight(Window.getClientHeight()-43, Unit.PX);
				
			}
		});
		mainActivityManager.setDisplay(mainDisplayPanel);
	  
  } 

@Override
public void setPresenter(Presenter presenter) {
	// TODO Auto-generated method stub
	this.presenter=presenter;
}

public Widget asWidget() {
    return this;
  }

@Override
public void showhidemenuleft() {
	// TODO Auto-generated method stub
	
}



}