/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniqcode87.helloworldmaventesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *
 * @author uniqcode87
 */
public class StringContainerTest {
    
    @Test
    @DisplayName("hello world")
    void testMessage() {
        StringContainer container = new StringContainer();
        assertEquals("hello world", container.getMessage(), "matched");
    }
}
