public class SetBefehl {
  public static void ausfuehren(String[] args) {
    if (args.length != 4) {
      System.err.println("Es werden drei Argumente erwartet: (x) (y) ('x'/'o'); Beispiel: 'set 1 2 o'");
      return;
    }
    if (args[3].equals("x") || args[3].equals("o")) {

    } else {
      System.out.println("Eingabe Falsch");
      }
    CLIMain.BRETT.setFigur(Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
  }
}
