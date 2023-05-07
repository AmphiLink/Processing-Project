package ProjetGroupe_sequential; 

import eventb_prelude.*;
import Util.Utilities;

public class modifyAiguillage0{
	/*@ spec_public */ private ProjetGroupeR2 machine; // reference to the machine 

	/*@ public normal_behavior
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public modifyAiguillage0(ProjetGroupeR2 m) {
		this.machine = m;
	}

	/*@ public normal_behavior
		requires true;
 		assignable \nothing;
		ensures (\result <==> new BSet<Integer>(machine.gauche,machine.droite).has(sens)) && (\exists BRelation<Integer,Integer> tmp_P3A; BRelation.cross(new Enumerated(0,3),new BSet<Integer>(machine.gauche,machine.droite)).has(tmp_P3A) && BOOL.implication(machine.sens.equals(machine.gauche),tmp_P3A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(0,machine.gauche),new Pair<Integer,Integer>(1,machine.P3A.apply(1)),new Pair<Integer,Integer>(2,machine.P3A.apply(2)),new Pair<Integer,Integer>(3,machine.P3A.apply(3))))) && BOOL.implication(machine.sens.equals(machine.droite),tmp_P3A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(0,machine.droite),new Pair<Integer,Integer>(1,machine.P3A.apply(1)),new Pair<Integer,Integer>(2,machine.P3A.apply(2)),new Pair<Integer,Integer>(3,machine.P3A.apply(3))))); machine.P3A.equals(tmp_P3A)) && (\exists BRelation<Integer,Integer> tmp_P3FS; BRelation.cross(new Enumerated(1,1),machine.trafficLights).has(tmp_P3FS) && BOOL.implication(machine.sens.equals(machine.droite) && machine.P2ToP3.apply(1).equals(0) && machine.P2ToP3.apply(2).equals(0),tmp_P3FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.vert)))) && BOOL.implication(machine.sens.equals(machine.droite) &&  || ,tmp_P3FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.rouge)))) && BOOL.implication(machine.sens.equals(machine.gauche) && machine.S1ToP3.apply(1).equals(0) && machine.S1ToP3.apply(2).equals(0),tmp_P3FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.vert)))) && BOOL.implication(machine.sens.equals(machine.gauche) &&  || ,tmp_P3FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.rouge)))); machine.P3FS.equals(tmp_P3FS)); */
	public /*@ pure */ boolean guard_modifyAiguillage0( Integer sens) {
		return new BSet<Integer>(machine.gauche,machine.droite).has(sens);
	}

	/*@ public normal_behavior
		requires guard_modifyAiguillage0(sens);
		assignable machine.P3A, machine.P3FS;
		ensures guard_modifyAiguillage0(sens) && (\exists BRelation<Integer,Integer> tmp_P3A; BRelation.cross(new Enumerated(0,3),new BSet<Integer>(machine.gauche,machine.droite)).has(tmp_P3A) && BOOL.implication(sens.equals(machine.gauche),tmp_P3A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(0,machine.gauche),new Pair<Integer,Integer>(1,machine.get_P3A().apply(1)),new Pair<Integer,Integer>(2,machine.get_P3A().apply(2)),new Pair<Integer,Integer>(3,machine.get_P3A().apply(3))))) && BOOL.implication(sens.equals(machine.droite),tmp_P3A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(0,machine.droite),new Pair<Integer,Integer>(1,machine.get_P3A().apply(1)),new Pair<Integer,Integer>(2,machine.get_P3A().apply(2)),new Pair<Integer,Integer>(3,machine.get_P3A().apply(3))))); machine.get_P3A().equals(tmp_P3A)) && (\exists BRelation<Integer,Integer> tmp_P3FS; BRelation.cross(new Enumerated(1,1),machine.trafficLights).has(tmp_P3FS) && BOOL.implication(sens.equals(machine.droite) && machine.get_P2ToP3().apply(1).equals(0) && machine.get_P2ToP3().apply(2).equals(0),tmp_P3FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.vert)))) && BOOL.implication(sens.equals(machine.droite) &&  || ,tmp_P3FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.rouge)))) && BOOL.implication(sens.equals(machine.gauche) && machine.get_S1ToP3().apply(1).equals(0) && machine.get_S1ToP3().apply(2).equals(0),tmp_P3FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.vert)))) && BOOL.implication(sens.equals(machine.gauche) &&  || ,tmp_P3FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.rouge)))); machine.get_P3FS().equals(tmp_P3FS)); 
	 also
		requires !guard_modifyAiguillage0(sens);
		assignable \nothing;
		ensures true; */
	public void run_modifyAiguillage0( Integer sens){
		if(guard_modifyAiguillage0(sens)) {
			BRelation<Integer,Integer> P3A_tmp = machine.get_P3A();
			BRelation<Integer,Integer> P3FS_tmp = machine.get_P3FS();

		//machine.P3A = Utilities.non_det_assignment(P3A_tmp,(BRelation.cross(new Enumerated(0,3),new BSet<Integer>(machine.gauche,machine.droite)).has(P3A_tmp) && BOOL.implication(sens.equals(machine.gauche),P3A_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(0,machine.gauche),new Pair<Integer,Integer>(1,P3A_tmp.apply(1)),new Pair<Integer,Integer>(2,P3A_tmp.apply(2)),new Pair<Integer,Integer>(3,P3A_tmp.apply(3))))) && BOOL.implication(sens.equals(machine.droite),P3A_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(0,machine.droite),new Pair<Integer,Integer>(1,P3A_tmp.apply(1)),new Pair<Integer,Integer>(2,P3A_tmp.apply(2)),new Pair<Integer,Integer>(3,P3A_tmp.apply(3)))))));
		//machine.P3FS = Utilities.non_det_assignment(P3FS_tmp,(BRelation.cross(new Enumerated(1,1),machine.trafficLights).has(P3FS_tmp) && BOOL.implication(sens.equals(machine.droite) && machine.get_P2ToP3().apply(1).equals(0) && machine.get_P2ToP3().apply(2).equals(0),P3FS_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.vert)))) && BOOL.implication(sens.equals(machine.droite) &&  || ,P3FS_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.rouge)))) && BOOL.implication(sens.equals(machine.gauche) && machine.get_S1ToP3().apply(1).equals(0) && machine.get_S1ToP3().apply(2).equals(0),P3FS_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.vert)))) && BOOL.implication(sens.equals(machine.gauche) &&  || ,P3FS_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.rouge))))));

			System.out.println("modifyAiguillage0 executed sens: " + sens + " ");
		}
	}

}
