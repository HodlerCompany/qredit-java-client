package qredit_java_client;

import java.util.List;
import lombok.Data;

@Data
public class QreditNetworkSettings {

  private String scheme;
  private List<QreditNetworkPeerSettings> seedPeers;
  private List<QreditNetworkPeerSettings> trustedPeers;
  private String netHash;
  private Integer pubKeyHash = 58;
  private String epoch = "2017-03-21 13:00:00";
  private String version;
}
