package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import starter.navigation.NavigateTo;
import starter.task.BuscarProducto;
import starter.ui.productUI;

import java.util.List;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AgregarProductoStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());}

    @Given("un usuario busca un producto de su interes")
    public void un_usuario_busca_un_producto_de_su_interes() {
        theActorCalled("Usuario").attemptsTo(NavigateTo.FalabellaHomePage());
    }

    @When("selecciona el producto y lo agrega al carrito de compras")
    public void selecciona_el_producto_y_lo_agrega_al_carrito_de_compras(DataTable dataTable) throws InterruptedException {
        List<String> listProductos = dataTable.asList(String.class);
        String producto = listProductos.get(1);
        theActorCalled("Usuario").attemptsTo(BuscarProducto.conProducto(producto));
    }

    @Then("el producto queda pendiente por confirmacion de pago")
    public void el_producto_queda_pendiente_por_confirmacion_de_pago() {
        WebElementQuestion.the(productUI.BUTTON_SEGUIR_COMPRANDO).answeredBy(theActorInTheSpotlight()).isPresent();
    }
}
