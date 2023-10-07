package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TestDrivenDevelopment {

    //3.5. Red-Green-Refactor
    @Test
    void testSadMoodAnalysis() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("У меня грустное настроение");

        assertThat(mood).isEqualTo("SAD");
    }

    @Test
    void testHappyMoodAnalysis() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("У меня веселое настроение");

        assertThat(mood).isEqualTo("HAPPY");
    }
}