package us.stqa.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {
    app.getNavigationHelper().goToHomePage();
    app.getContactHelper().selectContact("2");
    app.getContactHelper().deleteSelectedContacts();
    app.getContactHelper().returnToHomePage();
  }

}
