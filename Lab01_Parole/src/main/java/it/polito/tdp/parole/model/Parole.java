package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	private List<String> parole;
		
	public Parole() {
		this.parole = new ArrayList<>();
		//TODO
	}
	
	public void addParola(String p) {
		this.parole.add(p);
		//TODO
	}
	
	public Parole getElenco() {
		List<String> tmp= new LinkedList<>();
		Parole tmpP= new Parole();
		for(String s:parole) {
			tmp.add(s);
		}
		Collections.sort(tmp);
		for(String s:tmp) {
			tmpP.addParola(s);
		}
		
		//TODO
		return tmpP;
	}
	
	public void reset() {
		// TODO
		this.parole.clear();
	}
	public void cancella(String s) {
		this.parole.remove(s);
	}

	@Override
	public String toString() {
		String tmp="";
		for(String p:parole) {
			tmp = tmp+p+"\n";
		}
		
		
		return tmp ;
	}
	

}
