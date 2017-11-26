package JUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



@RunWith(Suite.class)
@SuiteClasses({Junit_First.class,
				JUnit_Second.class,JUnit_Third.class})

public class BatchRunner {

}
