package org.mix3.wickext;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.objetdirect.wickext.core.effects.EffectSpeed;
import org.objetdirect.wickext.core.effects.fading.FadeIn;
import org.objetdirect.wickext.core.events.Event;
import org.objetdirect.wickext.core.events.MouseEvent;
import org.objetdirect.wickext.core.events.WickextEventBehavior;
import org.objetdirect.wickext.core.javascript.JsQuery;
import org.objetdirect.wickext.core.javascript.JsScope;
import org.objetdirect.wickext.core.javascript.JsScopeContext;

public class Effects extends WebPage{
	public Effects(){
		Button button = new Button("effects.button.show");
		add(button);
		button.add(new WickextEventBehavior(new Event(MouseEvent.CLICK) {
		    @Override
		    public JsScope callback() {
		    	return new JsScope() {
					@Override
					protected void execute(JsScopeContext scopeContext) {
						scopeContext.append(new JsQuery().$(".show-me").chain(new FadeIn(EffectSpeed.SLOW)).render());
					}	
		    	};
		    }
		}));
	}
}
