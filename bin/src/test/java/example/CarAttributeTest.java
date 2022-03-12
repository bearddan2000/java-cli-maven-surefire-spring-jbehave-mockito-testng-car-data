package example;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import org.testng.Assert;
import org.mockito.InjectMocks;

public class CarAttributeTest {

  @InjectMocks
  example.service.CarService service = new example.service.CarServiceImpl();

  example.model.Car car;

  @When("Car created")
  public void createCar() {
     car = service.createCar();
  }

  @Then("Car price should be 0.0")
  public void checkPrice() {
     Assert.assertEquals(car.getPrice(), 0.0);
  }

  @Then("Car model should be test")
  public void checkModel() {
     Assert.assertEquals(car.getModel(), "test");
  }

  @Then("Car year should be 0")
  public void checkYear() {
     Assert.assertEquals(car.getYear(), 0);
  }

  @Then("Car make should be test")
  public void checkMake() {
    Assert.assertEquals(car.getMake(), "test");
  }

}
