package org.fnac.yams;

import cucumber.api.java.en.*;

import java.util.Locale;

import static org.assertj.core.api.Assertions.*;

public class CombinationToScoreSteps {

    private Combination heldCombination;

    @Given("^a (.*) is scored$")
    public void a_combination_is_scored(String scored) {
        heldCombination = Combination.valueOf(scored.toUpperCase(Locale.FRENCH));
    }

    @Then("^it accounts for (\\d+) points$")
    public void it_accounts_for_points(Integer score) throws Exception {
        assertThat(heldCombination.getScore()).as("Score retourné par le système").isEqualTo(score);
    }

}