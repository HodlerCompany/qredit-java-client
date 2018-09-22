package qredit_java_client;

import qredit_java_client.lib.ResourceUtils;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;

public class QreditNetworkFactory {
    
    public QreditNetwork createFromYml(String configFilename){
        Yaml yaml = new Yaml();
        InputStream fileInputStream = ResourceUtils.getInputStream(configFilename);
        QreditNetworkSettings qreditNetworkSettings = yaml.loadAs(fileInputStream, QreditNetworkSettings.class);
        
        return new QreditNetwork(
            qreditNetworkSettings.getScheme(),
            qreditNetworkSettings.getSeedPeers(),
            qreditNetworkSettings.getTrustedPeers(),
            qreditNetworkSettings.getNetHash(),
            qreditNetworkSettings.getPubKeyHash(),
            qreditNetworkSettings.getEpoch(),
            qreditNetworkSettings.getVersion()
        );
    }
}
