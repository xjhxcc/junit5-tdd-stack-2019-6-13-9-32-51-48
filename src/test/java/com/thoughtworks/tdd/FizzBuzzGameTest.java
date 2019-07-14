package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzGameTest {
    @Test
    public void should_return_1_when_call_number_given_1 () {
        //given
        FizzBuzzGame fiz = new FizzBuzzGame();
        //when
        String actual = fiz.number(1);
        //then
        assertThat(actual, is("1"));
    }
    @Test
    public void should_return_1_when_call_number_given_3 () {
        //given
        FizzBuzzGame fiz = new FizzBuzzGame();
        //when
        String actual = fiz.number(3);
        //then
        assertThat(actual, is("Fizz"));
    }
    @Test
    public void should_return_1_when_call_number_given_5 () {
        //given
        FizzBuzzGame fiz = new FizzBuzzGame();
        //when
        String actual = fiz.number(5);
        //then
        assertThat(actual, is("Buzz"));
    }
    @Test
    public void should_return_1_when_call_number_given_7 () {
        //given
        FizzBuzzGame fiz = new FizzBuzzGame();
        //when
        String actual = fiz.number(7);
        //then
        assertThat(actual, is("Whizz"));
    }
    @Test
    public void should_return_1_when_call_number_given_15 () {
        //given
        FizzBuzzGame fiz = new FizzBuzzGame();
        //when
        String actual = fiz.number(15);
        //then
        assertThat(actual, is("FizzBuzz"));
    }
    @Test
    public void should_return_1_when_call_number_given_21 () {
        //given
        FizzBuzzGame fiz = new FizzBuzzGame();
        //when
        String actual = fiz.number(21);
        //then
        assertThat(actual, is("FizzWhizz"));
    }
    @Test
    public void should_return_1_when_call_number_given_35 () {
        //given
        FizzBuzzGame fiz = new FizzBuzzGame();
        //when
        String actual = fiz.number(35);
        //then
        assertThat(actual, is("BuzzWhizz"));
    }
    @Test
    public void should_return_1_when_call_number_given_105 () {
        //given
        FizzBuzzGame fiz = new FizzBuzzGame();
        //when
        String actual = fiz.number(105);
        //then
        assertThat(actual, is("FizzBuzzWhizz"));
    }
    @Test
    public void should_return_1_when_call_number_given_13 () {
        //given
        FizzBuzzGame fiz = new FizzBuzzGame();
        //when
        String actual = fiz.number(13);
        //then
        assertThat(actual, is("Fizz"));
    }

}
