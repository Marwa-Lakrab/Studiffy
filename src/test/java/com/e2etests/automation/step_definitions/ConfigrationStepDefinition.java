package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.ConfigurationPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConfigrationStepDefinition {
	
	
    private ConfigurationPage configurationPage;
    
    public ConfigrationStepDefinition() {
//    	this.configurationPage = new ConfigurationPage();
    }

	@When("Je clique sur Planification")
	public void jeCliqueSurPlanification() {
//		configurationPage.clickBtnAjouter();
	  
	}
	@When("Je Clique sur Configuration")
	public void jeCliqueSurConfiguration() {
	   
	}

	@When("Je clique sur le bouton Ajouter configuration")
	public void jeCliqueSurLeBoutonAjouterConfiguration() {
	   
	}

	@When("Je saisis le nom {string}")
	public void jeSaisisLeNom(String string) {
	    
	}
	@When("Je saisis Durée {string}")
	public void jeSaisisDurée(String string) {
	    
	}
	@When("Je saisis l heure de debut matin {string}")
	public void jeSaisisLHeureDeDebutMatin(String string) {
	    
	}
	@When("Je saisis l heure de fin matin {string}")
	public void jeSaisisLHeureDeFinMatin(String string) {
	  
	}
	@When("Je choisis les jours {string} {string}")
	public void jeChoisisLesJours(String string, String string2) {
	    
	}
	@When("Je saisis l heure de debut apres midi {string}")
	public void jeSaisisLHeureDeDebutApresMidi(String string) {
	   
	}
	@When("Je saisis l heure de fin apres midi {string}")
	public void jeSaisisLHeureDeFinApresMidi(String string) {
	   
	}
	@When("Je saisis l heure de debut pause dejeuner {string}")
	public void jeSaisisLHeureDeDebutPauseDejeuner(String string) {
	    
	}
	@When("Je saisis l heure de fin pause dejeuner {string}")
	public void jeSaisisLHeureDeFinPauseDejeuner(String string) {
	   
	}
	@When("Je saisis l heure de debut pause {string}")
	public void jeSaisisLHeureDeDebutPause(String string) {
	    
	}
	@When("Je saisis l heure de fin pause {string}")
	public void jeSaisisLHeureDeFinPause(String string) {
	   
	}
	@When("Je clique sur le bouton Ajouter")
	public void jeCliqueSurLeBoutonAjouter() {
	    
	}
	@When("Je clique sur bouton ok du pop up")
	public void jeCliqueSurBoutonOkDuPopUp() {
	    
	}
	@Then("une nouvelle configuration s affiche dans la liste des configuration {string}")
	public void uneNouvelleConfigurationSAfficheDansLaListeDesConfiguration(String string) {
	  
	}



}
