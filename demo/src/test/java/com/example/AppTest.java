package com.example;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    Playwright playwright = Playwright.create();

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldPass()
    {
        Assert.assertEquals(1, 1);
    }


    /**
     * Rigorous Test :-)
     */
    @Test
    public void playwright()
    {
            //Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("msedge"));
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
            Page page = browser.newPage();
            page.navigate("http://playwright.dev");
            System.out.println(page.title());
            //Assert.assertEquals(page.title(), "Other Title");
    }

        /**
     * Rigorous Test :-)
     */
    @Test
    public void playwright2()
    {
            Browser browser = playwright.chromium().launch();
            //Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
            Page page = browser.newPage();
            page.navigate("http://playwright.dev");
            System.out.println(page.title());
            Assert.assertNotEquals(page.title(), "Other Title");
    }
}
