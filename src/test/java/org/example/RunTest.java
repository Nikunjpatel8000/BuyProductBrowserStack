package org.example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//Run With use for Class will be Run.
@RunWith(Cucumber.class)
//CucumberOptions Use for path locate or tags run and create a report and store it.
@CucumberOptions(features = ".",tags = "@BuyProducts",format = {"pretty","html:target/Destination" , "json:target/Destination/cucumber.json"})

public class RunTest {


}
