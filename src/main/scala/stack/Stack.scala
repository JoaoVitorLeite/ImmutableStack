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

  /***
   * <p>
   *   Note: Requere to check if the argument is a empty list
   */
  require(elems.isEmpty, "Empty List")

  /***
   * Method for adding an element to the stack
   * @param elem A element
   * @return New stack with the added element
   */
  def push(elem: A): Stack[A] = new Stack(elem::elems)

  /***
   * Method to remove element from a stack
   * @return New stack without the removed element
   */
  def pop : Stack[A] = elems match {
    case l if l.nonEmpty => new Stack(elems.tail)
    case _ => new Stack(Nil)
  }

  /***
   * Method for returning the first element of the stack
   * <p>
   *   Note: If the stack is empty, you will receive NoSuchElementException
   * </p>
   * @return A element of the stack
   */
  def peek: A = elems.head

  /***
   * Method to check if the stack is empty
   * @return If the stack is empty it will return true, otherwise false
   */
  def isEmpty: Boolean = elems.isEmpty

  /***
   * Method to update a element of the stack
   * @param index Index of the element in stack
   * @param elem New element at `index`
   * @return New stack with the update
   */
  def update(index: Int, elem: A): Stack[A]= new Stack(elems.updated(index, elem))

  /***
   * Method to join two stack's
   * @param other Other stack
   * @return New stack after the union
   */
  def ++(other: Stack[A]): Stack[A] = {
    val list = other match {
      case el => elems.::(el)
      case _ => elems.::(Nil)
    }
    new Stack[A](list)
  }
}
