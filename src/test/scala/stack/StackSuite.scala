package stack

import org.scalatest.FunSuite

class StackSuite extends FunSuite{

  test("T1"){
    val a = new Stack[Int](List(1,2,3))
    assert(a.push(5) == new Stack[Int](List(5,3,2,1)))
  }
  test("T2"){
    val a = new Stack[Double](List(1D,2D,3D))
    assert(a.pop == new Stack[Double](List(2D,1D)))
  }
  test("T3"){
    val a = new Stack[Long](List(1L,2L,3L))
    assert(a.peek == 3L)
  }
  test("T4"){
    val a = new Stack[Int](List(1,2,3))
    assert(a.list == List(3,2,1))
  }
  test("T5"){
    val a = new Stack[Int](List(1,2,3))
    val b = new Stack[Int](List(2,5,7))
    assert(a++b == new Stack[Int](List(7,5,2,3,2,1)))
  }

}
