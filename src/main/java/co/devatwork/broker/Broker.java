package co.devatwork.broker;

public class Broker {

    private String name;
    private String [] assetsOffered;

    public Broker(){

    }

    public Broker(String name){
        this.name = name;
    }

    public Broker(String name, String[] assetsOffered){
        this.name = name;
        this.assetsOffered = assetsOffered;
    }

    public String getBrokerName() {
        return name;
    }

    public void setBrokerName(String name) {
        this.name = name;
    }

    public void setListOfAssets(String[] assetList) {
        this.assetsOffered = assetList;
    }

    public String[] getListOfAssets() {
        return this.assetsOffered;
    }
}
