package com.puzikov.lab3;

import java.util.UUID;

// хранение и обработка персональных данных
public class Credentials {

    private UUID id;                      // Идентификатор заказчика
    private String surnameUser;               // Фамилия
    private String nameUser;                  // Имя
    private String patronymicUser;            // Отчество
    private String emailUser;                // Почта

    public Credentials(String surnameUser, String nameUser, String patronymicUser, String emailUser) {
        this.surnameUser = surnameUser;
        this.nameUser = nameUser;
        this.patronymicUser = patronymicUser;
        this.emailUser = emailUser;
        this.id = UUID.randomUUID();
    }

    public void show() {
        System.out.println("Покупатель: ");
        System.out.println("Id: " + id);
        System.out.println("Фамилия: " + surnameUser);
        System.out.println("Имя: " + nameUser);
        System.out.println("Отчество: " + patronymicUser);
        System.out.println("Email: " + emailUser);
    }


    @Override
    public String toString() {
        return "Credentials{" +
                "id=" + id +
                ", surnameUser='" + surnameUser + '\'' +
                ", nameUser='" + nameUser + '\'' +
                ", patronymicUser='" + patronymicUser + '\'' +
                ", emailUser='" + emailUser + '\'' +
                '}';
    }
}

