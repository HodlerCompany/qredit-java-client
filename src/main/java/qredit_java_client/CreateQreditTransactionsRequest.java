package qredit_java_client;

import lombok.Data;

import java.util.List;

@Data
public class CreateQreditTransactionsRequest {

    private List<CreateQreditTransactionRequest> transactions;

}
