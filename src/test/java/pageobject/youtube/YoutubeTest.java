package pageobject.youtube;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pageobject.BaseFunc;
import pageobject.youtube.pages.MainPage;
import pageobject.youtube.pages.VideoPage;

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
        VideoPage videoPage = new VideoPage(baseFunc);
        mainPage.selectCookiesOption();
//        mainPage.selectVideoById(id);
       String title = mainPage.getTitle(id);
       String channel = mainPage.getChannel(id);
       mainPage.clickVideo(id);
        videoPage.getTitle();


        Assertions.assertEquals(title, videoPage.getTitle());
        System.out.println(title);
        System.out.println(videoPage.getTitle());
        System.out.println(channel);
    }
}
