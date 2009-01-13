package org.mix3.wickext;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

public class HomePage extends WebPage {
	public HomePage() {
		add(new BookmarkablePageLink("Generating_JavaScript", Generating_JavaScript.class));
		add(new BookmarkablePageLink("WickeXt_helpers", WickeXt_helpers.class));
		add(new BookmarkablePageLink("Events", Events.class));
		add(new BookmarkablePageLink("Effects", Effects.class));
    }
}
