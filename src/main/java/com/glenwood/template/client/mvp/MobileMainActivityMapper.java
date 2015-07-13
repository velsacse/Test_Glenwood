package com.glenwood.template.client.mvp;





import com.glenwood.template.client.application.avptemplate.AVPActivity;
import com.glenwood.template.client.application.avptemplate.AVPPlace;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;


public class MobileMainActivityMapper implements ActivityMapper {

	Provider<AVPActivity> avpActivityProvider;
  
  @Inject
  public MobileMainActivityMapper(Provider<AVPActivity> avpActivityProvider
		  ){
	 super();
	 this.avpActivityProvider = avpActivityProvider;
	
  }


  @Override
  public Activity getActivity(Place place) {
	  
	  if (place instanceof AVPPlace) {
			return avpActivityProvider.get();
	    } 
	
	return null;
    
  }

}
