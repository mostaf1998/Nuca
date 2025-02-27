package Nuca_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Home_Page {
    WebDriver driver;

    public Home_Page(WebDriver x) {

        this.driver = x;
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

    public WebElement opportunity() {
        return driver.findElement(By.linkText("الفرص الاستثمارية"));
    }
    public WebElement City() {
        return driver.findElement(By.xpath("//*[@id=\"requests\"]/div/div[2]/div"));
    }

    public WebElement information() {
        return driver.findElement(By.xpath("/html/body/app-root/div[1]/div/app-guest-home-page/div/main/app-home-page/main/app-opportunites-cities-list/div/div/app-data-grid/div/div/div[2]/div[1]/div/table/tr[3]/td[10]/app-button"));
    }
    public WebElement applyOpportunity() {
        return driver.findElement(By.xpath("/html/body/app-root/div[1]/div/app-guest-home-page/div/main/app-home-page/main/app-opportunity-details/div/form/app-panel/div/div/div[3]/panel-footer/div/app-button"));
    }
    public WebElement name() {
        return driver.findElement(By.name("applicantName"));

    }
    public WebElement identify() {
        return driver.findElement(By.className("custom-focus-o"));

    }
    public WebElement sendIdentify() {
        return driver.findElement(By.xpath("//*[@id=\"s2id_autogen18_search\"]"));

    }
    public WebElement confirmIdentify() {
        return driver.findElement(By.xpath("//*[@id=\"select2-results-18\"]"));
    }
    public WebElement numberID() {
        return driver.findElement(By.cssSelector("input[name=\"applicantNationalNumber\"]"));

    }

    public WebElement advuserch() {
        return driver.findElement(By.xpath("/html/body/app-root/div[1]/div/app-guest-home-page/div/main/app-home-page/main/app-request-creator-page/div/div[1]/div/div/app-company-basic-info-editor/form/div/div[5]/app-select"));

    }

    public WebElement sendAdvuserch() {
        return driver.findElement(By.cssSelector("input[type=\"text\"]"));

    }

    public WebElement confirmAdvuserch() {
        return driver.findElement(By.className("select2-result-label"));

    }

    public WebElement company() {
        return driver.findElement(By.name("company"));

    }

    public WebElement sendCompany() {
        return driver.findElement(By.id("s2id_autogen30_search"));

    }

    public WebElement confirmCompany() {
        return driver.findElement(By.xpath("//*[@id=\"select2-results-30\"]/li"));
    }

    public WebElement currency() {
        return driver.findElement(By.xpath("//*[@id=\"s2id_autogen15\"]"));

    }

    public WebElement sendCurrency() {
        return driver.findElement(By.xpath("//*[@id=\"s2id_autogen16_search\"]"));

    }
    public WebElement confirmCurrency() {
        return driver.findElement(By.xpath("//*[@id=\"select2-results-16\"]/li[1]"));

    }

    public WebElement Data() {
        return driver.findElement(By.id("bankCertificateInfoData-pill"));
    }

    public WebElement type() {
        return driver.findElement(By.cssSelector("input[type=\"radio\"]"));
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
        return driver.findElement(By.xpath("//*[@id=\"s2id_autogen26_search\"]"));
    }


    public WebElement confirmBank() {
        return driver.findElement(By.xpath("//*[@id=\"select2-results-26\"]/li"));
    }

    public WebElement branchRef() {
        return driver.findElement(By.xpath("//*[@id=\"bankCertInfoItem\"]/div[1]/div[1]/div[4]/input"));
    }


    public WebElement BankCerAttachRef() {
        return driver.findElement(By.xpath("//*[@id=\"bankCertInfoItem\"]/div[1]/span[2]/input"));
    }
    public WebElement attach() {
        return driver.findElement(By.xpath("//*[@id=\"attachPin\"]/div"));
    }

    public WebElement additionalInfo() {
        return driver.findElement(By.id("additionalInfoData-pill"));
    }
    public WebElement establishmentDate() {
        return driver.findElement(By.name("establishmentDate"));
    }
    public WebElement establishmentDateattach() {
        return driver.findElement(By.xpath("//*[@id=\"EstablishmentContractAttacmentRef\"]"));
    }
    public WebElement taxCardNumber() {
        return driver.findElement(By.xpath("//*[@id=\"taxCardInfoHeading\"]/button"));
    }
    public WebElement sendTaxCardNumber() {
        return driver.findElement(By.name("taxCardNumber"));
    }
    public WebElement DateTaxCardNumber() {
        return driver.findElement(By.xpath("//*[@id=\"taxCardInfoItem\"]/div/div/div[2]/app-date-picker"));
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

