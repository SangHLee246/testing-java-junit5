package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.*;

@Tag("model")
public interface ModelTests {

    @BeforeEach
    default void beforeEachConsoleOutputter(TestInfo testInfo) {
        System.out.println("Running Test - " + testInfo.getDisplayName());
    }
}
