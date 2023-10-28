package pr22.exs2;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair();
    public MagicChair createMagicianChair();
    public FunctionalChair createFunctionalChair();
}