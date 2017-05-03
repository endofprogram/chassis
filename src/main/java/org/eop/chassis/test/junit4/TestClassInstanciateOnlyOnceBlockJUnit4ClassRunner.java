package org.eop.chassis.test.junit4;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;
/**
 * @author lixinjie 2017-04-12
 */
public class TestClassInstanciateOnlyOnceBlockJUnit4ClassRunner extends BlockJUnit4ClassRunner {

	protected Object testClassInstance;
	
	public TestClassInstanciateOnlyOnceBlockJUnit4ClassRunner(Class<?> klass) throws InitializationError {
		super(klass);
	}

	@Override
	protected Object createTest() throws Exception {
		if (testClassInstance == null) {
			testClassInstance = super.createTest();
		}
		return testClassInstance;
	}
}
