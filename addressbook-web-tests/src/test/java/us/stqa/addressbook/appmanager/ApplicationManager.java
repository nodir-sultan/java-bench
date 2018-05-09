package us.stqa.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

  WebDriver wd;

  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;
  private ContactHelper contactHelper;
  private SessionHelper sessionHelper;
  private String browser;

  public ApplicationManager(String browsername) {
    this.browser = browsername;
  }

  public void init() {
    if (browser.equals(BrowserType.FIREFOX)) {
      FirefoxOptions options = new FirefoxOptions();
      options.setAcceptInsecureCerts(true);
      wd = new FirefoxDriver(options);
    } else if (browser.equals(BrowserType.CHROME)) {
      wd = new ChromeDriver();
    } else if (browser.equals(BrowserType.IE)) {
      wd = new InternetExplorerDriver();
    } else if (browser.equals(BrowserType.EDGE)) {
      wd = new EdgeDriver();
    }
    wd.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    groupHelper = new GroupHelper(wd);
    contactHelper = new ContactHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    wd.get("http://localhost/addressbook/");
    sessionHelper.login("admin", "secret");
  }

  public void stop() {
    wd.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }
}
