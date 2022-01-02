package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable FalabellaHomePage() {
        return Task.where("Abrir pagina principal de Falabella",
                Open.browserOn().the(FalabellaHomePage.class));
    }
}
