import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigInteger;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CalculatorServiceTest {

    private CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    void shouldReturnCorrectValueForSmallPositiveNumbers() {
        // given
        int n = 4;

        // when
        BigInteger result = calculatorService.factorial(n);

        // then
        assertThat(result).isEqualTo(BigInteger.valueOf(24));
    }

    @ParameterizedTest
    @MethodSource("factorialTest")
    void shouldReturnCorrectValue(int n, BigInteger result) {

    }

    static Stream<Arguments>factorialTest(){
        return Stream.of(
            Arguments.of()
        );
    }

}