package dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloDtoTest {

    @Test
    public void test() {
        // given
        String sName = "TEST";
        int iAmount = 7777;

        // when
        HelloDto helloDto = new HelloDto(sName, iAmount);

        // then
        assertThat(helloDto.getName()).isEqualTo(sName, iAmount);
    }
}
