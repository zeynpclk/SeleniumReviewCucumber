package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ExpilicitPage {

    public ExpilicitPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }
        //  <button onclick="addElement()">Add Element</button>
        //*[.="Add Element'] bu sekilde de bulabiliriz
       @FindBy ( xpath = "//button[@onclick='addElement()']")
        public WebElement addElementButonu;


}
