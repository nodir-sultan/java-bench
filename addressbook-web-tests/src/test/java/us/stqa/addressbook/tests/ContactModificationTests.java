package us.stqa.addressbook.tests;

import org.testng.annotations.Test;
import us.stqa.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getNavigationHelper().goToHomePage();
    app.getContactHelper().selectContact("0");
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Sample first name2", "Sample Middle name2",
            "Sample Last name", "Nickname", "Title", "Company", "Sample address 1234",
            "+155566677788", "9", "sampleemail@comapnay.com", "test1"), false);
    app.getContactHelper().submitContactModification();

  }
}
