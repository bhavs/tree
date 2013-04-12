package example.tests;

import java.util.HashMap;
import java.util.Iterator;

public class SolveExpressions {
  static HashMap<String, String> keyValue = new HashMap<String, String>();

  /**
   * @param args
   */
  public static void main(String[] args) {
    SolveExpressions s = new SolveExpressions();
    for (String arg : args) {
      String[] temp = arg.split("=");
      keyValue.put(temp[0], temp[1]);
    }
    s.performOperation();
  }

  private void performOperation() {
    Iterator<String> iter = keyValue.keySet().iterator();
    while (iter.hasNext()) {
      String temp = iter.next();
      if (keyValue.get(temp).length() == 1) {
        String val = evaluateOperand(temp);
        keyValue.put(temp, val);
      } else {
        String val = evaluateExpression(keyValue.get(temp)).toString();
        System.out.println(val);
      }
    }
  }

  private String evaluateOperand(String temp) {
    String val = keyValue.get(temp);
    if (keyValue.containsKey(val)) {
      evaluateOperand(val);
    } else {
      return val;
    }
    return null;
  }

  private Integer evaluateExpression(String value) {
    Integer result = 0;
    if (value.contains("/")) {
      boolean flag = true;
      String[] tempOp = value.split("\\/");
      for (String op : tempOp) {
        if (op.length() > 1) {
          evaluateExpression(op);
        } else {
          if (flag) {
            if (keyValue.containsKey(op)) {
              result += Integer.parseInt(keyValue.get(op));
            } else {
              result += Integer.parseInt(op);
            }
            flag = false;
          } else {
            if (keyValue.containsKey(op)) {
              result /= Integer.parseInt(keyValue.get(op));
            } else {
              result /= Integer.parseInt(op);
            }
          }
        }
      }

    } else if (value.contains("*")) {
      boolean flag = true;
      String[] tempOp = value.split("\\-");
      for (String op : tempOp) {
        if (op.length() > 1) {
          evaluateExpression(op);
        } else {
          if (flag) {
            if (keyValue.containsKey(op)) {
              result += Integer.parseInt(keyValue.get(op));
            } else {
              result += Integer.parseInt(op);
            }
            flag = false;
          } else {
            if (keyValue.containsKey(op)) {
              result *= Integer.parseInt(keyValue.get(op));
            } else {
              result *= Integer.parseInt(op);
            }
          }
        }
      }

    } else if (value.contains("+")) {
      boolean flag = true;
      String[] tempOp = value.split("\\+");
      for (String op : tempOp) {
        if (op.length() > 1) {
          result += evaluateExpression(op);
        } else {
          if (flag) {
            if (keyValue.containsKey(op)) {
              result += Integer.parseInt(keyValue.get(op));
            } else {
              result += Integer.parseInt(op);
            }
            flag = false;
          } else {
            if (keyValue.containsKey(op)) {
              result += Integer.parseInt(keyValue.get(op));
            } else {
              result += Integer.parseInt(op);
            }
          }
        }
      }
    } else if (value.contains("-")) {
      boolean flag = true;
      String[] tempOp = value.split("\\-");
      for (String op : tempOp) {
        if (op.length() > 1) {
          evaluateExpression(op);
        } else {
          if (flag) {
            if (keyValue.containsKey(op)) {
              result += Integer.parseInt(keyValue.get(op));
            } else {
              result += Integer.parseInt(op);
            }
            flag = false;
          } else {
            if (keyValue.containsKey(op)) {
              result -= Integer.parseInt(keyValue.get(op));
            } else {
              result -= Integer.parseInt(op);
            }
          }
        }
      }
    } else {

    }
    return result;
  }

}
