package pageobject.youtube.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

import java.util.List;

public class MainPage {
    private final By COOKIES_REJECT_BUTTON = By.xpath("//span[contains(text(),'Reject all')]");
    private final By VIDEOS = By.xpath(".//div[contains(@id, 'content') and contains(@class, 'ytd-rich-item-renderer')]");
    private final By TITLES = By.xpath(".//a[contains(@class, 'yt-simple-endpoint focus-on')]//yt-formatted-string[contains(@class, 'style-scope ytd-rich')]");

    private final By CHANNEL_NAME = By.xpath(".//a[contains(@class, 'yt-formatted-string')]");


    private BaseFunc baseFunc;

    public MainPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public MainPage selectCookiesOption() {
        WebElement cookie = baseFunc.findElement(COOKIES_REJECT_BUTTON);
        baseFunc.actionClick(cookie);
        return this;
    }

//    public WebElement selectVideoById(int id) {
//        WebElement video = baseFunc.findElements(VIDEOS).get(id);
////        for (WebElement videos : videosList) {
////            if ()
////        }
////        WebElement video = videosList.get(id);
//
//
////        String getTitle = getVideo.findElement(TITLES).getText();
////
////        System.out.println(getTitle);
////        video.click();
//        return video;
//    }

    public String getTitle(int id) {
        List<WebElement> titles = baseFunc.findElements(TITLES);
        String title = titles.get(id).getText();

        return title;
    }

    public String getChannel(int id) {
        List<WebElement> channels = baseFunc.findElements(CHANNEL_NAME);
        String channel = channels.get(id).getText();
        return channel;
    }

    public void clickVideo(int id) {
        baseFunc.click(By.id(getTitle(id)));
    }


}
