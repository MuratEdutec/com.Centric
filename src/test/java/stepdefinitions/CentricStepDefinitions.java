package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import pages.CentricPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

import java.util.Iterator;
import java.util.Set;

import static utilities.Driver.driver;

public class CentricStepDefinitions {

    CentricPages pages;

    @Given("go to centric")
    public void go_to_centric() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethod.waitToSee(3);
    }

    @Then("click cookies")
    public void clickCookies() {
        pages = new CentricPages();
        pages.popupclose.click();
    }

    @Then("terminate test")
    public void terminateTest() throws InterruptedException {
        //Thread.sleep(3000);
        Driver.closeDriver();
        Driver.quitDriver();
    }

    @Then("click contact")
    public void clickContact() {
        pages.contact.click();
    }


    @Then("scroll down to footer")
    public void scrollDownToFooter() {
        ReusableMethod.scrolldown();
        ReusableMethod.bekle(3);
    }

    @Then("click LinkedIn Berlina van der Molen, Account Manager")
    public void clickLinkedInBerlinaVanDerMolenAccountManager() {
        pages.linkedin1.click();
        ReusableMethod.bekle(3);
    }

    @Then("verify that the LinkedIn Berlina van der Molen, Account Manager is opened correctly")
    public void verifyThatTheLinkedInBerlinaVanDerMolenAccountManagerIsOpenedCorrectly() {
        SoftAssert softassert = new SoftAssert();
        String mainWindowHandle = driver.getWindowHandle(); // Store the current window handle
        Set<String> windowHandles = driver.getWindowHandles(); // Get all window handles
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle); // Switch to the pop-up window
                break;
            }
        }
        String actualLinkedin = Driver.getDriver().getCurrentUrl();
        String expectedLinkedin = "berlina-van-der-molen";

        softassert.assertTrue(actualLinkedin.contains(expectedLinkedin));
        ReusableMethod.bekle(3);
        driver.switchTo().window(mainWindowHandle); // Switch to the pop-up window
    }

    @Then("click LinkedIn Wijnand de Reeder, Sales Manager")
    public void clickLinkedInWijnandDeReederSalesManager() {

        pages.linkedin2.click();
        ReusableMethod.bekle(3);
    }

    @Then("verify that the LinkedIn Wijnand de Reeder, Sales Manager is opened correctly")
    public void verifyThatTheLinkedInWijnandDeReederSalesManagerIsOpenedCorrectly() {
        SoftAssert softassert = new SoftAssert();
        String mainWindowHandle = driver.getWindowHandle(); // Store the current window handle
        Set<String> windowHandles = driver.getWindowHandles(); // Get all window handles
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle); // Switch to the pop-up window
                break;
            }
        }
        String actualLinkedin = Driver.getDriver().getCurrentUrl();
        String expectedLinkedin = "wijnand-de-reeder";
        softassert.assertTrue(actualLinkedin.contains(expectedLinkedin));
        ReusableMethod.bekle(3);
        driver.switchTo().window(mainWindowHandle);
    }

    @Then("click LinkedIn Scott Domhof, Senior Account Manager")
    public void clickLinkedInScottDomhofSeniorAccountManager() {
        pages.linkedin3.click();
        ReusableMethod.bekle(3);
    }

    @Then("verify that the LinkedIn Scott Domhof, Senior Account Manager is opened correctly")
    public void verifyThatTheLinkedInScottDomhofSeniorAccountManagerIsOpenedCorrectly() {

        SoftAssert softassert = new SoftAssert();
        String mainWindowHandle = driver.getWindowHandle(); // Store the current window handle
        Set<String> windowHandles = driver.getWindowHandles(); // Get all window handles
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle); // Switch to the pop-up window
                break;
            }
        }
        String actualLinkedin = Driver.getDriver().getCurrentUrl();
        String expectedLinkedin = "scott-domhof";
        softassert.assertTrue(actualLinkedin.contains(expectedLinkedin));
        /* ReusableMethod.bekle(3);*/
        driver.switchTo().window(mainWindowHandle);

    }

    @Then("click LinkedIn Franklin van den Berg, Sales Manager")
    public void clickLinkedInFranklinVanDenBergSalesManager() {
        pages.linkedin4.click();
        ReusableMethod.bekle(3);


    }

    @Then("verify that the LinkedIn Franklin van den Berg, Sales Manager is opened correctly")
    public void verifyThatTheLinkedInFranklinVanDenBergSalesManagerIsOpenedCorrectly() {
        SoftAssert softassert = new SoftAssert();
        String mainWindowHandle = driver.getWindowHandle(); // Store the current window handle
        Set<String> windowHandles = driver.getWindowHandles(); // Get all window handles
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle); // Switch to the pop-up window
                break;
            }
        }
        String actualLinkedin = Driver.getDriver().getCurrentUrl();
        String expectedLinkedin = "franklin-van-den-berg";
        softassert.assertTrue(actualLinkedin.contains(expectedLinkedin));
        ReusableMethod.bekle(3);
        driver.switchTo().window(mainWindowHandle);
    }

    @Then("click LinkedIn Tom Stoutenburg, Manager Sales & Service Delivery Financial Institutions")
    public void clickLinkedInTomStoutenburgManagerSalesServiceDeliveryFinancialInstitutions() {
        pages.linkedin5.click();
        ReusableMethod.bekle(3);
    }

    @Then("verify that the LinkedIn Tom Stoutenburg, Manager Sales & Service Delivery Financial Institutions is opened correctly")
    public void verifyThatTheLinkedInTomStoutenburgManagerSalesServiceDeliveryFinancialInstitutionsIsOpenedCorrectly() {
        SoftAssert softassert = new SoftAssert();
        String mainWindowHandle = driver.getWindowHandle(); // Store the current window handle
        Set<String> windowHandles = driver.getWindowHandles(); // Get all window handles
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle); // Switch to the pop-up window
                break;
            }
        }
        String actualLinkedin = Driver.getDriver().getCurrentUrl();
        String expectedLinkedin = "tomstoutenburg";
        softassert.assertTrue(actualLinkedin.contains(expectedLinkedin));
        ReusableMethod.bekle(3);
        driver.switchTo().window(mainWindowHandle);
    }


    @Then("click LinkedIn Bert Matthijssen, Commercieel Manager")
    public void clickLinkedInBertMatthijssenCommercieelManager() {

        pages.linkedin6.click();
        ReusableMethod.bekle(3);

    }

    @Then("verify that the LinkedIn Bert Matthijssen, Commercieel Manager is opened correctly")
    public void verifyThatTheLinkedInBertMatthijssenCommercieelManagerIsOpenedCorrectly() {
        SoftAssert softassert = new SoftAssert();
        String mainWindowHandle = driver.getWindowHandle(); // Store the current window handle
        Set<String> windowHandles = driver.getWindowHandles(); // Get all window handles
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle); // Switch to the pop-up window
                break;
            }
        }
        String actualLinkedin = Driver.getDriver().getCurrentUrl();
        String expectedLinkedin = "bertmatthijssen";
        softassert.assertTrue(actualLinkedin.contains(expectedLinkedin));
        ReusableMethod.bekle(3);
        driver.switchTo().window(mainWindowHandle);
    }

    //US_02 --> TC02

    @Then("click careers section")
    public void clickCareersSection() {
        pages.careers_button.click();
        ReusableMethod.bekle(3);

    }


    @Then("click careers cookies")
    public void clickCareersCookies() {
        // It will return the parent window name as a String
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();
        // Now iterate using Iterator
        Iterator<String> I1 = s.iterator();
        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                System.out.println(driver.getCurrentUrl());
                System.out.println(driver.switchTo().window(child_window).getTitle());
            }
        }
        System.out.println(driver.getCurrentUrl());
        pages.careers_cookie.click();
    }

    @Then("click Jij en Centric section")
    public void clickJijEnCentricSection() {
        pages.jijencentric_button.click();
        ReusableMethod.bekle(3);
    }

    @Then("click Werken bij Centric section")
    public void clickWerkenBijCentricSection() {
        pages.werkenbijcentric_button.click();
    }

    @Then("click Bekijk onze vacatures")
    public void clickBekijkOnzeVacatures() {
        pages.bekijk_onze_vacatures_button.click();
    }

    @Then("click Filteren button")
    public void clickFilterenButton() {
        pages.filter_button.click();
    }
}

