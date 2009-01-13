package org.mix3.wickext;

import org.apache.wicket.markup.html.WebPage;
import org.objetdirect.wickext.core.javascript.JsQuery;
import org.objetdirect.wickext.core.javascript.helper.AttributesHelper;
import org.objetdirect.wickext.core.javascript.helper.CssHelper;
import org.objetdirect.wickext.core.javascript.helper.TraversingHelper;
import org.objetdirect.wickext.core.options.Options;

public class WickeXt_helpers extends WebPage{
	public WickeXt_helpers(){
		// TraversingHelp.eq(int position)
		JsQuery jsq1 = new JsQuery();
		jsq1.$(".foo")
			.chain(TraversingHelper.eq(1))
			.chain(CssHelper.css(new Options().putLiteral("border", "1px solid red")));
		jsq1.contribute(this);
		
		// TraversingHelp.siblings(String expression)
		JsQuery jsq2 = new JsQuery();
		jsq2.$("#foo")
		   .chain(TraversingHelper.siblings(".style-me"))
		   .chain(CssHelper.css(new Options().putLiteral("border", "1px solid green")));
		jsq2.contribute(this);
		
		// AttributesHelper.addClass(String className)
		// "you-are-now-styled"は定数？
		// 前のスタイル情報（この例だと"1px solid green"）が適用される？
		JsQuery jsq3 = new JsQuery();
		jsq3.$(".foo2")
			.chain(TraversingHelper.siblings(".style-me"))
			.chain(AttributesHelper.addClass("you-are-now-styled"));
		jsq3.contribute(this);
		
		// CssHelper.css(String name, String value)
		JsQuery jsq4 = new JsQuery();
		jsq4.$(".foo-important")
			.chain(CssHelper.css("border", "1px solid red"));
		jsq4.contribute(this);
	}
}
