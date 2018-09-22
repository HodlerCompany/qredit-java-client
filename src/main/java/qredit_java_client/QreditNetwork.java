package qredit_java_client;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Data
public class QreditNetwork {

    private final String httpScheme;
    private final List<QreditNetworkPeerSettings> peerSettings;
    private final List<QreditNetworkPeerSettings> trustedPeerSettings;
    private final String netHash;
    private final Integer pubKeyHash;
    private final String epoch;
    private final String version;

}
