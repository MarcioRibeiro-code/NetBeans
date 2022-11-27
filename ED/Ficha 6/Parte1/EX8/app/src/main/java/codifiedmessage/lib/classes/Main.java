package codifiedmessage.lib.classes;

public class Main {
  public static void main(String[] args) {
    linkedQueue<HtmlTag> q = new linkedQueue<>();
    q = HtmlTag.tokenize("<body><h1>Titulo</h1><p><a>link</a></p></body>");
    LinkedStack actual = HtmlValidator.isValidHtml(q);
    System.out.println(HtmlValidator.checkForValidation(actual));
  }
}
