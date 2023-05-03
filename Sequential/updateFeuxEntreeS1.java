package ProjetGroupe_sequential; 

import eventb_prelude.*;
import Util.Utilities;

public class updateFeuxEntreeS1{
	/*@ spec_public */ private ProjetGroupeR2 machine; // reference to the machine 

	/*@ public normal_behavior
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public updateFeuxEntreeS1(ProjetGroupeR2 m) {
		this.machine = m;
	}

	/*@ public normal_behavior
		requires true;
 		assignable \nothing;
		ensures (\result <==> machine.get_updated4().equals(false)) && (\exists BRelation<Integer,Integer> tmp_S1F; BRelation.cross(new Enumerated(1,4),machine.trafficLights).has(tmp_S1F) && BOOL.implication(machine.S1.apply(1).equals(0),tmp_S1F.apply(1).equals(machine.vert) && tmp_S1F.apply(3).equals(machine.vert)) && BOOL.implication(,tmp_S1F.apply(1).equals(machine.rouge) && tmp_S1F.apply(3).equals(machine.rouge)) && BOOL.implication(machine.S1.apply(2).equals(0),tmp_S1F.apply(2).equals(machine.vert) && tmp_S1F.apply(4).equals(machine.vert)) && BOOL.implication(,tmp_S1F.apply(2).equals(machine.rouge) && tmp_S1F.apply(4).equals(machine.rouge)); machine.S1F.equals(tmp_S1F)); */
	public /*@ pure */ boolean guard_updateFeuxEntreeS1() {
		return machine.get_updated4().equals(false);
	}

	/*@ public normal_behavior
		requires guard_updateFeuxEntreeS1();
		assignable machine.S1F, machine.updated4;
		ensures guard_updateFeuxEntreeS1() && (\exists BRelation<Integer,Integer> tmp_S1F; BRelation.cross(new Enumerated(1,4),machine.trafficLights).has(tmp_S1F) && BOOL.implication(machine.get_S1().apply(1).equals(0),tmp_S1F.apply(1).equals(machine.vert) && tmp_S1F.apply(3).equals(machine.vert)) && BOOL.implication(,tmp_S1F.apply(1).equals(machine.rouge) && tmp_S1F.apply(3).equals(machine.rouge)) && BOOL.implication(machine.get_S1().apply(2).equals(0),tmp_S1F.apply(2).equals(machine.vert) && tmp_S1F.apply(4).equals(machine.vert)) && BOOL.implication(,tmp_S1F.apply(2).equals(machine.rouge) && tmp_S1F.apply(4).equals(machine.rouge)); machine.get_S1F().equals(tmp_S1F)) &&  machine.get_updated4() == \old(true); 
	 also
		requires !guard_updateFeuxEntreeS1();
		assignable \nothing;
		ensures true; */
	public void run_updateFeuxEntreeS1(){
		if(guard_updateFeuxEntreeS1()) {
			BRelation<Integer,Integer> S1F_tmp = machine.get_S1F();
			Boolean updated4_tmp = machine.get_updated4();

		//machine.S1F = Utilities.non_det_assignment(S1F_tmp,(BRelation.cross(new Enumerated(1,4),machine.trafficLights).has(S1F_tmp) && BOOL.implication(machine.get_S1().apply(1).equals(0),S1F_tmp.apply(1).equals(machine.vert) && S1F_tmp.apply(3).equals(machine.vert)) && BOOL.implication(,S1F_tmp.apply(1).equals(machine.rouge) && S1F_tmp.apply(3).equals(machine.rouge)) && BOOL.implication(machine.get_S1().apply(2).equals(0),S1F_tmp.apply(2).equals(machine.vert) && S1F_tmp.apply(4).equals(machine.vert)) && BOOL.implication(,S1F_tmp.apply(2).equals(machine.rouge) && S1F_tmp.apply(4).equals(machine.rouge))));
			machine.set_updated4(true);

			System.out.println("updateFeuxEntreeS1 executed ");
		}
	}

}
