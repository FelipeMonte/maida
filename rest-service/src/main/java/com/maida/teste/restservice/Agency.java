package com.maida.teste.restservice;

import java.util.ArrayList;

public class Agency {

    private final String name;
    private final long agencyNumber;
    private final Address address;
    private final ArrayList<Client> clients;

    public Agency(String name, long agencyNumber, Address address) {
        this.name = name;
        this.agencyNumber = agencyNumber;
        this.address = address;
        clients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public long getAgencyNumber() {
        return agencyNumber;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }
    
    public Client getClient(String cpf) {
        for (Client client : clients) {
            if (client.getCpf().equals(cpf))
                return client;
        }
        return null;
    }

    public Address getAddress() {
        return address;
    }
    
    public void addClient(String name, long rg, String cpf, Address address) {
        clients.add(new Client(name, rg, cpf, address));
    }
}
