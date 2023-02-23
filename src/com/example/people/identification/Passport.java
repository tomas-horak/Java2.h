package com.example.people.identification;

public class Passport {
    private int identifier;
    private String expirationDate;
    private boolean revoked;

    public Passport(int identifier, String expirationDate){
        this.identifier = identifier;
        this.expirationDate = expirationDate;

    }
    public int getIdentifier() {
        return identifier;
    }
    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }
    public void revoke () {
        this.revoked = true;
    }

    public boolean isRevoked () {
        return revoked;
    }

}
