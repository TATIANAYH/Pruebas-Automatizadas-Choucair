/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Tatiana Herrera
 */
public class validacionCP1_7 {
    private static WebDriver driver=null;
    JavascriptExecutor js = (JavascriptExecutor) driver;
    public validacionCP1_7() {
    }
    @BeforeClass
    public static void inicializarDriver(){
        System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void evento_Comments(){
        driver.get("https://s1.demo.opensourcecms.com/wordpress/2018/10/02/hello-world/");	
        driver.manage().window().maximize();
        js.executeScript("window.scrollBy(1,1000)");
        driver.get("https://s1.demo.opensourcecms.com/wordpress/comments/feed/");

    }
}