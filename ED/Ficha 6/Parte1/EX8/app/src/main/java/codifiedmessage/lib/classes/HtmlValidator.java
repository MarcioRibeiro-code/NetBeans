package codifiedmessage.lib.classes;

import codifiedmessage.lib.classes.linkedQueue.LinkedQueueIterator;

public class HtmlValidator {


  public static LinkedStack<HtmlTag> isValidHtml(linkedQueue<HtmlTag> tags) {
    LinkedStack<HtmlTag> stack = new LinkedStack<>();
    LinkedQueueIterator it = (LinkedQueueIterator) tags.iterator();
    HtmlTag tag = null;
    while (it.hasNext()) {
      tag = (HtmlTag) it.next();
      if (tag.isSelfClosing()) {
        continue;
      } else if (tag.isOpenTag()) {
        stack.push(tag);
      } else if (!tag.isOpenTag()) {
        if (!stack.isEmpty()) {
          if (stack.peek().matches(tag)) {
            stack.pop();
          } else {
            return stack;
          }
        } else {
          return null;
        }
      }
    }
    return stack;
  }

  public static String checkForValidation(LinkedStack<HtmlTag> tags) {

    if (tags == null) {
      return "Html Invalid";
    } else if (tags != null && !tags.isEmpty()) {
      return "Html Invalid - missing tag\n" + tags.toString();
    } else {
      return "HTML Valid";
    }
  }
}
