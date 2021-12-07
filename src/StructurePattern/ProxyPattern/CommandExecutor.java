package StructurePattern.ProxyPattern;

/*
프록시 패턴은 어떤 객체에 대하여 접근할 때에 Wrapper Class를 두어 접근에 대한 통제(Control access)를 위해 사용합니다.
 */
public interface CommandExecutor {

    public void runCommand(String cmd) throws Exception;

}
