package pageobject.youtube.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

public class VideoPage {
    private final By TITLE = By.xpath(".//h1[contains(@class, 'metadata')]");

    private BaseFunc baseFunc;

    public VideoPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public String getTitle() {
        String title = baseFunc.findElement(TITLE).getText();
        return title;
    }

}
