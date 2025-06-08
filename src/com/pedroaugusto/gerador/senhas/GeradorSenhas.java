package com.pedroaugusto.gerador.senhas;

import java.security.SecureRandom;
import java.util.Random;

public class GeradorSenhas {
    private int tamanho;
    public GeradorSenhas(int tamanho) {
        this.tamanho = tamanho;
    }

    public String gerarSenha () {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?`~ ";
        StringBuilder senha = new StringBuilder();
        Random random = new SecureRandom();

        for(int i = senha.length(); i < tamanho; i++) {
            int randomIndex = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(randomIndex));
        }

        return senha.toString();
    }
}
