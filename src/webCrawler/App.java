package webCrawler;

public class App {

    public static void main(String[] args) {
        WebCrawler crawler = new WebCrawler();
        String rootURL = "https://www.section.io/engineering-education/springboot-antmatchers/";
        crawler.crawl(rootURL, 100);
    }


}
