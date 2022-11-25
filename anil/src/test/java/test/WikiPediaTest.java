package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WikiPediaTest extends BaseTest {
 @Test(priority=1)
 public void rel() {
	 wikipedia.wikipedias();
	 AssertJUnit.assertEquals(wikipedia.country(), "India");
 }
 
 @Test(priority=2)
 public void date() {
	
	 AssertJUnit.assertEquals(wikipedia.relDate(), "17 December 2021");
 }
 
}
