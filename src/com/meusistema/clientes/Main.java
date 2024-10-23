package com.meusistema.clientes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
           System.out.println("Seja bem-vindo(a) Ao Coleta ProgACao!");

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println(" Ola " + nome +  " Digite seu email:");
        String email = scanner.nextLine();

        System.out.println("Digite uma senha:");
        String senha = scanner.nextLine();

        System.out.println("Digite seu telefone:");
        String telefone   = scanner.nextLine();

        System.out.println("Digite seu endereco:");
        String endereco   = scanner.nextLine();

        System.out.println("Digite seu cep:");
        String cep   = scanner.nextLine();

        System.out.println("Digite seu numero:");
        String numero   = scanner.nextLine();

        DadosColaboradores colaborador = new DadosColaboradores(nome, email, senha, telefone, endereco,cep, numero);

        System.out.println("\nCadastro realizado com sucesso!");
        System.out.println("Informações do Colaborador:");
        System.out.println("Nome: " + colaborador.getNome());
        System.out.println("Email: " + colaborador.getEmail());
        System.out.println("Telefone: " + colaborador.getTelefone());
        System.out.println("endereco: " + colaborador.getEndereço());
        System.out.println("cep: " + colaborador.getCep());
        System.out.println("numero: " + colaborador.getNumero());
        System.out.println(" Ola " + colaborador.getNome() + " obrigado por se cadastar para a coleta social de reciclagem ");
        scanner.close();
    }
}
