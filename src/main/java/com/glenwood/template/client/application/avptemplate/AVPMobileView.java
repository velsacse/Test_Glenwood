package com.glenwood.template.client.application.avptemplate;


import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class AVPMobileView extends Composite implements AVPView{
	
	 private static AVPMobileViewUiBinder uiBinder = GWT
             .create(AVPMobileViewUiBinder.class);

	 interface AVPMobileViewUiBinder extends UiBinder<Widget, AVPMobileView> {
	  }
	 private Presenter presenter;
		public AVPMobileView()
		{
			initWidget(uiBinder.createAndBindUi(this));
		}
		
		

		@Override
		public void setPresenter(Presenter presenter) {
			this.presenter=presenter;
			
		}

}
