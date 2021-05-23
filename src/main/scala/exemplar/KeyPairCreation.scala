package exemplar

import stellar.protocol.Seed

import scala.annotation.tailrec

object KeyPairCreation {

  def main(args: Array[String]): Unit = print(vanity("DOG"))

  def random: Seed =
    Seed.random

  @tailrec
  def vanity(suffix: String): Seed = {
    val seed = Seed.random
    if (seed.accountId.encodeToString.endsWith(suffix)) seed
    else vanity(suffix)
  }

  private def print(seed: Seed): Unit = {
    println(
      s"""Seed: $seed
         |encoded: ${seed.encodeToString}
         |derived public account id: ${seed.accountId}
         |""".stripMargin
    )
  }


}
