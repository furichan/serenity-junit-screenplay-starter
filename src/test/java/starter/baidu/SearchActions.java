package starter.baidu;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class SearchActions extends UIInteractions {

    @Step("Search keyword '{0}'")
    public void byKeyword(String keyword){
        // the element located with this method is null
//        $("#kw").sendKeys(keyword);
//        $("#su").click();
        getDriver().findElement(By.id("kw")).sendKeys(keyword);
        getDriver().findElement(By.id("su")).click();
    }
}
