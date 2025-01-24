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
    void shouldReturnCorrectValue(int n, BigInteger expectedResult) {
        // given

        // when
        BigInteger result = calculatorService.factorial(n);

        // then
        assertThat(result).isEqualTo(expectedResult);
    }

    static Stream<Arguments> factorialTest() {
        return Stream.of(
                Arguments.of(-1, BigInteger.valueOf(0)),
                Arguments.of(0, BigInteger.valueOf(1)),
                Arguments.of(1, BigInteger.valueOf(1)),
                Arguments.of(2, BigInteger.valueOf(2)),
                Arguments.of(3, BigInteger.valueOf(6)),
                Arguments.of(4, BigInteger.valueOf(24)),
                Arguments.of(111, new BigInteger("1762952551090244663872161047107075788761409536026565516041574063347346955087248316436555574598462315773196047662837978913145847497199871623320096254145331200000000000000000000000000"))

        );
    }

}