package Nuca_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Home_Page {
    WebDriver driver;

    public Home_Page(WebDriver driver) {

        this.driver = driver;
    }

    public WebElement sign() {
        return driver.findElement(By.cssSelector("a[data-bs-toggle=\"dropdown\"]"));
    }

    public WebElement signIn1() {
        return driver.findElement(By.xpath("//a[@class=\"dropdown-item text-theme\"]"));
    }

    public WebElement userName1() {
        return driver.findElement(By.cssSelector("input[class=\"form-control form-control-lg ng-untouched ng-pristine ng-invalid\"]"));
    }

    public WebElement password1() {
        return driver.findElement(By.cssSelector("input[name=\"password\"]"));
    }


    public WebElement enter1() {
        return driver.findElement(By.cssSelector("button[type=\"submit\"]"));

    }


    public WebElement apply() {
        return driver.findElement(By.linkText("طلباتى"));

    }

    public WebElement less5() {
        return driver.findElement(By.className("swiper-slide"));
    }

    public WebElement name() {
        return driver.findElement(By.name("applicantName"));

    }

    public WebElement numberID() {
        return driver.findElement(By.cssSelector("input[name=\"applicantNationalNumber\"]"));

    }

    public WebElement advuserch() {
        return driver.findElement(By.className("select2-chosen"));

    }

    public WebElement advuserch1() {
        return driver.findElement(By.cssSelector("input[type=\"text\"]"));

    }

    public WebElement advuserch2() {
        return driver.findElement(By.className("select2-result-label"));

    }

    public WebElement company() {
        return driver.findElement(By.id("s2id_autogen17"));

    }

    public WebElement company1() {
        return driver.findElement(By.xpath("//*[@id=\"s2id_autogen18_search\"]"));

    }

    public WebElement company3() {
        return driver.findElement(By.className("select2-result-label"));
        //select2-match
    }

    public WebElement currency() {
        return driver.findElement(By.id("s2id_autogen5"));

    }

    public WebElement currency1() {
        return driver.findElement(By.xpath("//*[@id=\"s2id_autogen6_search\"]"));

    }

    public WebElement city() {
        return driver.findElement(By.id("select2-chosen-12"));

    }

    public WebElement city1() {
        return driver.findElement(By.xpath("//*[@id=\"s2id_autogen20_search\"]"));

    }

    public WebElement city3() {
        return driver.findElement(By.className("select2-match"));

    }

    public WebElement activity() {
        return driver.findElement(By.id("select2-chosen-22"));

    }

    public WebElement activity1() {
        return driver.findElement(By.xpath("//*[@id=\"s2id_autogen22_search\"]"));

    }

    public WebElement activity3() {
        return driver.findElement(By.className("select2-match"));

    }

    public WebElement Noland() {
        return driver.findElement(By.id("select2-chosen-336"));

    }

    public WebElement Noland1() {
        return driver.findElement(By.xpath("//*[@id=\"s2id_autogen336_search\"]"));

    }

    public WebElement Noland2() {
        return driver.findElement(By.className("select2-result-label"));
    }

    public WebElement Data() {
        return driver.findElement(By.id("bankCertificateInfoData-pill"));
    }

    public WebElement Calendar() {
        return driver.findElement(By.name("certificateDate"));
    }

    public WebElement CerAmount() {
        return driver.findElement(By.name("certificateAmount"));
    }

    public WebElement Bank() {
        return driver.findElement(By.name("bank"));
    }

    public WebElement Bank1() {
        return driver.findElement(By.xpath("//*[@id=\"s2id_autogen24_search\"]"));
    }

    public WebElement BanK2() {
        return driver.findElement(By.className("select2-result-label"));
    }

    public WebElement BranchRef() {
        return driver.findElement(By.name("branchRef"));
    }

    public WebElement BankCerAttachRef() {
        return driver.findElement(By.id("BankCertificateAttacmentRef"));
    }

    public String attach() {
       return System.getProperty("user.dir");

    }

}
//BankCertificateAttacmentRef
    /*
    //تسجيل
    public WebElement Register() {
        return driver.findElement(By.cssSelector("app-button[ng-reflect-text=\"تسجيل\"]"));

    }
    //موافق
    public WebElement agree() {
        return driver.findElement(By.cssSelector("app-button[data-bs-dismiss=\"modal\"]"));

    }
*/

