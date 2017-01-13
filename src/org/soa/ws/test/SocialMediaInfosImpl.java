package org.soa.ws.test;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface="org.soa.ws.test.SocialMediaInfos")
public class SocialMediaInfosImpl implements SocialMediaInfos{
	
	public ArrayList<SocialMedia> socialmedia;
	
	public SocialMediaInfosImpl() {
		socialmedia = new ArrayList<SocialMedia>();
		socialmedia.add(new SocialMedia("Twitter","2006","Jack Dorsey"));
		socialmedia.add(new SocialMedia("Facebook","2004","Mark Zuckerberg"));
		socialmedia.add(new SocialMedia("Soundcloud","2007","Alexander Ljung"));
	}

	@Override
	@WebMethod
	public ArrayList<SocialMedia> getAllSocialMediaInfos() {
		return socialmedia;
	}

}
