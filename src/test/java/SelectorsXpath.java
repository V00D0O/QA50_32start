import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Random;


public class SelectorsXpath {
    WebDriver driver = new ChromeDriver();

    @Test
    public void iLcarroXpathTest(){
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ilcarro.web.app/search");
        driver.findElement(By.xpath("//a[text()=' Log in ']")).click();


        WebElement emailField = driver.findElement(
                By.xpath("//input[@id='email']")
        );

        WebElement passwordField = driver.findElement(
                By.xpath("//input[@id='password']")
        );

        WebElement loginButton = driver.findElement(
                By.xpath("//button[@type='submit']")
        );

        emailField.sendKeys("car116qa@test.com");
        passwordField.sendKeys("116carQa!");
        loginButton.click();


        driver.findElement(By.xpath("//a[text()=' Logout ']")).click();

        driver.findElement(By.xpath("//a[text()=' Home ']")).click();

        driver.quit();
    }

@Test
    public void phonebookTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://telranedu.web.app/home");
//        WebElement btnAbout = driver.findElement(By
//                .cssSelector("a[href='/about']"));
        WebElement btnAbout = driver.findElement(By.
                xpath("//a[@href='/about']"));
        //  //*[@href='/about']
        //  //*[text()='ABOUT']
        btnAbout.click();
        //SelectorsCss.pause(3);
        pause(3);

        WebElement btnLogin = driver.findElement(By.
                xpath("//*[text()='LOGIN']"));
        btnLogin.click();
        WebElement fieldEmail = driver.findElement(By
                .xpath("//input[@placeholder='Email']"));
        int i = new Random().nextInt(1000);
        fieldEmail.sendKeys("qakjiuoy" + i + "@gmail.com");
        pause(3);
        WebElement fieldPassword = driver.findElement(By.
                xpath("//*[@name='password']"));
        fieldPassword.sendKeys("Password123!");
        pause(3);
        WebElement btnRegistration = driver.findElement(By.
                xpath("//*[@name='registration']"));
        btnRegistration.click();
        pause(3);
        WebElement btnSignOut = driver.findElement(By.
                xpath("//button[text()='Sign Out']"));
        btnSignOut.click();
        pause(3);
        List<WebElement> buttons = driver.findElements
                (By.xpath("//button"));
        System.out.println(buttons);
        System.out.println(buttons.get(1).getText());


    }

    public void pause(int time) {
        try {
            Thread.sleep(time * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}