package Test;

import java.util.ArrayList;
import java.util.List;

public class AdvancedTextEditor extends TextEditor {
    private List<String> record;
    private int currentIndicator;
    
    public AdvancedTextEditor(String initialtext){
        super(initialtext);
        this.record = new ArrayList<>();
        this.currentIndicator = 0;
        this.record.add(this.text);
    }
    
    @Override
    public void append(String newtext){
        this.text += newtext;
        this.record = this.record.subList(0, this.currentIndicator + 1);
        this.record.add(this.text);
        this.currentIndicator++;
    }
    
    @Override
    public void delete(int n){
        if(n > this.text.length()){
            return;
        }
        this.text = this.text.substring(0, this.text.length() - n);
        this.record = this.record.subList(0, this.currentIndicator + 1);
        this.record.add(this.text);
        this.currentIndicator++;
    }
    public void undo(){
        if(this.currentIndicator > 0){
            this.currentIndicator--;
            this.text = this.record.get(this.currentIndicator);
        }
    }
}
