package exemplar

import stellar.horizon.{AccountDetail, Horizon, HorizonState}
import stellar.protocol.AccountId

import scala.util.Try

object Main {

  def main(args: Array[String]): Unit = {
    val horizon = Horizon.sync()

    val state: Try[HorizonState] = horizon.meta.state
    state.foreach(println)

    val accountId = AccountId("GAAZI4TCR3TY5OJHCTJC2A4QSY6CJWJH5IAJTGKIN2ER7LBNVKOCCWN7")
    val accountDetail: Try[AccountDetail] = horizon.account.detail(accountId)
    accountDetail.foreach(println)
  }
}
