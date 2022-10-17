package lib;

public class LinkedList<T1 extends Comparable> {

  public Person head;

  public LinkedList() {
    this.head = new Person<T1>((T1) "head", (T1) "head", null);

  }

  /**
   * Metodo addAtHead (Adicionar no Inicio).
   * É criado um novo Node, depois é verificado se
   * já existe um node na lista e de seguida ligamos o novo node
   * ao primeiro node, por fim atribuimos o valor de first node a newNode.
   * Já no caso de não haver node então é atribuido o valor de primeiro node ao node novo.
   *
   * @param name    - Nome da Pessoa a ser Adicionada
   * @param address - Endereço da Pessoa (Posição)
   */
  public void addAtHead(T1 name, T1 address) {
    Person newNode = new Person(name, address, this.head);

    if (this.head != null) {
      newNode.setPerson(this.head);
      this.head = newNode;
    } else {
      this.head.setPerson(newNode);
    }
  }

  /**
   * Cria um novo Node e se já existir node na lista Ligada,
   * então percorre-se pelos nodes até chegar ao fim.
   *
   * @param name    Nome da Pessoa a ser introduzida
   * @param address Endereço da Pessoa
   */
  public void addAtEnd(T1 name, T1 address) {
    Person newNode = new Person(name, address);
    Person current = this.head.getPerson();
    if (this.head.getPerson() != null) {

      while (current.getPerson() != null) {
        current = current.getPerson();

      }
      current.setPerson(newNode);
    } else {
      this.head.setPerson(newNode);
    }
  }

  public void remove(T1 name, T1 address) {
    Person newNode = new Person(name, address);
    Person current = this.head;
    Person temp;
    if (this.head != null) {

      if (current.equals(newNode)) {
        temp = current;
        this.head = temp.getPerson();
        temp = null;
        return;
      }
      current = this.head.getPerson();
      while (current.getPerson() != null) {
        if (current.getPerson().equals(newNode)) {
          temp = current.getPerson();
          current.setPerson(temp.getPerson());
          temp = null;
          return;
        }
        current = current.getPerson();
      }
      System.out.println("Elemnto nao Encontrado");
    }
  }

  @Override
  public String toString() {
    String returno = "";

    if (this.head == null) {
      return ("List is empty");

    }
    Person current = this.head;
    while (current.getPerson() != null) {
      returno += current.toString() + "->";
      current = current.getPerson();
    }
    return returno;
  }
}
