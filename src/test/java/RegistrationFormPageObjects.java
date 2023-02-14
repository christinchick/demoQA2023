import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationFormPageObjects {
    RegistrationFormComponentsTests registrationFormComponentsTests = new RegistrationFormComponentsTests();

    public RegistrationFormPageObjects  openPage(){
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        return this;
    }

    public RegistrationFormPageObjects setFirstName(String value) {
        $("#firstName").setValue(value);
        return this;
    }
    public RegistrationFormPageObjects setLastName(String value){
        $("#lastName").setValue(value);
        return this;
    }

    public RegistrationFormPageObjects setGenterWrapper(String value){
        $("#genterWrapper").$(byText(value)).click();

        return this;
    }
    public RegistrationFormPageObjects setUserNumber(String value){
        $("#userNumber").setValue(value);
        return this;
    }
    public RegistrationFormPageObjects setDateOfBirthInput(String day, String month, String year){
        $("#dateOfBirthInput").click();
        registrationFormComponentsTests.setDate(day, month, year);

        return this;
    }
    public RegistrationFormPageObjects setSubjectsInput(String value){
        $("#subjectsInput").setValue(value).pressEnter();
        return this;
    }
    public RegistrationFormPageObjects setEmail(String value){
        $("#userEmail").setValue(value);
        return this;
    }

    public RegistrationFormPageObjects setHobbies(){
        $("#hobbies-checkbox-3").parent().click();

        return this;
    }

    public RegistrationFormPageObjects downloadPicture(){
        $("#uploadPicture").uploadFromClasspath("img/1.png");
        $("#uploadPicture").uploadFile(new File("src/test/resources/img/1.png"));

        return this;
    }

    public RegistrationFormPageObjects setCurrentAdress(String value){
        $("#currentAddress").setValue(value).scrollTo();

        return this;
    }

    public RegistrationFormPageObjects setStateAndCity(){
        $("#state").click();
        $("#state").$(byText("Haryana")).click();
        $("#city").click();
        $("#city").$(byText("Karnal")).scrollTo().click();

        return this;
    }
}
