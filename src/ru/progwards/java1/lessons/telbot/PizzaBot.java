package ru.progwards.java1.lessons.telbot;

import org.telegram.telegrambots.ApiContextInitializer;
import ru.progwards.java1.telegrambot.ProgwardsTelegramBot;

public class PizzaBot extends ProgwardsTelegramBot {


    public static void main(String[] args) {
        System.out.println("Hello bot!");
        ApiContextInitializer.init();

        PizzaBot bot = new PizzaBot();
        //bot.username = "Pizzarikkjo";
        bot.username = "Pizzarebot";
        bot.token = "1039404929:AAF86cPSBevVnbqi1DQKUG_Qwsefv9yMJUg";
        bot.start();
    }
}
