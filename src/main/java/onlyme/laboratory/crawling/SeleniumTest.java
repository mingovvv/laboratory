package onlyme.laboratory.crawling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumTest {

    // 1. 드라이버 설치 경로
    public static String WEB_DRIVER_ID = "webdriver.chrome.driver";
    public static String WEB_DRIVER_PATH = "C:\\Users\\min\\Desktop\\테스트\\chromedriver.exe";

    public static void main(String[] args) throws InterruptedException {

        // WebDriver 경로 설정
        System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);

        // 2. WebDriver 옵션 설정
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-popup-blocking");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://nh.sinbiun.co.kr/InSaju.asp?bType=A027&bgID=2&tabID=2");
        TimeUnit.MILLISECONDS.sleep(2000);

        WebElement bSexM = driver.findElement(By.id("bSexF"));
        bSexM.click();

        WebElement selectBYear = driver.findElement(By.id("select_bYear"));
        Select select = new Select(selectBYear);
        select.selectByValue("1988");

        WebElement element = driver.findElement(By.id("btn_unse"));
        element.click();

        System.out.println(driver.getPageSource());


    }
    
}
