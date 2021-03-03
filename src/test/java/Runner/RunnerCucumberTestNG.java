package Runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features = { "src/test/resources/Feactures" }, // origen los archivos de caracteristica
		glue = { "src/test/java/StepDefinitions" } // origen de los pasos
)
public class RunnerCucumberTestNG {

	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpCucumber() {
		System.out.println("@BeforeClass...");
		try {
			testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@BeforeMethod(alwaysRun = true)
	public void setUpClass(String browser, String version, String platform) throws Exception {

	}

	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider(name = "features")
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}

//    @DataProvider(name="myFeatures")
//    public Object[][] getFeatures()
//    {
//        if(testNGCucumberRunner == null){
//            testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//        }
//        return testNGCucumberRunner.provideFeatures();
//    }

	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {
		testNGCucumberRunner.finish();
	}

//	private TestNGCucumberRunner testNGCucumberRunner;
//	
//	@BeforeClass(alwaysRun = true)
//	public void setupClass() {
//		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//	}
//	
//	@Test(groups = "cucumber", description = "Run cucumber feactures", dataProvider = "scenarios")
//	public void scenario(PickleEventWrapper pickleEvent, CucumberFeatureWrapper cucumberFeature) throws Throwable {
//		testNGCucumberRunner.runScenario(pickleEvent.getPickleEvent());
//	}
//	
//	@DataProvider
//	public Object[][] scenarios() {
//		return testNGCucumberRunner.provideScenarios();
//	}
//	
//	@AfterClass(alwaysRun = true)
//	public void finalizar() {
//		testNGCucumberRunner.finish();
//	}
//	
}
