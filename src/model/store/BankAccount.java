package model.store;

/**
 * Se crea la clase Bank account.
 */
public class BankAccount {

    /**
     * idHolder: atributo de la calse BankAccount.
     */
    private int idHolder;
    /**
     * nameHolder: atributo de la calse BankAccount.
     */
    private String nameHolder;
    /**
     * accountNumber: atributo de la calse BankAccount.
     */
    private int accountNumber;
    /**
     * bank: atributo de la calse BankAccount.
     */
    private String bank;
    /**
     * typeAccount: atributo de la calse BankAccount.
     */
    private String typeAccount;
    /**
     * Activated: atributo de la calse BankAccount.
     */
    protected boolean activated;


    /**
     * Instancia de una nueva Bank account.
     *
     * @param idHolder      the id holder
     * @param nameHolder    the name holder
     * @param accountNumber the account number
     * @param bank          the bank
     * @param typeAccount   the type account
     */
    public BankAccount(int idHolder, String nameHolder, int accountNumber, String bank, String typeAccount) {
        this.idHolder = idHolder;
        this.nameHolder = nameHolder;
        this.accountNumber = accountNumber;
        this.bank = bank;
        this.typeAccount = typeAccount;
    }


    /**
     * Metodo Get del atributo id holder.
     * @return the id holder
     */
    public int getIdHolder() {
        return idHolder;
    }

    /**
     * Metodo Set del atributo id holder.
     * @param idHolder the id holder
     */
    public void setIdHolder(int idHolder) {
        this.idHolder = idHolder;
    }

    /**
     * Metodo Get del atributo name holder.
     * @return the name holder
     */
    public String getNameHolder() {
        return nameHolder;
    }

    /**
     * Metodo Set del atributo name holder.
     * @param nameHolder the name holder
     */
    public void setNameHolder(String nameHolder) {
        this.nameHolder = nameHolder;
    }

    /**
     * Metodo Get del atributo account number.
     * @return the account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Metodo Set del atributo account number.
     * @param accountNumber the account number
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Metodo Get del atributo bank.
     * @return the bank
     */
    public String getBank() {
        return bank;
    }

    /**
     * Metodo Set del atributo bank.
     * @param bank the bank
     */
    public void setBank(String bank) {
        this.bank = bank;
    }

    /**
     * Metodo Get del atributo type account.
     * @return the type account
     */
    public String getTypeAccount() {
        return typeAccount;
    }

    /**
     * Metodo Set del atributo type account.
     * @param typeAccount the type account
     */
    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    /**
     * Is activated boolean.
     * @return the boolean
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * Metodo Set del atributo activated.
     * @param activated the activated
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
