package model.store;

public class BankAccount {

    private int idHolder;
    private String nameHolder;
    private int accountNumber;
    private String bank;
    private String typeAccount;
    protected boolean activated;


    public BankAccount(int idHolder, String nameHolder, int accountNumber, String bank, String typeAccount) {
        this.idHolder = idHolder;
        this.nameHolder = nameHolder;
        this.accountNumber = accountNumber;
        this.bank = bank;
        this.typeAccount = typeAccount;
    }



    public int getIdHolder() {
        return idHolder;
    }

    public void setIdHolder(int idHolder) {
        this.idHolder = idHolder;
    }

    public String getNameHolder() {
        return nameHolder;
    }

    public void setNameHolder(String nameHolder) {
        this.nameHolder = nameHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
