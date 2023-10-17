package homework.lessons.patterns.command;

public class StartCommnd implements Command {

    Computer computer;

    public StartCommnd(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.start();
    }
}
