
import Util.Utilities;

public class exit_P2{
	/*@ spec_public */ private ProjetGroupeR2 machine; // reference to the machine 

	/*@ public normal_behavior
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public exit_P2(ProjetGroupeR2 m) {
		this.machine = m;
	}

	/*@ public normal_behavior
		requires true;
 		assignable \nothing;
		ensures (\result <==> (new BSet<Integer>(new Integer(1),new Integer(2),new Integer(3),new Integer(4)).has(rame) && new BSet<Integer>(new Integer(1),new Integer(3)).has(destination) && !machine.get_P2().apply(rame).equals(new Integer(0)) && ((destination.equals(new Integer(1))) ==> (machine.get_P1ToP2().equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(1),new Integer(0)),new Pair<Integer,Integer>(new Integer(2),new Integer(0)))))) && ((destination.equals(new Integer(3))) ==> (machine.get_P2ToP3().equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(1),new Integer(0)),new Pair<Integer,Integer>(new Integer(2),new Integer(0)))))) && ((destination.equals(new Integer(1)) && rame.equals(new Integer(1))) ==> (machine.get_P2A().apply(new Integer(1)).equals(machine.droite) && machine.get_P2A().apply(new Integer(2)).equals(machine.droite))) && ((destination.equals(new Integer(1)) && rame.equals(new Integer(2))) ==> (machine.get_P2A().apply(new Integer(1)).equals(machine.droite) && machine.get_P2A().apply(new Integer(2)).equals(machine.gauche))) && ((destination.equals(new Integer(1)) && rame.equals(new Integer(3))) ==> (machine.get_P2A().apply(new Integer(1)).equals(machine.gauche) && machine.get_P2A().apply(new Integer(3)).equals(machine.droite))) && ((destination.equals(new Integer(1)) && rame.equals(new Integer(4))) ==> (machine.get_P2A().apply(new Integer(1)).equals(machine.gauche) && machine.get_P2A().apply(new Integer(3)).equals(machine.gauche))) && ((destination.equals(new Integer(3)) && rame.equals(new Integer(1))) ==> (machine.get_P2A().apply(new Integer(4)).equals(machine.droite) && machine.get_P2A().apply(new Integer(6)).equals(machine.droite))) && ((destination.equals(new Integer(3)) && rame.equals(new Integer(2))) ==> (machine.get_P2A().apply(new Integer(4)).equals(machine.gauche) && machine.get_P2A().apply(new Integer(6)).equals(machine.droite))) && ((destination.equals(new Integer(3)) && rame.equals(new Integer(3))) ==> (machine.get_P2A().apply(new Integer(5)).equals(machine.droite) && machine.get_P2A().apply(new Integer(6)).equals(machine.gauche))) && ((destination.equals(new Integer(3)) && rame.equals(new Integer(4))) ==> (machine.get_P2A().apply(new Integer(5)).equals(machine.gauche) && machine.get_P2A().apply(new Integer(6)).equals(machine.gauche))) && ((destination.equals(new Integer(1))) ==> (machine.get_P2FS().apply(new Integer(1)).equals(machine.vert))) && ((destination.equals(new Integer(3))) ==> (machine.get_P2FS().apply(new Integer(2)).equals(machine.vert))))) && (\exists BRelation<Integer,Integer> tmp_P1ToP2; BRelation.cross(new Enumerated(1,2),new BSet<Integer>(0,1,2)).has(tmp_P1ToP2) && BOOL.implication(machine.destination.equals(1),tmp_P1ToP2.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.P1ToP2.apply(1)),new Pair<Integer,Integer>(2,2)))); machine.P1ToP2.equals(tmp_P1ToP2)) && (\exists BRelation<Integer,Integer> tmp_P2ToP3; BRelation.cross(new Enumerated(1,2),new BSet<Integer>(0,1,2)).has(tmp_P2ToP3) && BOOL.implication(machine.destination.equals(3),tmp_P2ToP3.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,1),new Pair<Integer,Integer>(2,machine.P2ToP3.apply(2))))); machine.P2ToP3.equals(tmp_P2ToP3)) && (\exists BRelation<Integer,Integer> tmp_P2FS; BRelation.cross(new Enumerated(1,2),machine.trafficLights).has(tmp_P2FS) && BOOL.implication(machine.destination.equals(1),tmp_P2FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.rouge),new Pair<Integer,Integer>(2,machine.P2FS.apply(2))))) && BOOL.implication(machine.destination.equals(3),tmp_P2FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.P2FS.apply(1)),new Pair<Integer,Integer>(2,machine.rouge)))); machine.P2FS.equals(tmp_P2FS)) && (\exists BRelation<Integer,Integer> tmp_P1FS; BRelation.cross(new Enumerated(2,2),machine.trafficLights).has(tmp_P1FS) && BOOL.implication(machine.destination.equals(1),tmp_P1FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,machine.rouge)))) && BOOL.implication(machine.destination.equals(3),tmp_P1FS.equals(machine.P1FS)); machine.P1FS.equals(tmp_P1FS)) && (\exists BRelation<Integer,Integer> tmp_P3FS; BRelation.cross(new Enumerated(1,1),machine.trafficLights).has(tmp_P3FS) && BOOL.implication(machine.destination.equals(3),tmp_P3FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.rouge)))) && BOOL.implication(machine.destination.equals(1),tmp_P3FS.equals(machine.P3FS)); machine.P3FS.equals(tmp_P3FS)); */
	public /*@ pure */ boolean guard_exit_P2( Integer destination, Integer rame) {
		return (new BSet<Integer>(new Integer(1),new Integer(2),new Integer(3),new Integer(4)).has(rame) && new BSet<Integer>(new Integer(1),new Integer(3)).has(destination) && !machine.get_P2().apply(rame).equals(new Integer(0)) && BOOL.implication(destination.equals(new Integer(1)),machine.get_P1ToP2().equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(1),new Integer(0)),new Pair<Integer,Integer>(new Integer(2),new Integer(0))))) && BOOL.implication(destination.equals(new Integer(3)),machine.get_P2ToP3().equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(1),new Integer(0)),new Pair<Integer,Integer>(new Integer(2),new Integer(0))))) && BOOL.implication(destination.equals(new Integer(1)) && rame.equals(new Integer(1)),machine.get_P2A().apply(new Integer(1)).equals(machine.droite) && machine.get_P2A().apply(new Integer(2)).equals(machine.droite)) && BOOL.implication(destination.equals(new Integer(1)) && rame.equals(new Integer(2)),machine.get_P2A().apply(new Integer(1)).equals(machine.droite) && machine.get_P2A().apply(new Integer(2)).equals(machine.gauche)) && BOOL.implication(destination.equals(new Integer(1)) && rame.equals(new Integer(3)),machine.get_P2A().apply(new Integer(1)).equals(machine.gauche) && machine.get_P2A().apply(new Integer(3)).equals(machine.droite)) && BOOL.implication(destination.equals(new Integer(1)) && rame.equals(new Integer(4)),machine.get_P2A().apply(new Integer(1)).equals(machine.gauche) && machine.get_P2A().apply(new Integer(3)).equals(machine.gauche)) && BOOL.implication(destination.equals(new Integer(3)) && rame.equals(new Integer(1)),machine.get_P2A().apply(new Integer(4)).equals(machine.droite) && machine.get_P2A().apply(new Integer(6)).equals(machine.droite)) && BOOL.implication(destination.equals(new Integer(3)) && rame.equals(new Integer(2)),machine.get_P2A().apply(new Integer(4)).equals(machine.gauche) && machine.get_P2A().apply(new Integer(6)).equals(machine.droite)) && BOOL.implication(destination.equals(new Integer(3)) && rame.equals(new Integer(3)),machine.get_P2A().apply(new Integer(5)).equals(machine.droite) && machine.get_P2A().apply(new Integer(6)).equals(machine.gauche)) && BOOL.implication(destination.equals(new Integer(3)) && rame.equals(new Integer(4)),machine.get_P2A().apply(new Integer(5)).equals(machine.gauche) && machine.get_P2A().apply(new Integer(6)).equals(machine.gauche)) && BOOL.implication(destination.equals(new Integer(1)),machine.get_P2FS().apply(new Integer(1)).equals(machine.vert)) && BOOL.implication(destination.equals(new Integer(3)),machine.get_P2FS().apply(new Integer(2)).equals(machine.vert)));
	}

	/*@ public normal_behavior
		requires guard_exit_P2(destination,rame);
		assignable machine.P1ToP2, machine.P2ToP3, machine.P2, machine.P2FS, machine.P1FS, machine.P3FS, machine.P2F;
		ensures guard_exit_P2(destination,rame) && (\exists BRelation<Integer,Integer> tmp_P1ToP2; BRelation.cross(new Enumerated(1,2),new BSet<Integer>(0,1,2)).has(tmp_P1ToP2) && BOOL.implication(destination.equals(1),tmp_P1ToP2.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.get_P1ToP2().apply(1)),new Pair<Integer,Integer>(2,2)))); machine.get_P1ToP2().equals(tmp_P1ToP2)) && (\exists BRelation<Integer,Integer> tmp_P2ToP3; BRelation.cross(new Enumerated(1,2),new BSet<Integer>(0,1,2)).has(tmp_P2ToP3) && BOOL.implication(destination.equals(3),tmp_P2ToP3.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,1),new Pair<Integer,Integer>(2,machine.get_P2ToP3().apply(2))))); machine.get_P2ToP3().equals(tmp_P2ToP3)) &&  machine.get_P2().equals(\old((machine.get_P2().override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(rame,0)))))) && (\exists BRelation<Integer,Integer> tmp_P2FS; BRelation.cross(new Enumerated(1,2),machine.trafficLights).has(tmp_P2FS) && BOOL.implication(destination.equals(1),tmp_P2FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.rouge),new Pair<Integer,Integer>(2,machine.get_P2FS().apply(2))))) && BOOL.implication(destination.equals(3),tmp_P2FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.get_P2FS().apply(1)),new Pair<Integer,Integer>(2,machine.rouge)))); machine.get_P2FS().equals(tmp_P2FS)) && (\exists BRelation<Integer,Integer> tmp_P1FS; BRelation.cross(new Enumerated(2,2),machine.trafficLights).has(tmp_P1FS) && BOOL.implication(destination.equals(1),tmp_P1FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,machine.rouge)))) && BOOL.implication(destination.equals(3),tmp_P1FS.equals(machine.get_P1FS())); machine.get_P1FS().equals(tmp_P1FS)) && (\exists BRelation<Integer,Integer> tmp_P3FS; BRelation.cross(new Enumerated(1,1),machine.trafficLights).has(tmp_P3FS) && BOOL.implication(destination.equals(3),tmp_P3FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.rouge)))) && BOOL.implication(destination.equals(1),tmp_P3FS.equals(machine.get_P3FS())); machine.get_P3FS().equals(tmp_P3FS)) &&  machine.get_P2F().equals(\old((machine.get_P2F().override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(rame,machine.vert),new Pair<Integer,Integer>(new Integer(rame + 4),machine.vert)))))); 
	 also
		requires !guard_exit_P2(destination,rame);
		assignable \nothing;
		ensures true; */
	public void run_exit_P2( Integer destination, Integer rame){
		if(guard_exit_P2(destination,rame)) {
			BRelation<Integer,Integer> P1ToP2_tmp = machine.get_P1ToP2();
			BRelation<Integer,Integer> P2ToP3_tmp = machine.get_P2ToP3();
			BRelation<Integer,Integer> P2_tmp = machine.get_P2();
			BRelation<Integer,Integer> P2FS_tmp = machine.get_P2FS();
			BRelation<Integer,Integer> P1FS_tmp = machine.get_P1FS();
			BRelation<Integer,Integer> P3FS_tmp = machine.get_P3FS();
			BRelation<Integer,Integer> P2F_tmp = machine.get_P2F();

		//machine.P1ToP2 = Utilities.non_det_assignment(P1ToP2_tmp,(BRelation.cross(new Enumerated(1,2),new BSet<Integer>(0,1,2)).has(P1ToP2_tmp) && BOOL.implication(destination.equals(1),P1ToP2_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,P1ToP2_tmp.apply(1)),new Pair<Integer,Integer>(2,2))))));
		//machine.P2ToP3 = Utilities.non_det_assignment(P2ToP3_tmp,(BRelation.cross(new Enumerated(1,2),new BSet<Integer>(0,1,2)).has(P2ToP3_tmp) && BOOL.implication(destination.equals(3),P2ToP3_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,1),new Pair<Integer,Integer>(2,P2ToP3_tmp.apply(2)))))));
			machine.set_P2((P2_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(rame,0)))));
		//machine.P2FS = Utilities.non_det_assignment(P2FS_tmp,(BRelation.cross(new Enumerated(1,2),machine.trafficLights).has(P2FS_tmp) && BOOL.implication(destination.equals(1),P2FS_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.rouge),new Pair<Integer,Integer>(2,P2FS_tmp.apply(2))))) && BOOL.implication(destination.equals(3),P2FS_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,P2FS_tmp.apply(1)),new Pair<Integer,Integer>(2,machine.rouge))))));
		//machine.P1FS = Utilities.non_det_assignment(P1FS_tmp,(BRelation.cross(new Enumerated(2,2),machine.trafficLights).has(P1FS_tmp) && BOOL.implication(destination.equals(1),P1FS_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,machine.rouge)))) && BOOL.implication(destination.equals(3),P1FS_tmp.equals(P1FS_tmp))));
		//machine.P3FS = Utilities.non_det_assignment(P3FS_tmp,(BRelation.cross(new Enumerated(1,1),machine.trafficLights).has(P3FS_tmp) && BOOL.implication(destination.equals(3),P3FS_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.rouge)))) && BOOL.implication(destination.equals(1),P3FS_tmp.equals(P3FS_tmp))));
			machine.set_P2F((P2F_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(rame,machine.vert),new Pair<Integer,Integer>(new Integer(rame + 4),machine.vert)))));

			System.out.println("exit_P2 executed destination: " + destination + " rame: " + rame + " ");
		}
	}

}
