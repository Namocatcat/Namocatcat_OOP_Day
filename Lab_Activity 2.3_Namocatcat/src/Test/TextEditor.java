package Test;

public abstract class TextEditor {
    protected String text;
    
    public TextEditor(String initialtext) {
        this.text = initialtext;
    }

    public String getText() {
        return text;
    }
    
    public void setText(String newtext) {
        this.text = newtext;
    }
    public abstract void append(String newtext);
    
    public abstract void delete(int n);
}
