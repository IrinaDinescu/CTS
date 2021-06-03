package ro.ase.cts.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.test.Grupa2Test;
import ro.ase.cts.test.GrupaTest;
import ro.ase.cts.test.TestCaseDummy;
import ro.ase.cts.test.TestCaseStubPromovabilitateGrupa;
import ro.ase.cts.test.fake.GrupaTestWithFake;

@RunWith(Suite.class)
@SuiteClasses({GrupaTest.class, Grupa2Test.class, TestCaseDummy.class, GrupaTestWithFake.class, TestCaseStubPromovabilitateGrupa.class})
public class SuitaCompleta {
	
	

}
