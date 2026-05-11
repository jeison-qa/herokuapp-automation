package je_serenity.login.tasks;

import je_serenity.login.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {

    private final String usuario;
    private final String clave;

    public Login(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public static Login conCredenciales(String usuario, String clave) {
        return instrumented(Login.class, usuario, clave);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginPage.campoUsuario, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(usuario).into(LoginPage.campoUsuario),
                Enter.theValue(clave).into(LoginPage.campoClave),
                Click.on(LoginPage.botonLogin)
        );
    }
}