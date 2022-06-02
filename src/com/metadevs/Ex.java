package com.metadevs;

public class Ex {
    public static void main(String[] args) {
        String login = "as1d";
        String password = "";
        String confirmPassword = "";

        try {
            validate(login, password, confirmPassword);
        }
        catch (WrongLogEx e) {
            System.out.println("Неверно введен логин.");
        }
        catch (RuntimeException e){
            System.out.println("Ошибка.");
        }

    }

    public static void validate(String login, String password, String confirmPassword) {

        if (login.length() > 20) {
            throw new WrongLogEx("Wrong login.");

        }
        if (!login.matches("[a-zA-Z]+\\.?")) {
            throw new WrongLogEx("Wrong login.");
        }


        throw new RuntimeException("error");

    }
}
