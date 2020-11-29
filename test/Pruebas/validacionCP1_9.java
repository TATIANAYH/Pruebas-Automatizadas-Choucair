/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Tatiana Herrera
 */
public class validacionCP1_9 {
    private static WebDriver driver=null;
    JavascriptExecutor js = (JavascriptExecutor) driver;
    public validacionCP1_9() {
    }
    @BeforeClass
    public static void inicializarDriver(){
        System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void evento_Comments(){
        driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
        WebElement usuario = driver.findElement(By.id("user_login"));
        usuario.sendKeys("opensourcecms");
        WebElement pass = driver.findElement(By.id("user_pass"));
        pass.sendKeys("opensourcecms");
        WebElement button = driver.findElement(By.name("wp-submit"));
        button.click(); 
        driver.manage().window().maximize();
        driver.get("https://s1.demo.opensourcecms.com/wordpress/2018/10/02/hello-world/");	
        WebElement caja = driver.findElement(By.id("comment"));
        caja.sendKeys("Pruebas Automatizadas por Tatiana Herrera");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.MINUTES);
        
        WebElement bu = driver.findElement(By.name("submit"));
        bu.click(); 
        //driver.findElement(By.linkText("javascript:history.back()")).click();
    }
            
}
