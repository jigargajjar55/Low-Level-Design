package AbstractFactoryDesignPattern.CloudResourceExample;



import AbstractFactoryDesignPattern.CloudResourceExample.Instance.Capacity;
import AbstractFactoryDesignPattern.CloudResourceExample.aws.AwsResourceFactory;
import AbstractFactoryDesignPattern.CloudResourceExample.gcp.GoogleResourceFactory;

public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory factory){
        this.factory = factory;
    }

    private Instance createServer(Instance.Capacity cap, int storageMiB){
        
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMiB);

        instance.attachStorage(storage);

        return instance;
    }




    public static void main(String[] args) {

        Client client1 = new Client(new AwsResourceFactory());

        Instance i1 = client1.createServer(Capacity.micro, 20480);

        i1.start();
        i1.stop();

        Client client2 = new Client(new GoogleResourceFactory());

        Instance i2 = client2.createServer(Capacity.large, 4520480);

        i2.start();
        i2.stop();
    	
    }

}
