package us.stqa.addressbook.tests;

import org.testng.annotations.Test;
import us.stqa.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {
    app.getNavigationHelper().goToHomePage();
    if (!app.getContactHelper().isThereContact()) {
      app.getContactHelper().createContact(new ContactData("Sample first name", "Sample Middle name",
              "Sample Last name", "Nickname", "Title", "Company", "Sample address 1234",
              "+155566677788", "9", "sampleemail@comapnay.com", "Samplegroup1"), true);
    }
    app.getContactHelper().selectContact("2");
    app.getContactHelper().deleteSelectedContacts();
    app.getContactHelper().returnToHomePage();
  }

}
