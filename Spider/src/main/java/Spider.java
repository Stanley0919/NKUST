import org .jsoup.Jsoup;
import  org.jsoup.nodes.Element;
import  org.jsoup.select.Elements;
import  org.jsoup.nodes.Document;

public class Spider {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://www.ptt.cc/bbs/index.html").get();
            System.out.println(doc.title());

            Elements newsHeadlines = doc.select("#action-bar-container a");
            for (Element headline : newsHeadlines) {
                System.out.println(headline.attr("title"));
                System.out.println(headline.absUrl("href"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}





