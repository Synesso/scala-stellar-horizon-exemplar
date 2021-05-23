package exemplar

import stellar.horizon.Horizon.Networks
import stellar.horizon.{Horizon, TransactionResponse}
import stellar.protocol.{AccountId, Seed}

object AccountCreation {

  def main(args: Array[String]): Unit = {
    val seed = Seed.random
    val transactionResponse = createAccount(seed.accountId)
    transactionResponse.operationEvents.foreach(println)
  }

  def createAccount(accountId: AccountId): TransactionResponse = {
    val horizon = Horizon.sync(network = Networks.Test)
    horizon.friendbot.create(accountId).get
  }

}
