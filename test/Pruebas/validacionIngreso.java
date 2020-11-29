package Pruebas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
/*import static pruebas_choucair.Pruebas_choucair.driver;*/

/**
 *
 * @author Tatiana Herrera
 */
public class validacionIngreso {
    
    private static WebDriver driver=null;
    
    public validacionIngreso() {
    }
    
    @BeforeClass
    public static void inicializarDriver(){
        System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    
    @Test
    public void flujoCorrectoIngreso(){
        
        driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
        driver.manage().window().maximize();
        WebElement usuario = driver.findElement(By.id("user_login"));
        usuario.sendKeys("opensourcecms");
        WebElement pass = driver.findElement(By.id("user_pass"));
        pass.sendKeys("opensourcecms");
        WebElement button = driver.findElement(By.name("wp-submit"));
        button.click(); 
        
        WebDriverWait wait = new WebDriverWait(driver,10);
        
    }
    
    /*@AfterClass
    public static void cerrarDriver(){
        driver.quit();
    }*/
    
}
