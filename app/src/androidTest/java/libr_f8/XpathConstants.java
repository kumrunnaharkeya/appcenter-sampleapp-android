package libr_f8;

/**
 * Created by keya on 12/24/17.
 */

public class XpathConstants {
    public static class text_validation{
        public static final String appName="//android.widget.TextView[@index='0' and @text='Facebook Developer Conference']";
        public static final String devConDate="//android.widget.TextView[@index='4'and @text= 'APRIL 18 + 19 / SAN JOSE, CALIFORNIA']";
        public static final String skipButton ="//android.widget.TextView[@index='0'and @text= 'SKIP FOR NOW']";
    }
    public static class welcomePage{
        public static final String welcomeMessage="//android.widget.TextView[@index='1' and @text='Visual Studio App Center is mission control for apps. It brings together multiple services, commonly used for mobile developers, into a single, integrated product.\n" +
                "\n" +
                "\n" +
                "Swipe right to learn about our services']";
    }
}
