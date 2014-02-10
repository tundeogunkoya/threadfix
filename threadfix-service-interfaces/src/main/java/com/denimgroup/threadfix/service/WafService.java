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
package com.denimgroup.threadfix.service;

import java.util.List;

import com.denimgroup.threadfix.data.entities.Waf;
import com.denimgroup.threadfix.data.entities.WafRule;
import com.denimgroup.threadfix.data.entities.WafRuleDirective;
import com.denimgroup.threadfix.data.entities.WafType;

/**
 * @author bbeverly
 * 
 */
public interface WafService {

	/**
	 * @return
	 */
	List<Waf> loadAll();

	/**
	 * @param wafId
	 * @return
	 */
	Waf loadWaf(int wafId);

	/**
	 * @param name
	 * @return
	 */
	Waf loadWaf(String name);

	/**
	 * @param waf
	 */
	void storeWaf(Waf waf);

	/**
	 * @param wafId
	 */
	void deleteById(int wafId);

	/**
	 * @return
	 */
	List<WafType> loadAllWafTypes();

	/**
	 * @param wafId
	 * @return
	 */
	WafType loadWafType(int wafId);

	/**
	 * @param name
	 * @return
	 */
	WafType loadWafType(String name);

	/**
	 * @param waf
	 * @return
	 */
	void generateWafRules(Waf waf, WafRuleDirective directive);
	
	/**
	 * 
	 * @param waf
	 * @param directiveName
	 */
	void generateWafRules(Waf waf, String directiveName);

	/**
	 * 
	 * @param waf
	 * @param directive
	 */
	void saveOrUpdateRules(Waf waf, WafRuleDirective directive);
	
	/**
	 * 
	 * @param waf
	 * @return
	 */
	String getAllRuleText(Waf waf);
	
	/**
	 * 
	 * @param waf
	 * @return
	 */
	List<WafRule> loadCurrentRules(Waf waf);
}