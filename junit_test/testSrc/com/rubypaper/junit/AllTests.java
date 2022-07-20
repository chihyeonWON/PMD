package com.rubypaper.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MyStackTest.class, MyVectorTest.class })
public class AllTests {

}
