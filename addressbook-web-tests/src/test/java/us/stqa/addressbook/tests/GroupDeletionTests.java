package us.stqa.addressbook.tests;

import org.testng.annotations.Test;
import us.stqa.addressbook.model.GroupData;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() {
    app.getNavigationHelper().goToGroupPage();
    if (! app.getGroupHelper().isThereGroup()){
      app.getGroupHelper().createGroup(new GroupData("Samplegroup1", "Samplegroup2", "Samplegroup3"));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }

}
