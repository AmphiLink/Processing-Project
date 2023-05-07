
import Util.Utilities;

public class movrightP2ToP3{
	/*@ spec_public */ private ProjetGroupeR2 machine; // reference to the machine 

	/*@ public normal_behavior
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public movrightP2ToP3(ProjetGroupeR2 m) {
		this.machine = m;
	}

	/*@ public normal_behavior
		requires true;
 		assignable \nothing;
		ensures \result <==> machine.get_P2ToP3().equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(1),new Integer(1)),new Pair<Integer,Integer>(new Integer(2),new Integer(0)))); */
	public /*@ pure */ boolean guard_movrightP2ToP3() {
		return machine.get_P2ToP3().equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(new Integer(1),new Integer(1)),new Pair<Integer,Integer>(new Integer(2),new Integer(0))));
	}

	/*@ public normal_behavior
		requires guard_movrightP2ToP3();
		assignable machine.P2ToP3;
		ensures guard_movrightP2ToP3() &&  machine.get_P2ToP3().equals(\old(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,0),new Pair<Integer,Integer>(2,1)))); 
	 also
		requires !guard_movrightP2ToP3();
		assignable \nothing;
		ensures true; */
	public void run_movrightP2ToP3(){
		if(guard_movrightP2ToP3()) {
			BRelation<Integer,Integer> P2ToP3_tmp = machine.get_P2ToP3();

			machine.set_P2ToP3(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,0),new Pair<Integer,Integer>(2,1)));

			System.out.println("movrightP2ToP3 executed ");
		}
	}

}
