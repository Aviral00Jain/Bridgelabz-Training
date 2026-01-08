package com.linkedlist.undoredotexteditor;

class TextEditorHistory {

    private TextStateNode head;
    private TextStateNode tail;
    private TextStateNode current;

    private int size = 0;
    private final int MAX_HISTORY = 10;

    // Add new text state
    public void addState(String content) {

        TextStateNode newNode = new TextStateNode(content);

        // If undo was used, remove redo history
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
            size = calculateSize();
        }

        if (head == null) {
            head = tail = current = newNode;
            size = 1;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        current = newNode;
        size++;

        // Maintain fixed history size
        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo operation
    public void undo() {
        if (current == null || current.prev == null) {
            System.out.println("Nothing to undo");
            return;
        }
        current = current.prev;
        System.out.println("Undo performed");
    }

    // Redo operation
    public void redo() {
        if (current == null || current.next == null) {
            System.out.println("Nothing to redo");
            return;
        }
        current = current.next;
        System.out.println("Redo performed");
    }

    // Display current state
    public void displayCurrentState() {
        if (current == null) {
            System.out.println("Editor is empty");
        } else {
            System.out.println("Current Text: " + current.content);
        }
    }

    // Utility to recalculate size (after cutting redo history)
    private int calculateSize() {
        int count = 0;
        TextStateNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
