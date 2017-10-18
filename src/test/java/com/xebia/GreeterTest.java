package com.xebia;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class GreeterTest {

    private Greeter greeter = new Greeter();

    @Test
    public void greeterSaysHello() {
        assertThat(greeter.sayHello("pushpendu"), containsString("Hello pushpendu"));
    }

    @Test
    public void greeterSaysIt() {
        assertThat(greeter.sayIt("pushpendu"), containsString("Hello pushpendu"));
    }
}
