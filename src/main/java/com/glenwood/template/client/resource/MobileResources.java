package com.glenwood.template.client.resource;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;

public interface MobileResources extends ClientBundle {
	

public interface Styles extends CssResource {
	
	String pageloadFadeIn();
	
}

    @Source("../css/mobilestyles.css")
    Styles mobilestyles();
    

}
