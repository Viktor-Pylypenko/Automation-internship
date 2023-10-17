package homework.lessons.patterns.command;

public class CommandApp {

    public static void main(String[] args) {
        Computer computer = new Computer();

        User user = new User(
                new StartCommnd(computer),
                new StopCommand(computer),
                new ResetCommand(computer)
        );

        user.startComputer();
        user.stoptComputer();
        user.resetComputer();
    }

}
