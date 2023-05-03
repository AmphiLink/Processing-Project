

public class modifyAiguillage7{
	/*@ spec_public */ private ProjetGroupeR2 machine; // reference to the machine 

	/*@ public normal_behavior
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public modifyAiguillage7(ProjetGroupeR2 m) {
		this.machine = m;
	}

	/*@ public normal_behavior
		requires true;
 		assignable \nothing;
		ensures (\result <==> new BSet<Integer>(machine.gauche,machine.droite).has(sens)) && (\exists BRelation<Integer,Integer> tmp_P1A; BRelation.cross(new Enumerated(4,7),new BSet<Integer>(machine.gauche,machine.droite)).has(tmp_P1A) && BOOL.implication(machine.sens.equals(machine.gauche),tmp_P1A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(4,machine.P1A.apply(4)),new Pair<Integer,Integer>(5,machine.P1A.apply(5)),new Pair<Integer,Integer>(6,machine.P1A.apply(6)),new Pair<Integer,Integer>(7,machine.gauche)))) && BOOL.implication(machine.sens.equals(machine.droite),tmp_P1A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(4,machine.P1A.apply(4)),new Pair<Integer,Integer>(5,machine.P1A.apply(5)),new Pair<Integer,Integer>(6,machine.P1A.apply(6)),new Pair<Integer,Integer>(7,machine.droite)))); machine.P1A.equals(tmp_P1A)) && (\exists BRelation<Integer,Integer> tmp_P1FS; BRelation.cross(new Enumerated(2,2),machine.trafficLights).has(tmp_P1FS) && BOOL.implication(machine.sens.equals(machine.droite) && machine.P1ToP2.apply(1).equals(0) && machine.P1ToP2.apply(2).equals(0),tmp_P1FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,machine.vert)))) && BOOL.implication(machine.sens.equals(machine.droite) &&  || ,tmp_P1FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,machine.rouge)))) && BOOL.implication(machine.sens.equals(machine.gauche) && machine.P1ToS1.apply(1).equals(0) && machine.P1ToS1.apply(2).equals(0),tmp_P1FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,machine.vert)))) && BOOL.implication(machine.sens.equals(machine.gauche) &&  || ,tmp_P1FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,machine.rouge)))); machine.P1FS.equals(tmp_P1FS)); */
	public /*@ pure */ boolean guard_modifyAiguillage7( Integer sens) {
		return new BSet<Integer>(machine.gauche,machine.droite).has(sens);
	}

	/*@ public normal_behavior
		requires guard_modifyAiguillage7(sens);
		assignable machine.P1A, machine.P1FS;
		ensures guard_modifyAiguillage7(sens) && (\exists BRelation<Integer,Integer> tmp_P1A; BRelation.cross(new Enumerated(4,7),new BSet<Integer>(machine.gauche,machine.droite)).has(tmp_P1A) && BOOL.implication(sens.equals(machine.gauche),tmp_P1A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(4,machine.get_P1A().apply(4)),new Pair<Integer,Integer>(5,machine.get_P1A().apply(5)),new Pair<Integer,Integer>(6,machine.get_P1A().apply(6)),new Pair<Integer,Integer>(7,machine.gauche)))) && BOOL.implication(sens.equals(machine.droite),tmp_P1A.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(4,machine.get_P1A().apply(4)),new Pair<Integer,Integer>(5,machine.get_P1A().apply(5)),new Pair<Integer,Integer>(6,machine.get_P1A().apply(6)),new Pair<Integer,Integer>(7,machine.droite)))); machine.get_P1A().equals(tmp_P1A)) && (\exists BRelation<Integer,Integer> tmp_P1FS; BRelation.cross(new Enumerated(2,2),machine.trafficLights).has(tmp_P1FS) && BOOL.implication(sens.equals(machine.droite) && machine.get_P1ToP2().apply(1).equals(0) && machine.get_P1ToP2().apply(2).equals(0),tmp_P1FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,machine.vert)))) && BOOL.implication(sens.equals(machine.droite) &&  || ,tmp_P1FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,machine.rouge)))) && BOOL.implication(sens.equals(machine.gauche) && machine.get_P1ToS1().apply(1).equals(0) && machine.get_P1ToS1().apply(2).equals(0),tmp_P1FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,machine.vert)))) && BOOL.implication(sens.equals(machine.gauche) &&  || ,tmp_P1FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,machine.rouge)))); machine.get_P1FS().equals(tmp_P1FS)); 
	 also
		requires !guard_modifyAiguillage7(sens);
		assignable \nothing;
		ensures true; */
	public void run_modifyAiguillage7( Integer sens){
		if(guard_modifyAiguillage7(sens)) {
			BRelation<Integer,Integer> P1A_tmp = machine.get_P1A();
			BRelation<Integer,Integer> P1FS_tmp = machine.get_P1FS();

		//machine.P1A = Utilities.non_det_assignment(P1A_tmp,(BRelation.cross(new Enumerated(4,7),new BSet<Integer>(machine.gauche,machine.droite)).has(P1A_tmp) && BOOL.implication(sens.equals(machine.gauche),P1A_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(4,P1A_tmp.apply(4)),new Pair<Integer,Integer>(5,P1A_tmp.apply(5)),new Pair<Integer,Integer>(6,P1A_tmp.apply(6)),new Pair<Integer,Integer>(7,machine.gauche)))) && BOOL.implication(sens.equals(machine.droite),P1A_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(4,P1A_tmp.apply(4)),new Pair<Integer,Integer>(5,P1A_tmp.apply(5)),new Pair<Integer,Integer>(6,P1A_tmp.apply(6)),new Pair<Integer,Integer>(7,machine.droite))))));
		//machine.P1FS = Utilities.non_det_assignment(P1FS_tmp,(BRelation.cross(new Enumerated(2,2),machine.trafficLights).has(P1FS_tmp) && BOOL.implication(sens.equals(machine.droite) && machine.get_P1ToP2().apply(1).equals(0) && machine.get_P1ToP2().apply(2).equals(0),P1FS_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,machine.vert)))) && BOOL.implication(sens.equals(machine.droite) &&  || ,P1FS_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,machine.rouge)))) && BOOL.implication(sens.equals(machine.gauche) && machine.get_P1ToS1().apply(1).equals(0) && machine.get_P1ToS1().apply(2).equals(0),P1FS_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,machine.vert)))) && BOOL.implication(sens.equals(machine.gauche) &&  || ,P1FS_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,machine.rouge))))));

			System.out.println("modifyAiguillage7 executed sens: " + sens + " ");
		}
	}

}
