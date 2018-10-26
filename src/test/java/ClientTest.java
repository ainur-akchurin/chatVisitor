import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.Step;

import java.util.concurrent.TimeUnit;

public class ClientTest {
    private WebDriver driver;

    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void testScenario(){
        Step step = new Step(driver);
        step.openUrl("https://demo-pro.webim.ru/");
        step.openChat();
        step.sendMessageVisitor();
//        step.sendFile(); // questions
        step.rateOperator();
        step.closeChat();
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }
}
