package com.example.personnage;

public class Personnages {
    private  int id ;
    private String name;
    private String type;
    private int leveLife;


    public Personnages (int id, String name, String type, int leveLife) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.leveLife = leveLife;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLeveLife() {
        return leveLife;
    }

    public void setLeveLife(int leveLife) {
        this.leveLife = leveLife;
    }

    @Override
    public String toString(){
        return
                " Id = " + id +
                        " Nom = " + name +  '\'' +
                        " Type = " + type +  '\'' +
                        " Point de vie = " + leveLife +  '\'' ;

    }
}
