package PageObject;

import org.openqa.selenium.WebDriver;

public class MainPageCrm extends BaseWievCrm {
    public PageObject.NavigationMenuCrm navigationMenu;

    public MainPageCrm(WebDriver driver) {
        super(driver);
        navigationMenu = new NavigationMenuCrm(driver);
    }
}
