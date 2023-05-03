package ProjetGroupe_sequential; 

import eventb_prelude.*;
import Util.Utilities;

public class movleftP1ToS1{
	/*@ spec_public */ private ProjetGroupeR2 machine; // reference to the machine 

	/*@ public normal_behavior
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public movleftP1ToS1(ProjetGroupeR2 m) {
		this.machine = m;
	}

	/*@ public normal_behavior
		requires true;
 		assignable \nothing;
		ensures \result <==> machine.get_P1ToS1().equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(1),new Integer(0)),new Pair<Integer,Integer>(new Integer(2),new Integer(2)))); */
	public /*@ pure */ boolean guard_movleftP1ToS1() {
		return machine.get_P1ToS1().equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(1),new Integer(0)),new Pair<Integer,Integer>(new Integer(2),new Integer(2))));
	}

	/*@ public normal_behavior
		requires guard_movleftP1ToS1();
		assignable machine.P1ToS1;
		ensures guard_movleftP1ToS1() &&  machine.get_P1ToS1().equals(\old(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,2),new Pair<Integer,Integer>(2,0)))); 
	 also
		requires !guard_movleftP1ToS1();
		assignable \nothing;
		ensures true; */
	public void run_movleftP1ToS1(){
		if(guard_movleftP1ToS1()) {
			BRelation<Integer,Integer> P1ToS1_tmp = machine.get_P1ToS1();

			machine.set_P1ToS1(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,2),new Pair<Integer,Integer>(2,0)));

			System.out.println("movleftP1ToS1 executed ");
		}
	}

}
