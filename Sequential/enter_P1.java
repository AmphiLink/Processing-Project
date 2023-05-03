

public class enter_P1{
	/*@ spec_public */ private ProjetGroupeR2 machine; // reference to the machine 

	/*@ public normal_behavior
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public enter_P1(ProjetGroupeR2 m) {
		this.machine = m;
	}

	/*@ public normal_behavior
		requires true;
 		assignable \nothing;
		ensures (\result <==> (new BSet<Integer>(new Integer(1),new Integer(2),new Integer(3),new Integer(4)).has(rame) && machine.get_P1().apply(rame).equals(new Integer(0)) && new BSet<Integer>(new Integer(2),new Integer(3)).has(origin) && ((origin.equals(new Integer(2))) ==> (!machine.get_P1ToP2().apply(new Integer(1)).equals(new Integer(0)))) && ((origin.equals(new Integer(3))) ==> (!machine.get_P1ToS1().apply(new Integer(1)).equals(new Integer(0)))) && ((origin.equals(new Integer(2)) && rame.equals(new Integer(1))) ==> (machine.get_P1A().apply(new Integer(4)).equals(machine.droite) && machine.get_P1A().apply(new Integer(6)).equals(machine.droite) && machine.get_P1A().apply(new Integer(7)).equals(machine.droite))) && ((origin.equals(new Integer(3)) && rame.equals(new Integer(1))) ==> (machine.get_P1A().apply(new Integer(4)).equals(machine.droite) && machine.get_P1A().apply(new Integer(6)).equals(machine.droite) && machine.get_P1A().apply(new Integer(7)).equals(machine.gauche))) && ((origin.equals(new Integer(2)) && rame.equals(new Integer(2))) ==> (machine.get_P1A().apply(new Integer(4)).equals(machine.gauche) && machine.get_P1A().apply(new Integer(6)).equals(machine.droite) && machine.get_P1A().apply(new Integer(7)).equals(machine.droite))) && ((origin.equals(new Integer(3)) && rame.equals(new Integer(2))) ==> (machine.get_P1A().apply(new Integer(4)).equals(machine.gauche) && machine.get_P1A().apply(new Integer(6)).equals(machine.droite) && machine.get_P1A().apply(new Integer(7)).equals(machine.gauche))) && ((origin.equals(new Integer(2)) && rame.equals(new Integer(3))) ==> (machine.get_P1A().apply(new Integer(5)).equals(machine.droite) && machine.get_P1A().apply(new Integer(6)).equals(machine.gauche) && machine.get_P1A().apply(new Integer(7)).equals(machine.droite))) && ((origin.equals(new Integer(3)) && rame.equals(new Integer(3))) ==> (machine.get_P1A().apply(new Integer(5)).equals(machine.droite) && machine.get_P1A().apply(new Integer(6)).equals(machine.gauche) && machine.get_P1A().apply(new Integer(7)).equals(machine.gauche))) && ((origin.equals(new Integer(2)) && rame.equals(new Integer(4))) ==> (machine.get_P1A().apply(new Integer(5)).equals(machine.gauche) && machine.get_P1A().apply(new Integer(6)).equals(machine.gauche) && machine.get_P1A().apply(new Integer(7)).equals(machine.droite))) && ((origin.equals(new Integer(3)) && rame.equals(new Integer(4))) ==> (machine.get_P1A().apply(new Integer(5)).equals(machine.gauche) && machine.get_P1A().apply(new Integer(6)).equals(machine.gauche) && machine.get_P1A().apply(new Integer(7)).equals(machine.gauche))) && machine.get_P1F().apply(new Integer(rame + new Integer(4))).equals(machine.vert))) && (\exists BRelation<Integer,Integer> tmp_P1ToS1; BRelation.cross(new Enumerated(1,2),new BSet<Integer>(0,1,2)).has(tmp_P1ToS1) && BOOL.implication(machine.origin.equals(3),tmp_P1ToS1.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,0),new Pair<Integer,Integer>(2,machine.P1ToS1.apply(2))))); machine.P1ToS1.equals(tmp_P1ToS1)) && (\exists BRelation<Integer,Integer> tmp_P1ToP2; BRelation.cross(new Enumerated(1,2),new BSet<Integer>(0,1,2)).has(tmp_P1ToP2) && BOOL.implication(machine.origin.equals(2),tmp_P1ToP2.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,0),new Pair<Integer,Integer>(2,machine.P1ToP2.apply(2))))); machine.P1ToP2.equals(tmp_P1ToP2)) && (\exists BRelation<Integer,Integer> tmp_P2FS; BRelation.cross(new Enumerated(1,2),machine.trafficLights).has(tmp_P2FS) && BOOL.implication(machine.origin.equals(2),tmp_P2FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.vert),new Pair<Integer,Integer>(2,machine.P2FS.apply(2))))) && BOOL.implication(,tmp_P2FS.equals(machine.P2FS)); machine.P2FS.equals(tmp_P2FS)) && (\exists BRelation<Integer,Integer> tmp_S1FS; BRelation.cross(new Enumerated(1,2),machine.trafficLights).has(tmp_S1FS) && BOOL.implication(machine.origin.equals(3),tmp_S1FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.vert),new Pair<Integer,Integer>(2,machine.S1FS.apply(2))))) && BOOL.implication(,tmp_S1FS.equals(machine.S1FS)); machine.S1FS.equals(tmp_S1FS)); */
	public /*@ pure */ boolean guard_enter_P1( Integer origin, Integer rame) {
		return (new BSet<Integer>(new Integer(1),new Integer(2),new Integer(3),new Integer(4)).has(rame) && machine.get_P1().apply(rame).equals(new Integer(0)) && new BSet<Integer>(new Integer(2),new Integer(3)).has(origin) && BOOL.implication(origin.equals(new Integer(2)),!machine.get_P1ToP2().apply(new Integer(1)).equals(new Integer(0))) && BOOL.implication(origin.equals(new Integer(3)),!machine.get_P1ToS1().apply(new Integer(1)).equals(new Integer(0))) && BOOL.implication(origin.equals(new Integer(2)) && rame.equals(new Integer(1)),machine.get_P1A().apply(new Integer(4)).equals(machine.droite) && machine.get_P1A().apply(new Integer(6)).equals(machine.droite) && machine.get_P1A().apply(new Integer(7)).equals(machine.droite)) && BOOL.implication(origin.equals(new Integer(3)) && rame.equals(new Integer(1)),machine.get_P1A().apply(new Integer(4)).equals(machine.droite) && machine.get_P1A().apply(new Integer(6)).equals(machine.droite) && machine.get_P1A().apply(new Integer(7)).equals(machine.gauche)) && BOOL.implication(origin.equals(new Integer(2)) && rame.equals(new Integer(2)),machine.get_P1A().apply(new Integer(4)).equals(machine.gauche) && machine.get_P1A().apply(new Integer(6)).equals(machine.droite) && machine.get_P1A().apply(new Integer(7)).equals(machine.droite)) && BOOL.implication(origin.equals(new Integer(3)) && rame.equals(new Integer(2)),machine.get_P1A().apply(new Integer(4)).equals(machine.gauche) && machine.get_P1A().apply(new Integer(6)).equals(machine.droite) && machine.get_P1A().apply(new Integer(7)).equals(machine.gauche)) && BOOL.implication(origin.equals(new Integer(2)) && rame.equals(new Integer(3)),machine.get_P1A().apply(new Integer(5)).equals(machine.droite) && machine.get_P1A().apply(new Integer(6)).equals(machine.gauche) && machine.get_P1A().apply(new Integer(7)).equals(machine.droite)) && BOOL.implication(origin.equals(new Integer(3)) && rame.equals(new Integer(3)),machine.get_P1A().apply(new Integer(5)).equals(machine.droite) && machine.get_P1A().apply(new Integer(6)).equals(machine.gauche) && machine.get_P1A().apply(new Integer(7)).equals(machine.gauche)) && BOOL.implication(origin.equals(new Integer(2)) && rame.equals(new Integer(4)),machine.get_P1A().apply(new Integer(5)).equals(machine.gauche) && machine.get_P1A().apply(new Integer(6)).equals(machine.gauche) && machine.get_P1A().apply(new Integer(7)).equals(machine.droite)) && BOOL.implication(origin.equals(new Integer(3)) && rame.equals(new Integer(4)),machine.get_P1A().apply(new Integer(5)).equals(machine.gauche) && machine.get_P1A().apply(new Integer(6)).equals(machine.gauche) && machine.get_P1A().apply(new Integer(7)).equals(machine.gauche)) && machine.get_P1F().apply(new Integer(rame + new Integer(4))).equals(machine.vert));
	}

	/*@ public normal_behavior
		requires guard_enter_P1(origin,rame);
		assignable machine.P1, machine.P1ToS1, machine.P1ToP2, machine.P2FS, machine.S1FS, machine.P1F, machine.P1FS;
		ensures guard_enter_P1(origin,rame) &&  machine.get_P1().equals(\old((machine.get_P1().override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(rame,1)))))) && (\exists BRelation<Integer,Integer> tmp_P1ToS1; BRelation.cross(new Enumerated(1,2),new BSet<Integer>(0,1,2)).has(tmp_P1ToS1) && BOOL.implication(origin.equals(3),tmp_P1ToS1.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,0),new Pair<Integer,Integer>(2,machine.get_P1ToS1().apply(2))))); machine.get_P1ToS1().equals(tmp_P1ToS1)) && (\exists BRelation<Integer,Integer> tmp_P1ToP2; BRelation.cross(new Enumerated(1,2),new BSet<Integer>(0,1,2)).has(tmp_P1ToP2) && BOOL.implication(origin.equals(2),tmp_P1ToP2.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,0),new Pair<Integer,Integer>(2,machine.get_P1ToP2().apply(2))))); machine.get_P1ToP2().equals(tmp_P1ToP2)) && (\exists BRelation<Integer,Integer> tmp_P2FS; BRelation.cross(new Enumerated(1,2),machine.trafficLights).has(tmp_P2FS) && BOOL.implication(origin.equals(2),tmp_P2FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.vert),new Pair<Integer,Integer>(2,machine.get_P2FS().apply(2))))) && BOOL.implication(,tmp_P2FS.equals(machine.get_P2FS())); machine.get_P2FS().equals(tmp_P2FS)) && (\exists BRelation<Integer,Integer> tmp_S1FS; BRelation.cross(new Enumerated(1,2),machine.trafficLights).has(tmp_S1FS) && BOOL.implication(origin.equals(3),tmp_S1FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.vert),new Pair<Integer,Integer>(2,machine.get_S1FS().apply(2))))) && BOOL.implication(,tmp_S1FS.equals(machine.get_S1FS())); machine.get_S1FS().equals(tmp_S1FS)) &&  machine.get_P1F().equals(\old((machine.get_P1F().override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(rame + 4),machine.rouge)))))) &&  machine.get_P1FS().equals(\old((machine.get_P1FS().override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,machine.vert)))))); 
	 also
		requires !guard_enter_P1(origin,rame);
		assignable \nothing;
		ensures true; */
	public void run_enter_P1( Integer origin, Integer rame){
		if(guard_enter_P1(origin,rame)) {
			BRelation<Integer,Integer> P1_tmp = machine.get_P1();
			BRelation<Integer,Integer> P1ToS1_tmp = machine.get_P1ToS1();
			BRelation<Integer,Integer> P1ToP2_tmp = machine.get_P1ToP2();
			BRelation<Integer,Integer> P2FS_tmp = machine.get_P2FS();
			BRelation<Integer,Integer> S1FS_tmp = machine.get_S1FS();
			BRelation<Integer,Integer> P1F_tmp = machine.get_P1F();
			BRelation<Integer,Integer> P1FS_tmp = machine.get_P1FS();

			machine.set_P1((P1_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(rame,1)))));
		//machine.P1ToS1 = Utilities.non_det_assignment(P1ToS1_tmp,(BRelation.cross(new Enumerated(1,2),new BSet<Integer>(0,1,2)).has(P1ToS1_tmp) && BOOL.implication(origin.equals(3),P1ToS1_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,0),new Pair<Integer,Integer>(2,P1ToS1_tmp.apply(2)))))));
		//machine.P1ToP2 = Utilities.non_det_assignment(P1ToP2_tmp,(BRelation.cross(new Enumerated(1,2),new BSet<Integer>(0,1,2)).has(P1ToP2_tmp) && BOOL.implication(origin.equals(2),P1ToP2_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,0),new Pair<Integer,Integer>(2,P1ToP2_tmp.apply(2)))))));
		//machine.P2FS = Utilities.non_det_assignment(P2FS_tmp,(BRelation.cross(new Enumerated(1,2),machine.trafficLights).has(P2FS_tmp) && BOOL.implication(origin.equals(2),P2FS_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.vert),new Pair<Integer,Integer>(2,P2FS_tmp.apply(2))))) && BOOL.implication(,P2FS_tmp.equals(P2FS_tmp))));
		//machine.S1FS = Utilities.non_det_assignment(S1FS_tmp,(BRelation.cross(new Enumerated(1,2),machine.trafficLights).has(S1FS_tmp) && BOOL.implication(origin.equals(3),S1FS_tmp.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,machine.vert),new Pair<Integer,Integer>(2,S1FS_tmp.apply(2))))) && BOOL.implication(,S1FS_tmp.equals(S1FS_tmp))));
			machine.set_P1F((P1F_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(rame + 4),machine.rouge)))));
			machine.set_P1FS((P1FS_tmp.override(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,machine.vert)))));

			System.out.println("enter_P1 executed origin: " + origin + " rame: " + rame + " ");
		}
	}

}
