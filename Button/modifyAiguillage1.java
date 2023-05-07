package ProjetGroupe_sequential; 

import eventb_prelude.*;
import Util.Utilities;

public class modifyAiguillage1{
	/*@ spec_public */ private ProjetGroupeR2 machine; // reference to the machine 

	/*@ public normal_behavior
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public modifyAiguillage1(ProjetGroupeR2 m) {
		this.machine = m;
	}

	/*@ public normal_behavior
		requires true;
 		assignable \nothing;
		ensures (\result <==> (new BSet<Integer>(new Integer(2),new Integer(3),new Integer(4)).has(gare) && new BSet<Integer>(machine.gauche,machine.droite).has(sens))) && (\exists BRelation<Integer,Integer> tmp_P2A; BRelation.cross(new Enumerated(1,6),new BSet<Integer>(machine.gauche,machine.droite)).has(tmp_P2A) && BOOL.implication(machine.gare.equals(2) && machine.sens.equals(machine.gauche),tmp_P2A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.gauche),new Pair<Integer,Integer>(2,machine.P2A.apply(2)),new Pair<Integer,Integer>(3,machine.P2A.apply(3)),new Pair<Integer,Integer>(4,machine.P2A.apply(4)),new Pair<Integer,Integer>(5,machine.P2A.apply(5)),new Pair<Integer,Integer>(6,machine.P2A.apply(6))))) && BOOL.implication(machine.gare.equals(2) && machine.sens.equals(machine.droite),tmp_P2A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.droite),new Pair<Integer,Integer>(2,machine.P2A.apply(2)),new Pair<Integer,Integer>(3,machine.P2A.apply(3)),new Pair<Integer,Integer>(4,machine.P2A.apply(4)),new Pair<Integer,Integer>(5,machine.P2A.apply(5)),new Pair<Integer,Integer>(6,machine.P2A.apply(6))))) && BOOL.implication(,tmp_P2A.equals(machine.P2A)); machine.P2A.equals(tmp_P2A)) && (\exists BRelation<Integer,Integer> tmp_P3A; BRelation.cross(new Enumerated(0,3),new BSet<Integer>(machine.gauche,machine.droite)).has(tmp_P3A) && BOOL.implication(machine.gare.equals(3) && machine.sens.equals(machine.gauche),tmp_P3A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(0,machine.P3A.apply(0)),new Pair<Integer,Integer>(1,machine.gauche),new Pair<Integer,Integer>(2,machine.P3A.apply(2)),new Pair<Integer,Integer>(3,machine.P3A.apply(3))))) && BOOL.implication(machine.gare.equals(3) && machine.sens.equals(machine.droite),tmp_P3A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(0,machine.P3A.apply(0)),new Pair<Integer,Integer>(1,machine.droite),new Pair<Integer,Integer>(2,machine.P3A.apply(2)),new Pair<Integer,Integer>(3,machine.P3A.apply(3))))) && BOOL.implication(,tmp_P3A.equals(machine.P3A)); machine.P3A.equals(tmp_P3A)) && (\exists BRelation<Integer,Integer> tmp_S1A; BRelation.cross(new Enumerated(1,2),new BSet<Integer>(machine.gauche,machine.droite)).has(tmp_S1A) && BOOL.implication(machine.gare.equals(4) && machine.sens.equals(machine.gauche),tmp_S1A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.gauche),new Pair<Integer,Integer>(2,machine.S1A.apply(2))))) && BOOL.implication(machine.gare.equals(4) && machine.sens.equals(machine.droite),tmp_S1A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.droite),new Pair<Integer,Integer>(2,machine.S1A.apply(2))))) && BOOL.implication(,tmp_S1A.equals(machine.S1A)); machine.S1A.equals(tmp_S1A)); */
	public /*@ pure */ boolean guard_modifyAiguillage1( Integer sens, Integer gare) {
		return (new BSet<Integer>(new Integer(2),new Integer(3),new Integer(4)).has(gare) && new BSet<Integer>(machine.gauche,machine.droite).has(sens));
	}

	/*@ public normal_behavior
		requires guard_modifyAiguillage1(sens,gare);
		assignable machine.P2A, machine.P3A, machine.S1A;
		ensures guard_modifyAiguillage1(sens,gare) && (\exists BRelation<Integer,Integer> tmp_P2A; BRelation.cross(new Enumerated(1,6),new BSet<Integer>(machine.gauche,machine.droite)).has(tmp_P2A) && BOOL.implication(gare.equals(2) && sens.equals(machine.gauche),tmp_P2A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.gauche),new Pair<Integer,Integer>(2,machine.get_P2A().apply(2)),new Pair<Integer,Integer>(3,machine.get_P2A().apply(3)),new Pair<Integer,Integer>(4,machine.get_P2A().apply(4)),new Pair<Integer,Integer>(5,machine.get_P2A().apply(5)),new Pair<Integer,Integer>(6,machine.get_P2A().apply(6))))) && BOOL.implication(gare.equals(2) && sens.equals(machine.droite),tmp_P2A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.droite),new Pair<Integer,Integer>(2,machine.get_P2A().apply(2)),new Pair<Integer,Integer>(3,machine.get_P2A().apply(3)),new Pair<Integer,Integer>(4,machine.get_P2A().apply(4)),new Pair<Integer,Integer>(5,machine.get_P2A().apply(5)),new Pair<Integer,Integer>(6,machine.get_P2A().apply(6))))) && BOOL.implication(,tmp_P2A.equals(machine.get_P2A())); machine.get_P2A().equals(tmp_P2A)) && (\exists BRelation<Integer,Integer> tmp_P3A; BRelation.cross(new Enumerated(0,3),new BSet<Integer>(machine.gauche,machine.droite)).has(tmp_P3A) && BOOL.implication(gare.equals(3) && sens.equals(machine.gauche),tmp_P3A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(0,machine.get_P3A().apply(0)),new Pair<Integer,Integer>(1,machine.gauche),new Pair<Integer,Integer>(2,machine.get_P3A().apply(2)),new Pair<Integer,Integer>(3,machine.get_P3A().apply(3))))) && BOOL.implication(gare.equals(3) && sens.equals(machine.droite),tmp_P3A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(0,machine.get_P3A().apply(0)),new Pair<Integer,Integer>(1,machine.droite),new Pair<Integer,Integer>(2,machine.get_P3A().apply(2)),new Pair<Integer,Integer>(3,machine.get_P3A().apply(3))))) && BOOL.implication(,tmp_P3A.equals(machine.get_P3A())); machine.get_P3A().equals(tmp_P3A)) && (\exists BRelation<Integer,Integer> tmp_S1A; BRelation.cross(new Enumerated(1,2),new BSet<Integer>(machine.gauche,machine.droite)).has(tmp_S1A) && BOOL.implication(gare.equals(4) && sens.equals(machine.gauche),tmp_S1A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.gauche),new Pair<Integer,Integer>(2,machine.get_S1A().apply(2))))) && BOOL.implication(gare.equals(4) && sens.equals(machine.droite),tmp_S1A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.droite),new Pair<Integer,Integer>(2,machine.get_S1A().apply(2))))) && BOOL.implication(,tmp_S1A.equals(machine.get_S1A())); machine.get_S1A().equals(tmp_S1A)); 
	 also
		requires !guard_modifyAiguillage1(sens,gare);
		assignable \nothing;
		ensures true; */
	public void run_modifyAiguillage1( Integer sens, Integer gare){
		if(guard_modifyAiguillage1(sens,gare)) {
			BRelation<Integer,Integer> P2A_tmp = machine.get_P2A();
			BRelation<Integer,Integer> P3A_tmp = machine.get_P3A();
			BRelation<Integer,Integer> S1A_tmp = machine.get_S1A();

		//machine.P2A = Utilities.non_det_assignment(P2A_tmp,(BRelation.cross(new Enumerated(1,6),new BSet<Integer>(machine.gauche,machine.droite)).has(P2A_tmp) && BOOL.implication(gare.equals(2) && sens.equals(machine.gauche),P2A_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.gauche),new Pair<Integer,Integer>(2,P2A_tmp.apply(2)),new Pair<Integer,Integer>(3,P2A_tmp.apply(3)),new Pair<Integer,Integer>(4,P2A_tmp.apply(4)),new Pair<Integer,Integer>(5,P2A_tmp.apply(5)),new Pair<Integer,Integer>(6,P2A_tmp.apply(6))))) && BOOL.implication(gare.equals(2) && sens.equals(machine.droite),P2A_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.droite),new Pair<Integer,Integer>(2,P2A_tmp.apply(2)),new Pair<Integer,Integer>(3,P2A_tmp.apply(3)),new Pair<Integer,Integer>(4,P2A_tmp.apply(4)),new Pair<Integer,Integer>(5,P2A_tmp.apply(5)),new Pair<Integer,Integer>(6,P2A_tmp.apply(6))))) && BOOL.implication(,P2A_tmp.equals(P2A_tmp))));
		//machine.P3A = Utilities.non_det_assignment(P3A_tmp,(BRelation.cross(new Enumerated(0,3),new BSet<Integer>(machine.gauche,machine.droite)).has(P3A_tmp) && BOOL.implication(gare.equals(3) && sens.equals(machine.gauche),P3A_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(0,P3A_tmp.apply(0)),new Pair<Integer,Integer>(1,machine.gauche),new Pair<Integer,Integer>(2,P3A_tmp.apply(2)),new Pair<Integer,Integer>(3,P3A_tmp.apply(3))))) && BOOL.implication(gare.equals(3) && sens.equals(machine.droite),P3A_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(0,P3A_tmp.apply(0)),new Pair<Integer,Integer>(1,machine.droite),new Pair<Integer,Integer>(2,P3A_tmp.apply(2)),new Pair<Integer,Integer>(3,P3A_tmp.apply(3))))) && BOOL.implication(,P3A_tmp.equals(P3A_tmp))));
		//machine.S1A = Utilities.non_det_assignment(S1A_tmp,(BRelation.cross(new Enumerated(1,2),new BSet<Integer>(machine.gauche,machine.droite)).has(S1A_tmp) && BOOL.implication(gare.equals(4) && sens.equals(machine.gauche),S1A_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.gauche),new Pair<Integer,Integer>(2,S1A_tmp.apply(2))))) && BOOL.implication(gare.equals(4) && sens.equals(machine.droite),S1A_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.droite),new Pair<Integer,Integer>(2,S1A_tmp.apply(2))))) && BOOL.implication(,S1A_tmp.equals(S1A_tmp))));

			System.out.println("modifyAiguillage1 executed sens: " + sens + " gare: " + gare + " ");
		}
	}

}
