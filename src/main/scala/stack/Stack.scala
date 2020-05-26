package stack

/***
 * @author João Vitor Silva Leite
 */

/***
 * Immutable Stack
 * @param elems List of elements to create a stack
 * @param op Implicit to applying operations of the implemented type class
 * @tparam A Type class implemented
 */
class Stack[A](val elems: List[A])(implicit op: Num[A]){

  val list:List[A] = elems.reverse
  /***
   * <p>
   *   Note: Requere to check if the argument is a empty list
   */
  require(elems.nonEmpty, "Empty List")

  /***
   * Method for adding an element to the stack
   * @param elem A element
   * @return New stack with the added element
   */
  def push(elem: A): Stack[A] = new Stack(elem::list)

  /***
   * Method to remove element from a stack
   * @return New stack without the removed element
   */
  def pop : Stack[A] = list match {
    case l if l.nonEmpty => new Stack(list.tail)
    case _ => new Stack(Nil)
  }

  /***
   * Method for returning the first element of the stack
   * <p>
   *   Note: If the stack is empty, you will receive NoSuchElementException
   * </p>
   * @return A element of the stack
   */
  def peek: A = list.head

  /***
   * Method to check if the stack is empty
   * @return If the stack is empty it will return true, otherwise false
   */
  def isEmpty: Boolean = list.isEmpty

  /***
   * Method to join two stack's
   * @param other Other stack
   * @return New stack after the union
   */
  def ++(other: Stack[A]): Stack[A] = {
    new Stack[A](other.list ++ list)
  }

  /***
   * Method to print the stack
   * @return Formatted string to represent the stack
   */
  override def toString: String = list mkString ", "

  /***
   * Method to compare two stack
   * @param obj Other stack
   * @return Return true if the two stack are equal, otherwise false
   */
  override def equals(obj: Any): Boolean = obj match {
    case l: Stack[A] => if(list == l.list) true else false
    case _ => false
  }
}
