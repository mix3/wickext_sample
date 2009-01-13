package org.mix3.wickext;

import org.apache.wicket.markup.html.WebPage;
import org.objetdirect.wickext.core.javascript.JsQuery;
import org.objetdirect.wickext.core.javascript.helper.CssHelper;
import org.objetdirect.wickext.core.options.Options;

public class Generating_JavaScript extends WebPage{
	public Generating_JavaScript(){
		// Generating JavaScript
		JsQuery jsq1 = new JsQuery();
		jsq1.$(".foo").chain("css","{border: '1px solid red'}");
		jsq1.contribute(this);
		
		// Generating JavaScript
		JsQuery jsq2 = new JsQuery();
		jsq2.$(".bar")
			.chain(CssHelper.css(new Options().putLiteral("border", "1px solid blue")));
		jsq2.contribute(this);
	}
}
