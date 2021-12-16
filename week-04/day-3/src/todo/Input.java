package todo;

public class Input {

    public void handleInput(String[] args) {
        TaskManagement task = new TaskManagement();

        if (args == null || args.length < 1) {
            printUsage();
            return;
        }

        switch (args[0]) {
            case "-l": {
                if (args.length > 1) {
                    System.out.println("Unsupported argument");
                    break;
                }
                task.list();
                break;
            }
            case "-a": {
                if (args.length == 1) {
                    System.out.println("Unable to add: no task provided");
                    break;
                }
                task.add(getInputString(args));
                break;
            }
            case "-r": {
                task.remove(args);
                break;
            }
            case "-c": {
                task.check(args);
                break;
            }
            default: {
                System.out.println("Unsupported argument\n");
                printUsage();
            }
        }
    }

    private void printUsage() {
        System.out.println("Command Line Todo application");
        System.out.println("=============================\n");
        System.out.println("Command line arguments:");
        System.out.println("\t-l   Lists all the tasks");
        System.out.println("\t-a   Adds a new task");
        System.out.println("\t-r   Removes an task");
        System.out.println("\t-c   Completes an task");
    }

    private String getInputString(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < args.length; i++) {
            sb.append(args[i]).append(" ");
        }
        return sb.toString();
    }
}
