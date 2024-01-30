package PageObject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class SortingObject {

    public SelenideElement sortProductsByNameAtoZ(){
        return $x("//div[@class='produtc_sort_container']");
    }
}
