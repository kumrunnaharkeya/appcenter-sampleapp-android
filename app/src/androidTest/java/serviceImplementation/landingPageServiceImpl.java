package serviceImplementation;

import com.microsoft.appcenter.appium.EnhancedAndroidDriver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.util.concurrent.TimeUnit;

import libr_f8.UIElementsContants;
import libr_f8.XpathConstants;
import serviceInterface.landingPage;


/**
 * Created by keya on 12/24/17.
 */

public class landingPageServiceImpl implements landingPage {
    String a =null;
    @Override
    public void textValidation(EnhancedAndroidDriver driver) {

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        a = driver.findElement(By.xpath(XpathConstants.welcomePage.welcomeMessage)).getText();
        System.out.print(a);
        Assert.assertNotNull(a);
    }

    @Override
    public void swipeScreen(EnhancedAndroidDriver driver) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Dimension size;
        //Get the size of screen.
        size = driver.manage().window().getSize();
        System.out.println(size);

        //Find swipe start and end point from screen's with and height.
        //Find startx point which is at right side of screen.
        int startx = (int) (size.width * 0.70);
        //Find endx point which is at left side of screen.
        int endx = (int) (size.width * 0.30);
        //Find vertical point where you wants to swipe. It is in middle of screen height.
        int starty = size.height / 2;
        System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);

        //Swipe from Right to Left.
        driver.swipe(startx, starty, endx, starty, 30000);
        /*TouchAction touchAction = new TouchAction(driver);
        touchAction.press(startx,starty).moveTo(endx,starty).release();*/
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }
}
