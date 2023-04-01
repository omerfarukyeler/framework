package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


        plugin = {"json:target/cucumber.json",
                "htlm:target/cucumber-default-report",
                "rerun:target/failed.txt"},//burası raporları nereye çıkarcağını söylüyor .bunları target dosyasının içine atar .


        features ="src/test/resources/UI_Features",
        glue="src/test/java/stepdefinitions",
        tags="@googletest",
        dryRun = false
)





public class Runner {




}
