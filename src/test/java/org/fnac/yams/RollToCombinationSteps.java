package org.fnac.yams;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;


public class RollToCombinationSteps {

    public static final CombinationResolver COMBINATION_RESOLVER_SUT = new CombinationResolver();
    private List<Integer> heldRoll;

    @Given("^a (\\d+, \\d+, \\d+, \\d+, \\d+) is rolled$")
    public void a_is_rolled(String roll) throws Exception {
        heldRoll = Arrays.stream(roll.split(", "))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }


    @Then("^it accounts for a (.*)$")
    public void it_accounts_for_a_simple(String pCombination) {
        Combination combination = Combination.valueOf(pCombination.toUpperCase(Locale.FRENCH));
        assertThat(COMBINATION_RESOLVER_SUT.bestCombination(heldRoll)).as("Score retourné par le système").isEqualTo(combination);
    }


}