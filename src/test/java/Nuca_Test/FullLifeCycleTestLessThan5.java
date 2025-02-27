package Nuca_Test;

import Nuca_Page.Home_Page;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class FullLifeCycleTestLessThan5 extends Hooks {

    Home_Page home;

    @Test
    public void signIn() throws InterruptedException, AWTException {
        home = new Home_Page(driver);
        home.sign().click();
        home.signIn1().click();
        Thread.sleep(300);
        home.userName1().sendKeys("m11");
        home.password1().sendKeys("123456");
        home.enter1().click();
        Thread.sleep(100);
        home.opportunity().click();
        Thread.sleep(300);
        home.City().click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,250)");
        Thread.sleep(900);
        home.information().click();
        JavascriptExecutor ns = (JavascriptExecutor)driver;
        ns.executeScript("window.scroll(0,900)");
        Thread.sleep(800);
        home.applyOpportunity().click();
        Thread.sleep(2000);
        home.name().sendKeys("Mostafa Elsayed Abdelwahab");
        home.identify().click();
        home.sendIdentify().sendKeys("الرقم القومي");
        home.confirmIdentify().click();
        Thread.sleep(300);
        home.numberID().sendKeys("29809301702577");
        home.advuserch().click();
        home.sendAdvuserch().sendKeys("صاحب الشركة");
        home.confirmAdvuserch().click();
        Thread.sleep(1500);
        home.company().click();
        home.sendCompany().sendKeys("mohamed emad Development");
        home.confirmCompany().click();
        home.currency().click();
        home.sendCurrency().sendKeys("سداد بالجنية");
        home.confirmCurrency().click();
        JavascriptExecutor ms = (JavascriptExecutor)driver;
        ms.executeScript("window.scroll(0,450)");
        Thread.sleep(300);
        JavascriptExecutor s =(JavascriptExecutor) driver;
        s.executeScript("arguments[0].click();",home.Data());
        Thread.sleep(700);
        home.type().click();
        home.Calendar().click();
        home.CerAmount().sendKeys("100,000.00");
        home.Bank().click();
        home.Bank1().sendKeys("اسوان المحطة");
        home.confirmBank().click();
        home.branchRef().sendKeys("اسوان");
        Thread.sleep(300);
        home.BankCerAttachRef().click();
        Thread.sleep(300);
        //مرفق تعهد بسداد كامل قطعة الارض
        Robot robot = new Robot();
        home.attach().click();
        StringSelection filepath = new StringSelection("D:\\سجل تجارى اثينا حديث.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath,null);
        robot.setAutoDelay(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.setAutoDelay(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(500);
        JavascriptExecutor k =(JavascriptExecutor) driver;
        k.executeScript("arguments[0].click();", home.additionalInfo());
        Thread.sleep(500);
        home.establishmentDate().click();
        //مرفق عقد التأسيس
        Robot r = new Robot();
        home.establishmentDateattach().click();
        StringSelection path = new StringSelection("D:\\سجل تجارى اثينا حديث.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path,null);
        robot.setAutoDelay(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.setAutoDelay(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        JavascriptExecutor p = (JavascriptExecutor)driver;
        p.executeScript("window.scroll(0,600)");
        home.taxCardNumber().click();
        home.sendTaxCardNumber().sendKeys("7927782");
        home.DateTaxCardNumber().click();






       // Thread.sleep(8000);
        //home.Data1().click();

        /*
         Thread.sleep(300);
         home.Register().click();
         Thread.sleep(1000);
         JavascriptExecutor ns = (JavascriptExecutor) driver;
         ns.executeScript("arguments[0].click();", home.agree());
        Thread.sleep(400);

         */
        String Text = driver.findElement(By.cssSelector("div[class=\"title d-flex flex-column\"]")).getText();
        System.out.println("Text is " + Text);



       // JavascriptExecutor js = (JavascriptExecutor)driver;
        //js.executeScript("window.scroll(0,1422)");




/*
        new WebDriverWait(driver,Duration.ofSeconds(90));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("div[class=\"swiper-slide swiper-slide-prev\"]")));
*/



    }



        /*
        //Assertion2
        Assert.assertTrue(driver.findElement(By.cssSelector("h2[class=\"fs-title-lg-o text-dark-blue-o\"]")).isDisplayed());
        //Assertion3
        String url = driver.getCurrentUrl();
        System.out.println("url is " + url);
        home.present().sendKeys("Mostafa Elsayed Abdelwahab");
        home.numberID().sendKeys("29809301702577");
        driver.findElement(By.id("s2id_autogen1")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("select2-search")).sendKeys("صاحب الشركة");
       //Thread.sleep(9000);

*/

        //c.selectByVisibleText("صاحب الشركة");

        //Thread.sleep(1000);
        //driver.findElement(By.cssSelector("option[ng-reflect-value=\"1\"]")).isSelected();

        //Back WebBrowser
        //driver.navigate().back();









    }

