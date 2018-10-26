package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoProPage {
    private WebDriver driver;
    public DemoProPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String s) {
        driver.get(s);
    }

    public void openChat() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a[2]")).click();
    }

    public void sendMessage() {
        driver.findElement(By.xpath("//*[@id=\"webim_chat\"]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[2]")).sendKeys("fff");
        driver.findElement(By.xpath("//*[@id=\"webim_chat\"]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/button[2]")).click();
    }

    public void sendFile() {
        driver.findElement(By.xpath("//*[@id=\"webim_chat\"]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/button[1]")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id=\"webim_chat\"]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/ul/li[2]")).click();
    }

    public void rateOperator() {
        driver.findElement(By.xpath("//*[@id=\"webim_chat\"]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/button[1]")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id=\"webim_chat\"]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/ul/li[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"webim_chat\"]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div[1]/div/span")).click();
    }

    public void closeChat() {
        driver.findElement(By.xpath("//*[@id=\"webim_chat\"]/div[1]/div/div[1]")).click();
    }
}
