package StructurePattern.FacadePattern1;

/*
퍼사드 패턴은 서브시스템을 더 쉽게 사용할 수 있도록 higher-level 인터페이스를 정의하고, 제공합니다.
퍼사드 패턴을 적용하여 wrapper 인터페이스를 제공하여 클라이언트가 보다 쉽게 관리
퍼사드 패턴은 클라이언트 어플리케이션의 헬퍼 역할을 하는 것이지, 서브시스템 인터페이스를 숨기는 것은 아닙니다.
 */
public class FacadePatternTest {

    public static void main(String[] args) {
        String tableName = "Employee";

        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);


    }
}

