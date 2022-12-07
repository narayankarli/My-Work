package test_script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic_Script.Base_Test;
import generic_Script.Generic_Excel;
import pom_script.Pom_Facebook;


public class TestScript1 extends Base_Test {
@Test		
public void Script() throws EncryptedDocumentException, IOException, InterruptedException
{
	String username = Generic_Excel.getData("Sheet1", 0, 0);
	String password = Generic_Excel.getData("Sheet1", 1, 0);
	
	Pom_Facebook pmc=new Pom_Facebook(driver);
	pmc.Username(username);
	pmc.Password(password);
	pmc.LoginClick();
	Thread.sleep(8000);
	}
}
