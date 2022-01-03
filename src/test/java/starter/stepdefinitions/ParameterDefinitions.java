package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.ParameterType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.models.Producto;

import java.util.Map;

public class ParameterDefinitions {

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    @DataTableType
    public Producto productoCodificado(Map<String,String> data){
       return new Producto(data.get("tipoProducto"));
   }

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
}
