package sergey.sermakov.my_first_bot11;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.List;

@Component
public class Bot extends TelegramLongPollingBot {


    public static final String TOKEN = "5056913305:AAGIe3Fi25jLQWF-2pCwgTnh_Wx__EyFa_A";
    public static final String USERNAME = "BestWeather239bot";



    public String getBotUsername() {
        return USERNAME;
    }

    public String getBotToken() {
        return TOKEN;
    }
    @Override
    public void onUpdateReceived(Update update) {
        try {
            SendMessage sendMessage = new SendMessage();
            Long chatId = update.getMessage().getChatId();
            String message = String.valueOf(update.getMessage().getText());
            sendMessage.setChatId(String.valueOf(chatId));
            sendMessage.setText("your chat id: "+chatId+"  "+"your message: "+message);
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }


}
