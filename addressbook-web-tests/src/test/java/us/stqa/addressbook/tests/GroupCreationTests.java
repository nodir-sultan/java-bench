package us.stqa.addressbook.tests;

import org.testng.annotations.Test;
import us.stqa.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.goToGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("Samplegroup1", "Samplegroup2", "Samplegroup3"));
    app.submitGroupCreation();
    app.returnToGroupPage();
  }

}
