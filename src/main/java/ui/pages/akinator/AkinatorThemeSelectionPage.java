package ui.pages.akinator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ui.core.PageElement;

import java.util.ArrayList;
import java.util.List;

public class AkinatorThemeSelectionPage {

    PageElement gameThematicQuestionText = new PageElement(By.cssSelector(".bubble"));
    PageElement gameThematicOptionsText = new PageElement(By.cssSelector(".database-selection li"));

    public String getThemeSelectionQuestion() {
        return gameThematicQuestionText.getNodeText();
    }

    public List<WebElement> getWrappedOptions() {
        return gameThematicOptionsText.getListOfElements();
    }

    public List<String> getOptionsText() {
        List<String> options = new ArrayList<>();
        for (WebElement element : getWrappedOptions()) {
            options.add(element.getText());
        }
        return options;
    }

    public void chooseOption(String option) {
        for (WebElement element : getWrappedOptions()) {
            if (option.equals(element.getText())) {
                element.click();
            }
        }
    }

}
