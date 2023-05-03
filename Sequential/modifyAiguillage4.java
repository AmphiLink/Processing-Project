

public class modifyAiguillage4{
	/*@ spec_public */ private ProjetGroupeR2 machine; // reference to the machine 

	/*@ public normal_behavior
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public modifyAiguillage4(ProjetGroupeR2 m) {
		this.machine = m;
	}

	/*@ public normal_behavior
		requires true;
 		assignable \nothing;
		ensures (\result <==> (new BSet<Integer>(new Integer(1),new Integer(2)).has(gare) && new BSet<Integer>(machine.gauche,machine.droite).has(sens))) && (\exists BRelation<Integer,Integer> tmp_P2A; BRelation.cross(new Enumerated(1,6),new BSet<Integer>(machine.gauche,machine.droite)).has(tmp_P2A) && BOOL.implication(machine.gare.equals(2) && machine.sens.equals(machine.gauche),tmp_P2A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.P2A.apply(1)),new Pair<Integer,Integer>(2,machine.P2A.apply(2)),new Pair<Integer,Integer>(3,machine.P2A.apply(3)),new Pair<Integer,Integer>(4,machine.gauche),new Pair<Integer,Integer>(5,machine.P2A.apply(5)),new Pair<Integer,Integer>(6,machine.P2A.apply(6))))) && BOOL.implication(machine.gare.equals(2) && machine.sens.equals(machine.droite),tmp_P2A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.P2A.apply(1)),new Pair<Integer,Integer>(2,machine.P2A.apply(2)),new Pair<Integer,Integer>(3,machine.P2A.apply(3)),new Pair<Integer,Integer>(4,machine.droite),new Pair<Integer,Integer>(5,machine.P2A.apply(5)),new Pair<Integer,Integer>(6,machine.P2A.apply(6))))) && BOOL.implication(,tmp_P2A.equals(machine.P2A)); machine.P2A.equals(tmp_P2A)) && (\exists BRelation<Integer,Integer> tmp_P1A; BRelation.cross(new Enumerated(4,7),new BSet<Integer>(machine.gauche,machine.droite)).has(tmp_P1A) && BOOL.implication(machine.gare.equals(1) && machine.sens.equals(machine.gauche),tmp_P1A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(4,machine.gauche),new Pair<Integer,Integer>(5,machine.P1A.apply(5)),new Pair<Integer,Integer>(6,machine.P1A.apply(6)),new Pair<Integer,Integer>(7,machine.P1A.apply(7))))) && BOOL.implication(machine.gare.equals(1) && machine.sens.equals(machine.droite),tmp_P1A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(4,machine.droite),new Pair<Integer,Integer>(5,machine.P1A.apply(5)),new Pair<Integer,Integer>(6,machine.P1A.apply(6)),new Pair<Integer,Integer>(7,machine.P1A.apply(7))))) && BOOL.implication(,tmp_P1A.equals(machine.P1A)); machine.P1A.equals(tmp_P1A)); */
	public /*@ pure */ boolean guard_modifyAiguillage4( Integer sens, Integer gare) {
		return (new BSet<Integer>(new Integer(1),new Integer(2)).has(gare) && new BSet<Integer>(machine.gauche,machine.droite).has(sens));
	}

	/*@ public normal_behavior
		requires guard_modifyAiguillage4(sens,gare);
		assignable machine.P2A, machine.P1A;
		ensures guard_modifyAiguillage4(sens,gare) && (\exists BRelation<Integer,Integer> tmp_P2A; BRelation.cross(new Enumerated(1,6),new BSet<Integer>(machine.gauche,machine.droite)).has(tmp_P2A) && BOOL.implication(gare.equals(2) && sens.equals(machine.gauche),tmp_P2A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.get_P2A().apply(1)),new Pair<Integer,Integer>(2,machine.get_P2A().apply(2)),new Pair<Integer,Integer>(3,machine.get_P2A().apply(3)),new Pair<Integer,Integer>(4,machine.gauche),new Pair<Integer,Integer>(5,machine.get_P2A().apply(5)),new Pair<Integer,Integer>(6,machine.get_P2A().apply(6))))) && BOOL.implication(gare.equals(2) && sens.equals(machine.droite),tmp_P2A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.get_P2A().apply(1)),new Pair<Integer,Integer>(2,machine.get_P2A().apply(2)),new Pair<Integer,Integer>(3,machine.get_P2A().apply(3)),new Pair<Integer,Integer>(4,machine.droite),new Pair<Integer,Integer>(5,machine.get_P2A().apply(5)),new Pair<Integer,Integer>(6,machine.get_P2A().apply(6))))) && BOOL.implication(,tmp_P2A.equals(machine.get_P2A())); machine.get_P2A().equals(tmp_P2A)) && (\exists BRelation<Integer,Integer> tmp_P1A; BRelation.cross(new Enumerated(4,7),new BSet<Integer>(machine.gauche,machine.droite)).has(tmp_P1A) && BOOL.implication(gare.equals(1) && sens.equals(machine.gauche),tmp_P1A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(4,machine.gauche),new Pair<Integer,Integer>(5,machine.get_P1A().apply(5)),new Pair<Integer,Integer>(6,machine.get_P1A().apply(6)),new Pair<Integer,Integer>(7,machine.get_P1A().apply(7))))) && BOOL.implication(gare.equals(1) && sens.equals(machine.droite),tmp_P1A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(4,machine.droite),new Pair<Integer,Integer>(5,machine.get_P1A().apply(5)),new Pair<Integer,Integer>(6,machine.get_P1A().apply(6)),new Pair<Integer,Integer>(7,machine.get_P1A().apply(7))))) && BOOL.implication(,tmp_P1A.equals(machine.get_P1A())); machine.get_P1A().equals(tmp_P1A)); 
	 also
		requires !guard_modifyAiguillage4(sens,gare);
		assignable \nothing;
		ensures true; */
	public void run_modifyAiguillage4( Integer sens, Integer gare){
		if(guard_modifyAiguillage4(sens,gare)) {
			BRelation<Integer,Integer> P2A_tmp = machine.get_P2A();
			BRelation<Integer,Integer> P1A_tmp = machine.get_P1A();

		//machine.P2A = Utilities.non_det_assignment(P2A_tmp,(BRelation.cross(new Enumerated(1,6),new BSet<Integer>(machine.gauche,machine.droite)).has(P2A_tmp) && BOOL.implication(gare.equals(2) && sens.equals(machine.gauche),P2A_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,P2A_tmp.apply(1)),new Pair<Integer,Integer>(2,P2A_tmp.apply(2)),new Pair<Integer,Integer>(3,P2A_tmp.apply(3)),new Pair<Integer,Integer>(4,machine.gauche),new Pair<Integer,Integer>(5,P2A_tmp.apply(5)),new Pair<Integer,Integer>(6,P2A_tmp.apply(6))))) && BOOL.implication(gare.equals(2) && sens.equals(machine.droite),P2A_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,P2A_tmp.apply(1)),new Pair<Integer,Integer>(2,P2A_tmp.apply(2)),new Pair<Integer,Integer>(3,P2A_tmp.apply(3)),new Pair<Integer,Integer>(4,machine.droite),new Pair<Integer,Integer>(5,P2A_tmp.apply(5)),new Pair<Integer,Integer>(6,P2A_tmp.apply(6))))) && BOOL.implication(,P2A_tmp.equals(P2A_tmp))));
		//machine.P1A = Utilities.non_det_assignment(P1A_tmp,(BRelation.cross(new Enumerated(4,7),new BSet<Integer>(machine.gauche,machine.droite)).has(P1A_tmp) && BOOL.implication(gare.equals(1) && sens.equals(machine.gauche),P1A_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(4,machine.gauche),new Pair<Integer,Integer>(5,P1A_tmp.apply(5)),new Pair<Integer,Integer>(6,P1A_tmp.apply(6)),new Pair<Integer,Integer>(7,P1A_tmp.apply(7))))) && BOOL.implication(gare.equals(1) && sens.equals(machine.droite),P1A_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(4,machine.droite),new Pair<Integer,Integer>(5,P1A_tmp.apply(5)),new Pair<Integer,Integer>(6,P1A_tmp.apply(6)),new Pair<Integer,Integer>(7,P1A_tmp.apply(7))))) && BOOL.implication(,P1A_tmp.equals(P1A_tmp))));

			System.out.println("modifyAiguillage4 executed sens: " + sens + " gare: " + gare + " ");
		}
	}

}
