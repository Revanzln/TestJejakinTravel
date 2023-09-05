package com.jejakin.pages;

import com.jejakin.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseRoute {
    private WebDriver driver;
    public ChooseRoute() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[2]/div[1]/div/div/div/div[1]/div[2]/span")
    WebElement clickRoute;
    public void pointerChoose() {clickRoute.click();}
    @FindBy(xpath = "//div[normalize-space()='Bandar Udara Internasional Soekarno Hatta']")
    WebElement Keberangkatan;
    public void pilihKeberangkatan() {Keberangkatan.click();}
    @FindBy(xpath = "//div[normalize-space()='Bandar Udara Internasional Juanda']")
    WebElement Kedatangan;
    public void pilihKedatangan() {Kedatangan.click();}
    @FindBy(xpath = "//button[@class='dflex mt-auto mx-auto Button_btn___hqnz Button_btnBlock__2xQWD Button_btnGreen__k7VCG Button_btnBlock__2xQWD']")
    WebElement btnAction;
    public void tombolAction(){btnAction.click();}

}
