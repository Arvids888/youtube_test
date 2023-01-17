package pageobject.youtube.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

import java.util.List;

public class MainPage {
    private final By COOKIES_REJECT_BUTTON = By.xpath("//span[contains(text(),'Reject all')]");
    private final By VIDEOS = By.tagName("ytd-rich-item-renderer");
    private final By TITLES = By.xpath(".//a[contains(@id, 'video-title') and contains(@title, '')]");
//    .//a[contains(@class, 'yt-formatted')]  .//yt-formatted-string[contains(@id, 'video-title')]


    private BaseFunc baseFunc;

    public MainPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public MainPage selectCookiesOption() {
        WebElement cookie = baseFunc.findElement(COOKIES_REJECT_BUTTON);
        baseFunc.actionClick(cookie);
        return this;
    }

    public MainPage selectVideoById(int id) {
        List<WebElement> videos = baseFunc.findElements(VIDEOS);
        String getTitle = videos.get(id).getText();
        getTitle = getTitle.trim("")[0];
        System.out.println(getTitle);

        videos.get(id).click();
        return this;
    }

//    public MainPage getTitle(int id) {
//        List<WebElement> titles = baseFunc.findElements(TITLES);
//        String title = titles.get(id).getText();
//    }


}
