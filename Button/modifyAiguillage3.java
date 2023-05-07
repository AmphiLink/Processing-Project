
import Util.Utilities;

public class modifyAiguillage3{
	/*@ spec_public */ private ProjetGroupeR2 machine; // reference to the machine 

	/*@ public normal_behavior
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public modifyAiguillage3(ProjetGroupeR2 m) {
		this.machine = m;
	}

	/*@ public normal_behavior
		requires true;
 		assignable \nothing;
		ensures (\result <==> (new BSet<Integer>(new Integer(2),new Integer(3)).has(gare) && new BSet<Integer>(machine.gauche,machine.droite).has(sens))) && (\exists BRelation<Integer,Integer> tmp_P2A; BRelation.cross(new Enumerated(1,6),new BSet<Integer>(machine.gauche,machine.droite)).has(tmp_P2A) && BOOL.implication(machine.gare.equals(2) && machine.sens.equals(machine.gauche),tmp_P2A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.P2A.apply(1)),new Pair<Integer,Integer>(2,machine.P2A.apply(2)),new Pair<Integer,Integer>(3,machine.gauche),new Pair<Integer,Integer>(4,machine.P2A.apply(4)),new Pair<Integer,Integer>(5,machine.P2A.apply(5)),new Pair<Integer,Integer>(6,machine.P2A.apply(6))))) && BOOL.implication(machine.gare.equals(2) && machine.sens.equals(machine.droite),tmp_P2A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.P2A.apply(1)),new Pair<Integer,Integer>(2,machine.P2A.apply(2)),new Pair<Integer,Integer>(3,machine.droite),new Pair<Integer,Integer>(4,machine.P2A.apply(4)),new Pair<Integer,Integer>(5,machine.P2A.apply(5)),new Pair<Integer,Integer>(6,machine.P2A.apply(6))))) && BOOL.implication(,tmp_P2A.equals(machine.P2A)); machine.P2A.equals(tmp_P2A)) && (\exists BRelation<Integer,Integer> tmp_P3A; BRelation.cross(new Enumerated(0,3),new BSet<Integer>(machine.gauche,machine.droite)).has(tmp_P3A) && BOOL.implication(machine.gare.equals(3) && machine.sens.equals(machine.gauche),tmp_P3A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(0,machine.P3A.apply(0)),new Pair<Integer,Integer>(1,machine.P3A.apply(1)),new Pair<Integer,Integer>(2,machine.P3A.apply(2)),new Pair<Integer,Integer>(3,machine.gauche)))) && BOOL.implication(machine.gare.equals(3) && machine.sens.equals(machine.droite),tmp_P3A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(0,machine.P3A.apply(0)),new Pair<Integer,Integer>(1,machine.P3A.apply(1)),new Pair<Integer,Integer>(2,machine.P3A.apply(2)),new Pair<Integer,Integer>(3,machine.droite)))) && BOOL.implication(,tmp_P3A.equals(machine.P3A)); machine.P3A.equals(tmp_P3A)); */
	public /*@ pure */ boolean guard_modifyAiguillage3( Integer sens, Integer gare) {
		return (new BSet<Integer>(new Integer(2),new Integer(3)).has(gare) && new BSet<Integer>(machine.gauche,machine.droite).has(sens));
	}

	/*@ public normal_behavior
		requires guard_modifyAiguillage3(sens,gare);
		assignable machine.P2A, machine.P3A;
		ensures guard_modifyAiguillage3(sens,gare) && (\exists BRelation<Integer,Integer> tmp_P2A; BRelation.cross(new Enumerated(1,6),new BSet<Integer>(machine.gauche,machine.droite)).has(tmp_P2A) && BOOL.implication(gare.equals(2) && sens.equals(machine.gauche),tmp_P2A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.get_P2A().apply(1)),new Pair<Integer,Integer>(2,machine.get_P2A().apply(2)),new Pair<Integer,Integer>(3,machine.gauche),new Pair<Integer,Integer>(4,machine.get_P2A().apply(4)),new Pair<Integer,Integer>(5,machine.get_P2A().apply(5)),new Pair<Integer,Integer>(6,machine.get_P2A().apply(6))))) && BOOL.implication(gare.equals(2) && sens.equals(machine.droite),tmp_P2A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.get_P2A().apply(1)),new Pair<Integer,Integer>(2,machine.get_P2A().apply(2)),new Pair<Integer,Integer>(3,machine.droite),new Pair<Integer,Integer>(4,machine.get_P2A().apply(4)),new Pair<Integer,Integer>(5,machine.get_P2A().apply(5)),new Pair<Integer,Integer>(6,machine.get_P2A().apply(6))))) && BOOL.implication(,tmp_P2A.equals(machine.get_P2A())); machine.get_P2A().equals(tmp_P2A)) && (\exists BRelation<Integer,Integer> tmp_P3A; BRelation.cross(new Enumerated(0,3),new BSet<Integer>(machine.gauche,machine.droite)).has(tmp_P3A) && BOOL.implication(gare.equals(3) && sens.equals(machine.gauche),tmp_P3A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(0,machine.get_P3A().apply(0)),new Pair<Integer,Integer>(1,machine.get_P3A().apply(1)),new Pair<Integer,Integer>(2,machine.get_P3A().apply(2)),new Pair<Integer,Integer>(3,machine.gauche)))) && BOOL.implication(gare.equals(3) && sens.equals(machine.droite),tmp_P3A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(0,machine.get_P3A().apply(0)),new Pair<Integer,Integer>(1,machine.get_P3A().apply(1)),new Pair<Integer,Integer>(2,machine.get_P3A().apply(2)),new Pair<Integer,Integer>(3,machine.droite)))) && BOOL.implication(,tmp_P3A.equals(machine.get_P3A())); machine.get_P3A().equals(tmp_P3A)); 
	 also
		requires !guard_modifyAiguillage3(sens,gare);
		assignable \nothing;
		ensures true; */
	public void run_modifyAiguillage3( Integer sens, Integer gare){
		if(guard_modifyAiguillage3(sens,gare)) {
			BRelation<Integer,Integer> P2A_tmp = machine.get_P2A();
			BRelation<Integer,Integer> P3A_tmp = machine.get_P3A();

		//machine.P2A = Utilities.non_det_assignment(P2A_tmp,(BRelation.cross(new Enumerated(1,6),new BSet<Integer>(machine.gauche,machine.droite)).has(P2A_tmp) && BOOL.implication(gare.equals(2) && sens.equals(machine.gauche),P2A_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,P2A_tmp.apply(1)),new Pair<Integer,Integer>(2,P2A_tmp.apply(2)),new Pair<Integer,Integer>(3,machine.gauche),new Pair<Integer,Integer>(4,P2A_tmp.apply(4)),new Pair<Integer,Integer>(5,P2A_tmp.apply(5)),new Pair<Integer,Integer>(6,P2A_tmp.apply(6))))) && BOOL.implication(gare.equals(2) && sens.equals(machine.droite),P2A_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,P2A_tmp.apply(1)),new Pair<Integer,Integer>(2,P2A_tmp.apply(2)),new Pair<Integer,Integer>(3,machine.droite),new Pair<Integer,Integer>(4,P2A_tmp.apply(4)),new Pair<Integer,Integer>(5,P2A_tmp.apply(5)),new Pair<Integer,Integer>(6,P2A_tmp.apply(6))))) && BOOL.implication(,P2A_tmp.equals(P2A_tmp))));
		//machine.P3A = Utilities.non_det_assignment(P3A_tmp,(BRelation.cross(new Enumerated(0,3),new BSet<Integer>(machine.gauche,machine.droite)).has(P3A_tmp) && BOOL.implication(gare.equals(3) && sens.equals(machine.gauche),P3A_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(0,P3A_tmp.apply(0)),new Pair<Integer,Integer>(1,P3A_tmp.apply(1)),new Pair<Integer,Integer>(2,P3A_tmp.apply(2)),new Pair<Integer,Integer>(3,machine.gauche)))) && BOOL.implication(gare.equals(3) && sens.equals(machine.droite),P3A_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(0,P3A_tmp.apply(0)),new Pair<Integer,Integer>(1,P3A_tmp.apply(1)),new Pair<Integer,Integer>(2,P3A_tmp.apply(2)),new Pair<Integer,Integer>(3,machine.droite)))) && BOOL.implication(,P3A_tmp.equals(P3A_tmp))));

			System.out.println("modifyAiguillage3 executed sens: " + sens + " gare: " + gare + " ");
		}
	}

}
