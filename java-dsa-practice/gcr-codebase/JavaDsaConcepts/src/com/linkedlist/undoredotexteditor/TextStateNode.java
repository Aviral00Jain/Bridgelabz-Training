package com.linkedlist.undoredotexteditor;

class TextStateNode {

    String content;
    TextStateNode prev;
    TextStateNode next;

    public TextStateNode(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}
