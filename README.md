# Qredit Java Client

A simple Java client for the Qredit network. 

## Installation

Add the following repository to your `pom.xml`:

```
<repository>
    <id>bintray-ark-aces-qredit-java-client</id>
    <url>https://dl.bintray.com/ark-aces/qredit-java-client</url>
</repository>
```

```
<dependency>
    <groupId>com.arkaces</groupId>
    <artifactId>qredit-java-client</artifactId>
    <version>0.9.0</version>
</dependency>
```

## Usage

```java
QreditNetworkFactory qreditkNetworkFactory = new qreditkNetworkFactory();
QreditNetwork qreditNetwork = qreditNetworkFactory.createFromYml("mainnet.yml");

HttpQreditClientFactory httpQreditClientFactory = new HttpQreditClientFactory();
QreditClient qreditClient = httpQreditClientFactory.create(qreditNetwork);

// Look up a transaction by transaction ID
String qreditTransactionId = "83d3fa00ff3ac45ec859403ecedda48b870d73d9eeaddc34a6a8b79556141f43";
Transaction transaction = qreditClient.getTransaction(qreditTransactionId);

// Create a transaction
String address = "QewU1vEmPrtQNjdVo33cX84bfovY3jNAkV";
Long satoshiAmount = 10000L;
String vendorField = "test message";
String passphrase = "liar secret already much glow student crystal paddle ...";
String transactionId = qreditClient
    .broadcastTransaction(address, satoshiAmount, vendorField, passphrase);
```

