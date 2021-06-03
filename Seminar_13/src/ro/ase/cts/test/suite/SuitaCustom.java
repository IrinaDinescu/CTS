package ro.ase.cts.test.suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.test.Grupa2Test;
import ro.ase.cts.test.GrupaTest;
import ro.ase.cts.test.TestCaseDummy;
import ro.ase.cts.test.TestCaseStubPromovabilitateGrupa;
import ro.ase.cts.test.fake.GrupaTestWithFake;
import ro.ase.cts.test.suite.categorii.TesteGetPromovabilitate;
import ro.ase.cts.test.suite.categorii.TesteNormale;

@RunWith(Categories.class)
@SuiteClasses({GrupaTest.class, Grupa2Test.class, TestCaseDummy.class, GrupaTestWithFake.class, TestCaseStubPromovabilitateGrupa.class})
@IncludeCategory({TesteGetPromovabilitate.class})
@ExcludeCategory({TesteNormale.class})
public class SuitaCustom {

}
