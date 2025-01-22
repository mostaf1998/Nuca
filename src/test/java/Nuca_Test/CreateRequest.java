package Nuca_Test;

import Nuca_Page.D01_CreateRequest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Properties;

public class CreateRequest extends Testback {
    D01_CreateRequest page;

   public String landNumber = "553";
   public String location = "الشروق";
   public int Space = 40000;
   public String activity ="عمراني متكامل" ;
   public String currency= "دولار" ;
   public String City = "القاهرة الجديدة";

    /*
    String landNumber = ReaderData.data.getProperty("landNumber");
    String location = ReaderData.data.getProperty("location");
    String Space = ReaderData.data.getProperty("Space");
    String activity = ReaderData.data.getProperty("activity");
    String currency  = ReaderData.data.getProperty("currency");
    String City = ReaderData.data.getProperty("City");
*/
    /*
    @DataProvider(name ="ExcelData")
    public Object [][] userRegisterData() throws IOException {
        ExcelReader er = new ExcelReader();
     return er.getExcelData();
    }
    *
     */

    @Test(priority = 1)
    public void createRequest() throws AWTException, InterruptedException {
        page = new D01_CreateRequest(driver);
        //page.enter("موظف الهيئة 1" , "123456");
        page.userName().sendKeys("موظف الهيئة 1");
        page.password().sendKeys("123456");
        page.login().click();
        page.opportunity().click();
        page.createOpportunity().click();
        Thread.sleep(2000);
        page.landNumber().sendKeys(landNumber);
        page.location().sendKeys(location);
        page.space().sendKeys(Space+"");
        /*
        if (Space >= 30000)
        {
            page.clickonusufruct().click();
        }

         */
        Thread.sleep(100);
        page.activityType().click();
        page.activitySend().sendKeys(activity);
        page.activityaAtion().click();
        page.city().click();
        page.sendCity().sendKeys(City);
        page.actionCity().click();
        page.paymentCurrency().click();
        page.sendPaymentCurrency().sendKeys(currency);
        page.actionPaymentCurrency().click();
        JavascriptExecutor ns = (JavascriptExecutor) driver;
        ns.executeScript("window.scroll(0,300)");
        page.structuralRequirements().sendKeys("100 متر مباني");
        page.implementationPeriod().sendKeys("علي 12 شهر");
        JavascriptExecutor bs = (JavascriptExecutor) driver;
        bs.executeScript("window.scroll(0,500)");
        page.paymentMethod().sendKeys("يتم دفع المبلغ علي 4 اقساط");
        page.shapefile().click();
        Thread.sleep(1000);
        page.uploadFile();
        JavascriptExecutor ss =(JavascriptExecutor) driver;
        ss.executeScript("arguments[0].click();", page.save());
        SoftAssert x = new SoftAssert();
        x.assertTrue(page.Duplicate().getText().contains("رقم القطعة مكرر"),"false");
        Thread.sleep(100);

        }

    @Test(priority = 2)
    public void opportunityChance() throws InterruptedException {
        page = new D01_CreateRequest(driver);
        page.userName().sendKeys("مدير الفرص1");
        page.password().sendKeys("123456");
        page.login().click();
        page.dropdown().click();
        page.dropdownItem().click();
        Thread.sleep(1000);
        JavascriptExecutor os = (JavascriptExecutor) driver;
        os.executeScript("window.scroll(0,300)");
        page.AssignBtn().click();
        page.searchLandNumber(landNumber+"");
        Thread.sleep(1000);
        JavascriptExecutor ks = (JavascriptExecutor) driver;
        ks.executeScript("window.scroll(0,350)");
        Thread.sleep(500);
        page.Assign().click();
        Thread.sleep(100);
        page.price().sendKeys("1000");
        page.priceInstallment().sendKeys("2000");
        page.ReservationFeePercent().sendKeys("20");
        Thread.sleep(2000);
        JavascriptExecutor ss = (JavascriptExecutor) driver;
        ss.executeScript("window.scroll(0,600)");
        JavascriptExecutor n =(JavascriptExecutor) driver;
        n.executeScript("arguments[0].click();", page.button());
        page.date().click();
        Thread.sleep(3000);
        page.accepted().click();
        Thread.sleep(2000);
        page.opportunity1().click();
        Thread.sleep(2000);
        page.dropDownlist().click();
        page.searchLandNumber().sendKeys(landNumber+"");
        page.search2().click();
        JavascriptExecutor p = (JavascriptExecutor) driver;
        p.executeScript("window.scroll(0,500)");
        Thread.sleep(2000);
        page.detail().click();
        JavascriptExecutor nq = (JavascriptExecutor) driver;
        nq.executeScript("window.scroll(0,600)");
        Thread.sleep(5000);
        page.pushOpportunity().click();
        Thread.sleep(4000);
        page.calendar().click();
        page.push().click();


        //page.accepted().click();




    }
}





















