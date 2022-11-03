package factory;

/**
 *
 * @author Bohdan Basistyi
 */
public class Thursday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Dzień dobry Czwartek.";
    }

    @Override
    public String createMainMessage() {
        return "Dzień dobry Czwartek.";
    }

    @Override
    public String createClosingMessage() {
        return "Czwarty dzień pracy w tym tygodniu minął";
    }

}