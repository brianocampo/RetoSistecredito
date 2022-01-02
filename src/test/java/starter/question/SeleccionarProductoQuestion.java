package starter.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.productUI;

public class SeleccionarProductoQuestion implements Question {

    public SeleccionarProductoQuestion(){}

    @Override
    public Boolean answeredBy(Actor actor){
        return productUI.BUTTON_SEGUIR_COMPRANDO.resolveFor(actor).isPresent();
    }

    public static Question<Boolean> resultado(){
        return (Question<Boolean>) new SeleccionarProductoQuestion();
    }
}
