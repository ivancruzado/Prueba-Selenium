package steps;

import io.cucumber.java.en.*;
import pages.GooglePage;


public abstract class GoogleSteps {
    GooglePage google = new GooglePage();

    @Given("navego a Google")
    public void navegarGoogle() {
        google.navegarGoogle();
    }

    @When("busco algo")
    public void buscoAlgo() {
        System.out.println("hola");
    }

    @Then("encuentro algo")
    public void encuentroAlgo() {
        System.out.println("hola");
    }
}
