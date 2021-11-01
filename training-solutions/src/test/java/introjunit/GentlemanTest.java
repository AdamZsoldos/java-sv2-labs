package introjunit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GentlemanTest {

    @Test
    public void helloTest() {
        assertThat(new Gentleman().sayHello("John Doe"), equalTo("Hello John Doe!"));
    }
}
