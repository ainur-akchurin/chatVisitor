import com.sun.istack.internal.NotNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.Steps;

import java.util.concurrent.TimeUnit;

public class visitorTest {
    private WebDriver driver;
    private WebDriverWait wait;

    /* для проверки загрузки своего файла необходимо
           1. проиницилизировать absoluteFilePath, в методе init,указав абсолютный путь до файла, на вашем компьютере
           2. раскомментировать метод step.sendFile(absoluteFilePath)(стр.43)
           3. закомментировать метод step.sendFile(); выше (стр.42)
           P.S на данный момент файл загружается методом step.sendFile(), который получает файл из директории данного проекта
               находящегося по пути ./files/1.jpg*/
    @NotNull
    private String absoluteFilePath;

    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 15);

        absoluteFilePath = "/home/ak/1.jpg";
    }

    @Test
    public void testScenario(){
        Steps step = new Steps(driver, wait);
        step.openUrl("https://demo-pro.webim.ru/");
        step.openChat();
        step.sendMessageVisitor();
        step.sendFile();
//      step.sendFile(absoluteFilePath);
        step.rateOperator();
        step.closeChat();
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }
}
