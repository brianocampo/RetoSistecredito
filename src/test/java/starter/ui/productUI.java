package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class productUI {

    public static final Target BUTTON_AGREGAR_BOLSA = Target.the("Boton de agregar producto a la bolsa").located(By.xpath("//*[@id=\"buttonForCustomers\"]/button"));
    public static final Target BUTTON_SEGUIR_COMPRANDO = Target.the("Boton de seguir comprando").located(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div/div/div[3]/div/button"));

}
