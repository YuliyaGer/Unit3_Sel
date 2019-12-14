import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

public class TestClass {

    @Test
    void TestCardForm () throws InterruptedException {
        open("http://localhost:9999");
//        SelenideElement form = $("form");
//        form.$("[data-test-id=name]input").setValue("Петрович");
//        form.$("[data-test-id=phone]input").setValue("+79947013020");
//        form.$("[data-test-id=agreement]").click();
//        form.$("[data-test-id=submit]").click();
//        $(".alert-success").shouldHave(exactText("Вашазаявкауспешноотправлена!"));
        Thread.sleep(5000);
    }
}
