package pageobject.youtube;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pageobject.BaseFunc;
import pageobject.youtube.pages.MainPage;

public class YoutubeTest {
    private final String URL = "youtube.com";
    private final int id = 0;

    private BaseFunc baseFunc = new BaseFunc();

    @BeforeEach
    public void openWebPage() {
        baseFunc.openPage(URL);
    }

    @Test
    public void checkVideoData() {
        MainPage mainPage = new MainPage(baseFunc);
        mainPage.selectCookiesOption();
        mainPage.selectVideoById(id);
    }
}
