package us.stqa.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import us.stqa.addressbook.appmanager.ContactHelper;
import us.stqa.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().goToHomePage();;
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Sample first name", "Sample Middle name", "Sample Last name", "Nickname", "Title", "Company", "Sample address 1234", "+155566677788", "\\9", "sampleemail@comapnay.com"));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();
  }
}
