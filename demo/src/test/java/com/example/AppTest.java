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
    public void shouldFail()
    {
        Assert.assertEquals(2, 1);
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void playwright()
    {
        Playwright playwright = Playwright.create();

            Browser browser = playwright.chromium().launch();
            //Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page = browser.newPage();
            page.navigate("http://playwright.dev");
            System.out.println(page.title());
    }
}
