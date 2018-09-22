package qredit_java_client;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

public class HttpQreditClientFactory {

    public HttpQreditClient create(QreditNetwork qreditNetwork) {
        // Set up http client with sensible timeout values
        RestTemplate restTemplate = new RestTemplateBuilder()
                .setConnectTimeout(5000)
                .setReadTimeout(5000)
                .build();

        HttpQreditClient httpQreditClient = new HttpQreditClient(qreditNetwork, restTemplate);
        httpQreditClient.updatePeers();

        return httpQreditClient;
    }

}
