import java.util.ArrayList;
import java.util.LinkedList;

public class PriseMultiple extends ComposantElectrique implements SourceElectrique{
    public int nbPrise;

    public PriseMultiple(int nbPrise){
        this.nbPrise = nbPrise;
    }
    public ArrayList<ComposantElectrique> listCompBranche = new ArrayList<>();

    @Override
    public void brancheSur(PriseMultiple femmeComp) {
        super.brancheSur(femmeComp);
        for (ComposantElectrique compo : listCompBranche){
            compo.brancheSur(this);
        }

    }
    @Override
    public void debranche() {
        super.debranche();
        PriseMultiple source = null;
        for (ComposantElectrique compo : listCompBranche){
            compo.source = source;
            compo.debranche();
        }


    }

    @Override
    public void brancheSurPriseMurale() {
        super.brancheSurPriseMurale();
        for (ComposantElectrique compo : listCompBranche){
            compo.brancheSurPriseMurale();
        }

    }

    @Override
    public void add(ComposantElectrique compo) {
        if(!this.listCompBranche.contains(compo)) {
            if (nbPrise > 0) {
                listCompBranche.add(compo);
                nbPrise = nbPrise - 1;
            } else {
                System.out.println("Pas de prise disponible");
            }
        }
    }


    @Override
    public void remove(ComposantElectrique compo) {

        if(listCompBranche.contains(compo)){

            listCompBranche.remove(compo);
            nbPrise=nbPrise+1;
        }


    }
}
