/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Tatiana Herrera
 */
public class validacionCP1_2 {
    private static WebDriver driver=null;
    public validacionCP1_2() {
    }
    
    @BeforeClass
    public static void inicializarDriver(){
        System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    
    @Test
    public void flujoCorrectoFecha(){
        driver.get("https://s1.demo.opensourcecms.com/wordpress/2018/10/02/hello-world/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("October 2, 2018")).click();
        WebDriverWait wait = new WebDriverWait(driver,15);
        
    }
    
   /* @AfterClass
    public static void cerrarDriver(){
        driver.quit();
    }*/
}
