import Report.Report;
import TestCases.SampleTestCase;
import TestCases.SampleTestCase4;
import TestCases.facebookLogIn;

/**
 * @author akarim
 * 
 *         Main Class where All needed Testcases are used if Junit is not used.
 */
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Report report = Report.getInstance();

		SampleTestCase tc = new SampleTestCase();
		SampleTestCase4 tc4 = new SampleTestCase4();
		facebookLogIn fbTest = new facebookLogIn();
		try {
			fbTest.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		report.flush();
	}

}