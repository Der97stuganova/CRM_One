package PageObject;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.hamcrest.MatcherAssert.assertThat;


public class PageObjectTestCrm extends BaseTestCrm {

    @Test
    void loginInCrmWithPageObjTest() throws InterruptedException {
        driver.get("https://crm.geekbrains.space/");
        new LoginPageCrm(driver)
                .fillInputLogin("Applanatest1")
                .fillInputPassword("Student2020!")
                .clickLoginButton()
                .navigationMenu.openNavigationMenuItem("Контрагенты");

        new ExpensesSubMenuCrm(driver).goToExpensesRequestsPage();

        new ExpensesRequestPageCrm(driver)
                .createExpense()
                .lastName("Super")
                .firstName("Testmen")
                .selectBusinessUnit("123test")
                .Job("Tester")
                .saveAndCloseButton.click();

        webDriverWait.until(
                ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(text(),'Загрузка')]")));
    }
}
