package org.example;

import org.example.models.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        dataScraping();
    }

    private static void dataScraping() {
        System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");

        EdgeOptions options = new EdgeOptions();

        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-blink-features=AutomationControlled");

        options.setExperimentalOption("excludeSwitches", Collections.singleton("enable-automation"));

        WebDriver driver = new EdgeDriver(options);

        driver.get("https://amazon.com.br");

        WebElement searchInput = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        searchInput.sendKeys("celular");
        searchInput.submit();

        waitForIt(5000);

        List<WebElement> bookNames = driver.findElements(By.xpath("//span[@class=\"a-size-base-plus a-color-base a-text-normal\"]"));
        List<WebElement> bookPrices = driver.findElements(By.xpath("//div[@class='a-row a-size-base a-color-base']"));

        ArrayList<Product> products = new ArrayList<Product>();

        for (int i = 0; i < bookNames.size(); i++) {
            products.add(new Product(bookNames.get(i).getText(), bookPrices.get(i).getText()));
        }
    }

    private static void waitForIt(long time) {
        try {
            new Thread().sleep(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
