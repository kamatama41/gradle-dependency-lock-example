package com.github.kamatama41.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {
    @Test
    void sayHelloWorld() {
        assertEquals("Hello World", new Hello().world());
    }
}
