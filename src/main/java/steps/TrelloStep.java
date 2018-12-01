package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pom.LoginPage;
import pom.BoardPage;

public class TrelloStep {
    private LoginPage loginPage;
    private BoardPage boardPage;

    @Dado("^que eu esteja logado no Trello$")
    public void queEuEstejaLogadoNoTrello() {
        loginPage = new LoginPage();
        loginPage.access();
        loginPage.doLogin("vinicius.ts.franco@gmail.com", "Senh@001");
        Assert.assertEquals("Página Inicial do Trello",loginPage.checkInitialPage());
    }

    @E("^tenha acesso ao board automationprime$")
    public void tenhaAcessoAoBoardAutomationprime() {
        System.out.println(boardPage.checkBoard());
    }

    @Quando("^clico em \"([^\"]*)\" um cartao$")
    public void clicoEmUmCartao(String arg0) throws Throwable {
        System.out.println("Quando");
    }

    @Entao("^o cartao e \"([^\"]*)\"$")
    public void oCartaoE(String arg0) throws Throwable {
        System.out.println("Então");
    }
}

