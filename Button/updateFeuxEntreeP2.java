package ProjetGroupe_sequential; 

import eventb_prelude.*;
import Util.Utilities;

public class updateFeuxEntreeP2{
	/*@ spec_public */ private ProjetGroupeR2 machine; // reference to the machine 

	/*@ public normal_behavior
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public updateFeuxEntreeP2(ProjetGroupeR2 m) {
		this.machine = m;
	}

	/*@ public normal_behavior
		requires true;
 		assignable \nothing;
		ensures (\result <==> machine.get_updated2().equals(false)) && (\exists BRelation<Integer,Integer> tmp_P2F; BRelation.cross(new Enumerated(1,8),machine.trafficLights).has(tmp_P2F) && BOOL.implication(machine.P2.apply(1).equals(0),tmp_P2F.apply(5).equals(machine.vert)) && BOOL.implication(,tmp_P2F.apply(5).equals(machine.rouge)) && BOOL.implication(machine.P2.apply(2).equals(0),tmp_P2F.apply(6).equals(machine.vert)) && BOOL.implication(,tmp_P2F.apply(6).equals(machine.rouge)) && BOOL.implication(machine.P2.apply(3).equals(0),tmp_P2F.apply(7).equals(machine.vert)) && BOOL.implication(,tmp_P2F.apply(7).equals(machine.rouge)) && BOOL.implication(machine.P2.apply(4).equals(0),tmp_P2F.apply(8).equals(machine.vert)) && BOOL.implication(,tmp_P2F.apply(8).equals(machine.rouge)) && BOOL.implication(machine.P2.apply(1).equals(0),tmp_P2F.apply(1).equals(machine.vert)) && BOOL.implication(,tmp_P2F.apply(1).equals(machine.rouge)) && BOOL.implication(machine.P2.apply(2).equals(0),tmp_P2F.apply(2).equals(machine.vert)) && BOOL.implication(,tmp_P2F.apply(2).equals(machine.rouge)) && BOOL.implication(machine.P2.apply(3).equals(0),tmp_P2F.apply(3).equals(machine.vert)) && BOOL.implication(,tmp_P2F.apply(3).equals(machine.rouge)) && BOOL.implication(machine.P2.apply(4).equals(0),tmp_P2F.apply(4).equals(machine.vert)) && BOOL.implication(,tmp_P2F.apply(4).equals(machine.rouge)); machine.P2F.equals(tmp_P2F)); */
	public /*@ pure */ boolean guard_updateFeuxEntreeP2() {
		return machine.get_updated2().equals(false);
	}

	/*@ public normal_behavior
		requires guard_updateFeuxEntreeP2();
		assignable machine.P2F, machine.updated2;
		ensures guard_updateFeuxEntreeP2() && (\exists BRelation<Integer,Integer> tmp_P2F; BRelation.cross(new Enumerated(1,8),machine.trafficLights).has(tmp_P2F) && BOOL.implication(machine.get_P2().apply(1).equals(0),tmp_P2F.apply(5).equals(machine.vert)) && BOOL.implication(,tmp_P2F.apply(5).equals(machine.rouge)) && BOOL.implication(machine.get_P2().apply(2).equals(0),tmp_P2F.apply(6).equals(machine.vert)) && BOOL.implication(,tmp_P2F.apply(6).equals(machine.rouge)) && BOOL.implication(machine.get_P2().apply(3).equals(0),tmp_P2F.apply(7).equals(machine.vert)) && BOOL.implication(,tmp_P2F.apply(7).equals(machine.rouge)) && BOOL.implication(machine.get_P2().apply(4).equals(0),tmp_P2F.apply(8).equals(machine.vert)) && BOOL.implication(,tmp_P2F.apply(8).equals(machine.rouge)) && BOOL.implication(machine.get_P2().apply(1).equals(0),tmp_P2F.apply(1).equals(machine.vert)) && BOOL.implication(,tmp_P2F.apply(1).equals(machine.rouge)) && BOOL.implication(machine.get_P2().apply(2).equals(0),tmp_P2F.apply(2).equals(machine.vert)) && BOOL.implication(,tmp_P2F.apply(2).equals(machine.rouge)) && BOOL.implication(machine.get_P2().apply(3).equals(0),tmp_P2F.apply(3).equals(machine.vert)) && BOOL.implication(,tmp_P2F.apply(3).equals(machine.rouge)) && BOOL.implication(machine.get_P2().apply(4).equals(0),tmp_P2F.apply(4).equals(machine.vert)) && BOOL.implication(,tmp_P2F.apply(4).equals(machine.rouge)); machine.get_P2F().equals(tmp_P2F)) &&  machine.get_updated2() == \old(true); 
	 also
		requires !guard_updateFeuxEntreeP2();
		assignable \nothing;
		ensures true; */
	public void run_updateFeuxEntreeP2(){
		if(guard_updateFeuxEntreeP2()) {
			BRelation<Integer,Integer> P2F_tmp = machine.get_P2F();
			Boolean updated2_tmp = machine.get_updated2();

		//machine.P2F = Utilities.non_det_assignment(P2F_tmp,(BRelation.cross(new Enumerated(1,8),machine.trafficLights).has(P2F_tmp) && BOOL.implication(machine.get_P2().apply(1).equals(0),P2F_tmp.apply(5).equals(machine.vert)) && BOOL.implication(,P2F_tmp.apply(5).equals(machine.rouge)) && BOOL.implication(machine.get_P2().apply(2).equals(0),P2F_tmp.apply(6).equals(machine.vert)) && BOOL.implication(,P2F_tmp.apply(6).equals(machine.rouge)) && BOOL.implication(machine.get_P2().apply(3).equals(0),P2F_tmp.apply(7).equals(machine.vert)) && BOOL.implication(,P2F_tmp.apply(7).equals(machine.rouge)) && BOOL.implication(machine.get_P2().apply(4).equals(0),P2F_tmp.apply(8).equals(machine.vert)) && BOOL.implication(,P2F_tmp.apply(8).equals(machine.rouge)) && BOOL.implication(machine.get_P2().apply(1).equals(0),P2F_tmp.apply(1).equals(machine.vert)) && BOOL.implication(,P2F_tmp.apply(1).equals(machine.rouge)) && BOOL.implication(machine.get_P2().apply(2).equals(0),P2F_tmp.apply(2).equals(machine.vert)) && BOOL.implication(,P2F_tmp.apply(2).equals(machine.rouge)) && BOOL.implication(machine.get_P2().apply(3).equals(0),P2F_tmp.apply(3).equals(machine.vert)) && BOOL.implication(,P2F_tmp.apply(3).equals(machine.rouge)) && BOOL.implication(machine.get_P2().apply(4).equals(0),P2F_tmp.apply(4).equals(machine.vert)) && BOOL.implication(,P2F_tmp.apply(4).equals(machine.rouge))));
			machine.set_updated2(true);

			System.out.println("updateFeuxEntreeP2 executed ");
		}
	}

}
