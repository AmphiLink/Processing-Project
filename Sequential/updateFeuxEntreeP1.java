

public class updateFeuxEntreeP1{
	/*@ spec_public */ private ProjetGroupeR2 machine; // reference to the machine 

	/*@ public normal_behavior
		requires true;
		assignable \everything;
		ensures this.machine == m; */
	public updateFeuxEntreeP1(ProjetGroupeR2 m) {
		this.machine = m;
	}

	/*@ public normal_behavior
		requires true;
 		assignable \nothing;
		ensures (\result <==> machine.get_updated1().equals(false)) && (\exists BRelation<Integer,Integer> tmp_P1F; BRelation.cross(new Enumerated(5,8),machine.trafficLights).has(tmp_P1F) && BOOL.implication(machine.P1.apply(1).equals(0),tmp_P1F.apply(5).equals(machine.vert)) && BOOL.implication(,tmp_P1F.apply(5).equals(machine.rouge)) && BOOL.implication(machine.P1.apply(2).equals(0),tmp_P1F.apply(6).equals(machine.vert)) && BOOL.implication(,tmp_P1F.apply(6).equals(machine.rouge)) && BOOL.implication(machine.P1.apply(3).equals(0),tmp_P1F.apply(7).equals(machine.vert)) && BOOL.implication(,tmp_P1F.apply(7).equals(machine.rouge)) && BOOL.implication(machine.P1.apply(4).equals(0),tmp_P1F.apply(8).equals(machine.vert)) && BOOL.implication(,tmp_P1F.apply(8).equals(machine.rouge)); machine.P1F.equals(tmp_P1F)); */
	public /*@ pure */ boolean guard_updateFeuxEntreeP1() {
		return machine.get_updated1().equals(false);
	}

	/*@ public normal_behavior
		requires guard_updateFeuxEntreeP1();
		assignable machine.P1F, machine.updated1;
		ensures guard_updateFeuxEntreeP1() && (\exists BRelation<Integer,Integer> tmp_P1F; BRelation.cross(new Enumerated(5,8),machine.trafficLights).has(tmp_P1F) && BOOL.implication(machine.get_P1().apply(1).equals(0),tmp_P1F.apply(5).equals(machine.vert)) && BOOL.implication(,tmp_P1F.apply(5).equals(machine.rouge)) && BOOL.implication(machine.get_P1().apply(2).equals(0),tmp_P1F.apply(6).equals(machine.vert)) && BOOL.implication(,tmp_P1F.apply(6).equals(machine.rouge)) && BOOL.implication(machine.get_P1().apply(3).equals(0),tmp_P1F.apply(7).equals(machine.vert)) && BOOL.implication(,tmp_P1F.apply(7).equals(machine.rouge)) && BOOL.implication(machine.get_P1().apply(4).equals(0),tmp_P1F.apply(8).equals(machine.vert)) && BOOL.implication(,tmp_P1F.apply(8).equals(machine.rouge)); machine.get_P1F().equals(tmp_P1F)) &&  machine.get_updated1() == \old(true); 
	 also
		requires !guard_updateFeuxEntreeP1();
		assignable \nothing;
		ensures true; */
	public void run_updateFeuxEntreeP1(){
		if(guard_updateFeuxEntreeP1()) {
			BRelation<Integer,Integer> P1F_tmp = machine.get_P1F();
			Boolean updated1_tmp = machine.get_updated1();

		//machine.P1F = Utilities.non_det_assignment(P1F_tmp,(BRelation.cross(new Enumerated(5,8),machine.trafficLights).has(P1F_tmp) && BOOL.implication(machine.get_P1().apply(1).equals(0),P1F_tmp.apply(5).equals(machine.vert)) && BOOL.implication(,P1F_tmp.apply(5).equals(machine.rouge)) && BOOL.implication(machine.get_P1().apply(2).equals(0),P1F_tmp.apply(6).equals(machine.vert)) && BOOL.implication(,P1F_tmp.apply(6).equals(machine.rouge)) && BOOL.implication(machine.get_P1().apply(3).equals(0),P1F_tmp.apply(7).equals(machine.vert)) && BOOL.implication(,P1F_tmp.apply(7).equals(machine.rouge)) && BOOL.implication(machine.get_P1().apply(4).equals(0),P1F_tmp.apply(8).equals(machine.vert)) && BOOL.implication(,P1F_tmp.apply(8).equals(machine.rouge))));
			machine.set_updated1(true);

			System.out.println("updateFeuxEntreeP1 executed ");
		}
	}

}
