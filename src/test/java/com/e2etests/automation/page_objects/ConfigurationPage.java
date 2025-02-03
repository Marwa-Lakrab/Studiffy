package com.e2etests.automation.page_objects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class ConfigurationPage {

	private ConfigFileReader configfilereader;
	private Actions actions;

	@FindBy(how = How.XPATH, using = "//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-3nac8f']")
	public static WebElement BtnConfiguration;

	@FindBy(how = How.NAME, using = "name")
	public static WebElement name;

	@FindBy(how = How.NAME, using = "duree")
	public static WebElement duree;

	@FindBy(how = How.NAME, using = "heureDeDebut")
	public static WebElement Hdebut;

	@FindBy(how = How.NAME, using = "heureDeDebutApresMidi")
	public static WebElement Hdebutapresmidi;

	@FindBy(how = How.NAME, using = "heureDeFinApresMidi")
	public static WebElement Hfinapresmidi;

	@FindBy(how = How.NAME, using = "heureDeDebutDej")
	public static WebElement Hdebutdej;

	@FindBy(how = How.NAME, using = "heureDeFinDej")
	public static WebElement Hfindej;

	@FindBy(how = How.NAME, using = "pauses[0].start")
	public static WebElement Hdebutpause;

	@FindBy(how = How.NAME, using = "pauses[0].end")
	public static WebElement Hfinpause;

	public ConfigurationPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configfilereader = new ConfigFileReader();
		this.actions = new Actions(Setup.getDriver());

	}

//	public void clickBtnAjouter() {
//		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(10));
//		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("BtnConfiguration")));
//		Setup.getDriver().navigate().refresh();
//		actions.moveToElement(BtnConfiguration).perform();
//		BtnConfiguration.click();
//	}

}
