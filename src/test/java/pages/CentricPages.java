package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CentricPages {

    public CentricPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//span[text()='Contact'])[1]")
    public WebElement contact;
    @FindBy(xpath = "//a[normalize-space()='Allow all']")
    public WebElement popupclose;
    @FindBy(xpath = "(//*[text()='LinkedIn'])[1]")
    public WebElement linkedin1;
    @FindBy(xpath = "(//*[text()='LinkedIn'])[2]")
    public WebElement linkedin2;
    @FindBy(xpath = "(//*[text()='LinkedIn'])[3]")
    public WebElement linkedin3;
    @FindBy(xpath = "(//*[text()='LinkedIn'])[4]")
    public WebElement linkedin4;
    @FindBy(xpath = "(//*[text()='LinkedIn'])[5]")
    public WebElement linkedin5;
    @FindBy(xpath = "(//*[text()='LinkedIn'])[6]")
    public WebElement linkedin6;

    @FindBy(xpath = "(//span[text()='Careers'])[1]")
    public WebElement careers_button;
    @FindBy(xpath = "(//a[@class='c-button'])[1]")
    public WebElement careers_cookie;


    @FindBy(xpath = "(//span[text()='Jij en Centric'])[1]")
    public WebElement jijencentric_button;


    @FindBy(xpath = "(//span[text()='Werken bij Centric'])[1]")
    public WebElement werkenbijcentric_button;

@FindBy(xpath = "//span[text()='Bekijk onze vacatures']")
    public WebElement bekijk_onze_vacatures_button;



@FindBy(xpath = "//span[text()='Filteren']")
    public WebElement filter_button;




}
