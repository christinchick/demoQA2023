import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DemoQATests {
    @BeforeAll
    static void setUp(){
        Configuration.browserSize="1923x1080";
    }
    @Test
    void homeworkone(){
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Kristina");
        $("#lastName").setValue("Karabestkaia");
        $("#userEmail").setValue("Kristina@skyward.com");
        $("#genterWrapper").$(byText("Female")).click();
        $("#userNumber").setValue("89780382764");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("June");
        $(".react-datepicker__year-select").selectOption("1991");
        $(".react-datepicker__day--027:not(.react-datepicker__day--outside-month)").click();
        $("#hobbies-checkbox-3").parent().click();
        $("uploadPicture").uploadFile(new File("src/test/resources/img/1.png"));
        $("#currentAddress").setValue("Simferopol").scrollTo();
        $("#state").click();
        $("#state").$(byText("NCR")).click();
        $("#city").click();





    }

}
