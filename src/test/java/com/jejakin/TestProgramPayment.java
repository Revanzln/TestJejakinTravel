package com.jejakin;

import com.jejakin.pages.ProgramPayment;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentTest;

public class TestProgramPayment {
    static WebDriver driver;
    static ExtentTest extentTest;
    static ProgramPayment programPayment = new ProgramPayment();

    public TestProgramPayment(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User click planting program")
    public void user_click_panting_program() {
        programPayment.pilihProgram();
        extentTest.log(LogStatus.PASS, "User click planting program");
    }
    @And("User enter nama")
    public void user_enter_nama() {
        programPayment.inputNama("Budi");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User enter nama");
    }
    @And("User enter email")
    public void user_enter_email() {
        programPayment.inputEmail("budi@gmail.com");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User enter email");
    }
    @And("User click payment methode")
    public void click_payment_methode() {
        programPayment.selectPaymentMethode();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click payment methode");
    }
    @And("User click Qris methode")
    public void user_click_qris_methode() {
        programPayment.selectPaymentQris();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "User click Qris methode");
    }
    @And("User click checkbox I agree")
    public void user_click_checkbox() {
        programPayment.clickCheckBox();
        extentTest.log(LogStatus.PASS, "User click checkbox I agree");
    }
    @And("User click pay offset")
    public void user_click_pay_offset () {
        programPayment.clickbtnPayOffset();
        Hooks.delay(10);
        extentTest.log(LogStatus.PASS,"User click pay offset");
    }

}
