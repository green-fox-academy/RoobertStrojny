package com.greenfoxacademy.springstart;

import java.util.Random;

public class Hello {
    private String fontSize;
    private String color;
    private String content;

    public Hello(String fontSize, String color) {
        this.fontSize = fontSize;
        this.color = color;
        this.content = getRandomContent();
    }

    private String getRandomContent() {
        String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
                "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
                "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
                "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
        Random random = new Random();

        return hellos[random.nextInt(hellos.length - 1)];
    }

    public String getContent() {
        return content;
    }
}
