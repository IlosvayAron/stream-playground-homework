package countries;

import java.io.IOException;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;

public class Homework1 {

    private List<Country> countries;

    public Homework1() {

        countries = new CountryRepository().getAll();

        streamPipeline4(countries);
        streamPipeline10(countries);
        streamPipeline11(countries);
        streamPipeline12(countries);
        streamPipeline13(countries);
    }

    /**
     * Returns whether there is at least one country with the word "island" in its name ignoring case.
     */
    public boolean streamPipeline1() {
        // TODO
        return false;
    }

    /**
     *  Returns the first country name that contains the word "island" ignoring case.
     */
    public Optional<String> streamPipeline2() {
        // TODO
        return null;
    }

    /**
     * Prints each country name in which the first and the last letters are the same ignoring case.
     */
    public void streamPipeline3() {
        // TODO
    }

    /**
     * Prints the populations of the first ten least populous countries.
     */
    public void streamPipeline4(List<Country> countries) {
        countries.stream()
                .mapToLong(country -> country.getPopulation())
                .sorted()
                .limit(10)
                .forEach(System.out::println);
    }

    /**
     * Prints the names of the first ten least populous countries.
     */
    public void streamPipeline5() {
        // TODO
    }

    /**
     * Returns summary statistics about the number of country name translations associated with each country.
     */
    public IntSummaryStatistics streamPipeline6() {
        // TODO
        return null;
    }

    /**
     * Prints the names of countries in the ascending order of the number of timezones.
     */
    public void streamPipeline7() {
        // TODO
    }

    /**
     * Prints the number of timezones for each country in the form {@code name:timezones}, in the ascending order of the number of timezones.
     */
    public void streamPipeline8() {
        // TODO
    }

    /**
     * Returns the number of countries with no Spanish country name translation (the Spanish language is identifi
ed by the language code "es").
     */
    public long streamPipeline9() {
        // TODO
        return 0;
    }

    /**
     * Prints the names of countries with null area.
     */
    public void streamPipeline10(List<Country> countries) {
        countries.stream()
                .filter(country -> country.getArea() == null)
                .map(Country::getName)
                .forEach(System.out::println);
    }

    /**
     * Prints all distinct language tags of country name translations sorted in alphabetical order.
     */
    public void streamPipeline11(List<Country> countries) {
        countries.stream()
                .flatMap(country ->  country.getTranslations().entrySet().stream())
                .distinct()
                .forEach(System.out::println);
    }

    /**
     * Returns the average length of country names.
     */
    public double streamPipeline12(List<Country> countries) {
        return countries.stream()
                .mapToDouble(country -> country.getName().length())
                .average().getAsDouble();
    }

    /**
     * Prints all distinct regions of the countries with null area.
     */
    public void streamPipeline13(List<Country> countries) {
        countries.stream()
                .filter(country -> (country.getArea() == null))
                .map(country -> country.getRegion())
                .forEach(System.out::println);
    }

    /**
     * Returns the largest country with non-null area.
     */
    public Optional<Country> streamPipeline14() {
        // TODO
        return null;
    }

    /**
     * Prints the names of countries with a non-null area below 1.
     */
    public void streamPipeline15() {
        // TODO
    }

    /**
     * Prints all distinct timezones of European and Asian countries.
     */
    public void streamPipeline16() {
        // TODO
    }

}
