package ar.edu.unq.obj3

import scala.collection.mutable

class Animal {
  def comer(): Unit = {
    println("come")
  }

  def estaGordo(): Boolean = {
    true
  }

  def peso: Int = 33
}

class Vaca extends Animal {
  def ordeñar(): Unit = println("ordeñada")
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

class Corral[+T <: Animal](var animales:List[T]) {
  def pesoTotal:Int = animales.map(_.peso).sum
//  def elMasGordo:T =
}

class Pastor {
  def pastorear(animales:List[Animal]):Unit
      = animales.foreach(_.comer())
}

class Lechero {
  def ordeñar(corral:Corral[Vaca])
      = corral.animales.foreach((vaca:Vaca) => vaca.ordeñar())
}



object Ejemplo extends App {

  var vaca:Vaca = null

  val loca:Animal = new VacaLoca

  private val vaca1 = new Vaca
  val animales: List[Animal]
        = List(vaca1, new Caballo)

  animales.size
  animales.contains(vaca1)
//  animales.filter( _.ordeñar() )
  animales
    .map(_.getClass.getSimpleName)
    .mkString(", ")

  val corralDeVacas: Corral[Vaca] = ???

  new Lechero().ordeñar(corralDeVacas)

  val setAnimales:List[Animal] = corralDeVacas.animales

  val corralAnimales:Corral[Animal] = corralDeVacas

  new Pastor().pastorear(setAnimales)





  var f : Vaca => Vaca = ???

  def g(vaca: Vaca): Vaca = ??? // Recibe una Vaca y devuelve una Vaca
  def h(vaca: Vaca): Animal = ??? // Devuelve un Animal
  def i(vaca: Vaca): VacaLoca = ??? // Devuelve una VacaLoca
  def j(vacaLoca: VacaLoca): Vaca = ??? // Recibe una VacaLoca
  def k(animal: Animal): Vaca = ??? // Recibe un Animal

  f = k

  f(new Vaca).ordeñar()
}