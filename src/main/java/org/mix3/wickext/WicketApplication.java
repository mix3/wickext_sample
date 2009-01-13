package org.mix3.wickext;

import org.apache.wicket.util.lang.PackageName;
import org.objetdirect.wickext.utils.WickextWebApplication;

// WebApplication -> WickextWebApplication
public class WicketApplication extends WickextWebApplication{
	public WicketApplication(){}
	
	@Override
	protected void init() {
		mount("/sample", PackageName.forPackage(Package.getPackage("org.mix3.wickext")));
	}
	
	public Class<HomePage> getHomePage(){
		return HomePage.class;
	}
}
