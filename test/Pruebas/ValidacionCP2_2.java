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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Tatiana Herrera
 */
public class ValidacionCP2_2 {
    private static WebDriver driver=null;
    public ValidacionCP2_2() {
    }
    @BeforeClass
    public static void inicializarDriver(){
        System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void evento_Comments(){
        driver.get("https://s1.demo.opensourcecms.com/wordpress/?page_id=3&preview=true");	
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.MINUTES);
        driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-admin/post.php?post=3&action=edit");
        WebElement usuario = driver.findElement(By.id("user_login"));
        usuario.sendKeys("opensourcecms");
        WebElement pass = driver.findElement(By.id("user_pass"));
        pass.sendKeys("opensourcecms");
        WebElement button = driver.findElement(By.name("wp-submit"));
        button.click(); 
        WebElement edit = driver.findElement(By.id("post-title-0"));
        edit.sendKeys("Prueba Tatiana Herrera");
        
    }
}
