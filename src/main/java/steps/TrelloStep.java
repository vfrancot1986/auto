package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pom.LoginPage;


public class TrelloStep {
    private LoginPage loginPage;

    @Dado("^que eu esteja logado no Trello$")
    public void queEuEstejaLogadoNoTrello() {
        loginPage = new LoginPage();
        loginPage.access();
        loginPage.doLogin("vfrancot1986", "Senh@001");
        Assert.assertEquals("Página Inicial do Trello",loginPage.checkInitialPage());
    }

    @E("^tenha acesso ao board automationprime$")
    public void tenhaAcessoAoBoardAutomationprime() {
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

