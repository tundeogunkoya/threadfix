package com.denimgroup.threadfix.service;

import com.denimgroup.threadfix.data.entities.*;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Set;

public interface PermissionService {
	
	boolean isEnterprise();

	/**
	 * 
	 * @param orgId
	 * @return
	 */
	boolean isAuthorized(Permission permission, Integer orgId, Integer appId);
	
	/**
	 * 
	 * @param model
	 * @param orgId
	 * @param appId
	 * @param permissions
	 */
	void addPermissions(Model model, Integer orgId, Integer appId, Permission... permissions);
	
	/**
	 * 
	 */
	void addPermissions(ModelAndView modelAndView, Integer orgId, Integer appId, Permission... permissions);
	
	/**
	 * 
	 * @param waf
	 * @return
	 */
	boolean canSeeRules(Waf waf);
	
	/**
	 * 
	 * @return
	 */
	Set<Integer> getAuthenticatedAppIds();
	
	/**
	 * This method returns null if the user has access to all teams.
	 * TODO revisit this section
	 * @return
	 */
	Set<Integer> getAuthenticatedTeamIds();

	/**
	 * 
	 * @param organization
	 * @return
	 */
	List<Application> filterApps(Organization organization);
	
	/**
	 * 
	 * @param providers
	 */
	void filterApps(List<RemoteProviderType> providers);

}