package ru.progwards.java1.telegrambot;  //path after dummy class was created by myself
//package ru.progwards.java1.telegrambot; //it's own path


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

import com.google.common.collect.TreeMultimap;

/**
 * Класс-обработчик поступающих к боту сообщений.
 */
public class ProgwardsTelegramBot extends TelegramLongPollingBot {

    static class Association {
        public String name;
        public String tags;

        public Association(String name, String tags) {
            this.name = name;
            this.tags = tags;
        }
    }

    public static class FoundTags {
        public TreeMultimap<Integer, String> tags;
        public FoundTags(TreeMultimap<Integer, String> tags) {
            this.tags = tags;
        }
    }

    public ProgwardsTelegramBot() {
        ApiContextInitializer.init();
    }

    public String username;
    public String token;
    private List<Association> associations = new ArrayList<Association>();
    FoundTags found;

    public void addTags(String name, String tags) {
        associations.add(new Association(name, tags));
    }

    public void checkTags(String text) {
        found = findAssociation(text);
    }

    public boolean checkLastFound(String text) {
        return getLastFound().toLowerCase().equals(text.toLowerCase());
    }

    public String getLastFound() {
        Object[] a = found.tags.values().toArray();
        if (a.length > 0)
            return (String)a[a.length-1];
        else
            return "";
    }

    public int foundCount() {
        return found.tags.size();
    }

    public Integer getLastWeight(FoundTags found) {
        Object[] a = found.tags.keys().toArray();
        if (a.length > 0)
            return (Integer)a[a.length-1];
        else
            return 0;
    }

    public String extract(FoundTags found, int n) {
        Object[] vals = found.tags.values().toArray();
        Object[] keys = found.tags.keys().toArray();
        String res = "";
        int max = getLastWeight(found);
        for(int i=0; i<vals.length;i++)
            if (max == 1 || (Integer)keys[i] > 1)
                res += vals[i].toString()+"\n";
        return res;
    }

    public String extract() {
        return extract(found, found.tags.size());
    }

    private int findAssociation(Association ass, String text) {
        int weight = 0;
        if (text.toLowerCase().contains(ass.name.toLowerCase()))
            weight += 10;
        String[] tags = ass.tags.split(",");
        for(String s: tags)
            if (text.toLowerCase().contains(s.trim().toLowerCase()))
                weight++;
        return weight;
    }

    public FoundTags findAssociation(String text) {
        TreeMultimap<Integer, String> result = TreeMultimap.create();//new TreeMultimap<Integer, String>();
        for (Association ass: associations) {
            int weight = findAssociation(ass, text);
            if (weight > 0) {
                result.put(weight, ass.name);
                //System.out.println("found "+ass.name+" "+weight);
            }
        }
        //System.out.println(result.size()+" "+result.values().toArray()[0]);
        return new FoundTags(result);
    }

    /**
     * Метод, который возвращает токен, выданный нам ботом @BotFather.
     * @return токен
     */
    @Override
    public String getBotToken() {
        return token;
    }

    /**
     * Метод, который возвращает имя пользователя бота.
     * @return имя пользователя
     */
    @Override
    public String getBotUsername() {
        return username;
    }

    /**
     * Метод-обработчик поступающих сообщений.
     * @param update объект, содержащий информацию о входящем сообщении
     */
    @Override
    public void onUpdateReceived(Update update) {
        try {
            //проверяем есть ли сообщение и текстовое ли оно
            if (update.hasMessage() && update.getMessage().hasText()) {
                //Извлекаем объект входящего сообщения
                Message inMessage = update.getMessage();
                String text = inMessage.getText();
                //if (text.equals("/stop"))
                //	System.exit(0);
                //Создаем исходящее сообщение
                SendMessage outMessage = new SendMessage();
                //Указываем в какой чат будем отправлять сообщение
                //(в тот же чат, откуда пришло входящее сообщение)
                outMessage.setChatId(inMessage.getChatId());
                //Указываем текст сообщения
                outMessage.setText(processMessage(text));
                //Отправляем сообщение
                execute(outMessage);
            }
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public String processMessage(String text) {
        return text;
    }

    public void start() {
        TelegramBotsApi botsApi = new TelegramBotsApi();
        try {
            botsApi.registerBot(this);
        } catch (TelegramApiRequestException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}