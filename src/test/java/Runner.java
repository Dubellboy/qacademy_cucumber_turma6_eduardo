import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
                 tags = "@Test001",
                 plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
                 publish = true, //Relatório do Cucumber
                 stepNotifications = true//Mostrar cada step

)
public class Runner {

}
