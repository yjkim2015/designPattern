package StructurePattern.ProxyPattern;

public class ProxyPatternTest {

    public static void main(String[] args) {

        CommandExecutor executor = new CommandExecutorProxy("ReadyKim", "wrong_pwd");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand("rm -rf abc.pdf");
        } catch (Exception ex) {
            System.out.println("Exception Message :: " + ex.getMessage());
        }
    }
}
