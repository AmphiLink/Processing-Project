package ProjetGroupe_sequential; 

import eventb_prelude.*;
import Util.Utilities;

public class updateFeuxSortieP2{
	/*@ spec_public */ private ProjetGroupeR2 machine; // reference to the machine 

	/*@ public normal_behavior
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public updateFeuxSortieP2(ProjetGroupeR2 m) {
		this.machine = m;
	}

	/*@ public normal_behavior
		requires true;
 		assignable \nothing;
		ensures (\result <==> machine.get_updated5().equals(false)) && (\exists BRelation<Integer,Integer> tmp_P2FS; BRelation.cross(new Enumerated(1,2),machine.trafficLights).has(tmp_P2FS) && BOOL.implication(machine.P1ToP2.apply(1).equals(0) && machine.P1ToP2.apply(2).equals(0),tmp_P2FS.apply(1).equals(machine.vert)) && BOOL.implication(machine.P2ToP3.apply(1).equals(0) && machine.P2ToP3.apply(2).equals(0),tmp_P2FS.apply(2).equals(machine.vert)) && BOOL.implication( || ,tmp_P2FS.apply(1).equals(machine.rouge)) && BOOL.implication( || ,tmp_P2FS.apply(2).equals(machine.rouge)); machine.P2FS.equals(tmp_P2FS)); */
	public /*@ pure */ boolean guard_updateFeuxSortieP2() {
		return machine.get_updated5().equals(false);
	}

	/*@ public normal_behavior
		requires guard_updateFeuxSortieP2();
		assignable machine.P2FS, machine.updated5;
		ensures guard_updateFeuxSortieP2() && (\exists BRelation<Integer,Integer> tmp_P2FS; BRelation.cross(new Enumerated(1,2),machine.trafficLights).has(tmp_P2FS) && BOOL.implication(machine.get_P1ToP2().apply(1).equals(0) && machine.get_P1ToP2().apply(2).equals(0),tmp_P2FS.apply(1).equals(machine.vert)) && BOOL.implication(machine.get_P2ToP3().apply(1).equals(0) && machine.get_P2ToP3().apply(2).equals(0),tmp_P2FS.apply(2).equals(machine.vert)) && BOOL.implication( || ,tmp_P2FS.apply(1).equals(machine.rouge)) && BOOL.implication( || ,tmp_P2FS.apply(2).equals(machine.rouge)); machine.get_P2FS().equals(tmp_P2FS)) &&  machine.get_updated5() == \old(true); 
	 also
		requires !guard_updateFeuxSortieP2();
		assignable \nothing;
		ensures true; */
	public void run_updateFeuxSortieP2(){
		if(guard_updateFeuxSortieP2()) {
			BRelation<Integer,Integer> P2FS_tmp = machine.get_P2FS();
			Boolean updated5_tmp = machine.get_updated5();

		//machine.P2FS = Utilities.non_det_assignment(P2FS_tmp,(BRelation.cross(new Enumerated(1,2),machine.trafficLights).has(P2FS_tmp) && BOOL.implication(machine.get_P1ToP2().apply(1).equals(0) && machine.get_P1ToP2().apply(2).equals(0),P2FS_tmp.apply(1).equals(machine.vert)) && BOOL.implication(machine.get_P2ToP3().apply(1).equals(0) && machine.get_P2ToP3().apply(2).equals(0),P2FS_tmp.apply(2).equals(machine.vert)) && BOOL.implication( || ,P2FS_tmp.apply(1).equals(machine.rouge)) && BOOL.implication( || ,P2FS_tmp.apply(2).equals(machine.rouge))));
			machine.set_updated5(true);

			System.out.println("updateFeuxSortieP2 executed ");
		}
	}

}
