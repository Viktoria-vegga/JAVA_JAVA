package pr22.exs3;

public class CreateMusicDocument implements ICreateDocument{
    @Override
    public IDocument CreateNew() {
        return new MusicDocument();
    }

    @Override
    public IDocument CreateOpen() {
        return new MusicDocument();
    }
}