package logic;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JavaSortTest {
    private final JavaSort<Integer> javaSort = new JavaSort<>();

    @DisplayName("[JavaSort] 데이터 리스트를 입력하면, 정렬된 리스트를 반환한다.")
    @Test
    void givenList_whenSorting_thenReturnSortedList() {
        List<Integer> input = List.of(5,3,1,4,2);
        List<Integer> output = javaSort.sort(input);

        assertThat(output).isEqualTo(List.of(1,2,3,4,5));
    }
}