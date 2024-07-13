package apk.qa.store.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class CartPage {
    public CartPage (AndroidDriver<AndroidElement>androidDriver){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver, Duration.ofSeconds(10)),this);
    }

    @AndroidFindBy(id = "com.androidsample.generalstore:id/productName")
    List<AndroidElement> allProductNames;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/productPrice")
    List<AndroidElement> allProductPrices;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/totalAmountLbl\"]")
    AndroidElement totalPrice;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.androidsample.generalstore:id/btnProceed\"]")
    AndroidElement visitButton;

    public void productInformation(String firstProduct, String secondProduct, String firstPrice, String secondPrice){

        List<String> expectedShoes = Arrays.asList(firstProduct,secondProduct);
        List<String> actualPrices = Arrays.asList(firstPrice, secondPrice);

        double sum= 0;
        for (int i = 0; i < allProductNames.size(); i++){
            Assertions.assertEquals(expectedShoes.get(i), allProductNames.get(i).getText());
            Assertions.assertEquals(actualPrices.get(i), allProductPrices.get(i).getText());
            String priceS = allProductPrices.get(i).getText();
            priceS = priceS.replaceAll("[$]","");
            double price = Double.parseDouble(priceS);
            sum += price;
        }

        String totalPriceS = totalPrice.getText().replace("$","");
        Assertions.assertEquals(sum, Double.parseDouble(totalPriceS));
        Assertions.assertTrue(visitButton.isDisplayed());
    }
}
