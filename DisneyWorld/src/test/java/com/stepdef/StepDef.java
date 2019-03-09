package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.PageObjectModdel.PageObjectModel;
import com.common.Common;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
WebDriver driver;
PageObjectModel pf;

@Given("^Open Browser$")
public void open_Browser() throws Throwable {
 driver=Common.getbrowser("chrome",driver);
    
}

@When("^go to Disney Home Page$")
public void go_to_Disney_Home_Page() throws Throwable {
driver.get(Common.getGetURL());
pf=PageFactory.initElements(driver,PageObjectModel.class);
    
}

@When("^I CLick on Sing In or Create Account$")
public void i_CLick_on_Sing_In_or_Create_Account() throws Throwable {
 pf.getSigninorCreatButton().click(); 
    
}

@When("^Put Username \"([^\"]*)\"$")
public void put_Username(String arg1) throws Throwable {
 pf.getUsername().sendKeys("login_practice@yahoo.com");  
    
}

@When("^Put Password \"([^\"]*)\"$")
public void put_Password(String arg1) throws Throwable {
pf.getPassWord().sendKeys("Disney007");  
    
}
@When("^Click on submit button$")
public void click_on_submit_button() throws Throwable {
pf.getSubmit().click();	
}

@When("^Click on Ckekcin button$")
public void click_on_Ckekcin_button() throws Throwable {
 pf.getCkekcinButton().click(); 
    
}

@When("^Click on Ckeck in date$")
public void click_on_Ckeck_in_date() throws Throwable {
pf.getCkeckInDate().click();
    
}

@When("^Click on Check out date$")
public void click_on_Check_out_date() throws Throwable {
pf.getCheckOutDate().click();  
    
}

@When("^Click on -adult button$")
public void click_on_adult_button() throws Throwable {
pf.getAdutButton().click();   
    
}

@When("^Click on \\+child Button$")
public void click_on_child_Button() throws Throwable {
 pf.getChildButton().click();  
    
}

@When("^Click on child Age button$")
public void click_on_child_Age_button() throws Throwable {   
pf.getChidlAge().click();    
}

@When("^select child age (\\d+)$")
public void select_child_age(int arg1) throws Throwable {
 pf.getButtonAge16().click();  
    
}

@When("^Click on Resort Hotel button$")
public void click_on_Resort_Hotel_button() throws Throwable {
pf.getResortHotel().click();  
    
}

@When("^Select Diseny's Beach Club Villas$")
public void select_Diseny_s_Beach_Club_Villas() throws Throwable {
pf.getBeachClubVillas().click();   
    
}

@When("^Click onAccessible Rooms button$")
public void click_onAccessible_Rooms_button() throws Throwable {
pf.getRmsButton().click();
    
}

@When("^Click on Find Resort$")
public void click_on_Find_Resort() throws Throwable {
pf.getFrinfResort().click();   
    
}

@When("^Mouse hover on parks&tickets$")
public void mouse_hover_on_parks_tickets() throws Throwable {
pf.mshover();
pf.SS(driver);
    
}

@When("^Click on Epcot$")
public void click_on_Epcot() throws Throwable {
  
    
}

@Then("^It sould Navigate me to the Disney's Beach Club Villas page$")
public void it_sould_Navigate_me_to_the_Disney_s_Beach_Club_Villas_page(DataTable arg1) throws Throwable {
   
   
    
}


}
