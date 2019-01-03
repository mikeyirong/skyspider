package com.skySpider;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

public class RobotSpider implements PageProcessor {
	public Site site = Site.me().setSleepTime(1000).setTimeOut(5000);
	public Site getSite() {
		return this.site;
	}
	public void process(Page page) {

	}

}
