
import java.util.Random;
import Util.Utilities;

public class Test_ProjetGroupeR2{

	public static Integer random_gauche;
	public static Integer random_droite;
	public static Integer random_vert;
	public static Integer random_rouge;

	static Random rnd = new Random();
	static Integer max_size_BSet = 10;
	Integer min_integer = Utilities.min_integer;
	Integer max_integer = Utilities.max_integer;

	public Integer GenerateRandomInteger(){
		BSet<Integer> S =  new BSet<Integer>(
				new Enumerated(min_integer, max_integer)
				);
		/** User defined code that reflects axioms and theorems: Begin **/

		/** User defined code that reflects axioms and theorems: End **/

		return (Integer) S.toArray()[rnd.nextInt(S.size())];
	}

	public boolean GenerateRandomBoolean(){
		boolean res = (Boolean) BOOL.instance.toArray()[rnd.nextInt(2)];

		/** User defined code that reflects axioms and theorems: Begin **/

		/** User defined code that reflects axioms and theorems: End **/

		return res;
	}


	public BSet<Integer> GenerateRandomIntegerBSet(){
		int size = rnd.nextInt(max_size_BSet);
		BSet<Integer> S = new BSet<Integer>();
		while (S.size() != size){
			S.add(GenerateRandomInteger());
		}

		/** User defined code that reflects axioms and theorems: Begin **/

		/** User defined code that reflects axioms and theorems: End **/

		return S;
	}

	public BSet<Boolean> GenerateRandomBooleanBSet(){
		int size = rnd.nextInt(2);
		BSet<Boolean> res = new BSet<Boolean>();
		if (size == 0){
			res = new BSet<Boolean>(GenerateRandomBoolean());
		}else{
			res = new BSet<Boolean>(true,false);
		}

		/** User defined code that reflects axioms and theorems: Begin **/

		/** User defined code that reflects axioms and theorems: End **/

		return res;
	}

	public BRelation<Integer,Integer> GenerateRandomBRelation(){
		BRelation<Integer,Integer> res = new BRelation<Integer,Integer>();
		int size = rnd.nextInt(max_size_BSet);
		while (res.size() != size){
			res.add(
					new Pair<Integer, Integer>(GenerateRandomInteger(), GenerateRandomInteger()));
		}
		/** User defined code that reflects axioms and theorems: Begin **/

		/** User defined code that reflects axioms and theorems: End **/

		return res;
	}

	public static void main(String[] args){
		Test_ProjetGroupeR2 test = new Test_ProjetGroupeR2();

		/** User defined code that reflects axioms and theorems: Begin **/
		test.random_gauche = test.GenerateRandomInteger();
		test.random_droite = test.GenerateRandomInteger();
		test.random_vert = test.GenerateRandomInteger();
		test.random_rouge = test.GenerateRandomInteger();
		/** User defined code that reflects axioms and theorems: End **/

		ProjetGroupeR2 machine = new ProjetGroupeR2();
		int n = 30; //the number of events in the machine
		//Init values for parameters in event: exit_P1
		Integer destination = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		Integer rame = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: exit_P2
		Integer destination = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		Integer rame = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: exit_P3
		Integer destination = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		Integer rame = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: exit_S1
		Integer destination = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		Integer rame = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: enter_P1
		Integer origin = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		Integer rame = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: enter_P2
		Integer origin = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		Integer rame = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		Integer direction = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: enter_P3
		Integer origin = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		Integer rame = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: enter_S1
		Integer origin = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		Integer rame = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		Integer direction = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: modifyAiguillage0
		Integer sens = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: modifyAiguillage1
		Integer sens = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		Integer gare = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: modifyAiguillage2
		Integer sens = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		Integer gare = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: modifyAiguillage3
		Integer sens = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		Integer gare = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: modifyAiguillage4
		Integer sens = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		Integer gare = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: modifyAiguillage5
		Integer sens = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		Integer gare = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: modifyAiguillage6
		Integer sens = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		Integer gare = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		//Init values for parameters in event: modifyAiguillage7
		Integer sens = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));

		while (true){
			switch (rnd.nextInt(n)){
			case 0: if (machine.evt_exit_P1.guard_exit_P1(destination,rame))
				machine.evt_exit_P1.run_exit_P1(destination,rame); break;
			case 1: if (machine.evt_exit_P2.guard_exit_P2(destination,rame))
				machine.evt_exit_P2.run_exit_P2(destination,rame); break;
			case 2: if (machine.evt_exit_P3.guard_exit_P3(destination,rame))
				machine.evt_exit_P3.run_exit_P3(destination,rame); break;
			case 3: if (machine.evt_exit_S1.guard_exit_S1(destination,rame))
				machine.evt_exit_S1.run_exit_S1(destination,rame); break;
			case 4: if (machine.evt_enter_P1.guard_enter_P1(origin,rame))
				machine.evt_enter_P1.run_enter_P1(origin,rame); break;
			case 5: if (machine.evt_enter_P2.guard_enter_P2(origin,rame,direction))
				machine.evt_enter_P2.run_enter_P2(origin,rame,direction); break;
			case 6: if (machine.evt_enter_P3.guard_enter_P3(origin,rame))
				machine.evt_enter_P3.run_enter_P3(origin,rame); break;
			case 7: if (machine.evt_enter_S1.guard_enter_S1(origin,rame,direction))
				machine.evt_enter_S1.run_enter_S1(origin,rame,direction); break;
			case 8: if (machine.evt_movrightP1ToP2.guard_movrightP1ToP2())
				machine.evt_movrightP1ToP2.run_movrightP1ToP2(); break;
			case 9: if (machine.evt_movrightP1ToS1.guard_movrightP1ToS1())
				machine.evt_movrightP1ToS1.run_movrightP1ToS1(); break;
			case 10: if (machine.evt_movrightP2ToP3.guard_movrightP2ToP3())
				machine.evt_movrightP2ToP3.run_movrightP2ToP3(); break;
			case 11: if (machine.evt_movrightS1ToP3.guard_movrightS1ToP3())
				machine.evt_movrightS1ToP3.run_movrightS1ToP3(); break;
			case 12: if (machine.evt_movleftP1ToP2.guard_movleftP1ToP2())
				machine.evt_movleftP1ToP2.run_movleftP1ToP2(); break;
			case 13: if (machine.evt_movleftP1ToS1.guard_movleftP1ToS1())
				machine.evt_movleftP1ToS1.run_movleftP1ToS1(); break;
			case 14: if (machine.evt_movleftP2ToP3.guard_movleftP2ToP3())
				machine.evt_movleftP2ToP3.run_movleftP2ToP3(); break;
			case 15: if (machine.evt_movleftS1ToP3.guard_movleftS1ToP3())
				machine.evt_movleftS1ToP3.run_movleftS1ToP3(); break;
			case 16: if (machine.evt_modifyAiguillage0.guard_modifyAiguillage0(sens))
				machine.evt_modifyAiguillage0.run_modifyAiguillage0(sens); break;
			case 17: if (machine.evt_modifyAiguillage1.guard_modifyAiguillage1(sens,gare))
				machine.evt_modifyAiguillage1.run_modifyAiguillage1(sens,gare); break;
			case 18: if (machine.evt_modifyAiguillage2.guard_modifyAiguillage2(sens,gare))
				machine.evt_modifyAiguillage2.run_modifyAiguillage2(sens,gare); break;
			case 19: if (machine.evt_modifyAiguillage3.guard_modifyAiguillage3(sens,gare))
				machine.evt_modifyAiguillage3.run_modifyAiguillage3(sens,gare); break;
			case 20: if (machine.evt_modifyAiguillage4.guard_modifyAiguillage4(sens,gare))
				machine.evt_modifyAiguillage4.run_modifyAiguillage4(sens,gare); break;
			case 21: if (machine.evt_modifyAiguillage5.guard_modifyAiguillage5(sens,gare))
				machine.evt_modifyAiguillage5.run_modifyAiguillage5(sens,gare); break;
			case 22: if (machine.evt_modifyAiguillage6.guard_modifyAiguillage6(sens,gare))
				machine.evt_modifyAiguillage6.run_modifyAiguillage6(sens,gare); break;
			case 23: if (machine.evt_modifyAiguillage7.guard_modifyAiguillage7(sens))
				machine.evt_modifyAiguillage7.run_modifyAiguillage7(sens); break;
			case 24: if (machine.evt_updateFeuxEntreeP1.guard_updateFeuxEntreeP1())
				machine.evt_updateFeuxEntreeP1.run_updateFeuxEntreeP1(); break;
			case 25: if (machine.evt_updateFeuxEntreeP2.guard_updateFeuxEntreeP2())
				machine.evt_updateFeuxEntreeP2.run_updateFeuxEntreeP2(); break;
			case 26: if (machine.evt_updateFeuxEntreeP3.guard_updateFeuxEntreeP3())
				machine.evt_updateFeuxEntreeP3.run_updateFeuxEntreeP3(); break;
			case 27: if (machine.evt_updateFeuxEntreeS1.guard_updateFeuxEntreeS1())
				machine.evt_updateFeuxEntreeS1.run_updateFeuxEntreeS1(); break;
			case 28: if (machine.evt_updateFeuxSortieP2.guard_updateFeuxSortieP2())
				machine.evt_updateFeuxSortieP2.run_updateFeuxSortieP2(); break;
			case 29: if (machine.evt_updateFeuxSortieS1.guard_updateFeuxSortieS1())
				machine.evt_updateFeuxSortieS1.run_updateFeuxSortieS1(); break;
			}
			destination = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rame = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			destination = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rame = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			destination = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rame = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			destination = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rame = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			origin = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rame = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			origin = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rame = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			direction = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			origin = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rame = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			origin = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			rame = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			direction = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			sens = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			sens = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			gare = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			sens = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			gare = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			sens = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			gare = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			sens = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			gare = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			sens = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			gare = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			sens = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			gare = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
			sens = Utilities.someVal(new BSet<Integer>((new Enumerated(1,Utilities.max_integer))));
		}
	}

}
