package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.SearchResultsPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchTests extends BaseTest {

    @Test
    public void shouldReturnResultsForValidSearch() {
        HomePage homePage = new HomePage(driver);
        SearchResultsPage resultsPage = new SearchResultsPage(driver);

        homePage.searchByUrl("FGTS");

        assertTrue(
                resultsPage.hasResults() || resultsPage.containsText("FGTS"),
                "A busca deveria retornar resultados para um termo válido."
        );
    }

    @Test
    public void shouldHandleInvalidSearchTerm() {
        HomePage homePage = new HomePage(driver);
        SearchResultsPage resultsPage = new SearchResultsPage(driver);

        homePage.searchByUrl("xptoagibank987");

        boolean expectedBehavior =
                !resultsPage.hasResults()
                        || resultsPage.containsText("nenhum resultado")
                        || resultsPage.containsText("nothing found")
                        || resultsPage.containsText("no results");

        assertTrue(
                expectedBehavior,
                "A busca por termo inexistente deveria não retornar resultados."
        );
    }
}