package pageobject.youtube.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

import java.util.List;

public class MainPage {
    private final By COOKIES_REJECT_BUTTON = By.xpath("//span[contains(text(),'Reject all')]");
    private final By VIDEOS = By.xpath(".//div[contains(@id, 'content') and contains(@class, 'ytd-rich-item-renderer')]");
    private final By TITLES = By.xpath(".//a[contains(@class, 'yt-simple-endpoint focus-on')]//yt-formatted-string[contains(@class, 'style-scope ytd-rich')]");

    private final By CHANNEL_NAMES = By.xpath(".//a[contains(@class, 'yt-formatted-string')]");


    private BaseFunc baseFunc;

    public MainPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public MainPage selectCookiesOption() {
        WebElement cookie = baseFunc.findElement(COOKIES_REJECT_BUTTON);
        baseFunc.actionClick(cookie);
        return this;
    }

    public WebElement selectVideoById(int id) {
        List<WebElement> videosList = baseFunc.findElements(VIDEOS);
        WebElement video = videosList.get(id);

        return video;
    }

    public String getTitle(int id) {
        String title = selectVideoById(id).findElement(TITLES).getText();

        return title;
    }

    public String getChannel(int id) {
        String channel = selectVideoById(id).findElement(CHANNEL_NAMES).getText();
        return channel;
    }

    public void clickVideo(int id) {
        baseFunc.click(selectVideoById(id));
    }


}
