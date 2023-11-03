package AbstractFactoryDesignPattern.CloudResourceExample.aws;

import AbstractFactoryDesignPattern.CloudResourceExample.Instance;
import AbstractFactoryDesignPattern.CloudResourceExample.Instance.Capacity;
import AbstractFactoryDesignPattern.CloudResourceExample.ResourceFactory;
import AbstractFactoryDesignPattern.CloudResourceExample.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Capacity capacity) {
        
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
       
        return new S3Storage(capMib);
    }


}
