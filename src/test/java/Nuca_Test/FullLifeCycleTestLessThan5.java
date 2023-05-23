package Nuca_Test;

import Nuca_Page.Home_Page;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.sql.DriverManager;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class FullLifeCycleTestLessThan5 extends Hooks {

    Home_Page home;


    @Test
    public void signIn() throws InterruptedException {
        home = new Home_Page(driver);
        home.sign().click();
        home.signIn1().click();
        Thread.sleep(300);
        home.userName1().sendKeys("m11");
        home.password1().sendKeys("m19981998");
        home.enter1().click();
        Thread.sleep(600);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,800)");
        Thread.sleep(300);
        home.less5().click();
        Thread.sleep(900);
        /*
        home.name().sendKeys("Mostafa Elsayed Abdelwahab");
        home.numberID().sendKeys("29809301702577");
        Thread.sleep(300);
        home.advuserch().click();
        home.advuserch1().sendKeys("صاحب الشركة");
        home.advuserch2().click();
        home.company().click();
        home.company1().sendKeys("كريم2004");
        home.company3().click();
        home.currency().click();
        home.currency1().sendKeys("سداد بالجنية");
        home.company3().click();
        Thread.sleep(300);
        JavascriptExecutor ms = (JavascriptExecutor)driver;
        ms.executeScript("window.scroll(0,430)");
        Thread.sleep(300);

         */
        home.city().click();
        Thread.sleep(300);
        home.city1().sendKeys("القاهرة الجديدة");
        home.city3().click();
        home.activity().click();
        home.activity1().sendKeys("عمراني متكامل");
        home.activity3().click();
        Thread.sleep(300);
        home.Noland().click();
        home.Noland1().sendKeys("m1122");
        home.Noland2().click();
        Thread.sleep(300);
        JavascriptExecutor s =(JavascriptExecutor) driver;
        s.executeScript("arguments[0].click();",home.Data());
        home.Calendar().click();
        home.CerAmount().sendKeys("21,600.00");
        home.Bank().click();
        home.Bank1().sendKeys("اسوان المحطة");
        home.BanK2().click();
        home.BranchRef().sendKeys("اسوان");
        Thread.sleep(300);
        home.BranchRef().click();
        String path = home.attach();
        home.BankCerAttachRef().sendKeys(path+"\\Files\\Attachment.pdf");

        //String projectPath = System.getProperty("user.dir");
       // home.BankCerAttachRef().sendKeys(projectPath+"\\Files\\مرفق.jpg");


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

