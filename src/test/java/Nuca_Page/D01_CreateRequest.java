package Nuca_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class D01_CreateRequest {

    WebDriver driver;

    public D01_CreateRequest(WebDriver driver) {
        this.driver = driver;
    }

    //موظف الهيئة
    public  WebElement userName() {
      return  driver.findElement(By.name("username"));

    }

    public WebElement password() {
        return driver.findElement(By.name("password"));

    }

    public WebElement login() {
        return driver.findElement(By.className("c-btn"));

    }

    public WebElement opportunity() {
        return driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]"));

    }

    public WebElement createOpportunity() {
        return driver.findElement(By.linkText("إنشاء فرصة"));

    }


    public WebElement landNumber() {
        return driver.findElement(By.name("landNo"));
    }

    public WebElement location() {
        return driver.findElement(By.xpath("/html/body/div[1]/app-root/div[1]/div/app-home-page/div/div[2]/app-opportunity-editor/div/form/app-panel/div/div/div[2]/panel-body/div[1]/div[2]/input"));

    }

    public WebElement space() {
        return driver.findElement(By.name("area"));

    }

    public WebElement activityType() {
        return driver.findElement(By.id("s2id_autogen7"));

    }

    public WebElement activitySend() {
        return driver.findElement(By.xpath("//*[@id=\"s2id_autogen8_search\"]"));

    }

    public WebElement activityaAtion() {
        return driver.findElement(By.xpath("//*[@id=\"select2-results-8\"]/li"));

    }

    public WebElement city() {
        return driver.findElement(By.name("city"));

    }

    public WebElement sendCity() {
        return driver.findElement(By.xpath("//*[@id=\"s2id_autogen10_search\"]"));

    }

    public WebElement actionCity() {
        return driver.findElement(By.xpath("//*[@id=\"select2-results-10\"]/li"));

    }

    public WebElement paymentCurrency() {
        return driver.findElement(By.name("currancy"));

    }

    public WebElement sendPaymentCurrency() {
        return driver.findElement(By.xpath("//*[@id=\"s2id_autogen6_search\"]"));

    }

    public WebElement actionPaymentCurrency() {
        return driver.findElement(By.xpath("//*[@id=\"select2-results-6\"]/li"));

    }

    public WebElement structuralRequirements() {
        return driver.findElement(By.name("structuralRequirements"));

    }

    public WebElement implementationPeriod() {
        return driver.findElement(By.name("exPer"));

    }

    public WebElement paymentMethod() {
        return driver.findElement(By.name("payMeth"));

    }

    public WebElement shapefile() {
        return driver.findElement(By.name("reviewFromShapeFile"));

    }

    public WebElement save() {
        return driver.findElement(By.cssSelector("button[title=\"حفظ و إرسال للمراجعه \"]"));

    }

    public WebElement Duplicate() {
        return driver.findElement(By.xpath("/html/body/div[1]/app-root/div[1]/div/app-home-page/div/div[2]/app-user-msg/div/div/div/div/ul/li/span"));

    }

    /*
        String attachmentPath = System.getProperty("user.dir") + "\\Files\\photo.jpeg";
        public void upload() {
            driver.findElement(By.xpath("//*[@id=\"attachPin\"]/div/a")).sendKeys(attachmentPath);
        }
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    */
    public void uploadFile() throws AWTException {
        Robot robot = new Robot();
        driver.findElement(By.xpath("//*[@id=\"attachPin\"]/div/a")).click();
        robot.setAutoDelay(2000);
        StringSelection filepath = new StringSelection("D:\\سجل تجارى اثينا حديث.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
        robot.setAutoDelay(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.setAutoDelay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
    }

    //opportunity manager
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public WebElement dropdown() {
    return driver.findElement(By.id("workspaceDropMenu"));
    }

    public WebElement dropdownItem() {
    return driver.findElement(By.linkText("المهام القائمة"));
    }

    public WebElement AssignBtn() {
    return driver.findElement(By.name("AssignBtn"));
    }

    public void searchLandNumber(String landNumber) {
        driver.findElement(By.name("requestNo")).sendKeys(landNumber);

    }

    public WebElement Assign() {
        return driver.findElement(By.xpath("//*[@id=\"opportunity\"]/app-workspace-data-list/div[1]/form/div/app-data-grid/div/div/div[2]/div[1]/div/table/tr[2]/td[7]/div/div/app-button[1]/button"));
    }

    public WebElement price() {
        return driver.findElement(By.xpath("/html/body/div/app-root/div[1]/div/app-home-page/div/div[2]/app-opportunity-editor/div/form/app-panel/div/div/div[2]/panel-body/div[3]/div[2]/input"));
    }

    public WebElement priceInstallment() {
        return driver.findElement(By.name("MeterPriceInstallment"));
    }

    public WebElement ReservationFeePercent() {
        return driver.findElement(By.name("ReservationFeePercent"));
    }

    public WebElement button() {
        return driver.findElement(By.xpath("/html/body/div/app-root/div[1]/div/app-home-page/div/div[2]/app-opportunity-editor/div/form/app-panel/div/div/div[3]/panel-footer/div/div/app-button/button"));
    }

    public WebElement date() {
        return driver.findElement(By.xpath("//*[@id=\"CalendarId\"]/div/div/span/span"));
    }

    public WebElement accepted() {
        return driver.findElement(By.cssSelector("button[title=\"مقبول\"]"));
    }

    public WebElement opportunity1() {
        return driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]"));
    }

    public WebElement dropDownlist() {
        return driver.findElement(By.linkText("قائمة الفرص"));
    }

    public WebElement searchLandNumber() {
        return driver.findElement(By.xpath("/html/body/div/app-root/div[1]/div/app-home-page/div/div[2]/app-opportunity-list/div/form/app-panel/div/div/div[2]/panel-body/div[1]/div[1]/input"));
    }

    public WebElement search2() {
        return driver.findElement(By.xpath("/html/body/div/app-root/div[1]/div/app-home-page/div/div[2]/app-opportunity-list/div/form/app-panel/div/div/div[2]/panel-body/app-button-search/div/div/div/button[2]"));
    }

    public WebElement detail() {
        return driver.findElement(By.xpath("/html/body/div/app-root/div[1]/div/app-home-page/div/div[2]/app-opportunity-list/div/form/div/app-data-grid/div/div/div[2]/div[1]/div/div/table/tr[2]/td[12]/app-button/button"));
    }

    public WebElement pushOpportunity() {
        return driver.findElement(By.xpath("/html/body/div/app-root/div[1]/div/app-home-page/div/div[2]/app-opportunity-details/div/form/app-panel/div/div/div[3]/panel-footer/div[1]/app-button/button"));
    }

    public WebElement calendar() {
        return driver.findElement(By.cssSelector("span[class=\"fa fa-calendar pt-1 e\"]"));
    }
    public WebElement push() {
        return driver.findElement(By.cssSelector("app-button[ng-reflect-text=\"نشر\"]"));
    }

    public void SetText (WebElement txtelement  , String value) {
        txtelement.sendKeys(value);
    }

    public void enter(String name , String password)
    {
        SetText(userName(),name);
        SetText(password(),password);


    }
    public WebElement clickonusufruct() {
        return driver.findElement(By.name("usufruct"));
    }

}







