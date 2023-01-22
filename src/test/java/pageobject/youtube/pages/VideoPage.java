package pageobject.youtube.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

public class VideoPage {
    private final By TITLE = By.xpath(".//h1[contains(@class, 'metadata')]");
    private final By CHANNEL = By.xpath(".//a[contains(@class, 'yt-simple-endpoint style-scope yt-formatted-string') and contains(@href, '/@')]");
//.//yt-formatted-string[contains(@class, 'style-scope ytd-channel-name complex-string')]//a[contains(@class, 'yt-simple-endpoint style-scope yt-formatted-string')]
    private BaseFunc baseFunc;

    public VideoPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public String getTitle() {
        String title = baseFunc.findElement(TITLE).getText();
        return title;
    }
    public String getChannel() {
        String channel = baseFunc.findElement(CHANNEL).getText();
        return channel;
    }
}
