package qredit_java_client;

import lombok.Data;

import java.util.List;

@Data
public class ArkNetworkSettings {
    private String scheme;
    private List<ArkNetworkPeerSettings> seedPeers;
    private List<ArkNetworkPeerSettings> trustedPeers;
    private String netHash;
    private Integer pubKeyHash = 58;
    private String epoch = "2017-03-21 13:00:00";
    private String version;
}
