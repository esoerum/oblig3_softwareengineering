package no.hiof.espeso;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTests {
    @Test
    public void LeapYearIsDivisibleBy4AndNot100() {
        //Arrange
        int YearDivisibleBy4AndNot100 = 1032;
        //Act
        boolean ShouldBeTrue = Main.isLeapYear(YearDivisibleBy4AndNot100);
        //Assert
        assertTrue(ShouldBeTrue);
    }
    @Test
    public void LeapYearIsDivisibleBy400() {
        //Arrange
        int YearDivisibleBy400 = 2024;
        //Act
        boolean ShouldBeTrue = Main.isLeapYear(YearDivisibleBy400);
        //Assert
        assertTrue(ShouldBeTrue);
    }

    @Test
    public void NotLeapYearIfNotDivisibleBy4() {
        //Arrange
        int YearNotDivisible4 = 1997;
        //Act
        boolean ShouldBeFalse = Main.isLeapYear(YearNotDivisible4);
        //Assert
        assertFalse(ShouldBeFalse);
    }
    @Test
    public void NotLeapYearIfDivisibleBy100ButNot400() {
        //Arrange
        int YearDivisibleBy100ButNot400 = 2100;
        //Act
        boolean ShouldBeFalse = Main.isLeapYear(YearDivisibleBy100ButNot400);
        //Assert
        assertFalse(ShouldBeFalse);
    }
}
