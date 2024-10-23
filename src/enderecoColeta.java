import java.util.Scanner;

public class enderecoColeta {
    private String endereco;
    private String cep;
    private String numero;

    public enderecoColeta(String endereco, String cep, String numero){


        this.endereco = endereco;
        this.cep = cep;
        this.numero = numero;

    }

    public String getEndereco() {
        return endereco;
    }

    public String getCep() {
        return cep;
    }

    public String getNumero() {
        return numero;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


    public String toString(){
    return "enderecoColaboradores{"+
            "endereco='" +endereco+ '\'' +
            "cep='" +cep+ '\'' +
            "numero='" +numero+'\'' +
            '}';
    }





    }




