package apk.qa.store.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ProductPage {
    public ProductPage(AndroidDriver<AndroidElement>androidDriver){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver, Duration.ofSeconds(10)),this);
    }

    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[1]")
    AndroidElement firstProductAddToCart;
    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[2]")
    AndroidElement secondProductAddToCart;
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id=\"com.androidsample.generalstore:id/appbar_btn_cart\"]")
    AndroidElement cartSymbol;

    public void addingItemProductToTheCart(){
        firstProductAddToCart.click();
        secondProductAddToCart.click();
        cartSymbol.click();
    }
}
