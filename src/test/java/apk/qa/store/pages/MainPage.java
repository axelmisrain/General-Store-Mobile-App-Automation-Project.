package apk.qa.store.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtils;

import java.time.Duration;

public class MainPage {
    public MainPage(AndroidDriver<AndroidElement>androidDriver){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver, Duration.ofSeconds(10)), this);
    }
    @AndroidFindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
    AndroidElement country;
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.androidsample.generalstore:id/nameField\"]")
    AndroidElement name;
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@resource-id=\"com.androidsample.generalstore:id/radioFemale\"]")
    AndroidElement gender;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.androidsample.generalstore:id/btnLetsShop\"]")
    AndroidElement button;

    public void login(AndroidDriver<AndroidElement>androidDriver, String chooseCountry, String name){
        CommonUtils.elementTap(androidDriver, country);
        CommonUtils.scroll(androidDriver, chooseCountry).click();
        this.name.sendKeys(name);
        gender.click();
        button.click();
    }
}
