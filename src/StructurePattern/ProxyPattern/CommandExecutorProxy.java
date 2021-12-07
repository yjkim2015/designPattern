package StructurePattern.ProxyPattern;

public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor commandExecutor;

    public CommandExecutorProxy(String user, String pwd) {
        if ( "ReadyKim".equals(user) && "correct_pwd".equals(pwd) ) {
            isAdmin = true;
        }
        commandExecutor = new CommandExecutorImpl();

    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if ( isAdmin ) {
            commandExecutor.runCommand(cmd);
        }
        else {
            if ( cmd.trim().startsWith("rm") ) {
                throw new Exception("rm command is not allowd for non-admin users.");
            }
            else {
                commandExecutor.runCommand(cmd);
            }
        }
    }
}
