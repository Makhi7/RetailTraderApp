package co.devatwork.trader;

import co.devatwork.broker.Broker;

public class Trader {

    private String name;
    private String email;
    private Broker broker;
    private double wallet;
    
    public Trader(){
        
    }

    public Trader(String name){
        this.name = name;
    }
    
    public Trader(String name, String email, Broker broker){
        this.name = name;
        this.email = email;
        this.broker = broker;
    }

    public Trader(String name, String email, Broker broker, double wallet){
        this.name = name;
        this.email = email;
        this.broker = broker;
        this.wallet = wallet;
    }
    

    public String getTraderName() {
        return name;
    }

    public void setTraderName(String name) {
        this.name = name;
    }

    public void setTraderEmail(String email) {
        this.email = email;
    }

    public String getTraderEmail() {
        return this.email;
    }

    public String getBrokerNameFromTrader(){
        String brokerName = this.broker.getBrokerName();
        return brokerName;
    }

    public void setWalletAmount(double walletAmount) {
        this.wallet = walletAmount;
    }

    public double getWalletAmount() {
        return this.wallet;
    }

    public double depositMoneyInWallet(double depositInWallet) {
        double balance = getWalletAmount();
        balance+=depositInWallet;
        return balance;
    }
}
