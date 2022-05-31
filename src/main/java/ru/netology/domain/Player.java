package ru.netology.domain;


public class Player {
    private int id;
    private String name;
    private int strength;
    boolean registered = true;

    public Player() {
    }

    public Player(int id, String name, int strength, boolean registered) {
        this.id = id;
        this.name = name;
        this.strength = strength;
        this.registered = registered;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }
}
