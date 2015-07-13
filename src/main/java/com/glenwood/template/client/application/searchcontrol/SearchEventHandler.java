package com.glenwood.template.client.application.searchcontrol;

import com.google.gwt.event.shared.EventHandler;

/**
 *  @author Ganeshram Sivashanmugam 
 *  
 *  
 *  <ul>
 *  <li>
 *  	<b>Module</b>: Search control widget <br/>
 *  </li>
 *  <li>
 *  	<b>Purpose:</b> Handler interface for {@link SearchEvent} events.
 *  </li>
 *  </ul>
 */

public interface SearchEventHandler extends EventHandler {
  /**
   * Fired while typing in a text in the search box.
   * 
   * @param event the {@link SearchEvent} that was fired
   */	
	void onSearch(SearchEvent event);
}
