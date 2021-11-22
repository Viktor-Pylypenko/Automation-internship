package ui.pages.akinator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ui.core.PageElement;

import java.util.ArrayList;
import java.util.List;

public class AkinatorGamePage {

    PageElement gameQuestionText = new PageElement(By.cssSelector(".question-text"));
    PageElement gameOptionsText = new PageElement(By.cssSelector(".database-selection li"));
    PageElement questionNumber = new PageElement(By.cssSelector(".question-number"));
    PageElement propose = new PageElement(By.cssSelector(".sub-bubble-propose"));
    PageElement proposalTitle = new PageElement(By.cssSelector(".proposal-title"));
    PageElement proposalSubtitle = new PageElement(By.cssSelector(".proposal-subtitle"));
    PageElement answerProposeYes = new PageElement(By.cssSelector("#a_propose_yes"));
    PageElement answerProposeNo = new PageElement(By.cssSelector("#a_propose_no"));
    PageElement loading = new PageElement(By.cssSelector("#div-overlay.overlayed"));
    PageElement winBoard = new PageElement(By.cssSelector(".bubble-win"));

    public String getQuestionText() {
        return gameQuestionText.getNodeText();
    }

    public List<WebElement> getWrappedOptions() {
        return gameOptionsText.getListOfElements();
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

    public Integer getQuestionNumber() {
        return Integer.parseInt(questionNumber.getNodeText());
    }

    public String getPropose() {
        return propose.getNodeText();
    }

    public String getProposalTitle() {
        return proposalTitle.getNodeText();
    }

    public boolean isPrososalTitleShown() {
        return proposalTitle.isElementPresent();
    }

    public String getProposalSubtitle() {
        return proposalSubtitle.getNodeText();
    }

    public void answerPropose(String answer) {
        if (answer.equals("Yes")) {
            answerProposeYes.click();
        } else {
            answerProposeNo.click();
        }
    }

    public String getWinBoardText() {
        return winBoard.getNodeText();
    }

    public boolean loading() {
        return loading.isElementPresent();
    }

}
