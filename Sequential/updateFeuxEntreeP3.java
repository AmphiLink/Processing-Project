

public class updateFeuxEntreeP3{
	/*@ spec_public */ private ProjetGroupeR2 machine; // reference to the machine 

	/*@ public normal_behavior
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public updateFeuxEntreeP3(ProjetGroupeR2 m) {
		this.machine = m;
	}

	/*@ public normal_behavior
		requires true;
 		assignable \nothing;
		ensures (\result <==> machine.get_updated3().equals(false)) && (\exists BRelation<Integer,Integer> tmp_P3F; BRelation.cross(new Enumerated(1,4),machine.trafficLights).has(tmp_P3F) && BOOL.implication(machine.P3.apply(1).equals(0),tmp_P3F.apply(1).equals(machine.vert)) && BOOL.implication(,tmp_P3F.apply(1).equals(machine.rouge)) && BOOL.implication(machine.P3.apply(2).equals(0),tmp_P3F.apply(2).equals(machine.vert)) && BOOL.implication(,tmp_P3F.apply(2).equals(machine.rouge)) && BOOL.implication(machine.P3.apply(3).equals(0),tmp_P3F.apply(3).equals(machine.vert)) && BOOL.implication(,tmp_P3F.apply(3).equals(machine.rouge)) && BOOL.implication(machine.P3.apply(4).equals(0),tmp_P3F.apply(4).equals(machine.vert)) && BOOL.implication(,tmp_P3F.apply(4).equals(machine.rouge)); machine.P3F.equals(tmp_P3F)); */
	public /*@ pure */ boolean guard_updateFeuxEntreeP3() {
		return machine.get_updated3().equals(false);
	}

	/*@ public normal_behavior
		requires guard_updateFeuxEntreeP3();
		assignable machine.P3F, machine.updated3;
		ensures guard_updateFeuxEntreeP3() && (\exists BRelation<Integer,Integer> tmp_P3F; BRelation.cross(new Enumerated(1,4),machine.trafficLights).has(tmp_P3F) && BOOL.implication(machine.get_P3().apply(1).equals(0),tmp_P3F.apply(1).equals(machine.vert)) && BOOL.implication(,tmp_P3F.apply(1).equals(machine.rouge)) && BOOL.implication(machine.get_P3().apply(2).equals(0),tmp_P3F.apply(2).equals(machine.vert)) && BOOL.implication(,tmp_P3F.apply(2).equals(machine.rouge)) && BOOL.implication(machine.get_P3().apply(3).equals(0),tmp_P3F.apply(3).equals(machine.vert)) && BOOL.implication(,tmp_P3F.apply(3).equals(machine.rouge)) && BOOL.implication(machine.get_P3().apply(4).equals(0),tmp_P3F.apply(4).equals(machine.vert)) && BOOL.implication(,tmp_P3F.apply(4).equals(machine.rouge)); machine.get_P3F().equals(tmp_P3F)) &&  machine.get_updated3() == \old(true); 
	 also
		requires !guard_updateFeuxEntreeP3();
		assignable \nothing;
		ensures true; */
	public void run_updateFeuxEntreeP3(){
		if(guard_updateFeuxEntreeP3()) {
			BRelation<Integer,Integer> P3F_tmp = machine.get_P3F();
			Boolean updated3_tmp = machine.get_updated3();

		//machine.P3F = Utilities.non_det_assignment(P3F_tmp,(BRelation.cross(new Enumerated(1,4),machine.trafficLights).has(P3F_tmp) && BOOL.implication(machine.get_P3().apply(1).equals(0),P3F_tmp.apply(1).equals(machine.vert)) && BOOL.implication(,P3F_tmp.apply(1).equals(machine.rouge)) && BOOL.implication(machine.get_P3().apply(2).equals(0),P3F_tmp.apply(2).equals(machine.vert)) && BOOL.implication(,P3F_tmp.apply(2).equals(machine.rouge)) && BOOL.implication(machine.get_P3().apply(3).equals(0),P3F_tmp.apply(3).equals(machine.vert)) && BOOL.implication(,P3F_tmp.apply(3).equals(machine.rouge)) && BOOL.implication(machine.get_P3().apply(4).equals(0),P3F_tmp.apply(4).equals(machine.vert)) && BOOL.implication(,P3F_tmp.apply(4).equals(machine.rouge))));
			machine.set_updated3(true);

			System.out.println("updateFeuxEntreeP3 executed ");
		}
	}

}
