package ProjetGroupe_sequential; 

import eventb_prelude.*;
import Util.Utilities;

public class exit_S1{
	/*@ spec_public */ private ProjetGroupeR2 machine; // reference to the machine 

	/*@ public normal_behavior
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public exit_S1(ProjetGroupeR2 m) {
		this.machine = m;
	}

	/*@ public normal_behavior
		requires true;
 		assignable \nothing;
		ensures (\result <==> (new BSet<Integer>(new Integer(1),new Integer(2)).has(rame) && new BSet<Integer>(new Integer(1),new Integer(3)).has(destination) && !machine.get_S1().apply(rame).equals(new Integer(0)) && ((destination.equals(new Integer(1))) ==> (machine.get_P1ToS1().equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(1),new Integer(0)),new Pair<Integer,Integer>(new Integer(2),new Integer(0)))))) && ((destination.equals(new Integer(3))) ==> (machine.get_S1ToP3().equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(1),new Integer(0)),new Pair<Integer,Integer>(new Integer(2),new Integer(0)))))) && ((destination.equals(new Integer(1)) && rame.equals(new Integer(1))) ==> (machine.get_S1A().apply(new Integer(1)).equals(machine.droite))) && ((destination.equals(new Integer(1)) && rame.equals(new Integer(2))) ==> (machine.get_S1A().apply(new Integer(1)).equals(machine.gauche))) && ((destination.equals(new Integer(3)) && rame.equals(new Integer(1))) ==> (machine.get_S1A().apply(new Integer(2)).equals(machine.droite))) && ((destination.equals(new Integer(3)) && rame.equals(new Integer(2))) ==> (machine.get_S1A().apply(new Integer(2)).equals(machine.gauche))) && ((destination.equals(new Integer(1))) ==> (machine.get_S1FS().apply(new Integer(1)).equals(machine.vert))) && ((destination.equals(new Integer(3))) ==> (machine.get_S1FS().apply(new Integer(2)).equals(machine.vert))))) && (\exists BRelation<Integer,Integer> tmp_P1ToS1; BRelation.cross(new Enumerated(1,2),new BSet<Integer>(0,1,2)).has(tmp_P1ToS1) && BOOL.implication(machine.destination.equals(1),tmp_P1ToS1.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.P1ToS1.apply(1)),new Pair<Integer,Integer>(2,2)))); machine.P1ToS1.equals(tmp_P1ToS1)) && (\exists BRelation<Integer,Integer> tmp_S1ToP3; BRelation.cross(new Enumerated(1,2),new BSet<Integer>(0,1,2)).has(tmp_S1ToP3) && BOOL.implication(machine.destination.equals(3),tmp_S1ToP3.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,1),new Pair<Integer,Integer>(2,machine.S1ToP3.apply(2))))); machine.S1ToP3.equals(tmp_S1ToP3)) && (\exists BRelation<Integer,Integer> tmp_S1FS; BRelation.cross(new Enumerated(1,2),machine.trafficLights).has(tmp_S1FS) && BOOL.implication(machine.destination.equals(1),tmp_S1FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.rouge),new Pair<Integer,Integer>(2,machine.S1FS.apply(2))))) && BOOL.implication(machine.destination.equals(3),tmp_S1FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.S1FS.apply(1)),new Pair<Integer,Integer>(2,machine.rouge)))); machine.S1FS.equals(tmp_S1FS)) && (\exists BRelation<Integer,Integer> tmp_P1FS; BRelation.cross(new Enumerated(2,2),machine.trafficLights).has(tmp_P1FS) && BOOL.implication(machine.destination.equals(1),tmp_P1FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,machine.rouge)))) && BOOL.implication(machine.destination.equals(3),tmp_P1FS.equals(machine.P1FS)); machine.P1FS.equals(tmp_P1FS)) && (\exists BRelation<Integer,Integer> tmp_P3FS; BRelation.cross(new Enumerated(1,1),machine.trafficLights).has(tmp_P3FS) && BOOL.implication(machine.destination.equals(3),tmp_P3FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.rouge)))) && BOOL.implication(machine.destination.equals(1),tmp_P3FS.equals(machine.P3FS)); machine.P3FS.equals(tmp_P3FS)); */
	public /*@ pure */ boolean guard_exit_S1( Integer destination, Integer rame) {
		return (new BSet<Integer>(new Integer(1),new Integer(2)).has(rame) && new BSet<Integer>(new Integer(1),new Integer(3)).has(destination) && !machine.get_S1().apply(rame).equals(new Integer(0)) && BOOL.implication(destination.equals(new Integer(1)),machine.get_P1ToS1().equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(1),new Integer(0)),new Pair<Integer,Integer>(new Integer(2),new Integer(0))))) && BOOL.implication(destination.equals(new Integer(3)),machine.get_S1ToP3().equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(1),new Integer(0)),new Pair<Integer,Integer>(new Integer(2),new Integer(0))))) && BOOL.implication(destination.equals(new Integer(1)) && rame.equals(new Integer(1)),machine.get_S1A().apply(new Integer(1)).equals(machine.droite)) && BOOL.implication(destination.equals(new Integer(1)) && rame.equals(new Integer(2)),machine.get_S1A().apply(new Integer(1)).equals(machine.gauche)) && BOOL.implication(destination.equals(new Integer(3)) && rame.equals(new Integer(1)),machine.get_S1A().apply(new Integer(2)).equals(machine.droite)) && BOOL.implication(destination.equals(new Integer(3)) && rame.equals(new Integer(2)),machine.get_S1A().apply(new Integer(2)).equals(machine.gauche)) && BOOL.implication(destination.equals(new Integer(1)),machine.get_S1FS().apply(new Integer(1)).equals(machine.vert)) && BOOL.implication(destination.equals(new Integer(3)),machine.get_S1FS().apply(new Integer(2)).equals(machine.vert)));
	}

	/*@ public normal_behavior
		requires guard_exit_S1(destination,rame);
		assignable machine.P1ToS1, machine.S1ToP3, machine.S1, machine.S1FS, machine.P1FS, machine.P3FS, machine.S1F;
		ensures guard_exit_S1(destination,rame) && (\exists BRelation<Integer,Integer> tmp_P1ToS1; BRelation.cross(new Enumerated(1,2),new BSet<Integer>(0,1,2)).has(tmp_P1ToS1) && BOOL.implication(destination.equals(1),tmp_P1ToS1.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.get_P1ToS1().apply(1)),new Pair<Integer,Integer>(2,2)))); machine.get_P1ToS1().equals(tmp_P1ToS1)) && (\exists BRelation<Integer,Integer> tmp_S1ToP3; BRelation.cross(new Enumerated(1,2),new BSet<Integer>(0,1,2)).has(tmp_S1ToP3) && BOOL.implication(destination.equals(3),tmp_S1ToP3.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,1),new Pair<Integer,Integer>(2,machine.get_S1ToP3().apply(2))))); machine.get_S1ToP3().equals(tmp_S1ToP3)) &&  machine.get_S1().equals(\old((machine.get_S1().override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(rame,0)))))) && (\exists BRelation<Integer,Integer> tmp_S1FS; BRelation.cross(new Enumerated(1,2),machine.trafficLights).has(tmp_S1FS) && BOOL.implication(destination.equals(1),tmp_S1FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.rouge),new Pair<Integer,Integer>(2,machine.get_S1FS().apply(2))))) && BOOL.implication(destination.equals(3),tmp_S1FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.get_S1FS().apply(1)),new Pair<Integer,Integer>(2,machine.rouge)))); machine.get_S1FS().equals(tmp_S1FS)) && (\exists BRelation<Integer,Integer> tmp_P1FS; BRelation.cross(new Enumerated(2,2),machine.trafficLights).has(tmp_P1FS) && BOOL.implication(destination.equals(1),tmp_P1FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,machine.rouge)))) && BOOL.implication(destination.equals(3),tmp_P1FS.equals(machine.get_P1FS())); machine.get_P1FS().equals(tmp_P1FS)) && (\exists BRelation<Integer,Integer> tmp_P3FS; BRelation.cross(new Enumerated(1,1),machine.trafficLights).has(tmp_P3FS) && BOOL.implication(destination.equals(3),tmp_P3FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.rouge)))) && BOOL.implication(destination.equals(1),tmp_P3FS.equals(machine.get_P3FS())); machine.get_P3FS().equals(tmp_P3FS)) &&  machine.get_S1F().equals(\old((machine.get_S1F().override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(rame,machine.vert),new Pair<Integer,Integer>(new Integer(rame + 2),machine.vert)))))); 
	 also
		requires !guard_exit_S1(destination,rame);
		assignable \nothing;
		ensures true; */
	public void run_exit_S1( Integer destination, Integer rame){
		if(guard_exit_S1(destination,rame)) {
			BRelation<Integer,Integer> P1ToS1_tmp = machine.get_P1ToS1();
			BRelation<Integer,Integer> S1ToP3_tmp = machine.get_S1ToP3();
			BRelation<Integer,Integer> S1_tmp = machine.get_S1();
			BRelation<Integer,Integer> S1FS_tmp = machine.get_S1FS();
			BRelation<Integer,Integer> P1FS_tmp = machine.get_P1FS();
			BRelation<Integer,Integer> P3FS_tmp = machine.get_P3FS();
			BRelation<Integer,Integer> S1F_tmp = machine.get_S1F();

		//machine.P1ToS1 = Utilities.non_det_assignment(P1ToS1_tmp,(BRelation.cross(new Enumerated(1,2),new BSet<Integer>(0,1,2)).has(P1ToS1_tmp) && BOOL.implication(destination.equals(1),P1ToS1_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,P1ToS1_tmp.apply(1)),new Pair<Integer,Integer>(2,2))))));
		//machine.S1ToP3 = Utilities.non_det_assignment(S1ToP3_tmp,(BRelation.cross(new Enumerated(1,2),new BSet<Integer>(0,1,2)).has(S1ToP3_tmp) && BOOL.implication(destination.equals(3),S1ToP3_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,1),new Pair<Integer,Integer>(2,S1ToP3_tmp.apply(2)))))));
			machine.set_S1((S1_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(rame,0)))));
		//machine.S1FS = Utilities.non_det_assignment(S1FS_tmp,(BRelation.cross(new Enumerated(1,2),machine.trafficLights).has(S1FS_tmp) && BOOL.implication(destination.equals(1),S1FS_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.rouge),new Pair<Integer,Integer>(2,S1FS_tmp.apply(2))))) && BOOL.implication(destination.equals(3),S1FS_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,S1FS_tmp.apply(1)),new Pair<Integer,Integer>(2,machine.rouge))))));
		//machine.P1FS = Utilities.non_det_assignment(P1FS_tmp,(BRelation.cross(new Enumerated(2,2),machine.trafficLights).has(P1FS_tmp) && BOOL.implication(destination.equals(1),P1FS_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,machine.rouge)))) && BOOL.implication(destination.equals(3),P1FS_tmp.equals(P1FS_tmp))));
		//machine.P3FS = Utilities.non_det_assignment(P3FS_tmp,(BRelation.cross(new Enumerated(1,1),machine.trafficLights).has(P3FS_tmp) && BOOL.implication(destination.equals(3),P3FS_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.rouge)))) && BOOL.implication(destination.equals(1),P3FS_tmp.equals(P3FS_tmp))));
			machine.set_S1F((S1F_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(rame,machine.vert),new Pair<Integer,Integer>(new Integer(rame + 2),machine.vert)))));

			System.out.println("exit_S1 executed destination: " + destination + " rame: " + rame + " ");
		}
	}

}
