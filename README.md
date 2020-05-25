# Immutable Stack

### Description

Class to represent a Stack in Scala. Stack is a data structure type that respects dynamics: first in will be last out, or LIFO(last-in, first-out), as in the image below.

<p align="center">
  <img src="https://github.com/JoaoVitorLeite/ImmutableStack/blob/master/0_pIpMT7n7lVCZcVFt.jpg">
</p>


### About

This class was implemented using a generic type, which was implemented [here](https://github.com/JoaoVitorLeite/ImmutableStack/blob/master/src/main/scala/stack/Num.scala), which supports some basic algebraic operations and is defined for types Int, Float, Double, Long. The tests made are of simple character, and for this the [Scala Test](https://www.scalatest.org/) was used. In total ?? tests were performed.

### Test

To perform the tests it is necessary to be in the root directory(where the build.sbt file is), then use the `sbt test` command. The tests used FunSuite and assert's.

### IDE

The IDE used was [Intellij Idea](https://www.jetbrains.com/idea/).

### References

* [Link](https://www.cs.cmu.edu/~adamchik/15-121/lectures/Stacks%20and%20Queues/Stacks%20and%20Queues.html)

### License

The LICENSE used is [Apache-2.0](https://github.com/JoaoVitorLeite/Rational/blob/master/LICENSE).
