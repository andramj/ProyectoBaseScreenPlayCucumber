package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.OpenTheBrowser;
import userintefaces.paginaInicioAmazon;

public class searchAmazonStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver herBrowser;
    private Actor andres = Actor.named("Andres");
    private paginaInicioAmazon inicio;

    @Before
    public void setup() {
        andres.can(BrowseTheWeb.with(herBrowser));   // Se le asigna el driver al actor
    }

    Actor user = Actor.named("andres");

    @Given("I enter the amazon website")
    public void ingresoALaFaginaWeb() throws Exception {
        andres.wasAbleTo(OpenTheBrowser.at(inicio)); // Write code here that turns the phrase above into concrete actions

    }


    @When("I search the product '(.*)'")
    public void yaEsteEnLaPaginaWebMeLogueo(String arg1, String arg2) throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("I verify that the product '(.*)' exists")
    public void puedoRealizarElNuevoRegistro() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }

}
