package com.puzikov.lab2;

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



    }

