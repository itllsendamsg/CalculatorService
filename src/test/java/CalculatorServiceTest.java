import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

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
}