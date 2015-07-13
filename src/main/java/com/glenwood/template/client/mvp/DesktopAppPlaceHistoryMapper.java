package com.glenwood.template.client.mvp;



import com.glenwood.template.client.application.avptemplate.AVPPlace;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;



/**
 * PlaceHistoryMapper interface is used to attach all places which the
 * PlaceHistoryHandler should be aware of. This is done via the @WithTokenizers
 * annotation or by extending PlaceHistoryMapperWithFactory and creating a
 * separate TokenizerFactory.
 */
@WithTokenizers( {  AVPPlace.Tokenizer.class,
				   })
public interface DesktopAppPlaceHistoryMapper extends PlaceHistoryMapper {
}
