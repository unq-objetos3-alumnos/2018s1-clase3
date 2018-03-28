package ar.edu.unq.obj3

class Animal {
  def comer(): Unit = {
    println("come")
  }

  def estaGordo(): Unit = {
    println("está gordo")
  }
}

class Vaca extends Animal {
  def ordeñar(): Unit = {
    println("ordeñada")
  }
}

class VacaLoca extends Vaca {
  def reir(): Unit = {
    println("jajajajaja")
  }
}

class Caballo extends Animal {
  def relinchar(): Unit = {
    println("relincha")
  }
}