package com.hostelapp;

public class TesteVisibilidadePacote {
    public static void main(String[] args) {
        Guest hospede = new Guest();

        hospede.setFirstName("Florentino");
        hospede.setLastName("Ariza");

        System.out.println("Guest 1 - First name: " + hospede.getFirstName());
        System.out.println("Guest 1 - Last name: " + hospede.getLastName());
        System.out.println();

    }
}
