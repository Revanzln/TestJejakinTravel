package com.jejakin.pages;

import com.jejakin.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgramPayment {
    private WebDriver driver;
    public ProgramPayment() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h1[normalize-space()='Mangrove Edupark Area Tambakrejo']")
    WebElement clickProgram;
    public void pilihProgram() {clickProgram.click();}
    @FindBy(xpath = "//input[@id='input-fullname']")
    WebElement enterNama;
    public void inputNama(String Nama) {enterNama.sendKeys(Nama);}
    @FindBy(xpath = "//input[@id='input-email']")
    WebElement enterEmail;
    public void inputEmail(String Email) {enterEmail.sendKeys(Email);}
    @FindBy(xpath = "//div[@id='card-select-payment']")
    WebElement selectPayment;
    public void selectPaymentMethode(){selectPayment.click();}
    @FindBy(xpath = "//h1[normalize-space()='QRIS']")
    WebElement selectQris;
    public void selectPaymentQris(){selectQris.click();}
    @FindBy(xpath = "//label[@class='tx-note']")
    WebElement checkBox;
    public void clickCheckBox(){checkBox.click();}
    @FindBy(xpath = "//button[@class='dflex mx-auto btn-ovo Button_pay__kSx3m Button_btn___hqnz Button_btnGreen__k7VCG Button_btnBlock__2xQWD']")
    WebElement btnPayOffset;
    public void clickbtnPayOffset(){btnPayOffset.click();}
}
