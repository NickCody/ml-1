package com.primordia.machinelearning.ml1

import org.nd4j.linalg.factory.Nd4j
import org.nd4s.Implicits._

object Test {
  val DIM = 10

  def main(args: Array[String]): Unit = {
    val a = Nd4j.rand(DIM,DIM)
    println(a)

    val b = Nd4j.eye(DIM)
    println(b)

    val c = a * b
    println(c)
  }
}
