package junk.args;

import junk.args.exception.ArgsException;

public class TryArgs {

    public static void main(String[] args) {
        try {
            Args arg = new Args("l,p#,d*", new String[] {"42.3"});
            boolean logging = arg.getBoolean('l');
            int port = arg.getInt('p');
            String directory = arg.getString('d');
            executeApplication(logging, port, directory);
        } catch (ArgsException e) {
            System.out.printf("Argument error: %s\n", e.errorMessage());
        }
    }

    private static void executeApplication(boolean logging, int port, String directory) {
        System.out.println(logging);
        System.out.println(port);
        System.out.println(directory);
    }

}
