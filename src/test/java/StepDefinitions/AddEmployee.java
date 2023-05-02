package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.When;

import static StepDefinitions.PageInitializer.addEmployeePage;

public class AddEmployee extends CommonMethods {

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {


        doClick(addEmployeePage.pimTab);

    }

    @When("user clicks on add employee button")
    public void user_clicks_on_add_employee_button() {


        doClick(addEmployeePage.eddEmpBtn);
    }

    @When("user enters firstname and middlename and lastname")
    public void user_enters_firstname_and_middlename_and_lastname() {



        sendText(addEmployeePage.firstNameTextBox, ConfigReader.getPropertyValue("firstname"));


        sendText(addEmployeePage.middleNameTextBox, ConfigReader.getPropertyValue("middlename"));


        sendText(addEmployeePage.lastNameTextBox, ConfigReader.getPropertyValue("lastname"));

    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {

        doClick(addEmployeePage.saveBtn);
    }
}