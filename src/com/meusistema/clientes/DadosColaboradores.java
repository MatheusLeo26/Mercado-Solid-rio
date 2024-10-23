package com.meusistema.clientes;

public class DadosColaboradores {

    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String endereco;
    private String cep;
    private String numero;

    // Construtor para inicializar os atributos
    public DadosColaboradores(String nome, String email, String senha, String telefone, String endereco, String cep, String numero) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cep = cep;
        this.numero = numero;
    }


    public String getNome() {
        return nome;
    }


    public String getEmail() {
        return email;
    }


    public String getSenha() {
        return senha;
    }


    public String getTelefone() {
        return telefone;
    }

    public String getEndereço() {
        return endereco;
    }

    public String getCep() {
        return cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEndereco(String endereco) {this.endereco = endereco;}

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setNumero(String numero) {this.numero = numero;}

    public String toString() {
        return "DadosColaboradores{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco +'\''+
                ", cep='" + cep+'\''+
                ", numero'"+ numero+'\''+
                '}';
    }
}

