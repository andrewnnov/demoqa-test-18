import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitExamples {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All Tests");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before Each Tests");
    }

    @Test
    void firstTest() {
        System.out.println("Here is first test");
    }

    @Test
    void secondTest() {
        System.out.println("Here is second test");
    }

}
