package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class HomePage {
    private AppiumDriver driver;

    private By productItem = By.xpath("//android.widget.TextView[@text='Product A']");
    private By addToCartButton = By.id("com.demo:id/addToCart");

    public HomePage(AppiumDriver driver) {
        this.driver = driver;
    }

    public void addProductToCart() {
        driver.findElement(productItem).click();
        driver.findElement(addToCartButton).click();
    }
}