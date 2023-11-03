package AbstractFactoryDesignPattern.CloudResourceExample.gcp;

import AbstractFactoryDesignPattern.CloudResourceExample.Instance;
import AbstractFactoryDesignPattern.CloudResourceExample.Instance.Capacity;
import AbstractFactoryDesignPattern.CloudResourceExample.ResourceFactory;
import AbstractFactoryDesignPattern.CloudResourceExample.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Capacity capacity) {
        
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        
        return new GoogleCloudStorage(capMib);
    }


}
