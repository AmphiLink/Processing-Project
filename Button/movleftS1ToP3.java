
import Util.Utilities;

public class movleftS1ToP3{
	/*@ spec_public */ private ProjetGroupeR2 machine; // reference to the machine 

	/*@ public normal_behavior
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public movleftS1ToP3(ProjetGroupeR2 m) {
		this.machine = m;
	}

	/*@ public normal_behavior
		requires true;
 		assignable \nothing;
		ensures \result <==> machine.get_S1ToP3().equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(1),new Integer(0)),new Pair<Integer,Integer>(new Integer(2),new Integer(2)))); */
	public /*@ pure */ boolean guard_movleftS1ToP3() {
		return machine.get_S1ToP3().equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(1),new Integer(0)),new Pair<Integer,Integer>(new Integer(2),new Integer(2))));
	}

	/*@ public normal_behavior
		requires guard_movleftS1ToP3();
		assignable machine.S1ToP3;
		ensures guard_movleftS1ToP3() &&  machine.get_S1ToP3().equals(\old(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,2),new Pair<Integer,Integer>(2,0)))); 
	 also
		requires !guard_movleftS1ToP3();
		assignable \nothing;
		ensures true; */
	public void run_movleftS1ToP3(){
		if(guard_movleftS1ToP3()) {
			BRelation<Integer,Integer> S1ToP3_tmp = machine.get_S1ToP3();

			machine.set_S1ToP3(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,2),new Pair<Integer,Integer>(2,0)));

			System.out.println("movleftS1ToP3 executed ");
		}
	}

}
