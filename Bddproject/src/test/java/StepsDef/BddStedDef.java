package StepsDef;

import Implimentation.Imp;
import io.cucumber.java.en.Given;

public class BddStedDef {
	@Given("I enter the {string}")
	public void iEnterUsername(String user) {
		
	Imp.iEnterUsername(user);
	}

}
