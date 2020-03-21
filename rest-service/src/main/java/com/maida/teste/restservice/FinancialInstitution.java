package com.maida.teste.restservice;

import java.util.ArrayList;

public class FinancialInstitution {
    
    private final long id;
    private final String name;
    private final long cnpj;
    private final ArrayList<Agency> agencies;

    public FinancialInstitution(long id, String name, long cnpj) {
        this.id = id;
        this.name = name;
        this.cnpj = cnpj;
        agencies = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getCnpj() {
        return cnpj;
    }

    public ArrayList<Agency> getAgencies() {
        return agencies;
    }

    public Agency getAgency(int agencyNumber) {
        for (Agency ag : agencies) {
            if (ag.getAgencyNumber() == agencyNumber)
                return ag;
        }
        return null;
    }

    public void addAgency(String name, long agencyNumber, Address address) {
        agencies.add(new Agency(name, agencyNumber, address));
    }
}
