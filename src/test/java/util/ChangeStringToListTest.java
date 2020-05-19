package util;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class ChangeStringToListTest {
    @Test
    void 문자열_리스트로_변환_테스트() {
        //given
        String changeTarget  = "kim,min,sub";
        List<String> compareTarget = Arrays.asList("kim","min","sub");
        //when
        List<String> names = ChangeStringToList.changeStringToList(changeTarget);
        //then
        assertThat(names.containsAll(compareTarget)).isTrue();
    }
}