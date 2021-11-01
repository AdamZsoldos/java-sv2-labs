package introjunit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GentlemanTest {

    @Test
    public void helloTest() {
        Gentleman gentleman = new Gentleman();
        assertThat(gentleman.sayHello("John Doe"), equalTo("Hello John Doe!"));
        assertThat(gentleman.sayHello(""), equalTo("Hello Anonymous!"));
        assertThat(gentleman.sayHello(" \n"), equalTo("Hello Anonymous!"));
        assertThat(gentleman.sayHello(null), equalTo("Hello Anonymous!"));
    }
}
