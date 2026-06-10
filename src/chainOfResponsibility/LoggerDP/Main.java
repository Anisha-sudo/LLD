package chainOfResponsibility.LoggerDP;

public class Main {

    public static void main(String args[]){
        LogLevel logLevel= new InfoLogLevel(new DebugLogLevel(new ErrorLogLevel(null)));

//        logLevel.log(LogLevelEnum.info,"hi this is info log");
        logLevel.log(LogLevelEnum.debug,"hi this is debug log");
//        logLevel.log(LogLevelEnum.error,"hi this is error log");
    }
}
