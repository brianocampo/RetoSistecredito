package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.indexUI;
import starter.ui.productUI;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarProducto implements Task {

    private final String producto;

    public BuscarProducto(String producto){
        this.producto=producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(producto).into(indexUI.INPUT_QUE_BUSCA));
        actor.attemptsTo(Click.on(indexUI.BUTTON_BUSCAR));
        actor.attemptsTo(Click.on(indexUI.LINK_PRIMER_PRODUCTO));
        actor.attemptsTo(Click.on(productUI.BUTTON_AGREGAR_BOLSA));
    }

    public static Performable conProducto(String producto){
        return instrumented(BuscarProducto.class,producto);
    }

}
