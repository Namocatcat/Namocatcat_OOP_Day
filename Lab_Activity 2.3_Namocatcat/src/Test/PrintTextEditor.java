package Test;

   public class PrintTextEditor extends TextEditor{
     
        public PrintTextEditor(String initialtext){
            super(initialtext);
    }
        
        @Override
        public void append(String newtext){
            this.text += newtext;
        }
       
        @Override
        public void delete(int n){
        if(n > this.text.length()){
            return;
        }
        this.text = this.text.substring(0, this.text.length()-n);
        }
   }

