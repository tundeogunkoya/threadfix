////////////////////////////////////////////////////////////////////////
//
//     Copyright (c) 2009-2013 Denim Group, Ltd.
//
//     The contents of this file are subject to the Mozilla Public License
//     Version 2.0 (the "License"); you may not use this file except in
//     compliance with the License. You may obtain a copy of the License at
//     http://www.mozilla.org/MPL/
//
//     Software distributed under the License is distributed on an "AS IS"
//     basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
//     License for the specific language governing rights and limitations
//     under the License.
//
//     The Original Code is ThreadFix.
//
//     The Initial Developer of the Original Code is Denim Group, Ltd.
//     Portions created by Denim Group, Ltd. are Copyright (C)
//     Denim Group, Ltd. All Rights Reserved.
//
//     Contributor(s): Denim Group, Ltd.
//
////////////////////////////////////////////////////////////////////////
package com.denimgroup.threadfix.plugin.eclipse.marker;

import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.views.markers.MarkerField;
import org.eclipse.ui.views.markers.MarkerItem;

public class ParameterField extends MarkerField {
	
	@Override
	public String getColumnHeaderText() {
		System.out.println("Getting column header");
		return "Parameter";
	}
	
	@Override
	public int getDefaultColumnWidth(final Control control) {
		System.out.println("Getting column width");
	    return 60;
	}

	@Override
	public String getValue(MarkerItem markerItem) {
		System.out.println("Getting value for " + markerItem);
		return markerItem.getAttributeValue("parameter", "");
	}

}