package com.collector;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static org.openqa.selenium.remote.ErrorCodes.TIMEOUT;

public class JsoupHandler extends CrawlerHandler {

    private static final String DOWNLOAD_LINK_XPATH = "//p//a[contains(@href, '/upload/')][1]";

    public JsoupHandler() {
        super(EnumCrawlers.JSOUP);
    }

    @Override
    public List<String> getFileLinks(String urlToCrawl) {

        try {
            List<String> links = new ArrayList<>();
            Document doc = Jsoup.connect(urlToCrawl)
                    .timeout(TIMEOUT * 1000)
                    .get();
            Elements elts = doc.select("a[href*=/upload/]");
            for (Element link : elts) {
                String linkref = "https://ssp.rs.gov.br" + link.attr("href"); // == "/"
                links.add(linkref);
            }
            //upload/arquivos/201801/15173511-indicadores-da-violencia-contra-a-mulher-por-municipio-2017.xls
            return links;
        } catch (Exception e) {
            return next.getFileLinks(urlToCrawl);
        }
    }
}
