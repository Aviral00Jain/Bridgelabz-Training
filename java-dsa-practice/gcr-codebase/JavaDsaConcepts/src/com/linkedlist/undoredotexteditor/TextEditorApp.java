package com.linkedlist.undoredotexteditor;

public class TextEditorApp {

    public static void main(String[] args) {

        TextEditorHistory editor = new TextEditorHistory();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.addState("Hello World!!");

        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.addState("Hello World!!!");
        editor.displayCurrentState();

        editor.redo(); // should not redo
    }
}