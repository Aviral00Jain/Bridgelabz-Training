package com.linkedlist.socialmediafriendconnections;

class UserNode {

    int userId;
    String name;
    int age;

    FriendNode friendHead;
    UserNode next;

    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendHead = null;
        this.next = null;
    }
}