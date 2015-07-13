package com.glenwood.template.client.application.avptemplate;


import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class AVPTabletView extends Composite implements AVPView{
	
	 private static AVPTabletViewUiBinder uiBinder = GWT
             .create(AVPTabletViewUiBinder.class);

	 interface AVPTabletViewUiBinder extends UiBinder<Widget, AVPTabletView> {
	  }
	 private Presenter presenter;
		public AVPTabletView()
		{
			initWidget(uiBinder.createAndBindUi(this));
		}
		
		

		@Override
		public void setPresenter(Presenter presenter) {
			this.presenter=presenter;
			
		}

}
