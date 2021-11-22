package homework.lessons.selenium.akinator;

import ui.core.BrowserFactory;
import ui.pages.akinator.AkinatorGamePage;
import ui.pages.akinator.AkinatorHomePage;
import ui.pages.akinator.AkinatorThemeSelectionPage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AkinatorTest extends BrowserFactory {

    public static void main(String[] args) throws InterruptedException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        AkinatorHomePage akinatorHomePage = new AkinatorHomePage();
        AkinatorThemeSelectionPage akinatorThemeSelectionPage = new AkinatorThemeSelectionPage();
        AkinatorGamePage akinatorGamePage = new AkinatorGamePage();

        //Akinator Home Page
        akinatorHomePage.open();
        akinatorHomePage.acceptCookie();
        akinatorHomePage.startGame();

        //Akinator Theme Page
        System.out.print(akinatorThemeSelectionPage.getThemeSelectionQuestion() + ": ");
        System.out.println(akinatorThemeSelectionPage.getOptionsText());
        String themeChoice = br.readLine();
        try {
            //Element loaded twice and deleted from DOM after reload js
            akinatorThemeSelectionPage.chooseOption(themeChoice);
        } catch (org.openqa.selenium.StaleElementReferenceException e) {
            akinatorThemeSelectionPage.chooseOption(themeChoice);
        }

        //Akinator Game Page
        do {
            if (!akinatorGamePage.loading() && !akinatorGamePage.isPrososalTitleShown()) {
                try {
                System.out.print(akinatorGamePage.getQuestionNumber()+". ");
                System.out.print(akinatorGamePage.getQuestionText() + ": ");
                System.out.println(akinatorGamePage.getOptionsText());
                String answer = br.readLine();

                    akinatorGamePage.chooseOption(answer);
                } catch (org.openqa.selenium.StaleElementReferenceException e) {
                    System.out.print(akinatorGamePage.getQuestionNumber()+". ");
                    System.out.print(akinatorGamePage.getQuestionText() + ": ");
                    System.out.println(akinatorGamePage.getOptionsText());
                    String answer = br.readLine();
                    akinatorGamePage.chooseOption(answer);
                }
            }
        } while (akinatorGamePage.getQuestionNumber() != 26);

        System.out.println(akinatorGamePage.getPropose());
        System.out.println(akinatorGamePage.getProposalTitle());
        System.out.println(akinatorGamePage.getProposalSubtitle());
        System.out.println("Enter Yes or No");
        String answerPropose = br.readLine();
        akinatorGamePage.answerPropose(answerPropose);
        if (answerPropose.equals("Yes")) {
            System.out.println(akinatorGamePage.getWinBoardText());
        }

        tearDownDriver();
    }

}
