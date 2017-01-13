package org.soa.ws.test;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface SocialMediaInfos {
	
	@WebMethod
	@WebResult(name="SocialMedia")
	public ArrayList<SocialMedia> getAllSocialMediaInfos();

}
