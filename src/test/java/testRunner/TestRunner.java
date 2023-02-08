package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

		//features={".\\Features\"}
        features= {"C:\\Users\\AadyaSharad\\eclipse-workspace\\cuc\\src\\test\\resources\\Features\\Login.feature"},
        //features= {"C:\\Users\\AadyaSharad\\eclipse-workspace\\cuc\\src\\test\\resources\\Features\\LoginDDT.feature"},
        //features= {"C:\\Users\\AadyaSharad\\eclipse-workspace\\cuc\\src\\test\\resources\\Features\\LoginDDTExcel.feature"},
        //features={".\\Features\Login.feature",".\\Features\AccountRegistration.feature"},
        //features="@C:\\Users\\AadyaSharad\\eclipse-workspace\\cuc\\target\\rerun.txt",  //only executes failure
        glue="stepDefinitions",
        plugin= {
        		"pretty", "html:reports/myreport.html", 
        		"json:reports/myreport.json",
        		"rerun:target/rerun.txt",
        		},    //Mandatory to capture failures
        dryRun=false,
        monochrome=true
       // tags = "@sanity"	//Scenarios tagged with @sanity,
       // tags = "@sanity and @regression"	//Scenarios tagged with both @sanity and @regression,
       // tags = "@sanity or @regression"	//Scenarios tagged with either @sanity or @regression,
       // tags = "@sanity and not @regression"	//Scenarios tagged with @sanity but not tagged with @regression,
      )
public class TestRunner 
{

}

