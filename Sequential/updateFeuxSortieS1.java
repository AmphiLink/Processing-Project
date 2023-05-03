package ProjetGroupe_sequential; 

import eventb_prelude.*;
import Util.Utilities;

public class updateFeuxSortieS1{
	/*@ spec_public */ private ProjetGroupeR2 machine; // reference to the machine 

	/*@ public normal_behavior
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public updateFeuxSortieS1(ProjetGroupeR2 m) {
		this.machine = m;
	}

	/*@ public normal_behavior
		requires true;
 		assignable \nothing;
		ensures (\result <==> machine.get_updated6().equals(false)) && (\exists BRelation<Integer,Integer> tmp_S1FS; BRelation.cross(new Enumerated(1,2),machine.trafficLights).has(tmp_S1FS) && BOOL.implication(machine.P1ToS1.apply(1).equals(0) && machine.P1ToS1.apply(2).equals(0),tmp_S1FS.apply(1).equals(machine.vert)) && BOOL.implication(machine.S1ToP3.apply(1).equals(0) && machine.S1ToP3.apply(2).equals(0),tmp_S1FS.apply(2).equals(machine.vert)) && BOOL.implication( || ,tmp_S1FS.apply(1).equals(machine.rouge)) && BOOL.implication( || ,tmp_S1FS.apply(2).equals(machine.rouge)); machine.S1FS.equals(tmp_S1FS)); */
	public /*@ pure */ boolean guard_updateFeuxSortieS1() {
		return machine.get_updated6().equals(false);
	}

	/*@ public normal_behavior
		requires guard_updateFeuxSortieS1();
		assignable machine.S1FS, machine.updated6;
		ensures guard_updateFeuxSortieS1() && (\exists BRelation<Integer,Integer> tmp_S1FS; BRelation.cross(new Enumerated(1,2),machine.trafficLights).has(tmp_S1FS) && BOOL.implication(machine.get_P1ToS1().apply(1).equals(0) && machine.get_P1ToS1().apply(2).equals(0),tmp_S1FS.apply(1).equals(machine.vert)) && BOOL.implication(machine.get_S1ToP3().apply(1).equals(0) && machine.get_S1ToP3().apply(2).equals(0),tmp_S1FS.apply(2).equals(machine.vert)) && BOOL.implication( || ,tmp_S1FS.apply(1).equals(machine.rouge)) && BOOL.implication( || ,tmp_S1FS.apply(2).equals(machine.rouge)); machine.get_S1FS().equals(tmp_S1FS)) &&  machine.get_updated6() == \old(true); 
	 also
		requires !guard_updateFeuxSortieS1();
		assignable \nothing;
		ensures true; */
	public void run_updateFeuxSortieS1(){
		if(guard_updateFeuxSortieS1()) {
			BRelation<Integer,Integer> S1FS_tmp = machine.get_S1FS();
			Boolean updated6_tmp = machine.get_updated6();

		//machine.S1FS = Utilities.non_det_assignment(S1FS_tmp,(BRelation.cross(new Enumerated(1,2),machine.trafficLights).has(S1FS_tmp) && BOOL.implication(machine.get_P1ToS1().apply(1).equals(0) && machine.get_P1ToS1().apply(2).equals(0),S1FS_tmp.apply(1).equals(machine.vert)) && BOOL.implication(machine.get_S1ToP3().apply(1).equals(0) && machine.get_S1ToP3().apply(2).equals(0),S1FS_tmp.apply(2).equals(machine.vert)) && BOOL.implication( || ,S1FS_tmp.apply(1).equals(machine.rouge)) && BOOL.implication( || ,S1FS_tmp.apply(2).equals(machine.rouge))));
			machine.set_updated6(true);

			System.out.println("updateFeuxSortieS1 executed ");
		}
	}

}
