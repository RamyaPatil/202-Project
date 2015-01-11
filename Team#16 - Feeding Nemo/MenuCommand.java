public class MenuCommand implements IMenuCommand {
    private IMenuReceiver theReceiver ;    
    
    public MenuCommand (Screen scr) { 
        this.theReceiver = scr; 
    }
    
    public void execute() {
        theReceiver.doAction();
    }

    public void setReceiver(IMenuReceiver target) {
        theReceiver = target ;
    }     
}
 
