/*
 *  Copyright 2013~2014 Dan Haywood
 *
 *  Licensed under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package com.danhaywood.isis.wicket.fullcalendar2.applib;

import com.google.common.base.Function;

public interface CalendarEventable {

    String getCalendarName();
	CalendarEvent toCalendarEvent();
	
	public static class Functions  {
	    private Functions(){}
	    
	    public static <T extends CalendarEventable> Function<T, String> getCalendarName() {
	        return new Function<T, String>(){
	            @Override
	            public String apply(T calendarEventable) {
	                return calendarEventable.getCalendarName();
	            }};
	    }

	    public static <T extends CalendarEventable> Function<T, CalendarEventable> cast() {
	        return new Function<T, CalendarEventable>(){
	            @Override
	            public CalendarEventable apply(CalendarEventable toDoItem) {
	                return toDoItem;
	            }
	        };
	    }
	}

}
