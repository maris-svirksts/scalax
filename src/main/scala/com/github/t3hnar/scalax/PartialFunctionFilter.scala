package com.github.t3hnar.scalax

/*
* Separate class because of: "implementation restriction: nested class is not allowed in value class"
*/
class PartialFunctionFilter[-A, +B](pf: PartialFunction[A, B], f: A => Boolean) extends PartialFunction[A, B] {
  def apply(x: A): B = pf.apply(x)
  def isDefinedAt(x: A): Boolean = f(x) && pf.isDefinedAt(x)
}