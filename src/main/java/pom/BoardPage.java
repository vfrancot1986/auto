package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import util.Hook;

import static util.Tools.waitBy;

public class BoardPage {
        @FindBy(how = How.XPATH, using = "//a[title='Automation_prime']")
        private WebElement board;

        public  BoardPage (){
        PageFactory.initElements(Hook.getDriver(), this);
    }

        public String checkBoard() {
            return waitBy(board).getAttribute("Automation_prime");
        }


}
