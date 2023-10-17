package homework.lessons.patterns.command;

public class StopCommand implements Command {

    Computer computer;

    StopCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.stop();
    }
}
