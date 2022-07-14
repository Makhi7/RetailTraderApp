package co.devatwork.tradertest;

import co.devatwork.broker.Broker;
import co.devatwork.trader.Trader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TraderTest {

    //create a test that gets name of trader
    @Test
    public void shouldProvideDetailsOfTraderName(){

        //create a Trader instance
        Trader objTest = new Trader();
        //create result
        String name = "Kush";
        objTest.setTraderName(name);
        //create request
        String request = objTest.getTraderName();
        assertEquals("Kush",request);
    }

    //create a test that gets email of trader
    @Test
    public void shouldProvideDetailsOfTraderEmail(){

        //create a Trader instance
        Trader objTest = new Trader();
        //create result
        String email = "ganjaburn@gmail.com";
        objTest.setTraderEmail(email);
        //create request
        String request = objTest.getTraderEmail();
        assertEquals(email ,request);

    }

    //create test that shows the broker a trader is using
    @Test
    public void shouldProvideNameOfTradersBroker(){
        //create values for instance
        String name = "xxx";
        String email = "ph@gmail,com";
        Broker broker = new Broker();

        //result of broker name
        String setbrokerName = "Orion Markets";
        broker.setBrokerName(setbrokerName);

        //create a Trader instance #2
        Trader objTest = new Trader(name,email,broker);

        //create a result
        String brokersName = broker.getBrokerName();
        assertEquals(brokersName,objTest.getBrokerNameFromTrader());
    }

    //create test that shows the amount in traders wallet
    @Test
    public void shouldProvideAmountInTradersWallet(){
        //create Trader instance
        Trader objTest = new Trader();

        //result
        double walletAmount = 0.00;
        objTest.setWalletAmount(walletAmount);

        //request
        double showWalletAmount = objTest.getWalletAmount();
        assertEquals(0.00, showWalletAmount);

    }

    //create a test that shows money deposited in wallet
    //inputs: traderName, Money
    //output: sum of (wallet + money in)

    @Test
    public void shouldDepositMoneyInTradersWallet(){

        Broker broker = new Broker("Axe Capital");
        Trader objTest = new Trader("Steve","steve456@yahoo.co.za,broker",broker,500.78);
        Trader objTestTwo = new Trader("Taufiq","salie@proton.com",broker,200);

        double depositInWallet = 220.00;
        objTest.depositMoneyInWallet(depositInWallet);
        objTest.depositMoneyInWallet(depositInWallet);
        double depositMadeOne =objTest.getWalletAmount();
        double depositMadeTwo = objTestTwo.depositMoneyInWallet(depositInWallet);

        assertEquals(940.78,depositMadeOne);
//        assertEquals(420.,depositMadeTwo);

    }

}
