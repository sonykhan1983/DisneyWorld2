package com.PageObjectModdel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

public class PageObjectModel {
	WebDriver driver;
	public PageObjectModel (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

@FindBy (xpath= "//a[@class='signIn']")
private WebElement SigninorCreatButton;
public WebElement getSigninorCreatButton() {
	return SigninorCreatButton;
}

@FindBy (xpath= "//input[@id='loginPageUsername']")
private WebElement Username;
public WebElement getUsername() {
	return Username;
}

@FindBy (xpath= "//input[@id='loginPagePassword']")
private WebElement PassWord;
public WebElement getPassWord() {
	return PassWord;
}
@FindBy (xpath= "//button[@id='loginPageSubmitButton']")
private WebElement Submit;
public WebElement getSubmit() {
	return Submit;
}

@FindBy (xpath= "//div[@id='tripDatesContainer']")
private WebElement CkekcinButton;
public WebElement getCkekcinButton() {
	return CkekcinButton;
}

@FindBy (xpath= "//button[@id='3_13_2019']")
private WebElement CkeckInDate;
public WebElement getCkeckInDate() {
	return CkeckInDate;
}

@FindBy (xpath= "//button[@id='3_29_2019']")
private WebElement CheckOutDate;
public WebElement getCheckOutDate() {
	return CheckOutDate;
}

@FindBy (xpath= "(//button[@class='button'])[1]")
private WebElement AdutButton;
public WebElement getAdutButton() {
	return AdutButton;
}

@FindBy (xpath= "(//button[@class='button'])[4]")
private WebElement ChildButton;
public WebElement getChildButton() {
	return ChildButton;
}

@FindBy (xpath= "(//button[@class='btn btn-default dropdown-toggle'])[1]")
private WebElement ChidlAge;
public WebElement getChidlAge() {
	return ChidlAge;
}

@FindBy (xpath= "//a[@aria-label='16']")
private WebElement ButtonAge16;
public WebElement getButtonAge16() {
	return ButtonAge16;
}

@FindBy (xpath= "(//div[@class='form-group standard has-value'])[2]")
private WebElement ResortHotel;
public WebElement getResortHotel() {
	return ResortHotel;
}

@FindBy (xpath= "(//span[@class='option-text  ng-binding'])[7]")
private WebElement BeachClubVillas;
public WebElement getBeachClubVillas() {
	return BeachClubVillas;
}

@FindBy (xpath= "//div[@id='accessibleContainer']")
private WebElement RmsButton;
public WebElement getRmsButton() {
	return RmsButton;
}

@FindBy (xpath="//div[@id='findPricesContainer']")
private WebElement FrinfResort;
public WebElement getFrinfResort() {
	return FrinfResort;
}
public void mshover(){
Actions ac = new Actions(driver);
WebElement we = driver.findElement(By.xpath("(//a[@class='gnbCategoryTitle'])[1]"));
ac.moveToElement(we).moveToElement(driver.findElement(By.xpath("//a[@name='&lid=WDW_Header_ParksTickets_Epcot']"))).click().build().perform();
}
public void SS (WebDriver driver) throws Throwable{
	
	TakesScreenshot tkss = (TakesScreenshot) driver;
	File fl = tkss.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(fl,new File("/Users/rashelkhan/eclipse-workspace/DisneyWorld/Screenshot/"+".jpg"));
}
}
	/*
	 * public void dd() {
	 * 
	 * Select select = new Select(driver.findElement(By.xpath("")));
	 * select.selectByVisibleText(""); WebElement selected =
	 * select.getFirstSelectedOption(); System.out.println(selected.getText());
	 * 
	 * }
	 */


	/*
	 * @FindBy (xpath= "//span[@class='pillBase primary']") private WebElement
	 * 
	 * @FindBy (xpath= "//span[@class='pillBase primary']") private WebElement
	 * 
	 * @FindBy (xpath= "//span[@class='pillBase primary']") private WebElement
	 * 
	 * @FindBy (xpath= "//span[@class='pillBase primary']") private WebElement
	 */

