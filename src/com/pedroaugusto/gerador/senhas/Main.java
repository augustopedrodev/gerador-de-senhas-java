package com.pedroaugusto.gerador.senhas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Seja bem vindo ao gerador de senhas seguras!");
            System.out.print("Por favor, digite um tamanho de senha entre 6 e 20 digitos: ");
            int tamanho = scanner.nextInt();
            if (tamanho >= 6 && tamanho <= 20) {
                GeradorSenhas senhaGerada = new GeradorSenhas(tamanho);
                System.out.println("Sua senha gerada: " + senhaGerada.gerarSenha());
            } else {
                System.out.println("Digite um numero entre 4 e 20");
                continue;
            }

            scanner.nextLine();

            System.out.print("Deseja continuar com o programa? (s/n): ");
            String continuacaoPrograma = scanner.nextLine();
            if (continuacaoPrograma.equalsIgnoreCase("n")) {
                break;
            }
        }

        scanner.close();
    }
}