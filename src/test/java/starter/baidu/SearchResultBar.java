package starter.baidu;

import net.serenitybdd.core.pages.PageComponent;
import org.openqa.selenium.By;

public class SearchResultBar extends PageComponent {
    public String heading(){
//        String result = $("//div[@tpl='open_source_software']//em").getText();
        waitABit(3000);
        String result = getDriver().findElement(By.xpath("//div[@tpl='open_source_software']//em")).getText();
        return result;

    }
}
