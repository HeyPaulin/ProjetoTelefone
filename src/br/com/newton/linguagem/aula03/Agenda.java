package br.com.newton.linguagem.aula03;

public class Agenda {

    public static void main(String[] args) {

        Telefone telefone = new Telefone();
        Contato contato = new Contato();
        {
            contato.nome = "Rafaela";
            contato.numero = "222255";
            telefone.contato = contato;
        }
        {
            contato.nome = "João";
            contato.numero = "318989952";

            telefone.contato = contato;
            telefone.cor = "preto";
            telefone.marca = "iPhone";
            telefone.Tocar("rock");
        }
        {
            contato.nome = "Carmen";
            contato.numero = "31981109449";
            telefone.contato = contato;
            telefone.cor = "verde";
            telefone.marca = "S20";
            telefone.Tocar("blues");

        }


        System.out.println(telefone.contato.nome);
    }
}
