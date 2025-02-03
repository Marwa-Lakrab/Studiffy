package com.e2etests.automation.step_definitions;

import org.junit.After;

import com.e2etests.automation.page_objects.AuthentificationStudiffyPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationStudiffyStepDefinition {
	
	private ConfigFileReader configfilereader;
	private AuthentificationStudiffyPage authentificationStudiffyPage;
	
	public AuthentificationStudiffyStepDefinition(){
		this.configfilereader = new ConfigFileReader();
		this.authentificationStudiffyPage = new AuthentificationStudiffyPage();
	}

	@Given("Je me connecte sur l application Studiffy")
	public void jeMeConnecteSurLApplicationStudiffy() {
		Setup.getDriver().get(configfilereader.getProperties("Studiffy.url"));
	}
	@When("Je saisis l adresse mail {string}")
	public void jeSaisisLAdresseMail(String email) {
		authentificationStudiffyPage.fillEmail(email);
	}
	@When("Je saisis le motde passe {string}")
	public void jeSaisisLeMotdePasse(String password) {
		authentificationStudiffyPage.fillPassword(password);
	}
	@When("Je clique sur le bouton se connecter")
	public void jeCliqueSurLeBoutonSeConnecter() {
		authentificationStudiffyPage.clickBtnSeConnecter();
	}
	@Then("Je me redirige vers la page Dashbord {string}")
	public void jeMeRedirigeVersLaPageDashbord(String text) {
//		authentificationStudiffyPage.checkURLChanged();
		
	}
//	{authentificationStudiffyPage.refreshPage();}

}
