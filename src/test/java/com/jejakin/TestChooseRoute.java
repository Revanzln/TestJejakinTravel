package com.jejakin;

import com.jejakin.pages.ChooseRoute;
import com.jejakin.utils.Constants;
import com.jejakin.utils.Utils;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.print.DocFlavor;
import java.net.URLConnection;

public class TestChooseRoute {
    static WebDriver driver;
    static ExtentTest extentTest;
    static ChooseRoute chooseRoute = new ChooseRoute();
    public TestChooseRoute(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("User enter url jejakin")
    public void user_enter_url_jejakin(){
        driver.get(Constants.URL);
        Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS,"User enter url jejakin");
    }
    @And("User click chosse route")
    public void user_choose_route(){
        chooseRoute.pointerChoose();
        extentTest.log(LogStatus.PASS,"User click chosse route");
    }
    @And("User pilih keberangkatan")
    public void user_pilih_keberangkatan(){
        chooseRoute.pilihKeberangkatan();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS,"User pilih keberangkatan");
    }
    @And("User pilih kedatangan")
    public void user_pilih_kedatangan(){
        chooseRoute.pilihKedatangan();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS,"User pilih kedatangan");
    }
    @Then("User click tombol action")
    public void user_click_tombol_action() {
        chooseRoute.tombolAction();
        extentTest.log(LogStatus.PASS, "User click tombol action");
    }
}
