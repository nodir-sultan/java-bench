package us.stqa.addressbook.tests;

import org.testng.annotations.Test;
import us.stqa.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {
    app.getNavigationHelper().goToGroupPage();
    if (! app.getGroupHelper().isThereGroup()){
      app.getGroupHelper().createGroup(new GroupData("Samplegroup1", "Samplegroup2", "Samplegroup3"));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("Samplegroup1", "Samplegroup2", "Samplegroup3"));
    app.getGroupHelper().submitGroupModification();

  }
}
