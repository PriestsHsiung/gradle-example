package com.test;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Administrator on 2016/8/10 0010.
 */
public class MessageServiceTest {

    private MessageService messageService;

    @Before
    public void setUp() {
        messageService = new MessageService();
    }

    @Test
    public void getMessage_ShouldReturnMessage() {
        assertEquals("Hello World!", messageService.getMessage());
    }
}
