package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {
    List<Integer> list = new ArrayList<>();

    @Test
    void testTake() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        List<Integer> actual = App.take(numbers, 2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkEmptyList() {
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> actual = App.take(emptyList, 3);
        assertThat(emptyList.equals(actual)).isTrue();
    }

    @Test
    void  checkMoreElements() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        List<Integer> actual = App.take(list, 3);
        assertThat(actual.size() == 1).isTrue();
    }
}
