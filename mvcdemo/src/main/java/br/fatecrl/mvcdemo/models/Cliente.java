package br.fatecrl.mvcdemo.models;

public class Cliente {

    private String nome;
    private String cnpj;
    private float preco;


    public Cliente(String nome, String cnpj, float preco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.preco = preco;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

}

