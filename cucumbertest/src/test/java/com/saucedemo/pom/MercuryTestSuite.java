package com.saucedemo.pom;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Register_Test.class, SingIn_Test.class })
public class MercuryTestSuite {

}
