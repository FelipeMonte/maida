package com.maida.teste.restservice;

public class Client {
    
    private final String name;
    private final long rg;
    private final String cpf;
    private final Address address;
    private final Account account;
    
    public Client(String name, long rg, String cpf, Address address) {
        this.name = name;
        this.rg = rg;
        this.cpf = cpf;
        this.address = address;
        account = new Account(Integer.valueOf("11"+cpf));
    }
    
    public String getName() {
        return name;
    }
    
    public long getRg() {
        return rg;
    }
    
    public String getCpf() {
        return cpf;
    }

    public Address getAddress() {
        return address;
    }
    
    public Account getAccount() {
        return account;
    }
}
