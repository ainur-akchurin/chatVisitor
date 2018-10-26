package steps;

import org.openqa.selenium.WebDriver;
import pages.DemoProPage;


public class Step {
    private DemoProPage demoProPage;

    public Step(WebDriver driver) {
        demoProPage = new DemoProPage(driver);
    }

    public void openUrl(String s) {
        demoProPage.open(s);
    }

    public void openChat() {
        demoProPage.openChat();
    }

    public void sendMessageVisitor() {
        demoProPage.sendMessage();
    }

    public void sendFile() {
        demoProPage.sendFile();
    }

    public void rateOperator() {
        demoProPage.rateOperator();
    }

    public void closeChat() {
        demoProPage.closeChat();
    }
}
