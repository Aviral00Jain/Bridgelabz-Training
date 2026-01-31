package com.junit.list;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class ListManagerTest {

    @Test
    public void testAddRemoveAndSize() {
        ListManager manager = new ListManager();
        List<Integer> list = new ArrayList<>();

        manager.addElement(list, 10);
        manager.addElement(list, 20);
        assertEquals(2, manager.getSize(list));

        manager.removeElement(list, 10);
        assertEquals(1, manager.getSize(list));
    }
}