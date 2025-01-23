package Nuca_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Hooks {
    WebDriver driver;

    @BeforeTest
    public void openBrowse() {
        System.setProperty("webdriver.chrome.driver","D:\\Nuca_Project1\\src\\main\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.navigate().to("http://10.3.1.120:7110/");
    }

    @BeforeTest
    public void openBrowse1() {
        System.setProperty("webdriver.chrome.driver","D:\\Nuca_Project1\\src\\main\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.navigate().to("http://10.3.1.120:7110/");
    }
    @BeforeTest
    public void openBrowse2() {
        System.setProperty("webdriver.chrome.driver","D:\\Nuca_Project1\\src\\main\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.navigate().to("http://10.3.1.120:7110/");
    }
    }





