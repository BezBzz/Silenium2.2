package samokatTest;
import java.time.Duration;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import samokat.MainPage;

public class MainPageTest {
    WebDriver driver = new ChromeDriver();



    @Test
    public void CheckingTheOrderUsingTheTopButton() {
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickButtonOrder();
        mainPage.fillInTheNameField();
        mainPage.fillInTheSurnameField();
        mainPage.fillInTheAddressField();
        mainPage.fillInMetroStationField();
        mainPage.fillInTelephoneField();
        mainPage.clickFurtherButton();
        mainPage.fillDateField();
        mainPage.fillRentalField();
        mainPage.clickColourScooter();
        mainPage.fillCommentCourierField();
        mainPage.clickButtonOrderSecond();
        mainPage.clickYesButton();

     }

    @After
    public void tearDown() {
        driver.quit();
    }

}
