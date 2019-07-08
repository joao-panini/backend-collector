package com.collector;

import java.util.List;

public abstract class CrawlerHandler {


    protected CrawlerHandler next;
    protected EnumCrawlers crawler;


    public void setNext(CrawlerHandler service) {
        if (next == null) {
            next = service;
        } else {
            next.setNext(service);
        }
    }

    public CrawlerHandler(EnumCrawlers crawlerImpl) {
        next = null;
        crawler = crawlerImpl;
    }

    public abstract List<String> getFileLinks(String SSP_VIOLENCE_AGAINST_WOMAN_LINK);

}
