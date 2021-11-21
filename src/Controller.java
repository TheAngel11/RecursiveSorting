public class Controller {
    private Series seriesManager;
    private ConsoleUIManager consoleUIManager;

    public Controller() {
        this.seriesManager = seriesManager;
        this.consoleUIManager = consoleUIManager;
    }

    public void run() {
        boolean programRunning = true;
        while (programRunning){
            consoleUIManager.showMainMenu();
            switch (consoleUIManager.askForOption()){
                case 1:
                    break;
                case 2:
                    break;
                default:
                    break;
            }
        }
    }
}
