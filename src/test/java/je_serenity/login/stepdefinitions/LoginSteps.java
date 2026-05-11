package je_serenity.login.stepdefinitions;

import je_serenity.login.questions.LoginMessage;
import je_serenity.login.tasks.Login;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginSteps {

    @Managed
    WebDriver driver;

    Actor usuario;

    @Before
    public void prepararActor() {
        usuario = Actor.named("Usuario");
        usuario.can(BrowseTheWeb.with(driver));
    }

    @Given("el usuario abre la pagina de login")
    public void abrirLogin() {
        usuario.attemptsTo(
                Open.url("https://the-internet.herokuapp.com/login")
        );
    }

    @When("ingresa usuario {string} y clave {string}")
    public void ingresarCredenciales(String user, String clave) {
        usuario.attemptsTo(
                Login.conCredenciales(user, clave)
        );
    }

    @Then("debe ver el mensaje de bienvenida")
    public void verificarExito() {
        usuario.should(
                seeThat(LoginMessage.exitoso(), equalTo(true))
        );
    }

    @Then("debe ver un mensaje de error")
    public void verificarError() {
        usuario.should(
                seeThat(LoginMessage.fallido(), equalTo(true))
        );
    }
}