package testpackage.steps.jbehave;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import testpackage.steps.serenity.SignUpSteps;

public class SignUpPageSteps {
    @Steps
    SignUpSteps steps;

    @Given("I open signup page")
    public void open_page() {
        steps.open_signup_page();
    }

    @When("I set month \"$month\"")
    public void setMonth(String month) {
        steps.set_month(month);
    }

    @When("I set day \"$day\"")
    public void setDay(String day) {
        steps.type_day(day);
    }

    @When("I set year \"$year\"")
    public void setYear(String year) {
        steps.type_year(year);
    }

    @When("I check share")
    public void checkShare(){
        steps.set_share(true);
    }

    @When("I uncheck share")
    public void uncheckShare(){
        steps.set_share(false);
    }

    @When("I type mail \"$email\"")
    public void typeMail(String mail) {
        steps.type_mail(mail);
    }

    @When("I type confirmation mail \"$email\"")
    public void typeConfirmationMail(String mail) {
        steps.type_confirmation_email(mail);
    }

    @When("I type name \"$name\"")
    public void typeName(String name) {
        steps.type_name(name);
    }

    @When("I click signup button")
    public void clickSignUpButton() {
        steps.click_signup();
    }

    @When("I type password \"$password\"")
    public void typePassword(String pass) {
        steps.type_password(pass);
    }

    @When("I select sex \"$sex\"")
    public void selectSex(String sex) {
        steps.select_sex(sex);
    }

    @Then("I see error \"$message\"")
    public void shouldSeeErrorByText(String message) {
        steps.should_see_error(message);
    }

    @Then("I do not see error \"$msg\"")
    public void shouldNotSeeErrorByText(String message) {
        steps.should_not_see_error(message);
    }

    @Then("I see \"$count\" errors")
    public void shouldSeeCountOfErrors(int cnt) {
        steps.should_see_errors_count(cnt);
    }

    @Then("I see that \"$number\" has text \"$message\"")
    public void errorByNumber(int number, String msg) {
        steps.should_see_error_by_number(number, msg);
    }
}