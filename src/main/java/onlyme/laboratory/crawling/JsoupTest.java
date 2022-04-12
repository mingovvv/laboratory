package onlyme.laboratory.crawling;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupTest {
    public static void main(String[] args) {
        String url = "https://nh.sinbiun.co.kr/InSaju.asp?bType=A027&bgID=2&tabID=2";
        Connection connect = Jsoup.connect(url);
        try {
            Document document = connect.get();
            Element body = document.body();
            Elements txt_center = body.getElementsByClass("txt_center");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
