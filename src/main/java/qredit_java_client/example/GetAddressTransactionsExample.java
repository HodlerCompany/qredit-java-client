package qredit_java_client.example;

import qredit_java_client.*;
import qredit_java_client.lib.NiceObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class GetAddressTransactionsExample {
    
    private static final NiceObjectMapper niceObjectMapper = new NiceObjectMapper(new ObjectMapper());

    public static void main(String[] args) {
        QreditNetworkFactory qreditNetworkFactory = new QreditNetworkFactory();
        QreditNetwork qreditNetwork = qreditNetworkFactory.createFromYml("mainnet.yml");

        HttpQreditClientFactory httpQreditClientFactory = new HttpQreditClientFactory();
        QreditClient qreditClient = httpQreditClientFactory.create(qreditNetwork);
        
        List<Transaction> transactions = qreditClient.getTransactionByRecipientAddress("QRNJJruY6RcuYCXcwWsu4bx9kyZtntqeAx",10, 0);
        log.info(niceObjectMapper.writeValueAsString(transactions));
    }
}
