package ru.ak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.Random;

public class DemoProPage {
    private final WebDriverWait wait;
    private WebDriver driver;
    public DemoProPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void open(String s) {
        driver.get(s);
    }

    public boolean openChat() {
        try {
            WebElement chatButton = driver.findElement(By.xpath(Resource.CORNER_BTN_OPEN_CHAT));
            wait.until(ExpectedConditions.elementToBeClickable(chatButton));
            chatButton.click();
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
            WebElement chatButton = driver.findElement(By.xpath(Resource.CORNER_BTN_OPEN_CHAT));
            wait.until(ExpectedConditions.elementToBeClickable(chatButton));
            chatButton.click();
        }

        return driver.findElement(By.className(Resource.CHAT_WINDOW)).isDisplayed();
    }


    public boolean sendMessage() {
        driver.findElement(By.xpath(Resource.CHAT_MSG_AREA)).sendKeys(Resource.randomText(10));
        driver.findElement(By.xpath(Resource.CHAT_BTN_SEND_MSG)).click();

        return driver.findElement(By.className(Resource.CHAT_VISITOR_MSG)).isDisplayed();
    }


    public boolean sendFile() {
        File file = new File("./files/1.jpg");
        String absolute = file.getAbsolutePath();
        driver.findElement(By.xpath(Resource.CHAT_FILE_UPLOAD_INPUT)).sendKeys(absolute);

        return driver.findElement(By.className(Resource.CHAT_VISITOR_FILE_MSG)).isDisplayed();
    }

    public boolean sendFile(String absoluteFilePath) {
        driver.findElement(By.xpath(Resource.CHAT_FILE_UPLOAD_INPUT)).sendKeys(absoluteFilePath);

        return driver.findElement(By.className(Resource.CHAT_VISITOR_FILE_MSG)).isDisplayed();
    }


    public void rateOperator() {

        driver.findElement(By.xpath(Resource.CHAT_BTN_SHOW_ICONS)).click();
        wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath(Resource.CHAT_BTN_RATE_OPERATOR))));
        driver.findElement(By.xpath(Resource.CHAT_BTN_RATE_OPERATOR)).click();

        if(driver.findElement(By.className(Resource.CHAT_NO_OPERATOR)).isDisplayed()){
        wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath(Resource.CHAT_RATE_BLOCK_OVERLAY))));
        driver.findElement(By.xpath(Resource.CHAT_RATE_BLOCK_BTN_CLOSE)).click();
        }
        else {

            switch (new Random().nextInt(5)+1){
                case 1:
                    driver.findElement(By.xpath(Resource.CHAT_RATE_BLOCK_BTN_1STAR)).click();
                    break;
                case 2:
                    driver.findElement(By.xpath(Resource.CHAT_RATE_BLOCK_BTN_2STAR)).click();
                    break;
                case 3:
                    driver.findElement(By.xpath(Resource.CHAT_RATE_BLOCK_BTN_3STAR)).click();
                    break;
                case 4:
                    driver.findElement(By.xpath(Resource.CHAT_RATE_BLOCK_BTN_4STAR)).click();
                    break;
                case 5:
                    driver.findElement(By.xpath(Resource.CHAT_RATE_BLOCK_BTN_5STAR)).click();
                    break;
            }

        }
    }


    public boolean closeChat() {
        driver.findElement(By.xpath(Resource.CHAT_BTN_CLOSE)).click();
        return driver.findElement(By.className(Resource.CHAT_WINDOW)).isDisplayed();
    }
}
