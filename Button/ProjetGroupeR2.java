package ProjetGroupe_sequential;

import eventb_prelude.*;
import Util.*;
//@ model import org.jmlspecs.models.JMLObjectSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProjetGroupeR2{
	private static final Integer max_integer = Utilities.max_integer;
	private static final Integer min_integer = Utilities.min_integer;

	movrightP1ToS1 evt_movrightP1ToS1 = new movrightP1ToS1(this);
	movleftP1ToS1 evt_movleftP1ToS1 = new movleftP1ToS1(this);
	enter_P3 evt_enter_P3 = new enter_P3(this);
	updateFeuxEntreeP3 evt_updateFeuxEntreeP3 = new updateFeuxEntreeP3(this);
	updateFeuxEntreeP2 evt_updateFeuxEntreeP2 = new updateFeuxEntreeP2(this);
	enter_P1 evt_enter_P1 = new enter_P1(this);
	enter_P2 evt_enter_P2 = new enter_P2(this);
	updateFeuxSortieS1 evt_updateFeuxSortieS1 = new updateFeuxSortieS1(this);
	movleftP2ToP3 evt_movleftP2ToP3 = new movleftP2ToP3(this);
	updateFeuxEntreeP1 evt_updateFeuxEntreeP1 = new updateFeuxEntreeP1(this);
	movleftP1ToP2 evt_movleftP1ToP2 = new movleftP1ToP2(this);
	exit_S1 evt_exit_S1 = new exit_S1(this);
	modifyAiguillage5 evt_modifyAiguillage5 = new modifyAiguillage5(this);
	modifyAiguillage4 evt_modifyAiguillage4 = new modifyAiguillage4(this);
	movleftS1ToP3 evt_movleftS1ToP3 = new movleftS1ToP3(this);
	modifyAiguillage3 evt_modifyAiguillage3 = new modifyAiguillage3(this);
	modifyAiguillage2 evt_modifyAiguillage2 = new modifyAiguillage2(this);
	modifyAiguillage1 evt_modifyAiguillage1 = new modifyAiguillage1(this);
	movrightP1ToP2 evt_movrightP1ToP2 = new movrightP1ToP2(this);
	modifyAiguillage0 evt_modifyAiguillage0 = new modifyAiguillage0(this);
	movrightS1ToP3 evt_movrightS1ToP3 = new movrightS1ToP3(this);
	movrightP2ToP3 evt_movrightP2ToP3 = new movrightP2ToP3(this);
	updateFeuxEntreeS1 evt_updateFeuxEntreeS1 = new updateFeuxEntreeS1(this);
	modifyAiguillage7 evt_modifyAiguillage7 = new modifyAiguillage7(this);
	modifyAiguillage6 evt_modifyAiguillage6 = new modifyAiguillage6(this);
	updateFeuxSortieP2 evt_updateFeuxSortieP2 = new updateFeuxSortieP2(this);
	exit_P1 evt_exit_P1 = new exit_P1(this);
	exit_P2 evt_exit_P2 = new exit_P2(this);
	exit_P3 evt_exit_P3 = new exit_P3(this);
	enter_S1 evt_enter_S1 = new enter_S1(this);


	/******Set definitions******/
	//@ public static constraint aiguillage.equals(\old(aiguillage)); 
	public static final BSet<Integer> aiguillage = new Enumerated(min_integer,max_integer);

	//@ public static constraint trafficLights.equals(\old(trafficLights)); 
	public static final BSet<Integer> trafficLights = new Enumerated(min_integer,max_integer);


	/******Constant definitions******/
	//@ public static constraint droite.equals(\old(droite)); 
	public static final Integer droite = Test_ProjetGroupeR2.random_droite;

	//@ public static constraint gauche.equals(\old(gauche)); 
	public static final Integer gauche = Test_ProjetGroupeR2.random_gauche;

	//@ public static constraint vert.equals(\old(vert)); 
	public static final Integer vert = Test_ProjetGroupeR2.random_vert;

	//@ public static constraint rouge.equals(\old(rouge)); 
	public static final Integer rouge = Test_ProjetGroupeR2.random_rouge;



	/******Axiom definitions******/
	/*@ public static invariant BSet.partition(aiguillage,new BSet<Integer>(gauche),new BSet<Integer>(droite)); */
	/*@ public static invariant BSet.partition(trafficLights,new BSet<Integer>(vert),new BSet<Integer>(rouge)); */


	/******Variable definitions******/
	/*@ spec_public */ private Boolean updated2;

	/*@ spec_public */ private Boolean updated1;

	/*@ spec_public */ private Boolean updated4;

	/*@ spec_public */ private Boolean updated3;

	/*@ spec_public */ private Boolean updated6;

	/*@ spec_public */ private Boolean updated5;

	/*@ spec_public */ private BRelation<Integer,Integer> P1ToS1;

	/*@ spec_public */ private BRelation<Integer,Integer> P1ToP2;

	/*@ spec_public */ private BRelation<Integer,Integer> P2ToP3;

	/*@ spec_public */ private BRelation<Integer,Integer> P1;

	/*@ spec_public */ private BRelation<Integer,Integer> P2;

	/*@ spec_public */ private BRelation<Integer,Integer> P3;

	/*@ spec_public */ private BRelation<Integer,Integer> P2FS;

	/*@ spec_public */ private BRelation<Integer,Integer> S1;

	/*@ spec_public */ private BRelation<Integer,Integer> P1A;

	/*@ spec_public */ private BRelation<Integer,Integer> P1F;

	/*@ spec_public */ private BRelation<Integer,Integer> P2A;

	/*@ spec_public */ private BRelation<Integer,Integer> P2F;

	/*@ spec_public */ private BRelation<Integer,Integer> P3A;

	/*@ spec_public */ private BRelation<Integer,Integer> P3F;

	/*@ spec_public */ private BRelation<Integer,Integer> S1FS;

	/*@ spec_public */ private BRelation<Integer,Integer> S1ToP3;

	/*@ spec_public */ private BRelation<Integer,Integer> S1A;

	/*@ spec_public */ private BRelation<Integer,Integer> S1F;

	/*@ spec_public */ private BRelation<Integer,Integer> P3FS;

	/*@ spec_public */ private BRelation<Integer,Integer> P1FS;




	/******Invariant definition******/
	/*@ public invariant
		 P1.domain().equals(new Enumerated(new Integer(1),new Integer(4))) && P1.range().isSubset(new BSet<Integer>(new Integer(0),new Integer(1),new Integer(2))) && P1.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(4)),new BSet<Integer>(new Integer(0),new Integer(1),new Integer(2))).has(P1) &&
		P1.finite() &&
		 P2.domain().equals(new Enumerated(new Integer(1),new Integer(4))) && P2.range().isSubset(new BSet<Integer>(new Integer(0),new Integer(1),new Integer(2))) && P2.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(4)),new BSet<Integer>(new Integer(0),new Integer(1),new Integer(2))).has(P2) &&
		P2.finite() &&
		 P3.domain().equals(new Enumerated(new Integer(1),new Integer(4))) && P3.range().isSubset(new BSet<Integer>(new Integer(0),new Integer(1),new Integer(2))) && P3.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(4)),new BSet<Integer>(new Integer(0),new Integer(1),new Integer(2))).has(P3) &&
		P3.finite() &&
		 S1.domain().equals(new Enumerated(new Integer(1),new Integer(2))) && S1.range().isSubset(new BSet<Integer>(new Integer(0),new Integer(1),new Integer(2))) && S1.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(2)),new BSet<Integer>(new Integer(0),new Integer(1),new Integer(2))).has(S1) &&
		S1.finite() &&
		 P1ToP2.domain().equals(new Enumerated(new Integer(1),new Integer(2))) && P1ToP2.range().isSubset(new BSet<Integer>(new Integer(0),new Integer(1),new Integer(2))) && P1ToP2.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(2)),new BSet<Integer>(new Integer(0),new Integer(1),new Integer(2))).has(P1ToP2) &&
		P1ToP2.finite() &&
		 P2ToP3.domain().equals(new Enumerated(new Integer(1),new Integer(2))) && P2ToP3.range().isSubset(new BSet<Integer>(new Integer(0),new Integer(1),new Integer(2))) && P2ToP3.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(2)),new BSet<Integer>(new Integer(0),new Integer(1),new Integer(2))).has(P2ToP3) &&
		P2ToP3.finite() &&
		 P1ToS1.domain().equals(new Enumerated(new Integer(1),new Integer(2))) && P1ToS1.range().isSubset(new BSet<Integer>(new Integer(0),new Integer(1),new Integer(2))) && P1ToS1.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(2)),new BSet<Integer>(new Integer(0),new Integer(1),new Integer(2))).has(P1ToS1) &&
		P1ToS1.finite() &&
		 S1ToP3.domain().equals(new Enumerated(new Integer(1),new Integer(2))) && S1ToP3.range().isSubset(new BSet<Integer>(new Integer(0),new Integer(1),new Integer(2))) && S1ToP3.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(2)),new BSet<Integer>(new Integer(0),new Integer(1),new Integer(2))).has(S1ToP3) &&
		S1ToP3.finite() &&
		 P1A.domain().equals(new Enumerated(new Integer(4),new Integer(7))) && P1A.range().isSubset(aiguillage) && P1A.isaFunction() && BRelation.cross(new Enumerated(new Integer(4),new Integer(7)),aiguillage).has(P1A) &&
		P1A.finite() &&
		 P2A.domain().equals(new Enumerated(new Integer(1),new Integer(6))) && P2A.range().isSubset(aiguillage) && P2A.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(6)),aiguillage).has(P2A) &&
		P2A.finite() &&
		 P3A.domain().equals(new Enumerated(new Integer(0),new Integer(3))) && P3A.range().isSubset(aiguillage) && P3A.isaFunction() && BRelation.cross(new Enumerated(new Integer(0),new Integer(3)),aiguillage).has(P3A) &&
		P3A.finite() &&
		 S1A.domain().equals(new Enumerated(new Integer(1),new Integer(2))) && S1A.range().isSubset(aiguillage) && S1A.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(2)),aiguillage).has(S1A) &&
		S1A.finite() &&
		 P1F.domain().equals(new Enumerated(new Integer(5),new Integer(8))) && P1F.range().isSubset(trafficLights) && P1F.isaFunction() && BRelation.cross(new Enumerated(new Integer(5),new Integer(8)),trafficLights).has(P1F) &&
		 P2F.domain().equals(new Enumerated(new Integer(1),new Integer(8))) && P2F.range().isSubset(trafficLights) && P2F.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(8)),trafficLights).has(P2F) &&
		 P3F.domain().equals(new Enumerated(new Integer(1),new Integer(4))) && P3F.range().isSubset(trafficLights) && P3F.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(4)),trafficLights).has(P3F) &&
		 S1F.domain().equals(new Enumerated(new Integer(1),new Integer(4))) && S1F.range().isSubset(trafficLights) && S1F.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(4)),trafficLights).has(S1F) &&
		 P1FS.domain().equals(new Enumerated(new Integer(2),new Integer(2))) && P1FS.range().isSubset(trafficLights) && P1FS.isaFunction() && BRelation.cross(new Enumerated(new Integer(2),new Integer(2)),trafficLights).has(P1FS) &&
		 P2FS.domain().equals(new Enumerated(new Integer(1),new Integer(2))) && P2FS.range().isSubset(trafficLights) && P2FS.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(2)),trafficLights).has(P2FS) &&
		 P3FS.domain().equals(new Enumerated(new Integer(1),new Integer(1))) && P3FS.range().isSubset(trafficLights) && P3FS.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(1)),trafficLights).has(P3FS) &&
		 S1FS.domain().equals(new Enumerated(new Integer(1),new Integer(2))) && S1FS.range().isSubset(trafficLights) && S1FS.isaFunction() && BRelation.cross(new Enumerated(new Integer(1),new Integer(2)),trafficLights).has(S1FS) &&
		BOOL.instance.has(updated1) &&
		BOOL.instance.has(updated2) &&
		BOOL.instance.has(updated3) &&
		BOOL.instance.has(updated4) &&
		BOOL.instance.has(updated5) &&
		BOOL.instance.has(updated6); */


	/******Getter and Mutator methods definition******/
	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.P1ToP2;*/
	public /*@ pure */ BRelation<Integer,Integer> get_P1ToP2(){
		return this.P1ToP2;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.P1ToP2;
	    ensures this.P1ToP2 == P1ToP2;*/
	public void set_P1ToP2(BRelation<Integer,Integer> P1ToP2){
		this.P1ToP2 = P1ToP2;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.S1ToP3;*/
	public /*@ pure */ BRelation<Integer,Integer> get_S1ToP3(){
		return this.S1ToP3;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.S1ToP3;
	    ensures this.S1ToP3 == S1ToP3;*/
	public void set_S1ToP3(BRelation<Integer,Integer> S1ToP3){
		this.S1ToP3 = S1ToP3;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.P1A;*/
	public /*@ pure */ BRelation<Integer,Integer> get_P1A(){
		return this.P1A;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.P1A;
	    ensures this.P1A == P1A;*/
	public void set_P1A(BRelation<Integer,Integer> P1A){
		this.P1A = P1A;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.updated2;*/
	public /*@ pure */ Boolean get_updated2(){
		return this.updated2;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.updated2;
	    ensures this.updated2 == updated2;*/
	public void set_updated2(Boolean updated2){
		this.updated2 = updated2;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.P3F;*/
	public /*@ pure */ BRelation<Integer,Integer> get_P3F(){
		return this.P3F;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.P3F;
	    ensures this.P3F == P3F;*/
	public void set_P3F(BRelation<Integer,Integer> P3F){
		this.P3F = P3F;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.S1A;*/
	public /*@ pure */ BRelation<Integer,Integer> get_S1A(){
		return this.S1A;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.S1A;
	    ensures this.S1A == S1A;*/
	public void set_S1A(BRelation<Integer,Integer> S1A){
		this.S1A = S1A;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.updated1;*/
	public /*@ pure */ Boolean get_updated1(){
		return this.updated1;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.updated1;
	    ensures this.updated1 == updated1;*/
	public void set_updated1(Boolean updated1){
		this.updated1 = updated1;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.P1F;*/
	public /*@ pure */ BRelation<Integer,Integer> get_P1F(){
		return this.P1F;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.P1F;
	    ensures this.P1F == P1F;*/
	public void set_P1F(BRelation<Integer,Integer> P1F){
		this.P1F = P1F;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.S1F;*/
	public /*@ pure */ BRelation<Integer,Integer> get_S1F(){
		return this.S1F;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.S1F;
	    ensures this.S1F == S1F;*/
	public void set_S1F(BRelation<Integer,Integer> S1F){
		this.S1F = S1F;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.P2FS;*/
	public /*@ pure */ BRelation<Integer,Integer> get_P2FS(){
		return this.P2FS;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.P2FS;
	    ensures this.P2FS == P2FS;*/
	public void set_P2FS(BRelation<Integer,Integer> P2FS){
		this.P2FS = P2FS;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.P1FS;*/
	public /*@ pure */ BRelation<Integer,Integer> get_P1FS(){
		return this.P1FS;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.P1FS;
	    ensures this.P1FS == P1FS;*/
	public void set_P1FS(BRelation<Integer,Integer> P1FS){
		this.P1FS = P1FS;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.updated4;*/
	public /*@ pure */ Boolean get_updated4(){
		return this.updated4;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.updated4;
	    ensures this.updated4 == updated4;*/
	public void set_updated4(Boolean updated4){
		this.updated4 = updated4;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.P2ToP3;*/
	public /*@ pure */ BRelation<Integer,Integer> get_P2ToP3(){
		return this.P2ToP3;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.P2ToP3;
	    ensures this.P2ToP3 == P2ToP3;*/
	public void set_P2ToP3(BRelation<Integer,Integer> P2ToP3){
		this.P2ToP3 = P2ToP3;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.updated3;*/
	public /*@ pure */ Boolean get_updated3(){
		return this.updated3;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.updated3;
	    ensures this.updated3 == updated3;*/
	public void set_updated3(Boolean updated3){
		this.updated3 = updated3;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.updated6;*/
	public /*@ pure */ Boolean get_updated6(){
		return this.updated6;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.updated6;
	    ensures this.updated6 == updated6;*/
	public void set_updated6(Boolean updated6){
		this.updated6 = updated6;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.updated5;*/
	public /*@ pure */ Boolean get_updated5(){
		return this.updated5;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.updated5;
	    ensures this.updated5 == updated5;*/
	public void set_updated5(Boolean updated5){
		this.updated5 = updated5;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.P3FS;*/
	public /*@ pure */ BRelation<Integer,Integer> get_P3FS(){
		return this.P3FS;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.P3FS;
	    ensures this.P3FS == P3FS;*/
	public void set_P3FS(BRelation<Integer,Integer> P3FS){
		this.P3FS = P3FS;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.P2A;*/
	public /*@ pure */ BRelation<Integer,Integer> get_P2A(){
		return this.P2A;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.P2A;
	    ensures this.P2A == P2A;*/
	public void set_P2A(BRelation<Integer,Integer> P2A){
		this.P2A = P2A;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.P1;*/
	public /*@ pure */ BRelation<Integer,Integer> get_P1(){
		return this.P1;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.P1;
	    ensures this.P1 == P1;*/
	public void set_P1(BRelation<Integer,Integer> P1){
		this.P1 = P1;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.P2;*/
	public /*@ pure */ BRelation<Integer,Integer> get_P2(){
		return this.P2;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.P2;
	    ensures this.P2 == P2;*/
	public void set_P2(BRelation<Integer,Integer> P2){
		this.P2 = P2;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.P3;*/
	public /*@ pure */ BRelation<Integer,Integer> get_P3(){
		return this.P3;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.P3;
	    ensures this.P3 == P3;*/
	public void set_P3(BRelation<Integer,Integer> P3){
		this.P3 = P3;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.P1ToS1;*/
	public /*@ pure */ BRelation<Integer,Integer> get_P1ToS1(){
		return this.P1ToS1;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.P1ToS1;
	    ensures this.P1ToS1 == P1ToS1;*/
	public void set_P1ToS1(BRelation<Integer,Integer> P1ToS1){
		this.P1ToS1 = P1ToS1;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.P2F;*/
	public /*@ pure */ BRelation<Integer,Integer> get_P2F(){
		return this.P2F;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.P2F;
	    ensures this.P2F == P2F;*/
	public void set_P2F(BRelation<Integer,Integer> P2F){
		this.P2F = P2F;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.S1FS;*/
	public /*@ pure */ BRelation<Integer,Integer> get_S1FS(){
		return this.S1FS;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.S1FS;
	    ensures this.S1FS == S1FS;*/
	public void set_S1FS(BRelation<Integer,Integer> S1FS){
		this.S1FS = S1FS;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.S1;*/
	public /*@ pure */ BRelation<Integer,Integer> get_S1(){
		return this.S1;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.S1;
	    ensures this.S1 == S1;*/
	public void set_S1(BRelation<Integer,Integer> S1){
		this.S1 = S1;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable \nothing;
	    ensures \result == this.P3A;*/
	public /*@ pure */ BRelation<Integer,Integer> get_P3A(){
		return this.P3A;
	}

	/*@ public normal_behavior
	    requires true;
	    assignable this.P3A;
	    ensures this.P3A == P3A;*/
	public void set_P3A(BRelation<Integer,Integer> P3A){
		this.P3A = P3A;
	}



	/*@ public normal_behavior
	    requires true;
	    assignable \everything;
	    ensures
		P1.equals((new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,1)).union(new no_type(new JMLObjectSet {Integer i | (\exists no_type e; (new Enumerated(2,4).has(null)); e.equals(new Pair<Integer,ERROR>(null,0)))})))) &&
		P2.equals((new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,2)).union(new no_type(new JMLObjectSet {Integer i | (\exists no_type e; (new Enumerated(2,4).has(null)); e.equals(new Pair<Integer,ERROR>(null,0)))})))) &&
		P3.equals((new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,2)).union(new no_type(new JMLObjectSet {Integer i | (\exists no_type e; (new Enumerated(2,4).has(null)); e.equals(new Pair<Integer,ERROR>(null,0)))})))) &&
		S1 == new no_type(new JMLObjectSet {Integer i | (\exists no_type e; (new Enumerated(1,2).has(null)); e.equals(new Pair<Integer,ERROR>(null,0)))}) &&
		P1ToP2 == new no_type(new JMLObjectSet {Integer i | (\exists no_type e; (new Enumerated(1,2).has(null)); e.equals(new Pair<Integer,ERROR>(null,0)))}) &&
		P2ToP3 == new no_type(new JMLObjectSet {Integer i | (\exists no_type e; (new Enumerated(1,2).has(null)); e.equals(new Pair<Integer,ERROR>(null,0)))}) &&
		P1ToS1 == new no_type(new JMLObjectSet {Integer i | (\exists no_type e; (new Enumerated(1,2).has(null)); e.equals(new Pair<Integer,ERROR>(null,0)))}) &&
		S1ToP3 == new no_type(new JMLObjectSet {Integer i | (\exists no_type e; (new Enumerated(1,2).has(null)); e.equals(new Pair<Integer,ERROR>(null,0)))}) &&
		P1A == BRelation.cross(new Enumerated(4,7),new BSet<Integer>(droite)) &&
		P2A == BRelation.cross(new Enumerated(1,6),new BSet<Integer>(gauche)) &&
		P3A == BRelation.cross(new Enumerated(0,3),new BSet<Integer>(gauche)) &&
		S1A == BRelation.cross(new Enumerated(1,2),new BSet<Integer>(gauche)) &&
		P1F == BRelation.cross(new Enumerated(5,8),new BSet<Integer>(rouge)) &&
		P2F == BRelation.cross(new Enumerated(1,8),new BSet<Integer>(rouge)) &&
		P3F == BRelation.cross(new Enumerated(1,4),new BSet<Integer>(rouge)) &&
		S1F == BRelation.cross(new Enumerated(1,4),new BSet<Integer>(rouge)) &&
		P1FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,rouge))) &&
		P2FS == BRelation.cross(new Enumerated(1,2),new BSet<Integer>(rouge)) &&
		P3FS.equals(new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,rouge))) &&
		S1FS == BRelation.cross(new Enumerated(1,2),new BSet<Integer>(rouge)) &&
		updated1 == false &&
		updated2 == false &&
		updated3 == false &&
		updated4 == false &&
		updated5 == false &&
		updated6 == false;*/
	public ProjetGroupeR2(){
		P1 = ((new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,1)).union(new no_type(new JMLObjectSet {Integer i | (\exists no_type e; (new Enumerated(2,4).has(null)); e.equals(new Pair<Integer,ERROR>(null,0)))}))));
		P2 = ((new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,2)).union(new no_type(new JMLObjectSet {Integer i | (\exists no_type e; (new Enumerated(2,4).has(null)); e.equals(new Pair<Integer,ERROR>(null,0)))}))));
		P3 = ((new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,2)).union(new no_type(new JMLObjectSet {Integer i | (\exists no_type e; (new Enumerated(2,4).has(null)); e.equals(new Pair<Integer,ERROR>(null,0)))}))));
		S1 = new no_type(new JMLObjectSet {Integer i | (\exists no_type e; (new Enumerated(1,2).has(null)); e.equals(new Pair<Integer,ERROR>(null,0)))});
		P1ToP2 = new no_type(new JMLObjectSet {Integer i | (\exists no_type e; (new Enumerated(1,2).has(null)); e.equals(new Pair<Integer,ERROR>(null,0)))});
		P2ToP3 = new no_type(new JMLObjectSet {Integer i | (\exists no_type e; (new Enumerated(1,2).has(null)); e.equals(new Pair<Integer,ERROR>(null,0)))});
		P1ToS1 = new no_type(new JMLObjectSet {Integer i | (\exists no_type e; (new Enumerated(1,2).has(null)); e.equals(new Pair<Integer,ERROR>(null,0)))});
		S1ToP3 = new no_type(new JMLObjectSet {Integer i | (\exists no_type e; (new Enumerated(1,2).has(null)); e.equals(new Pair<Integer,ERROR>(null,0)))});
		P1A = BRelation.cross(new Enumerated(4,7),new BSet<Integer>(droite));
		P2A = BRelation.cross(new Enumerated(1,6),new BSet<Integer>(gauche));
		P3A = BRelation.cross(new Enumerated(0,3),new BSet<Integer>(gauche));
		S1A = BRelation.cross(new Enumerated(1,2),new BSet<Integer>(gauche));
		P1F = BRelation.cross(new Enumerated(5,8),new BSet<Integer>(rouge));
		P2F = BRelation.cross(new Enumerated(1,8),new BSet<Integer>(rouge));
		P3F = BRelation.cross(new Enumerated(1,4),new BSet<Integer>(rouge));
		S1F = BRelation.cross(new Enumerated(1,4),new BSet<Integer>(rouge));
		P1FS = (new BRelation<Integer,Integer>(new Pair<Integer,Integer>(2,rouge)));
		P2FS = BRelation.cross(new Enumerated(1,2),new BSet<Integer>(rouge));
		P3FS = (new BRelation<Integer,Integer>(new Pair<Integer,Integer>(1,rouge)));
		S1FS = BRelation.cross(new Enumerated(1,2),new BSet<Integer>(rouge));
		updated1 = false;
		updated2 = false;
		updated3 = false;
		updated4 = false;
		updated5 = false;
		updated6 = false;

	}
}