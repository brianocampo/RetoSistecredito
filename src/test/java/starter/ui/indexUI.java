package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class indexUI {

    public static final Target BUTTON_BUSCAR = Target.the("Boton de buscador de productos").located(By.className("SearchBar-module_searchBtnIcon__6KVum"));
    public static final Target INPUT_QUE_BUSCA = Target.the("Buscardor de productos").located(By.id("testId-SearchBar-Input"));
    public static final Target LINK_PRIMER_PRODUCTO = Target.the("Primer producto listado").located(By.xpath(".//*/section[2]/div/div[2]/div[1]/div/div[1]/div[1]/a"));


}
