public abstract class ComposantElectrique {
    public boolean isBranche =false;
    public void brancheSur(SourceElectrique prise){
        isBranche = true;

    }
    public void debranche(){
        isBranche = false;
    }

    public void brancheSurPriseMurale(){
        isBranche = true;
    }
}
