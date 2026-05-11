package je_serenity.login.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class LoginMessage implements Question<Boolean> {

    private final String tipo;

    public LoginMessage(String tipo) {
        this.tipo = tipo;
    }

    public static LoginMessage exitoso() {
        return new LoginMessage("exito");
    }

    public static LoginMessage fallido() {
        return new LoginMessage("error");
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        var driver = BrowseTheWeb.as(actor).getDriver();
        if (tipo.equals("exito")) {
            return !driver.findElements(
                    org.openqa.selenium.By.cssSelector(".flash.success")
            ).isEmpty();
        } else {
            return !driver.findElements(
                    org.openqa.selenium.By.cssSelector(".flash.error")
            ).isEmpty();
        }
    }
}