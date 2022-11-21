package starter.baidu;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenSearchingByKeyword {
    @Managed(driver = "chrome",options = "headless")
    WebDriver driver;

    NavigateActions navigate=new NavigateActions();
    SearchActions search=new SearchActions();
    SearchResultBar searchResultBar=new SearchResultBar();

    @Test
    public void theKeywordShouldAppearInTheResultsSidebar(){
        navigate.toTheBaiduSearchPage();
        search.byKeyword("Cucumber");
//        assertThat(searchResultBar.heading()).isEqualTo("Cucumber");
        Serenity.reportThat("The keyword should appear in the resulBar heading",
                () -> assertThat(searchResultBar.heading()).isEqualTo("Cucumber"));

    }
}
