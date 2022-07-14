package co.devatwork.brokertest;

import co.devatwork.broker.Broker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BrokerTest {

    //create a test that gets name of trader
    @Test
    public void shouldProvideNameOfBroker(){

        //create a broker instance
        Broker objTest = new Broker();
        //create result
        String name = "Orion Market";
        objTest.setBrokerName(name);
        //create request
        String request = objTest.getBrokerName();
        assertEquals("Orion Market",request);
    }

    //create a test to show list of assets that are offered
    @Test
    public void shouldProvideListOfAssetsOfferedByBroker(){

        //create a Broker instance
        Broker objTest = new Broker();

        //create result
        String[] assetList = {"Stocks","Cryptocurrency","Commodities","Forex"};
        objTest.setListOfAssets(assetList);

        //create result
        String [] showAssest = objTest.getListOfAssets();
        assertEquals(assetList,showAssest);

    }





}
