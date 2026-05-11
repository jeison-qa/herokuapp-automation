package je_serenity.login.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static Target campoUsuario = Target.the("campo usuario").locatedBy("//input[@id='username']");
    public static Target campoClave   = Target.the("campo clave").locatedBy("//input[@id='password']");
    public static Target botonLogin   = Target.the("boton login").locatedBy("//button[@type='submit']");
    public static Target mensajeExito = Target.the("mensaje exito").locatedBy("//div[@class='flash success']");
    public static Target mensajeError = Target.the("mensaje error").locatedBy("//div[@class='flash error']");
}