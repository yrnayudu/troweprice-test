package com.troweprice;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringUtilsTest {

    @Test(expected = IllegalArgumentException.class)
    public void test_find_longest_word_throws_exception_when_input_is_null() {
        StringUtils.findLongestWordAndWordLength(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_find_longest_word_throws_exception_when_input_is_empty() {
        StringUtils.findLongestWordAndWordLength("    ");
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_find_longest_word_throws_exception_when_input_have_only_newline_chars() {
        StringUtils.findLongestWordAndWordLength("\n \r");
    }

    @Test
    public void test_find_longest_word_when_input_sentence_have_one_word_with_one_letter() {
        assertThat(StringUtils.findLongestWordAndWordLength("a"), equalTo("a and 1"));
    }

    @Test
    public void test_find_longest_word_when_input_sentence_have_one_word() {
        assertThat(StringUtils.findLongestWordAndWordLength("first"), equalTo("first and 5"));
    }

    @Test
    public void test_find_longest_word_returns_first_max_length_word_when_input_sentence_have_two_words_with_same_length() {
        assertThat(StringUtils.findLongestWordAndWordLength("this test"), equalTo("this and 4"));
    }

    @Test
    public void test_find_longest_word_when_input_sentence_have_first_word_short_and_second_word_long() {
        assertThat(StringUtils.findLongestWordAndWordLength("this company"), equalTo("company and 7"));
    }

    @Test
    public void test_find_longest_word_when_input_sentence_have_first_word_long_and_second_word_short() {
        assertThat(StringUtils.findLongestWordAndWordLength("company is"), equalTo("company and 7"));
    }

    @Test
    public void test_find_longest_word_when_input_sentence_extra_spaces_between_words() {
        assertThat(StringUtils.findLongestWordAndWordLength("  this is   uneven spacing   sentence  "), equalTo("sentence and 8"));
    }

    @Test
    public void test_find_longest_word_when_input_sentence_is_long() {
        assertThat(StringUtils.findLongestWordAndWordLength("The cow jumped over the moon."), equalTo("jumped and 6"));
    }

    @Test
    public void test_find_longest_word_when_input_sentence_have_punctuations() {
        assertThat(StringUtils.findLongestWordAndWordLength("This is a long sentence, but not too long either"), equalTo("sentence and 8"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_find_shortest_word_throws_exception_when_input_is_null() {
        StringUtils.findShortestWordAndWordLength(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_find_shortest_word_throws_exception_when_input_is_empty() {
        StringUtils.findShortestWordAndWordLength("    ");
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_find_shortest_word_throws_exception_when_input_have_only_newline_chars() {
        StringUtils.findShortestWordAndWordLength("\n \r");
    }

    @Test
    public void test_find_shortest_word_when_input_sentence_have_one_word_with_one_letter() {
        assertThat(StringUtils.findShortestWordAndWordLength("a"), equalTo("a and 1"));
    }

    @Test
    public void test_find_shortest_word_when_input_sentence_have_one_word() {
        assertThat(StringUtils.findShortestWordAndWordLength("first"), equalTo("first and 5"));
    }

    @Test
    public void test_find_shortest_word_returns_first_max_length_word_when_input_sentence_have_two_words_with_same_length() {
        assertThat(StringUtils.findShortestWordAndWordLength("this test"), equalTo("this and 4"));
    }

    @Test
    public void test_find_shortest_word_when_input_sentence_have_first_word_short_and_second_word_long() {
        assertThat(StringUtils.findShortestWordAndWordLength("this company"), equalTo("this and 4"));
    }

    @Test
    public void test_find_shortest_word_when_input_sentence_have_first_word_long_and_second_word_short() {
        assertThat(StringUtils.findShortestWordAndWordLength("company is"), equalTo("is and 2"));
    }

    @Test
    public void test_find_shortest_word_when_input_sentence_extra_spaces_between_words() {
        assertThat(StringUtils.findShortestWordAndWordLength("  this is   uneven spacing   sentence  "), equalTo("is and 2"));
    }

    @Test
    public void test_find_shortest_word_when_input_sentence_is_long() {
        assertThat(StringUtils.findShortestWordAndWordLength("The cow jumped over the moon."), equalTo("The and 3"));
    }

    @Test
    public void test_find_shortest_word_when_input_sentence_have_punctuations() {
        assertThat(StringUtils.findShortestWordAndWordLength("This is a long sentence, but not too long either"), equalTo("a and 1"));
    }







}
