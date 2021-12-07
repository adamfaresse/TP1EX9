public abstract class ComposantElectrique {
    public boolean isInTension = false;
    public boolean isBranche =false;
    public PriseMultiple source = null;
    public void brancheSur(PriseMultiple femmeComp){
        this.isInTension = femmeComp.isInTension;
        if(!isBranche){
            femmeComp.add(this);
            source = femmeComp;
            isBranche = true;
        }
    }




    public void debranche(){
        isInTension = false;
        if(source == null){
            isBranche = false;
        }else if(source.listCompBranche.contains(this)){
            source.remove(this);
            isBranche = false;
        }


    }

    public void brancheSurPriseMurale(){

        isBranche = true;
        isInTension = true;
    }
}
