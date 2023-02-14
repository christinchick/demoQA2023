import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DemoQATests {
    RegistrationFormPageObjects registrationFormPageObjects = new RegistrationFormPageObjects();
    Faker faker = new Faker();

    String  firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            telephonNumber = faker.number().digits(10),
            currentAdress = faker.address().city();
    @BeforeAll
    static void setUp(){
        Configuration.browserSize="1800x1700";
        Configuration.baseUrl = "https://demoqa.com";
    }
    @Test
    void homeworkone(){

        registrationFormPageObjects.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGenterWrapper("Female")
                .setUserNumber(telephonNumber)
                .setDateOfBirthInput("27","June", "1991")
                .setSubjectsInput("Hindi")
                .setHobbies()
                .downloadPicture()
                .setCurrentAdress(currentAdress)
                .setStateAndCity();
        $("#submit").scrollTo().click();
        $("#submit").scrollTo().click();





    }

}
