package Task_5;

public class Main {
    public static void main(String[] args) {
        MonitoringSystem GeneralIndicatorsMonitoringModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Monitoring of general indicators has started!");
            }
        };

        MonitoringSystem ErrorMonitoringModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Bag tracking monitoring has started!");
            }
        };

        MonitoringSystem SecurityModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Security monitoring has started!");
            }
        };

        GeneralIndicatorsMonitoringModule.startMonitoring();
        ErrorMonitoringModule.startMonitoring();
        SecurityModule.startMonitoring();
    }
}



