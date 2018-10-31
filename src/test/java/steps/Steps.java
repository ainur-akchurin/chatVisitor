package steps;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.ak.DemoProPage;


public class Steps {
    private DemoProPage demoProPage;

    public Steps(WebDriver driver, WebDriverWait wait) {
        demoProPage = new DemoProPage(driver, wait);
    }

    @Step ("Open https://demo-pro.webim.ru/")
    public void openUrl(String s) {
        demoProPage.open(s);
    }

    @Step("Check chat opened")
    public void openChat() {
        Assert.assertTrue(demoProPage.openChat());
    }

    @Step("Check that messages have been sent")
    public void sendMessageVisitor() {
        Assert.assertTrue(demoProPage.sendMessage());
    }

    @Step("Check that files have been sent")
    public void sendFile() {
        Assert.assertTrue(demoProPage.sendFile());
    }

    @Step("Check that files have been sent from computer")
    public void sendFile(String absoluteFilePath) {
        Assert.assertTrue(demoProPage.sendFile(absoluteFilePath));
    }

    /** Без проверки оценки оператора, т.к. оператор не бывает онлайн,
     * слежовательно, реализовано только закрытие блока оценки */
    @Step("Check that the operator is rated")
    public void rateOperator() {
        demoProPage.rateOperator();
    }

    @Step("Check chat closed")
    public void closeChat() {
        Assert.assertFalse(demoProPage.closeChat());
    }
}
